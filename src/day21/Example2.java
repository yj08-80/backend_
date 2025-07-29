package day21;

//------------------------------------//

import java.time.LocalTime;
import java.util.Scanner;

// [2] 시계 쓰레드
class 시계스레드 implements Runnable {
    @Override
    public void run() {
        while (true) { // 무한루프
            // 1. 현재 시간 출력
            System.out.println(LocalTime.now());
            // 2. 1초(1/1000) 간 일시정지
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
    }
}

//------------------------------------//

// [3] 타이머 쓰레드
class 타이머스레드 extends Thread{
    boolean state = true;

    @Override
    public void run() {
        int second = 0; // 타이머가 계산하는 초
        for( ; ; ){
            if( state == false ) break;
            second++; // 1초 증가
            System.out.println( "[타이머] 초 : " + second ); // 출력
            try {
                Thread.sleep( 1000 ); // 현재 쓰레드를 1초간 일시정지
            }catch ( Exception e ){

            }

        }
    }
}

//------------------------------------//

public class Example2 { // class start
    public static void main(String[] args) { // main start
        // [1] 메인 쓰레드(입력) : main(String[] args) {}

        // [2] 시계 쓰레드
        시계스레드 시계스레드 = new 시계스레드(); // 구현체
        Thread thread1 = new Thread( 시계스레드 );
        thread1.start(); // thread 객체가 갖는 구현체를 실행


        // [3] 타이머 쓰레드
        타이머스레드 thread2 = null;

        for( ; ; ){
            System.out.println( "타이머 1.on 2.off : " );
            Scanner scan = new Scanner( System.in );
            int ch = scan.nextInt();
            if( ch == 1 ){ // 타이머 쓰레드 실행
                thread2 = new 타이머스레드(); // 쓰레드 객체 생성
                thread2.start(); // 쓰레드 객체 실행
            }else if( ch == 2 ){ // 타이머 쓰레드 종료
                thread2.state = false; // 상태변경 해서 안전하게 종료
            }
        }


    } // main end
} // class end










