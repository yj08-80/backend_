package 종합.심화과제1;

import java.util.Scanner;

public class BankService { // class start
    public static void main(String[] args) { // main start
        // doPost와 doGet 호출하기 위한 객체 생성
        BankController bs = new BankController();

        //반복문
        for( ; ; ){
            Scanner scan = new Scanner( System.in );
            System.out.println( "============== KB Bank  ==============" );
            System.out.println( "   1.계좌등록 | 2.입금 | 3.출금 | 4.잔고" );
            System.out.println( "======================================" );
            System.out.print( "선택 >" );
            int choose = scan.nextInt();
            // 1번 선택하면
            //--- 계좌 등록 ---
            //계좌번호 : 123-456
            //비밀번호 : 1111
            //[안내] 계좌 등록이 완료되었습니다.
            if( choose == 1 ){
                System.out.println( "--- 계좌 등록 ---" );
                System.out.println( "계좌번호 : " );
                String num = scan.next();
                System.out.println( "비밀번호 : " );
                String pwd = scan.next();
                boolean result = bs.doPost( num , pwd );
                if( result == true ){
                    System.out.println( "[안내] 계좌 등록이 완료되었습니다.");
                }
            }else if( choose == 2 ){
                System.out.println( "--- 입금 ---" );
                System.out.print( "계좌번호 : " );
                String num = scan.next();
                System.out.print( "비밀번호 : " );
                String pwd = scan.next();
                System.out.print( "입금액 : " );
                int money = scan.nextInt();
                // 일치하는 계좌번호가 있는지 순회
                // accounts 배열 사용
                // 출력 필요 없음
                boolean accounts = bs.deposit( num , pwd , money );
            }else if( choose == 3 ){
                System.out.println( "--- 출금 ---");
                System.out.print( "계좌번호 : " );
                String num = scan.next();
                System.out.print( "비밀번호 : " );
                String pwd = scan.next();
                System.out.print( "출금액 : " );
                int money = scan.nextInt();
                boolean accounts = bs.withdraw( num , pwd , money );
            }else if( choose == 4 ){
                System.out.println( "--- 잔고 확인 ---" );
                System.out.print( "계좌번호 : " );
                String num = scan.next();
                System.out.print( "비밀번호 : " );
                String pwd = scan.next();
                // 잔고확인 메소드 가져오기
                int accounts = bs.getBalance( num , pwd );
                System.out.println( "[잔고]" + accounts + "원" );
            }
        } // for end
    } // main end
    /*

    [JAVA] 심화과제1 : BankService 아래 실행예시를 참고하여 코드를 구현하시오.
[ 클래스 개수 ] : 3개 (Account, BankController, BankService)
[ 규칙 ] BankController 에서는 입력과 출력을 하지 않습니다.
[ 계좌 최대 개수 ] : 100개
[ 실행 예시 ]
============== KB Bank  ==============
  1.계좌등록 | 2.입금 | 3.출금 | 4.잔고
======================================
선택 > 1
--- 계좌 등록 ---
계좌번호 : 123-456
비밀번호 : 1111
[안내] 계좌 등록이 완료되었습니다.

============== KB Bank  ==============
  1.계좌등록 | 2.입금 | 3.출금 | 4.잔고
======================================
선택 > 2
--- 입금 ---
계좌번호 : 123-456
비밀번호 : 1111
입금액 : 50000
[안내] 입금이 완료되었습니다.

============== KB Bank  ==============
  1.계좌등록 | 2.입금 | 3.출금 | 4.잔고
======================================
선택 > 4
--- 잔고 확인 ---
계좌번호 : 123-456
비밀번호 : 1111
[잔고] 50000원

============== KB Bank  ==============
  1.계좌등록 | 2.입금 | 3.출금 | 4.잔고
======================================
선택 > 3
--- 출금 ---
계좌번호 : 123-456
비밀번호 : 1111
출금액 : 20000
[안내] 출금이 완료되었습니다.

============== KB Bank  ==============
  1.계좌등록 | 2.입금 | 3.출금 | 4.잔고
======================================
선택 > 4
--- 잔고 확인 ---
계좌번호 : 123-456
비밀번호 : 1111
[잔고] 30000원

============== KB Bank  ==============
  1.계좌등록 | 2.입금 | 3.출금 | 4.잔고
======================================
선택 > 2
--- 입금 ---
계좌번호 : 123-456
비밀번호 : 2222
입금액 : 10000
[경고] 계좌정보가 일치하지 않습니다.

============== KB Bank  ==============
  1.계좌등록 | 2.입금 | 3.출금 | 4.잔고
======================================
선택 > 3
--- 출금 ---
계좌번호 : 123-456
비밀번호 : 1111
출금액 : 40000
[경고] 잔액이 부족합니다.

     */
} // class end
