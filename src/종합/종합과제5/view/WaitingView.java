package 종합.종합과제5.view;

import 종합.종합과제5.controller.WaitingController;
import 종합.종합과제5.model.dao.WaitingDao;
import 종합.종합과제5.model.dto.WaitingDto;
import 종합.종합예제7.model.dto.BoardDto;
import 종합.종합예제7.view.BoardView;

import java.util.Scanner;

public class WaitingView { // class start

    // 싱글톤 만들기
    private WaitingView(){}
    private static final WaitingView view = new WaitingView();
    public static WaitingView getInstance(){
        return view;
    }

    private Scanner scan = new Scanner( System.in );
    // Controller 객체 가져오기 - 멤버변수
    private WaitingController waitingController = WaitingController.getInstance();

    public void index(){
        for( ; ; ){
            System.out.println( "=========== 맛집 대기 시스템 ===========" );
            System.out.println( "           1.대기 등록 | 2.대기 현황" );
            System.out.println( "=====================================" );
            System.out.print( "선택 >" );
            int choose = scan.nextInt();
            if( choose == 1 ){
                waitingWrite();
            }else if( choose == 2 ){
                waitingPrint();
            }
        }
    }// func end


    // 등록 view
    private void waitingWrite(){
        System.out.print( "전화번호 : " );
        String phone = scan.next();
        System.out.print( "인원수 : " );
        String count = scan.next();
        boolean result = waitingController.waitingWrite( phone , count );
        if( result ){
            System.out.println( "[안내] 대기 등록이 완료되었습니다." );
        }else{
            System.out.println( "[경고] 대기 등록에 실패하였습니다." );
        }
    } // func end

    // 조회 view
    public void waitingPrint(){
        System.out.println( "============= 대기 현황 =============" );
        WaitingDto[] result = waitingController.waitingPrint();
        for( int i = 0 ; i <= result.length-1 ; i++ ){
            WaitingDto waitingDto = result[i];
            if( waitingDto != null ){
                System.out.println( "전화번호 : " + waitingDto.getPhone() );
                System.out.println( "인원수 : " + waitingDto.getCount() );
                System.out.println( "------------------------------------" );
            }
        }
    }
} // class end



















