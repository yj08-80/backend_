package 종합.과제.종합과제9.model.dao;


import day08.Book;
import 종합.과제.종합과제9.model.dto.MarketDto;

import java.security.spec.ECField;
import java.sql.*;
import java.util.ArrayList;

public class MarketDao { // class start

    // 싱글톤
    private MarketDao(){ connect(); }
    private static final MarketDao instance = new MarketDao();
    public static MarketDao getInstance(){
        return instance;
    }

    // (*) DB 연동
    private String db_url = "jdbc:mysql://localhost:3306/mytest0724";
    private String db_user = "root";
    private String db_password = "1234";
    private Connection conn;
    private void connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection( db_url , db_user , db_password );
        }catch ( Exception e ){
            System.out.println(e);
        }
    }


    // (1) 등록 기능 구현
    public boolean usedItemRegister( MarketDto marketDto ){
        try{
            String sql = "insert into market ( username , pname , content , price , pwd , datetime , is_sold ) values ( ? , ? , ? , ? , ? , ? , ?);";
            PreparedStatement ps = conn.prepareStatement( sql );
            // 3. sql 매개변수 대입, 현재 > 2개
            ps.setString( 1, marketDto.getUsername() );
            ps.setString( 2 , marketDto.getPname() );
            ps.setString( 3, marketDto.getContent() );
            ps.setInt( 4, marketDto.getPrice());
            ps.setString( 5, marketDto.getPwd() );
            ps.setTimestamp(6, new Timestamp(System.currentTimeMillis())); // 현재 시간 저장
            ps.setBoolean(7, false);
            int count = ps.executeUpdate();
            if( count >= 1 ) return  true;
            return false;
        }catch ( Exception e ){
            System.out.println( e );
            return false;
        }
    } // func end

    // (2) 전체조회 기능 구현
    public ArrayList< MarketDto > showAllItems(){
        ArrayList< MarketDto > list = new ArrayList<>();
        try{
            String sql = "select * from Market";
            PreparedStatement ps = conn.prepareStatement( sql );
            ResultSet rs = ps.executeQuery();
            while ( rs.next() ){
                int no = rs.getInt( "no" );
                String username = rs.getString( "username" );
                String pname = rs.getString( "pname" );
                String content = rs.getString( "content" );
                int price = rs.getInt( "price" );
                String pwd = rs.getString( "pwd" );
                Date date = rs.getDate( "datetime" );
                boolean is_sold = rs.getBoolean( "is_sold" );
                MarketDto marketDto = new MarketDto( no , username , pname , content , price , pwd , date , is_sold );
                list.add( marketDto );
            }
        }catch ( Exception e ){
            System.out.println( e );
        }
        return list;
    } // func end

    // (3) 삭제 기능 구현
    public boolean deleteItem( int no ){
        try{
            String sql = "delete from market where no = ?";
            PreparedStatement ps = conn.prepareStatement( sql );
            ps.setInt( 1, no );
            int count = ps.executeUpdate();
            if( count == 1 ){
                return true;
            }else{
                return false;
            }
        }catch ( Exception e ){
            System.out.println( e );
        }
        return false;
    }


    // (4) 수정 기능 구현
    public boolean updateItemInfo( MarketDto marketDto ) {
        try {
            String sql = "UPDATE market SET pname = ?, content = ?, price = ?, is_sold = ? WHERE no = ?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, marketDto.getPname());
            ps.setString(2, marketDto.getContent());
            ps.setInt(3, marketDto.getPrice());
            ps.setBoolean(4, marketDto.isIs_sold());
            ps.setInt(5, marketDto.getNo());

            int count = ps.executeUpdate();
            return count >= 1;

        } catch (Exception e) {
            System.out.println("수정 오류: " + e);
            return false; // 비밀번호 불일치 또는 예외 발생 시 false
        }

    }

    public boolean check( MarketDto marketDto ) {
        try {
            String sql = "select username from market where no = ? and pwd = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, marketDto.getNo());
            ps.setString(2, marketDto.getPwd());
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
} // class end























