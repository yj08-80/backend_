package day09;

class D{
    //final int 최종변수; 오류: 초기값을 안넣었기 때문
    final int 최종변수 = 10;
    //static
    static int 비멤버공유변수; // 객체 내 포함하지 않고 클래스가 new하지 않아도 사용 가능
    //상수 만들기
    static final int 상수 = 10;
    //[5]
    void 멤버메소드1(){}
    static void  비멤버메소드(){}
    void 멤버메소드2(){}

}

public class Example2 { // class start
    void 멤버메소드(){}
    static void 비멤버메소드(){}
    public static void main(String[] args) { // main start

        // [1] final 멤버변수 호출
        D d = new D();
        System.out.println( d.최종변수 ); // 호출 가능
        // d.최종변수 = 20; -> 수정 불가능

        // [2] static 정적변수에 호출, 클래스명.정적변수명;
        System.out.println( D.비멤버공유변수 ); // 객체 없이 static 가능
        D.비멤버공유변수 = 20;
        System.out.println( d.비멤버공유변수 ); // 객체도 static 가능

        // [3] 상수 호출
        System.out.println( D.상수 );

        // [4] static 메소드 내 statinc 유무 메소드 호출
        // 멤버메소드(); 부랏능
        Example2 exam = new Example2();
        exam.멤버메소드(); // 가능 : 객체 통한
        비멤버메소드(); // 가능 : 객체 없이 사용 가능

        // [5] static 메소드가 아닌 static 유무 메소드 호출

        /*

        [ final ]
            1. 고정 상태를 정의할 때 사용되는 키워드
            2. 사용법
                final 타입 멤버변수
            3. 주의할 점 : 초기값이 무조건 존재 해야한다.

        [ static ]
            1. 프로그램이 실행될 때 메모리가 할당되고 프로그램이 종료될 때 메모리가 삭제되는 키워드
            2. 사용법
                static 타입 멤버변수 -------> static변수/정적변수
                주의할점 : 멤버변수(객체내변수) vs static(우선할당)
                    1) 프로그램 내 딱 1개만 존재하는 변수를 선언할 때 사용, 서로 다른 객체들이 공유해서 사용한다.
        [ 상수 ] : 변하지 않는 변수
            1. 사용법 : static final 타입 상수명;
            2. 주의할 점 : 1) 수정 불가능 2) 프로그램 내 딱 1개만 존재 3) 상수명 대문자 사용

        [ static 유무 중요한 이유 ]
            ***** : static으로 선언된 메소드는 같은 클래스 내 메소드를 호출할 수 없다.
            // 방법1 : 객체를 생성하여 객체를 통해 static 아닌 메소드 호출한다

            class Test{

            }
            static void main3(){ }
            void main(){ }
            static void main(){
                main2(){ } // 불가능 : main 함수는 우선할당이 되면서 main2가 누구세요?
                new Test().main(); // 가능
                main3(){ } // 가능 : main 함수는 우선할당이 되면서 우선할당된 main3가 알고있다.
            }
         */
    } // main end
} // class end
