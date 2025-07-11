package 종합.심화과제2.view;

import java.util.Scanner;

public class BankView { // class start
    // 싱글톤 만들기
    private BankView(){}
    private static final BankView view = new BankView();
    public static BankView getInstance(){
        return view;
    } // func end

    // Scanner
    private Scanner scan = new Scanner( System.in );

    // 화면 구현
    public void index(){
        // 무한반복
        for( ; ; ){
            System.out.println( "=============== KB Bank ===============" );
            System.out.println( "1.계좌등록 | 2.입금 | 3.출금 | 4.잔고 | 5.계좌이체" );
            System.out.println( "========================================" );
            System.out.print( "선택 >" );
            int choose = scan.nextInt();
            
        } // for end
    } // index func end

    // 등록 view
    public void bankWrite(){
        System.out.println( "계좌번호 : " );
        String account = scan.next();
        System.out.println( "비밀번호 : " );
        int password = scan.nextInt();
    }

    // 조회 view
    public void BankPrint(){

    }
} // class end





















