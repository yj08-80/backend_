package 종합.심화과제2.model.dao;

import 종합.종합예제7.model.dao.BoardDao;

public class BankDao { // class start

    // 싱글톤 만들기
    private BankDao(){}
    private static final BankDao dao = new BankDao();
    public static BankDao getInstance(){
        return dao;
    }

    // 데이터베이스
    BankDao[] bankDao = new BankDao[100];

    // 등록 메소드

    // 조회 메소드
} // class end

