package day16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.security.spec.ECField;
import java.util.Scanner;

public class 실습15 { // class start
    public static void main(String[] args) { // main start


        // * 파일처리 목적 : (저장) 자바 외 저장소로 영구저장 가능하다


//[JAVA] 실습15 : 파일 처리 (개정판)
//[ 문제 ] 아래 파일 처리 관련 문제를 해결하시오.
//[ 제출방법 ] 코드가 작성된 파일이 위치한 깃허브 상세 주소를 제출하시오.
//
//[문제 1] 파일에 일기 쓰기
//1. FileOutputStream을 사용하여 src 폴더 내에 src/diary.txt 파일을 생성하세요.
//2. "오늘 날씨는 맑았다. 자바 공부는 재미있다." 라는 문자열을 바이트로 변환하여 파일에 쓰세요.
//3. try-catch를 사용하여 예외 처리하세요.
        try{
            String diary = "./src/diary.txt";
            FileOutputStream fileOutputStream = new FileOutputStream( diary );
            fileOutputStream.write( "오늘 날씨는 맑았다. 자바 공부는 재미있다.".getBytes() );

            //[문제 2] 파일에 작성된 일기 읽기
            //1. FileInputStream을 사용하여 문제 1에서 생성한 src/diary.txt 파일을 읽어오세요.
            //2. 읽어온 바이트 데이터를 String으로 변환하여 콘솔에 출력하세요.
            FileInputStream fileInputStream = new FileInputStream( diary );
            byte[] bytes = new byte[50];
            fileInputStream.read( bytes );

            //[문제 3] File 클래스로 파일 정보 확인하기
            //1. File 객체를 src/diary.txt 경로로 생성하세요.
            //2. .exists(), .getPath(), .getName(), .length() 메소드를 각각 사용하여
            // 해당 파일의 존재 여부, 경로, 이름, 크기(바이트)를 출력하세요.
            File file = new File( diary );
            System.out.println( file.exists() );
            System.out.println( file.getName() );
            System.out.println( file.getName() );
            System.out.println( file.length() );

            //[문제 4] 방문 로그 누적 기록하기
            //1. FileOutputStream을 사용하여 src/visit_log.txt 파일을 여세요.
            //2. Scanner로 방문자 이름을 입력받아,
            // "OOO님이 방문했습니다.\n" 형식의 문자열을 visit_log.txt 파일의 기존 내용 뒤에 추가하세요.
            //3. 프로그램을 여러 번 실행하여 방문 기록이 계속 누적되는지 확인하세요.
            Scanner scan = new Scanner( System.in );
            System.out.print( "방문자 이름 : " );
            String str = scan.next();
            String visit = "src/visit_log.txt";
            FileOutputStream fileOutputStream1 = new FileOutputStream( visit );
            byte[] outByte = str.getBytes();
            fileOutputStream1.write( outByte );

            //[문제 5] 연락처를 CSV 형식으로 파일에 저장하기
            //1. Scanner를 사용하여 사용자로부터 이름, 전화번호, 사는 도시를 순서대로 입력받으세요.
            //2. 입력받은 데이터들을 쉼표(,)로 연결하여 하나의 String으로 만드세요.
            // (예: "유재석,010-1234-5678,서울")
            //3. 해당 문자열을 contacts.csv 파일에 저장하세요. (줄바꿈 문자 \n 포함)
            System.out.print( "이름 : " );
            String name = scan.next();
            System.out.print( "전화번호 : " );
            String phone = scan.next();
            System.out.print( "사는 도시 : " );
            String city = scan.next();

            String contact = name + "," + phone + "," + city + "\n";

            FileOutputStream fileOutputStream2 = new FileOutputStream("contacts.csv");
            byte[] bytes1 = contact.getBytes();
            fileOutputStream2.write( bytes1 );




            //[문제 6] 영화 감상평을 파일에 저장하기
            //1. Scanner를 사용하여 사용자로부터 좋아하는 영화 제목과 감상평을 한 줄로 입력받으세요.
            //2. 입력받은 내용을 src 폴더 내의 src/movie_review.txt 파일에 저장하세요.
            System.out.println( "좋아하는 영화 제목, 감상평 : " );
            scan.nextLine();
            String title_review = scan.nextLine();

            String movie_review = "src/movie_review.txt";
            FileOutputStream fileOutputStream4 = new FileOutputStream( movie_review );

            byte[] outByte1 = title_review.getBytes();
            fileOutputStream4.write( outByte1 );

            //[문제 7] 저장된 감상평 파일 읽기
            //1. 문제 3에서 생성된 src/movie_review.txt 파일의 내용을 읽어오세요.
            //2. File 클래스의 .length()를 사용하여 파일 크기만큼 바이트 배열을 선언하고,
            // 파일 전체를 한 번에 읽어오세요.
            //3. 읽어온 내용을 콘솔에 출력하세요.

            FileInputStream fileInputStream1 = new FileInputStream( movie_review );
            byte[] inByte = new byte[ (int)file.length()  ]; // 바이트 배열
            fileInputStream1.read( inByte );
            String inStr = new String( inByte );
            System.out.println( inStr );

        }catch (Exception e ){
            System.out.println( e );
        }


//[문제 8] 공공데이터 CSV 파일 읽고 분석하기
//1. **공공데이터포털(data.go.kr)**에서 '부평구_인구현황'을 검색하여 CSV 파일을 다운로드하고,
// src 폴더에 bupyeong_population.csv 라는 이름으로 저장하세요.
//2. FileInputStream을 사용하여 해당 파일을 읽어오세요.
// (주의: 한글 깨짐 방지를 위해 new String(bytes, "EUC-KR") 사용)
//3. 읽어온 전체 내용을 줄바꿈(\n) 기준으로 분리하여 String 배열에 저장하세요.
//4. for문을 사용하여 배열의 각 줄(각 동의 인구 정보)을 순회하며,
// '행정기관'과 '총인구수'만 추출하여 "동별: [ 동별 ], 총 인구: [ 인구수(계)   ]명" 형식으로 출력하세요.
        try{
            String path = "src/day16/인천광역시 부평구_인구 현황_20250131.csv";
            File file = new File( path );
            System.out.println( file.exists() );

            if( file.exists() ){
                FileInputStream fileInputStream = new FileInputStream( path );
                byte[] bytes = new  byte[ (int) file.length() ];
                fileInputStream.read( bytes );
                String str = new String( bytes, "EUC-KR" );
                System.out.println( str );
                String[] 행데이터 = str.split( "\n");
                for( int i = 0 ; i < 행데이터.length ; i++ ){
                    String row = 행데이터[i];
                    String[] 열데이터 = row.split( ",");
                    System.out.printf( "동별: [ %s ], 총 인구: [ %s ]명 \n" , 열데이터[0] , 열데이터[1] );
                }
            }
        }catch ( Exception e ){
            System.out.println( e );
        }
    } // main end
} // class end
