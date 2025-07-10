package day09;

public class CircleCalculator {
    //원주율(PI) 상수를 선언
    final double PI = 3.14159;
    //반지름(정수)을 매개변수로 받아
    // 원의 넓이(반지름 * 반지름 * PI)를 계산하여 출력하는 printCircleArea 메소드
    void printCirvleArea( int 반지름 ){
        double 넓이 = 반지름 * 반지름 * PI;
        System.out.println( 넓이 );

    }

}
