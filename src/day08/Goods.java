package day08;

public class Goods { // class start
    // name, price 멤버 변수
    String name;
    int price;
    // 생성자를 두 개 만드세요(오버로딩)
    Goods(){
        this.name = "미정";
        this.price = 0;
    }
    // 매개변수가 있는 생성자
    Goods( String name , int price ){
        this.name = name;
        this.price = price;
    }



} // class end
