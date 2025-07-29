package day18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {
    // 관례적인 MVC 패턴에서의 (협업) 용어
    // D : DATA     데이터 ( 데이터베이스/DB )
    // A : ACCESS   접근
    // O : OBJECT   객체
    // (1) 데이터베이스 연동 코드(함수/메소드)
    private String db_url = "jdbc:mysql://localhost:3306/mydb0723"; // 연동할 DB서버의 주소 = jdbc:mysql://IP번호:PORT번호/DB명
    private String db_user = "root";                                // DB서버의 계정명    = root
    private String db_password = "1234";                            // DB서버의 비밀번호  = 1234
    private Connection conn ; // DB연동 결과를 조작하는 인터페이스 , import 주의 , java.sql
    public void connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // 1. MYSQL 드라이버/클래스 불러오기
            conn = DriverManager.getConnection( db_url , db_user , db_password );// 2. MYSQL DB서버 연동
        }
        catch ( ClassNotFoundException e ){  System.out.println("[경고] MYSQL 라이브러리 로드 실패");  }
        catch ( SQLException e ){ System.out.println("[경고] DB 서버와 연동 실패 "); }
    } // func end

    // (*) 싱글톤 : 주로 프로그램내 하나(싱글)의 객체(톤) 표현
    private UserDao(){ connect(); } // 싱글톤 생성시 connect 함수가 실행
    private static final UserDao instance = new UserDao();
    public static UserDao getInstance(){
        return instance;
    }

    // -> 주로 MVC패턴 에서 싱글톤 사용하는 레이어/계층 : view/controller/dao
    // 왜? 기능은 하나만 있어도 재사용 가능하니까. 즉] 메소드 위주  , 요리사사람1명 , 서빙사람1명
    // -> D(데이터)T(이동)O(객체) 에서는 싱글톤 사용하지 않는다.
    // 왜? 데이터(회원정보)1개만 존재하지 않는다. 즉] 멤버변수 위주

    // (2) 연동 성공 이후에 사용할 DML(테이블 조작) 하기
    // 1) USER 테이블에 INSERT 해보기
    public boolean userInsert( ){
        try {
            // 1. SQL 작성 - String sql = "SQL문법";
            String sql = "insert into user(uname,uage) values( '유재석' , 40 ); ";
            // 2. SQL 기재 - PreparedStatement ps = conn.prepareStatement( sql );
            PreparedStatement ps = conn.prepareStatement(sql);
            // 3. SQL 실행 - int count = ps.executeUpdate();
            int count = ps.executeUpdate(); // SQL 실행 결과 몇개의 INSERT 레코드를 했는지 반환
            // 4. SQL 결과 에 따른 확인/로직/리턴
            System.out.println( count );
            if( count >= 1 ) return true; // 성공
            else return false; // 실패
        } catch (Exception e) { System.out.println(e); }
        return false; // 실패
    }


    public void userSelect(){
        try {

        }catch ( Exception e ){
            System.out.println( e );
        }
    }
} // class end














