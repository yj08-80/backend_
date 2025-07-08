package 종합.종합과제3;

import 종합.종합예제4.BoardController;

import java.util.Scanner;

public class 과제3 {
    // 반복 구간 출력하기
    public static void main(String[] args) {
        WaitingController bs = new WaitingController();
        for ( ; ; ){
            System.out.println( "=========== 맛집 대기 시스템 ===========" );
            System.out.println( "1.대기 등록 | 2.대기 현황" );
            System.out.println( "========================================" );
            System.out.print( "선택 >" );
            Scanner scan = new Scanner( System.in );
            int choose = scan.nextInt();

            if ( choose == 1 ){
                System.out.print( "전화번호 : ");
                String phone = scan.next();
                System.out.print( "인원수 : " );
                int count = scan.nextInt();
                // doPost 써서 결과값 출력
                boolean result = bs.doPost( phone , count );
                if( result == true ) {
                    System.out.println("[안내] 대기 등록이 완료되었습니다.");
                }else{
                    System.out.println( "[경고] 더 이상 대기 등록을 할 수 없습니다." );
                }
                System.out.println( "[안내] 대기 등록이 완료되었습니다." );
            }else if( choose == 2 ){
                System.out.println( "============= 대기 현황 =============" );
                Waiting[] waitings = bs.doGet();
                for( int i = 0 ; i <= waitings.length-1 ; i++ ){
                    Waiting waiting = waitings[i];
                    if( waiting != null ){
                        System.out.println( i + ".연락처: " + waiting.phone + " - 인원: " + waiting.count );
                        System.out.println( "------------------------------------" );
                    }
                }

            }
        }
    }
}



/*
[JAVA] 종합과제3 : 식당 대기번호 프로그램 (메소드/역할 분리)
[ 목표 ]
    종합과제2의 로직을 Controller 클래스로 분리하여, 역할과 책임에 따라 코드를 구성하는 방법을 학습합니다.
    main 함수는 사용자 입출력(View)을, Controller는 데이터 처리(Controller)를 담당하도록 역할을 분담하여 보다 체계적인 프로그램을 구현합니다.
[ 요구사항 ]
    1. 클래스 설계 (총 3개)
        · Waiting 클래스 (데이터 모델)
            - 각 대기 팀의 데이터를 담는 클래스입니다.
            - String phone; 과 int count; 멤버 변수를 가집니다.
        · WaitingController 클래스 (제어/로직 담당)
            - 대기 명단 데이터를 직접 관리하고 처리하는 클래스입니다.
            - Waiting 객체를 100개 저장할 수 있는 배열(Waiting[] waitings = new Waiting[100];)을 멤버 변수로 가집니다.
            - 대기 등록 기능 메소드 addWaiting(String phone, int count)를 정의합니다.
                -> 매개변수로 phone과 count를 받습니다.
                ->  Waiting 객체를 생성하고, 매개변수로 받은 값들을 객체의 멤버 변수에 저장합니다.
                ->  waitings 배열의 빈 공간(null)을 찾아 생성된 객체를 저장합니다.
                ->  저장 성공 시 true, 실패(공간 없음) 시 false를 반환(return)합니다.
            -  대기 현황 조회 기능 메소드 getWaitingList()를 정의합니다.
                ->  자신이 관리하는 waitings 배열 전체를 반환(return)합니다.
        · WaitingService 클래스 (실행/화면 담당)
            - main 함수를 포함하는 실행 클래스입니다.
    2. 메인 프로그램 흐름 구현하기 (WaitingService의 main 함수)
        · WaitingController 객체를 하나 생성합니다. WaitingController controller = new WaitingController();
        · for(;;) 무한루프 안에서 사용자에게 메뉴(1.대기 등록 | 2.대기 현황)를 보여주고, Scanner로 입력을 받습니다.
        · 기능 1: 대기 등록 (입력값: 1)
            - 사용자로부터 전화번호와 인원수를 입력받습니다.
            - 생성해둔 WaitingController 객체의 addWaiting() 메소드를 호출하면서, 입력받은 값들을 인자로 전달합니다.
            - addWaiting() 메소드가 반환한 boolean 값에 따라 "[안내] 대기 등록이 완료되었습니다." 또는 "[경고] 더 이상 대기 등록을 할 수 없습니다." 메시지를 출력합니다.
        · 기능 2: 대기 현황 보기 (입력값: 2)
            - WaitingController 객체의 getWaitingList() 메소드를 호출하여 Waiting 배열을 반환받습니다.
            - 반환받은 배열을 for문으로 순회하며, null이 아닌 요소의 전화번호와 인원수를 출력합니다.

[ 실행 예시 ]
=========== 맛집 대기 시스템 ===========
  1.대기 등록 | 2.대기 현황
========================================
선택 > 1
전화번호 : 010-1234-5678
인원수 : 2
[안내] 대기 등록이 완료되었습니다.

=========== 맛집 대기 시스템 ===========
  1.대기 등록 | 2.대기 현황
========================================
선택 > 1
전화번호 : 010-8765-4321
인원수 : 4
[안내] 대기 등록이 완료되었습니다.

=========== 맛집 대기 시스템 ===========
  1.대기 등록 | 2.대기 현황
========================================
선택 > 2
============= 대기 현황 =============
1. 연락처: 010-1234-5678 - 인원: 2명
------------------------------------
2. 연락처: 010-8765-4321 - 인원: 4명
------------------------------------

*/