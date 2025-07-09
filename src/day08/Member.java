package day08;

public class Member { // class start
    //id, isLogin 멤버 변수
    String id;
    boolean isLogin;
    //Member 클래스에 기본 생성자, 이 생성자 안에서 id는 "guest", isLogin은 false로 초기화
    Member(){
        this.id = "guest";
        this.isLogin = false;
    }
} // class end
