package 종합.과제.종합과제6.model.dao;

import 종합.과제.종합과제6.model.dto.WaitDto;

import java.util.ArrayList;

public class WaitDao { // class start

    // 싱글톤
    private WaitDao(){}
    private static final WaitDao waitDao = new WaitDao();
    public static WaitDao getInstance(){
        return waitDao;
    }

    // 여러개 게시물들을 저장할 리스트 선언
    private ArrayList<WaitDto> waitDB = new ArrayList<>();

    // 등록 기능 구현
    public boolean addWait( String phone , int count ){
        // result 기본 값 false
        boolean result = false;
        // dto 객체 생성
        WaitDto waitDto = new WaitDto( phone , count );
        // ArrayList(DB 역할)에 추가
        waitDB.add( waitDto );
        // 성공하면 true
        result = true;
        return  result;
    }

    // 전체조회 기능 구현
    public ArrayList< WaitDto > getWaitList(){
        return waitDB;
    }
} // class end
