package day17;

import au.com.bytecode.opencsv.CSVReader;

import java.io.FileReader;
import java.nio.charset.Charset;
import java.util.List;

public class Example1 { // class start
    public static void main(String[] args) { // class start
        try {
            // OPENCSV 라이브러리 목적 : CSV 규칙에 따른 자동 분해/분리
            // * OPENCSV 라이브러리 사용해보기
            // new CSVReader( new FileReader(파일경로) ) : CSV 읽어오는 클래스
                // --> .readAll() : List<String[]> 타입으로 반환하는 함수
            // new CSVWriter( new FileWriter(파일경로) ) : CSV 출력하는 클래스
                // --> .writeAll( List객체 ) : List객체를 내보내는 함수

            // 1. 파일 경로 지정
            String path = "src/day16/인천광역시 부평구_맛있는 집.csv";
            // 2. FileReader 파일 읽기모드 객체 생성, 예외처리, 한글 인코딩(번역)
            FileReader fileReader = new FileReader( path , Charset.forName( "EUC-KR" ));
            // 3. CSVReader 클래스 이용한 file 읽어오기
            CSVReader csvReader = new CSVReader( fileReader );
            // 4. .readAll() : ArrayList<String[]> 반환
            List< String[] > inData = csvReader.readAll();
                // List 인터페이스 타입 vs ArrayList 구현체
            // 5. 반복문 이용한 순회
            for( int i = 0 ; i < inData.size() ; i++ ){
                String[] row = inData.get(i);
                System.out.printf( "업소명 : %s , 지정메뉴 : %s \n" , row[1] , row[3] );
            }
        }catch( Exception e ){
            System.out.println( e );
        }
    } // class end
} // class end













