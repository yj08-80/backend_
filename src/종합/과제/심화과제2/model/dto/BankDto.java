package 종합.과제.심화과제2.model.dto;

public class BankDto { // class start
    // 멤버변수
    private String account;
    private int password;

    // 기본생성자와 매개변수가 있는 생성자
    BankDto(){}
    BankDto( String account , int password ){
        this.account = account;
        this.password = password;
    }

    // getter and setter
    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }
    public int getPassword() {
        return password;
    }
    public void setPassword(int password) {
        this.password = password;
    }

    // toString()

    @Override
    public String toString() {
        return "BankDto{" +
                "account='" + account + '\'' +
                ", password=" + password +
                '}';
    }
} // class end
