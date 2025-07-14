package 종합.과제.종합과제6.controller;

import 종합.과제.종합과제6.model.dao.WaitDao;
import 종합.과제.종합과제6.model.dto.WaitDto;

import java.util.ArrayList;

public class WaitController { // class start

    // 싱글톤
    private WaitController(){}
    private static final WaitController control = new WaitController();
    public static WaitController getInstance(){
        return control;
    }

    // dao 싱글톤 가져오기
    private WaitDao waitDao = WaitDao.getInstance();

    // 등록 기능 구현
    public boolean addWait( String phone , int count ){
        // boolean 기본값 false
        boolean result = false;
        // DAO에 등록 요청 → 성공 여부 반환
        result = waitDao.addWait( phone , count );
        // return bankDao.addBank(phone, count); 도 가능
        return result;
    }

    // 전체조회 기능 구현
    public ArrayList<WaitDto> getWaitList(){
        // bankDao에서 리스트 전체 받기
        return waitDao.getWaitList();
    }
} // class end

