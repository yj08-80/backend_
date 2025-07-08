package 종합.종합예제4;

import java.util.Scanner;

// BoardService4 : 입출력 담당
public class BoardService4 { // class start
    public static void main(String[] args) { // main

        // 1. content 와 writer 멤버변수를 갖는 객체 필요하므로 Board클래스 선언
        // 2. board클래스 객체를 100개 저장하는 controller 선언
        // 3. doPost()와 doGet() 메소드를 호출하기 위한 객체 생성
        BoardController bs = new BoardController();
        for( ; ; ){ // (1) 무한루프 사용 이유? 프로그램을 24시간 실행하기 위해서
            System.out.println( "============= My Community =============" );
            System.out.println( "           1.게시물쓰기 | 2.게시물출력" );
            System.out.println( "========================================" );
            System.out.print( "선택 >" );
            Scanner scan = new Scanner( System.in );
            int choose = scan.nextInt();
            // (2)
            if( choose == 1 ){
                System.out.print( "내용 : " );
                String content = scan.next();
                System.out.print( "작성자 : " );
                String writer = scan.next();
                // (4) doPost 메소드를 호출해서 등록 처리 후 결과물 반환
                boolean result = bs.doPost( content , writer ); // doPost 메소드 실행 후 결거ㅏ물 result에 저장 , 입력받은 두 값을 인수로 전달
                if( result == true ){ // doPost에서 true 반환이면
                    System.out.println( "[안내] 글쓰기 성공" );
                }else{ // doPost에서 false가 반환이면
                    System.out.println( "[경고] 글쓰기 실패" );
                }
                System.out.println( "[안내] 글쓰기 성공" );
            }else if( choose == 2 ){
                System.out.println( "============= 게시물 목록 =============" );
                Board[] boards = bs.doGet();
                // doGet() 반환된 boards배열 자료를 boards에 대입한다.
                for( int index = 0 ; index <= boards.length -1 ; index++ ){
                    Board board = boards[index];
                    if( board != null ){
                        System.out.println( "작성자 : " + board.writer );
                        System.out.println( "내용 : " + board.content );
                        System.out.println( "------------------------------------" );
                    }

                } // for end

            } // if end

        } // for end
    } // main end
//[JAVA] 종합예제4 : boardService4 (메소드/역할 분리)
//[ 목표 ]
//    boardService3의 게시판 로직을 Controller 클래스로 분리하여 main 함수는 사용자 입출력(View)을,
//    BoardController 클래스는 데이터 처리(Controller)를 담당하도록 역할을 분담하여 보다 체계적인 프로그램을 구현합니다.
     // -> BoardController : HTML과 DB의 중간 역할 (자바)
//
//[ 요구사항 ]
//    1. 클래스 설계 (총 3개)
//    · Board 클래스 (데이터 모델)
//          각 게시물의 데이터를 담는 클래스입니다.
//          String content; 와 String writer; 멤버 변수를 가집니다.
//    · BoardController 클래스 (제어/로직 담당)
//    - 게시물 데이터를 직접 관리하고 처리하는 클래스입니다.
//    - Board 객체를 100개 저장할 수 있는 배열(Board[] boards = new Board[100];)을 멤버 변수로 가집니다.
//    - 게시물 등록 기능 메소드 doPost(String content, String writer)를 정의합니다.
//          -> 매개변수로 content와 writer를 받습니다.
//          -> Board 객체를 생성하고, 매개변수로 받은 값들을 객체의 멤버 변수에 저장합니다.
//          -> boards 배열의 빈 공간(null)을 찾아 생성된 객체를 저장합니다.
//          -> 저장 성공 시 true, 실패(공간 없음) 시 false를 반환(return)합니다.
//     - 게시물 조회 기능 메소드 doGet()을 정의합니다.
//          -> 자신이 관리하는 boards 배열 전체를 반환(return)합니다.
//     · BoardService4 클래스 (실행/화면 담당)
//          - main 함수를 포함하는 실행 클래스입니다.
//
//    2. 메인 프로그램 흐름 구현하기 (BoardService4의 main 함수)
//     · BoardController 객체를 하나 생성합니다. BoardController bs = new BoardController();
//     · for(;;) 무한루프 안에서 사용자에게 메뉴(1.등록 | 2.출력)를 보여주고, Scanner로 입력을 받습니다.
//         · 기능 1: 게시물 쓰기 (입력값: 1)
//         - 사용자로부터 내용과 작성자를 입력받습니다.
//         - 생성해둔 BoardController 객체의 doPost() 메소드를 호출하면서, 입력받은 내용과 작성자를 인자로 전달합니다.
//         - doPost() 메소드가 반환한 boolean 값에 따라 "[안내] 등록 성공" 또는 "[경고] 등록 실패" 메시지를 출력합니다.
//         · 기능 2: 게시물 출력 (입력값: 2)
//         - BoardController 객체의 doGet() 메소드를 호출하여 Board 배열을 반환받습니다.
//         - 반환받은 배열을 for문으로 순회하며, null이 아닌 요소의 내용과 작성자를 출력합니다.
//
//[ 실행 예시 ]  <종합예제3 과 동일 참고>
//============= My Community =============
//            1.게시물쓰기 | 2.게시물출력
//========================================
//선택 > 1
//내용 : 안녕하세요
//작성자 : 유재석
//[안내] 글쓰기 성공
//
//============= My Community =============
//            1.게시물쓰기 | 2.게시물출력
//========================================
//선택 > 1
//내용 : 반갑습니다
//작성자 : 강호동
//[안내] 글쓰기 성공
//
//============= My Community =============
//            1.게시물쓰기 | 2.게시물출력
//========================================
//    선택 > 2
//============= 게시물 목록 =============
//    작성자 : 유재석
//    내용 : 안녕하세요
//------------------------------------
//    작성자 : 강호동
//    내용 : 반갑습니다
//------------------------------------
} // class end
