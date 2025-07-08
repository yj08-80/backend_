package 종합.종합과제3;

public class WaitingController { // class start

    //대기 명단 데이터를 직접 관리하고 처리하는 클래스
    // 1. 멤버변수
    Waiting[] waitings = new Waiting[100];

    Boolean doPost( String phone , int count ){
        Waiting waiting = new Waiting();
        waiting.phone = phone;
        waiting.count = count;
        // waitings 배열의 빈 공간(null)을 찾아 생성된 객체를 저장한다
        for( int i = 0 ; i <= waitings.length -1 ; i++ ){
            if( waitings[i] == null ){
                waitings[i] = waiting;
                return true;
            }
        } // for end
        return false;
    }
    Waiting[] doGet(){
        return waitings;
        // 배열 타입 전체 반환
    }
} // class end
