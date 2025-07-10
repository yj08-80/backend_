package day09;

import day09.package1.A;
import day09.package2.C;

public class Example1 { // class start
    public static void main(String[] args) { // main start
        /*

        다형성, 캡슐화
        [ 접근 제한자 ] : 캡슐(알약 --> 내부감추기)화 특징
            1. 정의 : 클래스, 멤버변수, 생성자, 메소드 등등 접근(호출/사용) 제한한다
                -왜? 실무에서는 비정상적인(보안이 필요한) 접근에서 필수로 사용
            2. 종류
                1) public : 공개, 프로젝트 폴더 내 어디서든 접근 가능
                2) private : 비공개, 현재 클래스에서만 접근 가능
                3) (default) : (키워드 선언 x) 같은/하위 패키지에서만 접근 허용
                4) protected : 같은/하위 패키지에서만 접근 가능, 상속관계 예외
            3. 사용법 : 주로 타입 앞에 존재
                1) 멤버변수 타입 앞에, 접근제한자 타입 변수명;
                2) 생성자명 앞에, 접근제한자 생성자명(){}
                3) 클래스명 앞에, 접근제한자 class 클래스명{}
                4) 메소드명 반환타입 앞에, 접귽제한자 반환타입 메소드명(){}

        [ 패키지 ]
            1. 정의 : 파일들을 저장하는 공간, 식별자
            2. 주의할 점 : 같은 패키지 내 같은 클래스명은 존재할 수 없다.
                        * 다른 패키지 내 같은 클래스명으로 존재할 수 있다.
            3. 사용법
                import : 같은 패키지가 아닌 다른 패키지의 클래스 가져오는 키워드
                    예) import 경로.클래스명;
                    * 자동완성 사용하면 자동 import 가능
                    * 단) java.lang 패키지는 예외/생략가능
                        -> System클래스, String클래스 등

        [ getter and setter ]
            1. 정의 : 클래스 내 private 멤버변수를 다른 클래스가 사용할 수 있도록
            2. 관례적으로
                저장/대입 목적( setter ) : public set멤버변수 ( 타입 매개변수 ){
                                this 맴버변수명 = 매개변수;
                              }
                호출/반환 목적( getter )  : public get멤버변수 ( 타입 매개변수 ){
                                this 맴버변수명 = 매개변수;


         */

        // [1] 하위 package1 폴더 내 A클래스 접근
        A a = new A();
        System.out.println( a.공개변수 ); // 가능
        // System.out.println( a.비공개변수 ); // 오류 발생 : 해당 클래스에서만 가능
        // System.out.println( a.일반변수 ); // 오류 발생 : 같은 패키지에서만 가능

        // [2] 하위 package2 폴더 내 C클래스 접근
        C c = new C();
        // System.out.println( c.비공개변수 ); // 오류 발생
        System.out.println( c.반환메소드() ); // 가능
    } // main end
} // class end












