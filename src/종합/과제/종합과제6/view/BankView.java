package 종합.과제.종합과제6.view;


import 종합.과제.종합과제6.controller.BankController;
import 종합.과제.종합과제6.model.dto.BankDto;

import java.util.ArrayList;
import java.util.Scanner;

public class BankView { // class start

    // 싱글톤
    // 기본생성자
    private BankView(){}
    private static final BankView instance = new BankView();
    public static BankView getInstance(){
        return instance;
    }

    // controller 싱글톤 가져오기
    private BankController bankController = BankController.getInstance();

    // 모든 메소드에서 사용 가능한 Scanner 입력객체
    private Scanner scan = new Scanner( System.in );

    // 프로그램 최초 화면
    public void index(){
        for( ; ; ){
            System.out.println("=========== 맛집 대기 시스템 ===========");
            System.out.println("    1.대기 등록 | 2.대기 현황");
            System.out.println("====================================");
            System.out.print("선택 > ");
            int choose = scan.nextInt();
            if( choose == 1 ){
                addBank();
            }else if( choose == 2 ){
                getBoardList();
            }
        }
    }
    public void addBank(){
        System.out.print( "전화번호 : " );
        String phone = scan.next();
        System.out.print( "인원수 : " );
        int count = scan.nextInt();
        boolean result = bankController.addBank( phone , count );
        if( result == true ){
            System.out.println( "[안내] 글쓰기 성공" );
        }else{
            System.out.println( "[경고] 글쓰기 실패" );
        }
    }

    public void getBoardList(){
        System.out.println( "============= 대기 현황 =============" );
        ArrayList<BankDto> result = bankController.getBankList();
        for( int i = 0 ; i < result.size() ; i++ ){
            BankDto bank = result.get(i);
            System.out.print( "작성자 : " + bank.getPhone() );
            System.out.println( " - 인원 : " + bank.getCount() );
            System.out.println( "------------------------------------" );
        }
    }
} // class end













