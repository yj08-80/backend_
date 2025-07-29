package day21;

// (1) 유저1 클래스[작업스레드1]
class User1 extends Thread{
    public Calculator calculator;

    @Override
    public void run() { // 작업스레드 메소드 구현
        calculator.setMemory( 100 ); // 계산기에 100 넣기
    }
} // class end

//------------------------------------//

// (2) 유저2 클래스[작업스레드2]
class User2 extends Thread{
    public Calculator calculator;

    @Override
    public void run() { // 작업스레드 메소드 구현
        calculator.setMemory( 200 ); // 계산기에 200 넣기
    }
}

//------------------------------------//

// (3) 계산기 클래스[객체]
class Calculator{
    public int memory; // 멤버변수
    // 메소드
    public synchronized void setMemory( int memory ){
        // synchronized : 두 개 이상의 쓰레드가 해당 메소드 사용시 먼저 요청한 쓰레드가 점령하고 종료될 때까지 await(대기)한다.

        this.memory = memory;
        try {
            Thread.sleep( 2000 ); // 2초간 일시정지
        }catch ( Exception e ){

        }
        System.out.println( this.memory ); // 멤버변수 확인
        // user1 쓰레드가 2초간 일시정지 도중에 user2 쓰레드가 200으로 대입
        // 주의할 점 : 두 개 이상의 쓰레드가 하나의 메소드를 호출할 때 비동기 처리를 한다.
        // 동기화 : 두 개 이상의 쓰레드가 하나의 메소드를 순서대로 호출하고 처리할 때 사용한다.
        // 동기화 목적 : 두 개 이상의 쓰레드가 먼저 메소드를 호출하고 다른 쓰레드는 wait 상태로 만든다.
        // 예) 비동기화 : 동시에 달리기, 동기화 : (기다렸다가) 이어달리기
    }
}

//------------------------------------//

public class Example3 { // class start
    public static void main(String[] args) { // main start

        // [ 동기화와 비동기화 ]
        // [ synchronized ] 동기화
        //      1. 정의 : 메소드에 lock(락) 사용하여 메소드를 점령한다.
        //      2. 목적 : 여러 쓰레드가 동시에 하나의 쓰레드를 사용하면 멤버변수(코드) 충돌 생길 수 있다.
        //      3. 비교
        //         동기화                      비동기화
        //         함번에 하나의 쓰레드가 처리      여러 개의 쓰레드가 동시 처리
        //         처리 순서 보장                처리 순서 보장 안됨
        //
        //      4. 사용법
        //          (방법1) 메소드 선언부의 반환타입 앞에 'synchronized' 키워드 붙인다
        //          (방법2) synchronized(this){ } 블럭 이용한다.
        // 1. 계산기 객체를 하나 생성한다.
        Calculator calculator = new Calculator();
        // 2. 하나의 계산기를 두 개의 쓰레드(객체)에 대입한다.
        User1 user1 = new User1();
        user1.calculator = calculator;

        User2 user2 = new User2();
        user2.calculator = calculator; // user1과 같은 객체
        // * 두 개의 쓰레드가 동일한 (계산기) 객체정보를 갖는다.

        // 3. 두 쓰레드 실행
        user1.start();// user1은 100 넣기 : 200

        user2.start(); // user1은 200 넣기 : 200

    } // main end
} // class end
