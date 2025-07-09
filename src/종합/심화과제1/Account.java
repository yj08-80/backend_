package 종합.심화과제1;

// Account : 데이터 모델
public class Account { // class start

    // 멤버변수
    String num;
    String pwd;
    int balance;

    // 초기화할 생성자
    Account( String num , String pwd ){
        this.num = num;
        this.pwd = pwd;
        this.balance = 0;
    }
} // class end
