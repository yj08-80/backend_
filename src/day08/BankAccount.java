package day08;

public class BankAccount { // class start
    // accountNumber, ownerName, balance 멤버 변수
    String accountNumber;
    String ownerName;
    int balance;

    // 세 멤버 변수를 모두 초기화하는 생성자
    BankAccount( String accountNumber , String ownerName , int balance ){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    //입금(deposit)
    int deposit( int price ) {
        balance += price ;
        return balance;
    }

    //출금(withdraw)
    int withdraw( int price ){
        balance -= price;
        return balance;
    }
} // class end
