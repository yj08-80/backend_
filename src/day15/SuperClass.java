package day15;

public class SuperClass { // class start
    String name = "상위";
    public void method(){
        System.out.println( "상위 메소드" );
    }
} // class end

class SubClass extends SuperClass{
    String name = "하위";
    public void method(){
        System.out.println( "하위 메소드" );
    }
}

