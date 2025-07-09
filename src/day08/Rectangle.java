package day08;

public class Rectangle { // class start
    //width, height 멤버 변수
    double width;
    double height;
    //width와 height를 매개변수로 받아 초기화하는 생성자
    Rectangle( double width , double height ){
        this.width = width;
        this.height = height;
    }
    //사각형의 넓이(width * height)를 계산하여 반환하는 getArea() 메소드
    double getArea(){
        double 넓이 = width * height;
        return 넓이;
    }
} // class end
