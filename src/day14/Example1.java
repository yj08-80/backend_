package day14;

class 상위클래스{ // class start
    // 멤버변수
    int value1 = 10;
    int value2 = 20;

    // 생성자
    상위클래스(){
        System.out.println( "[상위클래스 인스턴스 생성]" );
    }

    //메소드
    void showValue(){
        System.out.println( "[상위클래스의 메소드 실행]" );
    }
} // class end

//---------------------------------------------------//

class 하위클래스 extends 상위클래스{ // class start
    // 멤버변수
    int value3 = 30;
    int value2 = 40;

    // 생성자
    하위클래스(){
        System.out.println( "[하위클래스 인스턴스 생성]" );
    }

    // 메소드
    void showValue2(){
        System.out.println( ">>하위클래스 메소드2 실행<<" );
    }

    // 메소드
    void showValue(){
        System.out.println( " 하위클래스의 메소드 실행");
    }
} // class end

//--------------------------------------------------//

public class Example1 { // class start
    public static void main(String[] args) {
        // (1) 상위클래스 객체 생성
        상위클래스 obj1 = new 상위클래스();
        obj1.showValue();
        //obj1.showValue2(); - 하위클래스의 멤버는 접근 불가

        // (2) 하위클래스 객체 생성
        하위클래스 obj2 = new 하위클래스();
        obj2.showValue(); // 현재타입
        obj2.showValue2(); // 상위타입 접근 가능

        // (3) 멤버변수명이 동일할 때 구분
        System.out.println( obj2.value1 ); // 상위 멤버변수
        // 상위클래스의 멤버변수
        System.out.println( obj2.value1 ); // 10
        // 현재클래스의 멤버변수
        System.out.println( obj2.value3 ); // 30
        // 만일, 상위타입/ 하위타입 내 동일한 멤버변수명이 존재할 때 현재타입이 우선순위를 가짐
        System.out.println( obj2.value2 ); // 40

        // 하위타입에서 상위타입으로 변환 후 동일한 멤버변수 호출시
        상위클래스 obj3 = obj2;
        System.out.println( obj3.value2 ); // 20

        // (4) 메소드명이 동일할 때 구분 : 오버라이딩
        // 메소드는 객체마다 할당이 아니고 메소드는 모든 객체들이 공유
        // 오버로딩 vs 오버라이딩
        // 오버라이딩 : 상위클래스로부터 메소드를 재정의
        // 주의할점 : 메소드가 동일할 때 오버라이딩 메소드 최우선
        obj2.showValue(); // obj2(하위타입) 일때 하위타입 메소드 실행
        obj3.showValue(); // obj3(상위타입) 일때 하위타입 메소드 실행
        상위클래스 obj4 = obj2;
        obj4 .showValue(); // obj4(상위타입) 일때 '태생'타입 메소드 우선
        상위클래스 obj5 = new 상위클래스();
        obj5.showValue();

    }
} // class end























