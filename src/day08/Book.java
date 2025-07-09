package day08;

public class Book {
    // title, author, price 멤버 변수
    String title;
    String author;
    int price;


    // Book 클래스에 title, author, price를 매개변수로 받아 멤버 변수를 초기화하는 생성자를 만드세요.
    Book(String title, String author, int price) {
        // 각 객체의 정보를 출력
        this.title = title;
        this.author = author;
        this.price = price;
    }
}
