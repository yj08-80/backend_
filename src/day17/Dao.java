package day17;


import com.mysql.cj.jdbc.exceptions.ConnectionFeatureNotAvailableException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Data Access Object : 데이터( 데이터베이스/파일 ) 접근 객체
public class Dao { // class start
    // 싱글톤
    private static final Dao instance = new Dao();
    private Dao(){
        connentDB();
    }
    public static Dao getInstance(){
        return  instance;
    }

    // (!) DB연동에 필요한 정보
    String db_url = "jdbc:mysql://localhost:3306/mydb0722";
    String db_user = "root";
    String db_password = "11111"; // 비밀번호 입력
    Connection conn; // DB연동 결과를 갖는 인터페이스

    // (1) 연동 함수
    public void connentDB(){
        try {
            Class.forName( "com.mysql.cj.jdbc.Driver" ); // mysql 드라이버/클래스 로드 함수
            conn = DriverManager.getConnection( db_url , db_user , db_password );
            System.out.println( "[시스템 안내] 데이터베이스 연동 성공" );
        }catch( ClassNotFoundException e ) {
            System.out.println( "[경고] mysql 드라이버 연동 실패" );
        }catch ( SQLException e ){
            System.out.println( "[경고] 데이터베이스 연동 실패");
        }
    }
} // class end
