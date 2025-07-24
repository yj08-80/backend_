package 종합.종합예제10.view;

import 종합.종합예제10.controller.BoardController;
import 종합.종합예제10.model.dto.BoardDto;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BoardView {

    private BoardView(){}
    private static final BoardView instance = new BoardView();
    public static BoardView getInstance(){
        return instance;
    }

    //(*) 모든 메소드가 사용 가능하도록 메소드밖에 입력객체 생성
    private Scanner scan = new Scanner(System.in);
    // (*) BoardController 싱글톤 불러오기
    private BoardController boardController = BoardController.getInstance();

    // (*) 메인 화면
    public void index(){
        for( ; ; ) {
            try {
                System.out.println("============= 비회원 게시판 =============");
                System.out.print("1.등록 2.전제조회 3.삭제 4.수정   선택> ");
                int choose = scan.nextInt();
                if (choose == 1) { boardWrite(); }
                else if (choose == 2) { boardPrint();}
                else if (choose == 3) { boardDelete(); }
                else if (choose == 4) { boardUpdate(); }
                else {   System.out.println("[경고] 존재하지 않는 번호 입니다.");  }
            }catch ( InputMismatchException e ){
                System.out.println("[경고] 입력 타입이 일치 하지 않습니다.<다시입력>");
                scan = new Scanner( System.in ); // * 입력에 따른 입력객체 초기화 : 잘못된 데이터 지우기
            }catch ( Exception e ){
                System.out.println("[오류] 관리자에게 문의 <010-3333-3333> ");
            }
        }
    }

    // (1) 등록 화면 구현
    public void boardWrite(){
        // 1. 입력받기
        scan.nextLine();
        System.out.print("> 내용 : ");    String bcontent = scan.nextLine(); // nextLine() : 띄어쓰기 가능 , 앞에 의미없는 .nextLine() 필요하다.
        System.out.print("> 작성자 : ");   String bwriter = scan.next();// next() : 띄어쓰기 불가능
        // 2. controller 전달하기 // 3. 전달후 (결과)리턴값 저장하기
        boolean result  = boardController.boardWrite( bcontent , bwriter );
        // 4. 리턴된 값 에 따른 출력하기
        if( result ){ System.out.println("[안내] 게시물 작성 성공 ");  }
        else{    System.out.println("[실패] 게시물 작성 실패 ");  }
    } // func end

    // (2) 전체조회 화면 구현
    public void boardPrint(){
        // 1. controller 에게 요청후 결과 받기
        ArrayList<BoardDto> result = boardController.boardPrint();
        // 2. 결과에 따른 화면 구현 ,
        System.out.println("-----------------------------------------------");
        System.out.println("no \t 작성자 \t 내용"); // 표 상단(헤더)
        System.out.println("-----------------------------------------------");
        for( BoardDto dto : result ){ // 향상된 for문 , for( 타입 변수명 : 리스트명 ){ }
            System.out.printf("%d \t %s \t %s \n",  // 표 내용물
                    dto.getBno() , dto.getBwriter() , dto.getBcontent() );
        } // for end
    }

    // (3) 삭제 화면 구현
    public void boardDelete(){
        // 1.입력받기
        System.out.print("삭제할 게시물번호 : "); int bno = scan.nextInt();
        // 2. controller 전달하기 // 3. 전달후 (결과)리턴값 저장하기
        boolean result = boardController.boardDelete( bno );
        // 4. 리턴된 값 에 따른 출력하기
        if( result ){ System.out.println("[안내] 삭제 성공 "); }
        else{  System.out.println("[경고] 없는 번호 이거나 실패"); }
    }

    // (4) 수정 화면 구현
    public void boardUpdate(){
        // 1. 입력받기
        System.out.print("수정할 게시물 번호 : "); int bno = scan.nextInt();
        scan.nextLine();
        System.out.print("수정할 게시물 내용 : "); String bcontent = scan.nextLine();
        // 2. controller 전달하기 // 3. 전달후 (결과)리턴값 저장하기
        boolean result = boardController.boardUpdate( bno , bcontent );
        // 4. 리턴된 값 에 따른 출력하기
        if( result ){ System.out.println("[안내] 수정 성공"); }
        else{ System.out.println("[경고] 없는 번호 이거나 수정 실패"); }
    }

} // class end