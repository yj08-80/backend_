package 종합.과제.종합과제7.model.dao;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import 종합.과제.종합과제7.model.dto.WaitingDto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WaitingDao { // class start

    // 싱글톤
    private WaitingDao(){
        // 싱글톤 생성시에 csv 열기
        openCSV();
    }
    private static final WaitingDao instance = new WaitingDao();
    public static WaitingDao getInstance(){
        return instance;
    }

    // 데이터 만들기
    ArrayList<WaitingDto> waitDB = new ArrayList<>();

    // (1) 등록
    // 매소드 : WaitindDto waitingDto
    // 반환 값 : boolean
    public boolean waitWrite( WaitingDto waitingDto ){
        waitDB.add( waitingDto );
        saveCSV();
        return true;
    } // 등록 func end

    // (2) 전체 조회
    public ArrayList< WaitingDto > waitingPrint(){
        return waitDB;
    } // 전체 조회 func end

    // 데이터 경로
    private String path = "src/종합/과제/종합과제7/data.csv";

    // CSV 파일 연동 함수
    public void openCSV(){
        File file = new File( path );
        // 만약 file이 존재한다면
        if( file.exists() ){
            loadCSV();
        }else{ // 존재하지 않는다면
            try {
                file.createNewFile(); // 파일 생성
            } catch (IOException e) {
                System.out.println( e );
            }

        }
    } // openCSV func end


    // CSV 입력(호출) 함수
    private void loadCSV(){
        // 미리 위에서 선언해서 다같이 사용
        FileReader fileReader = null;
        try {
            fileReader = new FileReader( path );
        } catch (FileNotFoundException e) {
            System.out.println( e );
        }
        CSVReader csvReader = new CSVReader( fileReader );
        List< String[] > inData = null;
        try {
            inData = csvReader.readAll();
        } catch (IOException e) {
            System.out.println( e );
        }
        for( String[] row : inData ){
            String phone = row[0];
            // 문자열 배열 타입을 정수로 변환해서 대입
            int count = Integer.parseInt(row[1]);
            WaitingDto waitingDto = new WaitingDto( phone , count );
            waitDB.add( waitingDto );
        } // for end
        try {
            // 안전하게 닫기
            csvReader.close();
        } catch (IOException e) {
            System.out.println( e );
        }
    } // func end

    // CSV 출력(저장) 함수
    public void saveCSV(){
        // 미리 선언해서 다같이 사용
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter( path );
        } catch (IOException e) {
            System.out.println( e );
        }
        CSVWriter csvWriter = new CSVWriter( fileWriter );
        List< String[] > outData = new ArrayList<>();
        for( WaitingDto waitingDto : waitDB ){
            String[] row = { waitingDto.getPhone() , String.valueOf(waitingDto.getCount())};
            outData.add( row );
        } // for end
        csvWriter.writeAll( outData );
        try {
            // 안전하게 닫기
            csvWriter.close();
        } catch (IOException e) {
            System.out.println( e );
        }
    }


} // class end























