package 종합.예제2; // .java 파일의 폴더/패키지 위치

import java.util.Scanner;

public class BoardService2 { // class start
    public static void main(String[] args) { // main start

        // (5) 메모리 설계
        // boardService1 에서는 총 게시물 3개를 저장    , 변수     --> 게시물 100개 -> 200개 변수 필요
        // boardService2 에서는 총 게시물 100개를 저장 , 변수+배열  --> 게시물 100개 -> 배열2개 변수 필요.
        String[] contents = new String[100];    // 총 문자열(String) 100개를 저장할수 있는 배열 선언
        String[] writers = new String[100];     // 총 문자열(String) 100개를 저장할수 있는 배열 선언

        for( ; ; ) {                                                        // (1) 무한루프
            System.out.println("============= My Community ============="); // (2) 출력
            System.out.println("  1.게시물쓰기 | 2.게시물출력");
            System.out.println("========================================");
            System.out.print("선택 > ");
            Scanner scan = new Scanner( System.in );                        // (3) 입력객체 생성
            int choose = scan.nextInt();
            if( choose == 1 ){                                              // (4) '1'번 입력시
                System.out.print("내용 : ");          String content = scan.next();
                System.out.print("작성자 : ");         String writer = scan.next();
                // ** 배열내 빈(null)공간을 찾아 빈공간에 입력받은 값 대입한다.
                boolean check = false; // false : 저장실패 , true:저장성공
                for( int index = 0 ; index <= contents.length -1 ; index++ ){ // * 향상된 for 문 vs 일반for문
                    if( contents[index] == null ){ // 만약에 index번째가 null(비어있으면) 이면
                        contents[index] = content;  // 입력받은 값 대입한다.
                        writers[index] = writer;
                        check = true;   break; // 저장 성공시 상태변수 수정후 반복문 탈출
                    }
                }
                if( check ){  System.out.println("[안내] 글쓰기 성공"); }
                else{  System.out.println("[경고] 게시물을 등록할 공간이 부족합니다."); }

            }else if( choose == 2 ){                                        // (4) '2'번 입력시
                System.out.println("============= 게시물 목록 =============");
                // ** 배열내 빈(null)공간이 아니면 요소 값들 출력
                for( int index = 0 ; index <= contents.length - 1 ; index++ ){
                    if( contents[index] != null ){
                        System.out.println("작성자 : " + writers[index] );
                        System.out.println("내용 : " + contents[index] );
                        System.out.println("------------------------------------------");
                    } // if end
                } // for end
            }
        } // for end
    } // main end
} // class end


/*

[JAVA] 종합예제2 : boardService2 (배열 활용)
[ 목표 ] 종합예제1 에서 배열 문법 추가하여 , 최대 100개의 게시물을 저장하고 조회할 수 있는 간단한 콘솔 게시판 프로그램을 구현합니다.
[ 요구사항 ]
    1. 게시물 저장 공간 만들기
        · 최대 100개의 게시물을 저장할 수 있어야 합니다.
        · 각 게시물은 '내용'과 '작성자' 정보를 가집니다.
        · 총 2개의 String[] 배열변수를 선언하여 저장 공간을 만드세요. (예: String[] contents = new String[100] , String[] writers = new String[100] )
        · 모든 변수는 null로 초기화하여, 해당 공간이 비어있음을 나타내도록 합니다.
    2. 메인 프로그램 흐름 구현하기
        · 프로그램은 사용자가 강제 종료하기 전까지 계속 실행되어야 합니다. for(;;) 무한루프를 사용하세요.
        · 무한루프 안에서 사용자에게 메뉴를 보여주고, Scanner를 통해 원하는 기능의 번호를 입력받으세요.
        · 기능 1: 게시물 쓰기 (입력값: 1)
            - 사용자가 1을 입력하면, "내용 : "과 "작성자 : "를 순서대로 물어보고 입력받습니다.
            - 가장 먼저 발견된 빈 공간에 입력받은 내용과 작성자를 저장하고 "[안내] 글쓰기 성공" 메시지를 출력합니다.
            - 만약 100개의 게시물 공간이 모두 차 있다면, "[경고] 게시물을 등록할 공간이 부족합니다." 라는 메시지를 출력합니다.
        · 기능 2: 게시물 출력 (입력값: 2)
            - 사용자가 2를 입력하면, 저장된 모든 게시물을 아래 형식으로 출력합니다.
            - 저장 공간이 비어있지 않은(null이 아닌) 경우에만 출력합니다.
[ 실행 예시 ]  <종합예제1 과 동일 참고>
============= My Community =============
  1.게시물쓰기 | 2.게시물출력
========================================
선택 > 1
내용 : 안녕하세요
작성자 : 유재석
[안내] 글쓰기 성공

============= My Community =============
  1.게시물쓰기 | 2.게시물출력
========================================
선택 > 1
내용 : 반갑습니다
작성자 : 강호동
[안내] 글쓰기 성공

============= My Community =============
  1.게시물쓰기 | 2.게시물출력
========================================
선택 > 2
============= 게시물 목록 =============
작성자 : 유재석
내용 : 안녕하세요
------------------------------------
작성자 : 강호동
내용 : 반갑습니다
------------------------------------

============= My Community =============
  1.게시물쓰기 | 2.게시물출력
========================================
선택 > 1
내용 : 테스트
작성자 : 이수근
[경고] 게시물을 등록할 공간이 부족합니다.

*/
