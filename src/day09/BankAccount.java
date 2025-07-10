package day09;

public class BankAccount {
    // private 접근 제한자를 가진 accountNumber(문자열) 멤버 변수
    private String accountNumber;
    // accountNumber를 초기화하는 생성자
    BankAccount( String accountNumber ){
        this.accountNumber = accountNumber;
    }
    //public 접근 제한자를 가진 getAccountNumber() 메소드(Getter)만 정의

    public String getAccountNumber() {
        return accountNumber;
    }
}
