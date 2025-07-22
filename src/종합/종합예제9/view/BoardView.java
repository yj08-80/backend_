package 종합.종합예제9.view;


import day09.package1.B;
import 종합.종합예제9.controller.BoardController;
import 종합.종합예제9.model.dto.BoardDto;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class BoardView { // class start


    // 싱글톤
    private BoardView(){}
    private static final BoardView instance = new BoardView();
    public static BoardView getInstance(){
        return instance;
    }

    // BoardController 싱글톤 호출 : 컨트롤러 메소드/기능 사용하기 위해
    private BoardController boardController = BoardController.getInstance();
    // 입력 객체 : 메소드 밖에서 선언한 이유, 여러 개 메소드에서 사용하기 위해
    private Scanner scan = new Scanner( System.in );
    // 메인 뷰
    public void index(){
        for( ; ; ){
            System.out.println( "==========================" );
            System.out.println( "      1.등록 2.전체조회" );
            System.out.println( "==========================" );
            System.out.print("선택 > ");
            int choose = scan.nextInt();
            if( choose == 1 ){
                boardWrite();
            }else if( choose == 2 ){
                boardPrint();
            }
        }
    } // func end


    // 등록 뷰
    public void boardWrite(){
        // 입력 받기
        System.out.print( "내용 : " );
        String content = scan.next();
        System.out.print( "작성자 : " );
        String writer = scan.next();
        // 2. controller 에게 입력받은 값 전달하고 결과 받기
        boolean result = boardController.boardWrite( content , writer );
        // 3. 결과에 따라 출력한다
        if( result ){
            System.out.println( "글 등록 성공" );
        }else{
            System.out.println( "글 등록 실패" );
        }
    } // func end

    // 전체조회 뷰
    public void boardPrint(){
        // 1. controller 요청 후 결과 받기
        ArrayList<BoardDto> result = boardController.boardPrint();
        // 2. 결과를 반환하여 출력한다
        for( BoardDto dto : result ){
            System.out.println( "작성자 : " + dto.getWriter() );
            System.out.println( "내용 : " + dto.getContent() );
            System.out.println( "--------------------------" );
        }
    }
} // class end









