package 종합.종합과제5.controller;

import 종합.종합과제5.model.dao.WaitingDao;
import 종합.종합과제5.model.dto.WaitingDto;

public class WaitingController { // class start

    // Controller 싱글톤 만들기
    //     private 클래스명(){}
    //    private static final 클래스명 instance = new 클래스명();
    //    public static 클래스명 getInstance(){
    //        return instance;
    //    }
    private WaitingController(){}
    private static final WaitingController control = new WaitingController();
    public static WaitingController getInstance(){
        return control;
    }

    // DAO 싱글톤 가져오기
    private WaitingDao waitingDao = WaitingDao.getInstance();

    // 등록 처리 메소드
    public boolean waitingWrite(String phone , int count ){
        WaitingDto waitingDto = new WaitingDto( phone , count );
        boolean result = waitingDao.waitingWrite( waitingDto );
        return result;
    }

    // 조회 처리 메소드
    public  WaitingDto[] waitingPrint(){
        WaitingDto[] result = waitingDao.waitingPrint();
        return result;
    }
} // class end
















