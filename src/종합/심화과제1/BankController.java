package 종합.심화과제1;

import day08.Player;

public class BankController {
    //BankController 에서는 입력과 출력을 하지 않습니다.

    // 멤버변수
    Account[] accounts = new Account[100];

    // 등록 메소드
    boolean doPost( String num , String pwd ){ // 등록 start
        // 객체 생성
        Account account = new Account( num , pwd );
        // 배열 순회
        for( int i = 0 ; i <= accounts.length-1 ; i++ ){
            // 순회 중에 빈 곳이 있으면
            if( accounts[i] == null ){
                accounts[i] = account;
                return true;
            } // if end
        } // for end
        return false;
    } // 등록 end

    // 출력 메소드
    Account[] doGet(){
        return accounts;
    }
    // 입금 메소드
//    int deposit( int money ){
//        balance += money;
//        return sumMoney;
//    }
    boolean deposit(String num, String pwd, int money) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null) {
                if (accounts[i].num.equals(num) && accounts[i].pwd.equals(pwd)) {
                    accounts[i].balance += money;
                    return true; // 입금 성공
                }
            }
        }
        return false; // 계좌정보 불일치
    }


    // 출금 메소드
//    int withdraw( int money ){
//        sumMoney -= money;
//        return sumMoney;
//    }
    boolean withdraw( String num , String pwd , int money ){
        for( int i = 0 ; i <= accounts.length-1 ; i++ ){
            if( accounts[i] != null ){
                if( accounts[i].num.equals(num) && accounts[i].pwd.equals(pwd)){
                    accounts[i].balance -= money;
                    return true; // 출금 성공
                }
            } // if end
        } // for end
        return false;
    } // 출금 end

    int getBalance( String num , String pwd ){
        for( int i = 0 ; i <= accounts.length-1 ; i++ ){
            if( accounts[i].num.equals(num) && accounts[i].pwd.equals(pwd) ){
                // 찾으면 잔고 반환
                return accounts[i].balance;
            }
        }
        return -1; // 계좌 정보 불일치
    }


}
