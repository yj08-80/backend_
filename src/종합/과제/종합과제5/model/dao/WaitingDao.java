package 종합.과제.종합과제5.model.dao;

import 종합.과제.종합과제5.model.dto.WaitingDto;

public class WaitingDao { // class start

    // 싱글톤
    private WaitingDao(){}
    private static final WaitingDao dao = new WaitingDao();
    public static WaitingDao getInstance(){
        return dao;
    }

    // 데이터베이스
    private WaitingDto[] waitingDB = new WaitingDto[100];

    // 1. 등록 처리 메소드
    public boolean waitingWrite( WaitingDto waitingDto ) {
        for (int i = 0; i <= waitingDB.length - 1; i++) {
            if (waitingDB[i] == null) {
                waitingDB[i] = waitingDto;
                // 등록 성공
                return true;
            } // if end
        } // for end
        return false;
    }

    // 2. 조회 처리 메소드
    public WaitingDto[] waitingPrint(){
        return waitingDB;
    }

} // class end



















