package day14;

public class Shape { // class start
    public void draw(){
        System.out.println( "도형을 그립니다." );
    }
} // class end

class Circle extends Shape{
    public void draw(){
        System.out.println( "원을 그립니다." );
    }
}
