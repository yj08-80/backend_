package day21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example4 { // class start
    public static void main(String[] args) { // main start
        /*

        [ 쓰레드풀 ]
            1. 정의 : 미리 일정 개수의 쓰레드를 생성하고 필요에 따라 재사용하는 방식
            2. 목적 : 작업이 들어올 때마다 새로운 쓰레드가 아닌 기존 쓰레드 이용한다.
            3. 효과 : 쓰레드 재사용, 자원 효율성, 과부하 방지 등ㄷ,ㅇ
            4. 구조 : 작업의 요청을 '큐'라는 자료 구조로 배치하여 순서대로 쓰레드풀에서 대기중인 쓰레드에게 작업 배정
                * 큐? 자료의 데이터들을 요청 순서대로 처리하는 방법
                ---------------------------------
                input [요청3] [요청2] [요청1] output
                ---------------------------------]
            5. 생활 속 예시 : 콜센터 : 유재석이 콜센터에 전화하면 대기중인 직원1이(Thread)가 존재하면 처리 아니면 대기

                콜 요청 ----------->  직원1( 쓰레드 )
                                    직원2( 쓰레드 )
                                    직원3( 쓰레드 )

            6. 사용처
                1) 통켓[자바웹클래스]
                2) JDBC
                3) 업로드/다운로드
                4) 채팅

         */

        // [1] 작업스레드를 배정하기
        // ExecutorService executorService = Executors.newFixedThreadPool( 쓰레드풀에 저장할 쓰레드수 );
        ExecutorService executorService = Executors.newFixedThreadPool( 3 );

        // [2] 반복문을 이용하여 3개 쓰레드를 생성하여 쓰레드풀에 넣어주기
        for (int i = 1; i <= 30 ; i++) {
            String name = "Thread : " + i;
            // [3] 스레드 생성, 익명 구현체
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(2000);
                    } catch (Exception e) {

                    }
                    System.out.println("Task Thread ? : " + name);
                }// run end
            }; // 익명구현체 end
            // [4] 생성된 쓰레드를 쓰레드풀에 넣어주기
            executorService.submit(runnable);
        } // for end

        // [5] 쓰레드풀 종료
        executorService.shutdown();
    } // main end
} // class end
