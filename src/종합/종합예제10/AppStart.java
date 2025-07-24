package 종합.종합예제10;

import 종합.종합예제10.controller.BoardController;
import 종합.종합예제10.view.BoardView;

public class AppStart { // class start
    public static void main(String[] args) { // main start

        BoardView.getInstance().index();



        // 등록테스트
//        boolean result = BoardController.getInstance().boardWrite( "테스트내용" , "강사" );
//        System.out.println( result );
    } // main end
} // class end
