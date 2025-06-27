package day01;

public class Example2 { // class start : 모든 자바코드는 클래스 안에 작성한다
    //(1)main함수 선언 : main + 엔터(자동완성)
    public static void main(String[] args) {
        // (2) 리터럴 : (JAVA) 언어들이 미리 정의한 데이터
        // 3 , '김' , "김현수" , 3.14 , true   *JS에서는 '작은따옴표'와 "큰따옴표: 구분이 없지만 자바는 있음
        // 리터럴의 모든 정수는 int , 모든 실수는 double ,
        // (3) 출력함수
        // JS : console.log(); 스크립트는 세미콜론 선택이지만
        // JAVA : System.out.print( 리터럴 / 변수 / 연산 / 함수 등); 자바에서는 무조건 써야함
        //(4) main 함수 실행 : ctrl + shift + f10
        System.out.println( 3 ); // 리터럴 3 출력
        System.out.println( 3.14 ); // 리터럴 3.14 출력
        System.out.println( '김' ); // 리터럴 '김' 출력
        System.out.println( "김현수" ); // 리터럴 "김현수" 출력
        System.out.println( true ); // 리터럴 true 출력
        // (5) 자료형/타입           * 기본자료형 vs 참조자료형
            // 정수 : byte, short, int(*), long
            // 실수 : float, double(*)
            // 문자 : char     문자열 : String
            // 논리 : boolean

        // (6) 리터럴 값을 변수(*하나의 자료를 저장)에 대입하기
        // --> 자로형 변수명 = 리터럴;
            //1.boolean 타입 : true와 false만 저장
        boolean bool1 = true; // 리터럴 true를 저장 가능한 타입 : boolean
        boolean bool2 = false;
        //boolean bool3 = 3;  // 3이라는 리터럴은 boolean에 저장 불가 x
        System.out.println( bool1 );
        System.out.println( bool2);
            // 2.char 타입 : '작은따옴표' 으로 감싼 문자 1개 작성
        char ch1 = 'A';
        //char ch2 = 'ABC'; // 불가능, 문자열(문자여러개) x
        //char ch3 = "ABC"; // "" 감싼 자료도 불가능 x
        System.out.println( ch1 );
            // 3.String 클래스타입:"큰따옴표"로 감싼 문자 여러개 저장
        String str1 = "ABC";
        //String str2 = 'ABC'; x JAVA에는 백틱 존재x
        System.out.println( str1 );
            // 4.byte 타입 :-128 ~ +127  , 1바이트
        byte b1 = 100;
        //byte b2 = 300; x
        System.out.println( b1 );
            // 5. short 타입 : +- 3만 정도  , 2바이트
        short s1 = 32000;
        //short s2 = 50000; x
        System.out.println( s1 );
            // 6. int 타입 : +- 21억 정도   , 4바이트 , 정수 리터럴*
        int i1 = 2100000000;
        //int i2 = 3000000000; x
        System.out.println( i1 );
            // 7. long 타입 : +- 21억 이상  , 8바이트 , 리터럴 뒤에 L/l
        //long l1 = 3000000000; // 불가능 : 키보드로 입력한 모든 값은 (리터럴) 정수가 int라서
        long l2 = 3000000000L;
            // 8. double 타입 : 실수 소수점 17자리까지 표현, 실수 리터럴
        double d1 = 0.12345678;
        System.out.println( d1 );
        // 9. float 타입 : 실수 소수점 8자리까지 표현, 리터럴 뒤에 F/f
        //float f1 = 0.123456789123456789; // x
        float f1 = 0.123456789123456789F;
        System.out.println( f1 );

        // ********* 주의할 점 : double vs Double


    } // main end
} // class end
