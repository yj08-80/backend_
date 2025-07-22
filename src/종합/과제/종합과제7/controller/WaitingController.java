package 종합.과제.종합과제7.controller;


import 종합.과제.종합과제7.model.dao.WaitingDao;
import 종합.과제.종합과제7.model.dto.WaitingDto;

import java.util.ArrayList;

public class WaitingController { // class start

    // 싱글톤
    private WaitingController(){}
    private static final WaitingController instance = new WaitingController();
    public static WaitingController getInstance(){
        return instance;
    }

    // Dao 호출
    private WaitingDao waitingDao = WaitingDao.getInstance();


    // (1) 등록
    public boolean waitWrite( String phone , int count ){
        WaitingDto waitingDto = new WaitingDto( phone, count );
        boolean result = waitingDao.waitWrite( waitingDto );
        return result;
    }

    // (2) 전체조회
    public ArrayList< WaitingDto > waitingPrint(){
        ArrayList< WaitingDto > result = waitingDao.waitingPrint();
        return result;
    }
} // class end






















