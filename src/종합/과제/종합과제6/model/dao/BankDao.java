package 종합.과제.종합과제6.model.dao;

import 종합.과제.종합과제6.model.dto.BankDto;
import 종합.종합예제8.model.dao.BoardDao;

import java.util.ArrayList;

public class BankDao { // class start

    // 싱글톤
    private BankDao(){}
    private static final BankDao bankDao = new BankDao();
    public static BankDao getInstance(){
        return bankDao;
    }

    // 여러개 게시물들을 저장할 리스트 선언
    private ArrayList<BankDto> bankDB = new ArrayList<>();

    // 등록 기능 구현
    public boolean addBank( String phone , int count ){
        // result 기본 값 false
        boolean result = false;
        // dto 객체 생성
        BankDto bankDto = new BankDto( phone , count );
        // ArrayList(DB 역할)에 추가
        bankDB.add( bankDto );
        // 성공하면 true
        result = true;
        return  result;
    }

    // 전체조회 기능 구현
    public ArrayList< BankDto > getBankList(){
        return bankDB;
    }
} // class end























