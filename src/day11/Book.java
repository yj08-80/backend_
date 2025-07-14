package day11;

public class Book { // class start
    // 멤버변수
    private String title;
    private String author;

    // 생성자

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // getter and setter

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
} // class end
