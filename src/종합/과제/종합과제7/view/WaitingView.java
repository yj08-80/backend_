package 종합.과제.종합과제7.view;

import 종합.과제.종합과제7.controller.WaitingController;
import 종합.과제.종합과제7.model.dto.WaitingDto;

import java.util.ArrayList;
import java.util.Scanner;

public class WaitingView { // class start

    // 싱글톤
    private WaitingView(){}
    private static final WaitingView instance = new WaitingView();
    public static WaitingView getInstance(){
        return instance;
    }

    // 호출
    private WaitingController waitingController = WaitingController.getInstance();

    // 입력 객체
    private Scanner scan = new Scanner( System.in );

    // 메인 뷰
    public void index(){
        for( ; ; ){
            System.out.println( "=========== 맛집 대기 시스템 ===========" );
            System.out.println( "       1.대기 등록 | 2.대기 현황" );
            System.out.println( "====================================" );
            System.out.print( " 선택 > " );
            int choose = scan.nextInt();
            if( choose == 1 ){
                waitingWrite();
            }else if( choose == 2 ){
                waitingPrint();
            }
        }
    } // index func end

    // 등록 뷰
    public void waitingWrite(){
        System.out.print( "전화번호 : " );
        String phone = scan.next();
        System.out.print( "인원수 : " );
        int count = scan.nextInt();
        boolean result = waitingController.waitWrite( phone , count );
        if( result ){
            System.out.println( "글 등록 성공" );
        }else{
            System.out.println( "글 등록 실패" );
        } // if end

    } // func end

    public void waitingPrint(){
        System.out.println( "============= 대기 현황 =============" );
        ArrayList<WaitingDto> result = waitingController.waitingPrint();
        for( WaitingDto dto : result ){
            System.out.println( " 연락처 : " + dto.getPhone() );
            System.out.println( " 인원수 : " + dto.getCount() );
            System.out.println( "-----------------------------------");
        }
    }
} // class end









