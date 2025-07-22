package 종합.종합예제9.model.dao;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import 종합.종합예제9.model.dto.BoardDto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BoardDao { // class start

    // 싱글톤 : 지정한 클래스 내 하나의 객체를 미리 만들고 프로그램 내 하나의 객체만 존재
    private BoardDao(){
        openCSV();// 싱글톤 생성시 csv 로드
    }


    private static final BoardDao instance = new BoardDao();
    public static BoardDao getInstance(){
        return instance;
    }

    // DB 대신할 리스트 선언 < 추후에 사용하지 않음 >
    ArrayList<BoardDto> boardDB = new ArrayList<>();

    // (1) 등록
    public boolean boardWrite( BoardDto boardDto ){
        // boolean : 반환타입으로 성공시 true, 실패시 false
        // boardWrite : 임의의 함수명
        // BoardDto boardDto : 매개변수
        boardDB.add( boardDto ); // 1. 리스트(db)에 DTO를 저장한다.
        saveCSV(); // * CSV 저장
        return true;
    }

    // (2) 전체 조회
    public ArrayList< BoardDto > boardPrint(){
        // ArrayList<BoardDto> : 반환타입으로 모든 dto를 반환한다
        return boardDB; // boardDB 변수의 타입은 ArrayList<BoardDto>이다.
    }

    private String path = "src/종합/종합예제9/data.csv";
    //-------------------- 1. CSV 파일 연동 함수 --------------------//
    public void openCSV(){
        File file = new File( path ); //파일 객체 생성
        if( file.exists() ){ // 만약에 파일이 존재하면 정보 불러오기
            loadCSV();
        }else{ // 아니면 파일 생성
            try {
                file.createNewFile(); // 파일 생성
            }catch ( IOException e ){
                System.out.println( e );
            }
        }
    } // func end

    //-------------------- 1. CSV 입력(호출) 함수 --------------------//
    private void loadCSV(){
        try {
            FileReader fileReader = new FileReader( path ); // (1) FileReader 이용한 읽기모드 객체 생성
            CSVReader csvReader = new CSVReader( fileReader ); // (2) CSVReader에 FileReader 대입하여 CSV객체 생성
            List< String[] > inData = csvReader.readAll(); // (3) .readAll 함수로 모든 CSV 정보를 읽어온다
            for( String[] row : inData ){
                String content = row[0];
                String writer = row[1];
                BoardDto boardDto = new BoardDto( content , writer );
                boardDB.add( boardDto ); // (6) 생성은 dto를 리스트에
            } // for end
            csvReader.close(); // (7) csvReader 안전하게 닫기
        } catch ( Exception e) {
            System.out.println( e );
        } // func end
    }
    //-------------------- 2. CSV 출력(저장) 함수 --------------------//

    public void saveCSV(){
        // (1) FileWriter 파일 쓰기모드 객체 생성
        try {
            FileWriter fileWriter = new FileWriter(path);
            // (2) CSVWriter에 fileWriter 객체를 대입하여 생성
            CSVWriter csvWriter = new CSVWriter( fileWriter );
            // (3) 빈 리스트 생성
            List<String[]> outData = new ArrayList<>();
            // (4) 현재 모든 정보( boardDB )를 outData에 담아준다
            for (BoardDto boardDto : boardDB) {
                String[] row = {boardDto.getContent(), boardDto.getWriter()};
                outData.add(row); // outData에 저장
            } // for end
            csvWriter.writeAll(outData);
            csvWriter.close(); // 안전하게 객체 닫기
        }catch ( Exception e ){
            System.out.println( e );
        }

    }
} // class end
