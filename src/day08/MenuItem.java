package day08;

public class MenuItem { // class start

    // name, price, isSignature 멤버 변수
    String name;
    int price;
    boolean isSignature;
    // 세 멤버 변수를 모두 초기화하는 생성자
    MenuItem( String name , int price , boolean isSignature ){
        this.name = name;
        this.price = price;
        this.isSignature = isSignature;
    }
} // class end
