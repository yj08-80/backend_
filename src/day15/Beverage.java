package day15;

public class Beverage { // class start
    public void drink(){
        System.out.println( "음료를 마십니다." );
    }
} // class end

class Coke extends Beverage{
    public void drink(){
        System.out.println( "콜라를 마십니다." );
    }
} // class end

class Coffee extends Beverage{
    public void drink(){
        System.out.println( "커피를 마십니다." );
    }
} // class end
