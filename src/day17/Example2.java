package day17;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Example2 { // class start
    public static void main(String[] args) { // main start
        /*

        [ JDBC ] : JAVA DATABASE CONNECT 자바 데이터베이스 연동

            1. 연동코드
            2. 핵심 인터페이스
                * 인터페이스를 사용하는 이유 : mysql, oracle 등 각기 다른 데이터베이스 회사들의 클래스(구현체)를 조작하기 위해
                1) Connection
                    (1) Connection conn = DriverManager.getConnection( "서버주소","계정","비밀번호" )
                    (2) 연동된 DB에 SQL 기재 함수, 기재된 preparedStatement 반환
                        conn.prepareStatemen( SQL문법 );
                2) PreparedStatment
                    (1) 기재된 SQL 실행 함수
                        RusultSet rs = ps.executeQuery();          select 문법 실행 결과를 ResultSet 타입 변환
                        int count = ps.executeUpdate();         insert,update,delete 문법 실행 결과 int 타입으로 변환

                3) ResultSet
                    (1) SQL 결과 조작 함수
                        rs.next();              조회된 레코드들 중에서 다음 레코드 이동 함스
                        rs.getXXX( 속성명 );       현재 레코드에서 지정한 속성명의 값 반환 함수
                            - XXX : 적절한 자바 타입, getInt(), getString(), getDouble() 등등
         */

        // [1] 자바와 데이터베이스 연동
            // 1) mysql 회사 지원하는 연동 Driver 클래스 로드/가져오기 * DB회사별로 다름
        try {
            Class.forName( "com.mysql.cj.jdbc.Driver" );
            System.out.println( "[JDBC 드라이버 가져오기 성공]");
            // 2) DB 연동 후 연동 결과를 갖는 인터페이스, Connection, import java.sql
                // .prepareStatement( SQL ) : 연동된 DB에 SQL 기재 준비, PreparedStatement 타입 변환
            // 3) DB 연동 클래스( 구현체 ) : DriverManager
            // 4) DB 연동 함수 : .getConnection( 서버주소 , 계정명 , 비밀번호 ) *예외발생
            // - 데이터베이스 서버 주소 : jdbc:mysql://ip주소:port번호
            String db_url = "jdbc:mysql://localhost:3306/mydb0722"; // 데이터베이스 서버 주소
            String db_user = "root"; // 데이터베이스 계정명
            String db_password = "dbwls6724"; // 데이터베이스 비밀번호
            Connection connection = DriverManager.getConnection( db_url , db_user , db_password );
            System.out.println( "[데이터베이스 연동 성공]");
            // -----자바에서 insert 문법 사용해보기-----//
            String sql = "insert into test(content) values('안녕하세요')"; // 5) sql 작성
            PreparedStatement ps = connection.prepareStatement( sql ); // 6) 지정한 SQL을 연동된 인터페이스에 대입
            ps.execute(); // 7) 기제된 SQL 실행, PreparedStatement
        } catch ( ClassNotFoundException e) {
            System.out.println( "[JDBC 드라이버 가져오기 실패]" );
        }catch ( SQLException e ){
            System.out.println( "[데이터베이스 연동 실패]" );
        }

    } // main end
} // class end
