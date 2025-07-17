package project.view;

import day09.package1.B;
import project.controller.BookInfoController;
import project.controller.BookListController;
import project.controller.LendingStatusController;
import project.model.dto.BookInfoDto;
import project.model.dto.BookListDto;
import project.model.dto.LendingStatusDto;

import java.util.ArrayList;
import java.util.Scanner;


public class LogInView { // class start

    // 싱글톤
    private LogInView(){}
    private static final LogInView logInView = new LogInView();
    public static LogInView getInstance(){
        return logInView;
    }

    LendingStatusController lendingStatusController = LendingStatusController.getInstance();
    BookListController bookListController = BookListController.getInstance();
    BookInfoController bookInfoController = BookInfoController.getInstance();

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
            else if( choose == 3 ){}
            else if( choose == 4 ){}
            else if( choose == 5 ){}
            else if( choose == 6 ){}
            else{
                System.out.println( "[경고] 없는 번호입니다.");
            }
        } // for end
    } // index func end


    public void bookState() {
        ArrayList<LendingStatusDto> lendingStatusDB = lendingStatusController.bookState();
        ArrayList<BookInfoDto> bookInfoDB = bookInfoController.bookInfoList();
        ArrayList<BookListDto> booklistDB = bookListController.bookList();


        // 도서 대출 현황 출력
        int who = bookInfoController.who();


        for (int i = 0; i < lendingStatusDB.size(); i++) {
            LendingStatusDto lendingStatus = lendingStatusDB.get(i);
            int bookNo = 0;
            for (int j = 0; j < booklistDB.size(); j++) {
                BookListDto bookList = booklistDB.get(i);
                if (bookList.getBookLog() == lendingStatus.getBookLog()) {
                    bookNo = bookList.getBookNo();
                }
            }
            BookInfoDto bookinfo2 = null;
            for (int h = 0; h < bookInfoDB.size(); h++) {
                BookInfoDto bookinfo = bookInfoDB.get(i);
                if (bookNo == bookinfo.getBookNo()) {
                    bookinfo2 = bookinfo;
                }
            }

            if (who == -1) {
                System.out.println("[경고] 관리자입니다");
            } else {
                System.out.println("[" + lendingStatus.getLoanLog() + "] " + bookinfo2.getBookName() + " | " + bookinfo2.getBookAuthor() + " | 대출일: " +
                        lendingStatus.getLoanDate() + " | 반납일: ");
            }
        } // for end


        // 도서 목록 출력

        for (int i = 0; i < booklistDB.size(); i++) {
            BookListDto bookList = booklistDB.get(i);
            boolean onLoan = false;          // 대출 여부 플래그
            for (int j = 0; j <= lendingStatusDB.size(); j++) {
                LendingStatusDto lendingStatus = lendingStatusDB.get(i);
                if (lendingStatus.getBookLog() == bookList.getBookLog() && lendingStatus.getDueDate() == null) {
                    onLoan = true;
                }
                if (onLoan == true) {
                    continue;
                }
                String bookName = "";
                String bookAuthor = "";

                for ( int h = 0 ; h < bookInfoDB.size() ; h++ ) {
                    BookInfoDto bookInfo = bookInfoDB.get(i);
                    if ( bookInfo.getBookNo() == bookList.getBookNo() ) {
                        bookName = bookInfo.getBookName();
                        bookAuthor = bookInfo.getBookAuthor();
                        break;
                    }
                }
                System.out.println( "[" + bookList.getBookLog() + "] " + bookName + " | " + bookAuthor );
            }
        } // main end


    }
} // class end
