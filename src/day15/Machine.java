package day15;

import java.util.concurrent.CountDownLatch;

public class Machine { // class start
    // 생성자
    Machine(){
        System.out.println( "부모 클래스 생성자 실행" );
    }
} // class end

class Computer extends Machine{
    Computer(){
        System.out.println( "자식 클래스 생성자 실행" );
    }
}
