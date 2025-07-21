package day15;

// "하늘을 납니다."를 출력하는 fly() 추상 메소드를 가진 Flyable 인터페이스
interface Flyable{
    default void fly(){
        System.out.println( "하늘을 납니다." );
    }
}

// "물에서 헤엄칩니다."를 출력하는 swimmable() 추상 메소드를 가진 Swimmable 인터페이스
interface Swimmable{
    default void swimmable(){
        System.out.println( "물에서 헤엄칩니다." );
    }
}

public class Duck implements Flyable,Swimmable{
    @Override
    public void fly() {
        Flyable.super.fly();
    }

    @Override
    public void swimmable() {
        Swimmable.super.swimmable();
    }
} // class end
