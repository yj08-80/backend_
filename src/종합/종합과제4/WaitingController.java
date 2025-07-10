package 종합.종합과제4;

public class WaitingController { // class start

//    2. WaitingController.java 클래스 설계 (Controller - static 활용)
//        · 대기 명단 배열을 private static final Waiting[] waitings = new Waiting[100]; 으로 선언합니다.
//            · 대기 등록 기능 메소드 addWaiting(String phone, int count)를
//            public static 으로 정의합니다.
//            - 매개변수로 받은 값들을 Waiting 클래스의 생성자에 전달하여 객체를 생성합니다.
//            - static으로 선언된 waitings 배열의 빈 공간을 찾아 생성된 객체를 저장하고,
//            성공 여부를 boolean으로 반환합니다.
//        · 대기 현황 조회 기능 메소드 getWaitingList()를 public static 으로 정의합니다.

    // 대기 명단 배열
    private static final Waiting[] waitings = new Waiting[100];
    // 대기 등록 기능 메소드 addWaiting을 public static 으로 정의
    public static boolean addWaiting( String phone , int count ){
        // Waiting 클래스의 생성자에 전달하여 객체를 생성
        Waiting waiting = new Waiting( phone, count);
        // 배열의 빈 공간을 찾아
        for( int i = 0 ; i<= waitings.length-1 ; i++ ){
            // 객체를 저장하고, 성공 여부를 boolean으로 반환
            if( waitings[i] == null ){
                waitings[i] = waiting;
                return true;
            }
        }
        return false;
    }
    // 대기 현황 조회 기능 메소드 getWaitingList()
    public static Waiting[] getWaitingList(){
        return waitings;
    }
} // class end
