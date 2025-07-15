package libraryService과제.view;

import java.util.Scanner;

public class LogOutView { // class start


    // 싱글톤
    private LogOutView(){}
    private static final LogOutView logOutView = new LogOutView();
    public static LogOutView getInstance(){
        return logOutView;
    }

    Scanner scan = new Scanner( System.in );

    public void index(){
        // 무한반복문
        for( ; ; ){
            System.out.println("`============ 도서관리 시스템  ============");
            System.out.println("          1.회원가입 | 2.로그인");
            System.out.println("=======================================");
            System.out.print("선택 > ");
            int choose = scan.nextInt();
            if( choose == 1 ){}
            else if( choose == 2 ){}
        } // for end
    } // index func end
} // class end


















