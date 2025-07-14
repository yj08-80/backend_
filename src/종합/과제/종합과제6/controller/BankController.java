package 종합.과제.종합과제6.controller;

import 종합.과제.종합과제6.model.dao.BankDao;
import 종합.과제.종합과제6.model.dto.BankDto;

import java.util.ArrayList;

public class BankController { // class start

    // 싱글톤
    private BankController(){}
    private static final BankController control = new BankController();
    public static BankController getInstance(){
        return control;
    }

    // dao 싱글톤 가져오기
    private BankDao bankDao = BankDao.getInstance();

    // 등록 기능 구현
    public boolean addBank( String phone , int count ){
        // boolean 기본값 false
        boolean result = false;
        // DAO에 등록 요청 → 성공 여부 반환
        result = bankDao.addBank( phone , count );
        // return bankDao.addBank(phone, count); 도 가능
        return result;
    }

    // 전체조회 기능 구현
    public ArrayList<BankDto> getBankList(){
        // bankDao에서 리스트 전체 받기
        return  bankDao.getBankList();
    }
} // class end
