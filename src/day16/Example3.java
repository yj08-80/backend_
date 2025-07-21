package day16;

import java.io.*;

public class Example3 { // class start
    public static void main(String[] args) {
        /*

    [ 파일 입출력 클래스 ]
        1. 쓰기/출력/내보내기 방법, 자바 ---> 외부
            - FileOutputStream 클래스
        2. 읽기/입력/가져오기 방법, 자바 <--- 외부
            - FileInputStream 클래스

     */

        // [1] 파일 쓰기
        // (1) 파일 경로 설정
        String path = "./src/day16/test1.txt"; // 파일의 위치, 상대경로 또는 절대경로
        // 해당 패키지명(day16) 오른쪽 -> [경로/참조 복사] -> 컨텐츠로부터 경로 복사후 -> 파일명 작성
        // (2) 파일 출력 객체 생성 * 무조건 일반 예외 발생
        // FileOutputStream fileOutputStream = new FileOutputStream( 파일경로 );
        try{ // (3) 예외처리하기
            FileOutputStream fileOutputStream = new FileOutputStream( path );
            // 파일에 쓰기, .write( 바이트데이터 );
            // "문자열".getBytes() : 문자열 --> 바이트 배열 변환 반환 함수
            fileOutputStream.write( "자바에서 작성한 텍스트입니다.".getBytes() );
        }catch ( FileNotFoundException e ){
            System.out.println( "파일 또는 경로가 존재하지 않습니다." );
        }catch ( IOException e1 ){
            System.out.println( "입출력 도중에 오류가 발생했습니다." );
        }

        // [2] 파일 읽기
        // (1) 경로는 위에서 선언한 path 그대로 사용
        // (2) 파일 입력 객체 생성
            // FileInputStream fileInputStream = new FileInputStream( 파일경로 );
        try{
            FileInputStream fileInputStream = new FileInputStream( path );
            // (3) 읽어온 바이트들을 저장할 배열 선언한다.
            byte[] bytes =  new byte[50]; // 50바이트를 저장할 배열 준비
            // (4) 읽어오기, .read( 바이트배열 );
            fileInputStream.read( bytes );
            // (5) new String( 바이트배열) : * 무조건 (IOException) 일반예외 발생
        }catch ( FileNotFoundException e ){
            System.out.println( "파일 또는 경로가 존재하지 않습니다." );
        }catch ( IOException e1 ){
            System.out.println( "파일 읽어오는데에 문제가 발생했습니다. ");
        }


    }


} // class end
