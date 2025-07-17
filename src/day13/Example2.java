package day13;

    // 자바의 모든 클래스는 자동으로 extends Object 이므로 자바는 100% 객체지향이다.
    // Object - 슈퍼클래스, 최상위클래스

class A{ // A class start

    // A 클래스 생성자
    A(){
        System.out.println( "A 객체 탄생" );
    }
} // A class end
class B extends A{ // B는 A로부터 상속받는다
    // B 클래스 생성자
    B(){
        System.out.println( "B는 A로부터 상속받는다." );
    }
} // B class end

class C extends A{ // C
    C(){
        System.out.println( "C는 A로부터 상속받는다." );
    }
} // C


class D extends B{ // D
    D(){
        System.out.println( "D는 B로부터 상속받는다." );
    }
} // D

class E extends C{ // E
    E(){
        System.out.println( "E는 C로부터 상속받는다." );
    }
} // E



public class Example2 { // class start
    public static void main(String[] args) {
        // (1)A클래스로 객체 생성시 총 객체수 : 2개 ( Object,A )
        A a = new A();

        // (2) B클래스로 객체 생성시 총 객체수 : 3개( Object,A,B )
        B b = new B();

        // (3) C클래스로 객체 생성시 총 객체수: 3개( Object,A,C )
        C c = new C();

        // (4) D클레스로 객체 생성시 총 객체수 : 4개( Object,A,C,D )
        D d = new D();

        // (5) E클래스로 객체 생성시 총 객체수 : 4개( Object,A,C,E )
        E e = new E();

        A a1 = b; // b객체(값)는 B타입
        Object o1 = b; // b객체(값)는 Object타입 변환 가능
        // 오류 : B b2 = c;

        // (7) 강제타입변환
        B b2 = (B)a1; // 가능! a1 태생 확인
        A a2 = e;
        C c1 = (C)a2; // 가능! 강제
        // B b3 = (B)a2; // 문법적인 오류는 아니지만 실행오류

        // (8) 인스턴스(객체/값) 타입 확인 방법
        // 객체 instanceof 타입/클래스명 : 객체가 지정한 클래스 타입 확인
        // 강제타입 변환 전에 확인 목적
        System.out.println( a instanceof Object ); // true
        System.out.println( b instanceof A ); // true
        //System.out.println( e instanceof B ); // false
        System.out.println( a2 instanceof C ); // true
        System.out.println( a2 instanceof B ); // false

        // (9) 상속 활용처
        // 1. 웹/앱 라이브러리
        // 2.
        //      코드 치다가 명령어(코드)가 중복되면 메소드화
        //      클래스를 정의하다가 다른 클래스와 멤버변수가 중복되면 상속화
    } // main end
} // class end









