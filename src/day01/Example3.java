package day01;

public class Example3 { // class start
    public static void main(String[] args) {
        /*

        [출력함수]
            System : 시스템 관련 기능 제공하는 클래스
            out : 출력 관련 객체를 반환하는 변수
            (1) System.out.print();     : 출력 함수
            (2) System.out.printIn();  *  : 출력 후 줄바꿈 함수
            (3) System.out.printf( "형식" , 값 );    : f(format) 정해진 형식의 출력 함수
                [ 형식 ]
                %s : 문자열 위치
                %c : 문자 위치
                %d : 정수 위치
                %f : 실수 위치
                [ 자릿수 맞춤 ]
                %자릿수d : 자릿수만큼 자릿수 차지, 만일 비어있으면 공백, 오른쪽 정렬
                %-자릿수d : 자릿수만큼 자릿수 차지, 만일 비어있으면 공백, 왼쪽 정렬
                %0자릿수d : 자릿수만큼 자릿수 차지, 만일 비어있으면 0채움
                [ 소수점 자릿수 맞춤 ]
                %전체자릿수, 소수점자릿수f : (소수점 포함) 전체 자릿수만큼 자릿수 차지

                [ 이스케이프 / 제어 문자 ] : 특수문자에 기능이 포함
                \n : 줄바꿈
                \t : 들여쓰기
                \\ : '\' 백슬래시 하나 출력
                \' : 작은따옴표 출력
                \" : 큰따옴표 출력



        */

        //[1]
        System.out.println( "자바안녕1" ); // 자료 출력 후 줄바꿈처리
        System.out.println( "자바안녕2" ); // 자료 출력 후 줄바꿈처리

        System.out.print( "자바안녕3" ); // 자료 출력
        System.out.print( "자바안녕4" ); // 자료 출력

        System.out.printf( "%s", "자바안녕5" );

        //[2]
        String name = "유재석"; // String(문자열타입) name(변수명) =(대입) "유재석"(자료)
        int age = 40; // int(정수타입) age(변수명) =(대입) 40(자료)
        System.out.printf( "저는 %s이고 나이는 %d입니다." , name , age );

        //vs

        System.out.println( "저는" + name +  "이고 나이는" + age +  "입니다" ); // 연결연산자 사용
        System.out.printf( "저는 %s이고 나이는 %6d입니다 \n", name , age ); // %6d는 6자리의 정수를 표현하겠다는 뜻
        System.out.printf( "저는 %s이고 나이는 %-6d입니다 \n" , name, age );
        System.out.printf( "저는 %s이고 나이는 %06d입니다 \n" , name , age ); // %06d는 6자릿수 안에 정수 표현, 빈자리는 0
        System.out.printf( "저는 %s이고 나이는 %5.2f입니다 \n" , name , 188.257 ); // 5자릿수 안에 실수 표현 , 소수점은 2자리까지


        //[3]
        System.out.println( "안녕1\n안녕2" ); // \n 줄바꿈 처리
        System.out.println( "안녕3\t안녕4" ); // \t 들여쓰기
        System.out.println( "안녕5\'안녕6\'"); // \' 작은따옴표
        System.out.println( "안녕7\"안녕8\""); // \" 큰따옴표
        System.out.println( "안녕9 \\안녕\\"); // \\  백슬래시 하나 출력

    } // main end
} // class end
