package day07;


// 클래스 목적
//(1) 실행 클래스 : main 함수 갖는 클래스
//(2) 객체 설계 클래스 : 객체 만들기 위한 객체 설계 클래스

public class Calculator {
    // 클래스 멤버( 객체내포함 )
    // 1. 멤버변수
    boolean isPowerOn = false;
    // 2. 생성자
    // 3. 메소드

    // (1) 매개변수x 반환값o
    double getPi(){
        // double : return(반환)할 값의 타입이 실수
        // getPi : 메소드명
        // () : 매개변수 자리 현재는 없음
        // return 값 : 메소드를 호출했더 곳으로 반환하는 값
        return 3.141592;
    }
    // (2) 매개변수 x, 반환값 o
    void powerOn(){
        // void : return할 값이 없다는 키워드
        System.out.println( "계산기 전원을 켭니다" );
        isPowerOn = true;
        // isPowerOn : 해당 메소드를 호출한 객체의 *******멤버변수******
    }

    // (3) 매개변수 o, 반환값 x
    void printSum( int x , int y ){
        // ( int x , int y ) : 메소드 호출시 인수값 정수 두 개를 저장하는 변수
        if( isPowerOn ){ // 만약에 전원이 켜져 있으면
            int sum = x + y;
            System.out.println( sum );
        }else{
            System.out.println( "전원이 꺼져 있습니다." );
            return;
        }
    }

    // 매개변수 o 반환값 o
    int add( int x , int y ){
        if( isPowerOn ){
            int result = x + y;
            return result;
            // return 값 : 메소드를 호출했던 곳으로 반환되는 값
        }else{
            System.out.println( "전원이 꺼져있다" );
            return 0;
        }
    }
}
