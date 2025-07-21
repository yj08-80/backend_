package Day16;

import java.io.LineNumberReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {

        /*

        [ 예외 처리 ]
            1. 시스템 오류 : 시스템이 종료되는 심각한 수준의 문제

            2. 예외 : 개발자가 구현한 로직이나 사용자의 영향으로 인한 문제

            3. 예외 종류
                1) 일반 예외 : 컴파일(실행)될 때 예외 처리 코드 여부 겸사 예외
                            - 입출력, 네트워크, 파일, JBDC, 주로 자바외부통신
                    Class.forName
                    Thread.sleep()
                2) 실행 예외 : 컴파일(실행)될 때 예외 처리 코드 여부 검사 하지 않는 예외, 개발자의 (경험) 의존도가 높다

                * 웹/앱 라이브러리/프레임워크(SPRING)는 자동 예외처리

            4. 예외란
                - 예외/오류 발생시 예외를 고치는 게 아니라 **흐름 제어** va if 비슷
                - 프로그램을 24시간 중단 없이 실행하기 위한 안전한 로직 구현 < 100% 없다 --> 유지보수 >

            5. 예외 클래스
                ClassNotFoundException : 클래스를 못찾았을 때 발생되는 예외클래스
                InterruptedException : 흐름이 중단되었을때 발생되는 정보를 저장하는 클래스
                NullPointerException : 객체가 없는데 객체에 접근연산자 사용하면 발생 클래스
                NumberFormatException : 정수로 타입 불가능한 예외
                ArrayIndexOutOfBoundsException : 존재하지 않는 인덱스 호출 예외

            6. 사용법
                try{ 예외가 발생할 것 같은 코드 또는 일반예외 }
                catch( 예외클래스명 매개변수명 ){ 지정한 예외 발생시 처리할 코드 }
                catch( 예외클래스명 매개변수명 ){ 지정한 예외 발생시 처리할 코드 }
                catch( 예외클래스명 매개변수명 ){ 지정한 예외 발생시 처리할 코드 }
                finally{ 예외 여부 상관없이 무조건 실행되는 코드 }


         */

        // 예제에서는 강제로 예외 발생하는 상황 만듦


        // [1] 일반 예외 : 예외가 있던 없던 무조건 예외처리 해야한다
        try { // 1.일반예외 발생 코드를 try{} 감싼다.
            Class.forName("java.lang.String"); // Class.forName(클래스경로) : 해당 경로의 클래스를 알아오는 함수
        }catch ( ClassNotFoundException e ){ // 2. catch( 예외클래스명 매개변수명 ){}에서 예외발생시 처리할 코드
            System.out.println( "[예외발생1] String 클래스가 없습니다");
        } // try-catch end


        // [2] 일반 예외, 예외 발생
        try{
            Class.forName( "java.lang.String2" ); // String2 클래스는 존재하지 않아서 예외 발생한다
        }catch( ClassNotFoundException e ){
            System.out.println( "[예외발생2] String2 클래스가 없습니다." );
            // [예외발생] String2 클래스가 없습니다
        }

        // [3] 일반 예외
        try{
            Thread.sleep( 1000 ); // 코드 실행을 밀리초동안 일시정지 함수
        }catch( InterruptedException e ){
            System.out.println( "[예외발생3] sleep 도중에 오류 발생" );
        }

        // [4] 실행 예외 : 프로그램 실행 도중에 발생하는 예외, < 예측 >
        // ** NullPointerException : 객체가 없는데 객체를 호출하면 발생하는 예외
        try {
            String str1 = "강호동";
            System.out.println( str1.length() ); // length() 문자열 길이를 반환하는 함수
            String str2 = null; // 자바에서 null이란? 변수가 참조(저장)하는 값/객체가 없다 뜻
            System.out.println( str2.length() ); // .(접근연산자)란 객체 내 메소드 호출
        }catch ( NullPointerException e ){
            System.out.println( "[예외발생4] 객체가 없어서 .length 사용 불가능" );
        }


        // [5] 실행 예외 : NumberFormatException : 정수로 타입 불가능한 예외
        try{
            String str3 = "100"; // 문자 100 저장
            String str4 = "1aa"; // 문자 1aa 저장
            Integer.parseInt( str3 ); // Integer.parseInt(); 문자열 타입을 int 타입으로 반환하는 함수
            Integer.parseInt( str4 ); // 문자 100은 숫자 100이 될 수 있지만 1aa는 숫자1aa가 될 수 없다
        }catch ( NumberFormatException e ){
            System.out.println( "[예외발생5] 정수로 변환 불가능하다." );
        }

        // [6] 실행 예외 : ArrayIndexOutOfBoundsException : 존재하지 않는 인덱스 호출 예외
        try {
            int[] intArray = { 1, 2, 3 };
            System.out.println( intArray[0] ); // 0번 인덱스 존재
            System.out.println( intArray[4] ); // 4번 인덱스 존재x 오류 발생
        }catch ( ArrayIndexOutOfBoundsException e ){
            System.out.println( "[예외발생6] 없는 인덱스입니다." );
        }

        // [7] 실행 예외 :
        try {
            Scanner scan = new Scanner( System.in );
            System.out.print( "정수 입력: " );
            int value7 = scan.nextInt();
        }catch ( InputMismatchException e ){
            System.out.println( "[예외발생7] 입력한 타입이 불일치한다." );
        }

        // [8] 다중 catch와 finally, 상의킇래스 : Exception
        try{
            Integer.parseInt( "1aa" );
            int[] intArray = { 1 , 2, 3 };
            System.out.println( intArray[10] );

            String str = null;
            System.out.println( str.length() );
        }catch ( NumberFormatException e1 ){
            System.out.println( "e1" );
        }catch ( ArrayIndexOutOfBoundsException e2 ){
            System.out.println( "e2" );
        }catch ( NullPointerException e3 ){
            System.out.println( "e3" );
            // 주의할 점 : Exception클래스는 모든 예외를 처리하므로 다중 catch 맨 아래에서 정의한다.
        }catch ( Exception e4 ){
            System.out.println( "e4") ;
        }
        // 주의할 점 : 다중 catch시 먼저 발생한 예외부터 하나의 예외 발생하고 하나의 catch만 실행한다
        finally {
            System.out.println( "예외가 있던 없던 무조건 실행코드" );
        }





    }
}


















