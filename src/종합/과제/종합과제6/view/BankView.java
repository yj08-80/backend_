package 종합.과제.종합과제6.view;


import 종합.과제.종합과제6.controller.BankController;
import 종합.과제.종합과제6.model.dto.BankDto;

import java.util.ArrayList;
import java.util.Scanner;


// View 역할
// 사용자 입력 → Controller에 전달 → 결과 출력
public class BankView { // class start

    // 싱글톤
    private BankView(){}
    private static final BankView instance = new BankView();
    public static BankView getInstance(){
        return instance;
    }

    // controller 싱글톤 가져오기
    // BankController를 싱글톤으로 관리하니까, getInstance()로 하나만 가져와서 변수에 담고 쓰는 것
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
            // choose가 1일 경우
            if( choose == 1 ){
                addBank();
                // choose가 2일 경우
            }else if( choose == 2 ){
                getBankList();
            }
        }
    }


    public void addBank(){
        // 내용 입력받기
        System.out.print( "전화번호 : " );
        String phone = scan.next();
        System.out.print( "인원수 : " );
        int count = scan.nextInt();
        // BankController의 addBank() 메소드에 입력값을 전달하고 boolean 타입으로 성공 여부를 받음
        boolean result = bankController.addBank( phone , count );
        if( result == true ){ // == true는 생략 가능
            System.out.println( "[안내] 글쓰기 성공" );
        }else{
            System.out.println( "[경고] 글쓰기 실패" );
        }
    }
    // 조회 함
    public void getBankList(){
        System.out.println( "============= 대기 현황 =============" );
        // Controller에게 요청해서 전체 대기자(또는 게시글) 리스트를 가져옴
        ArrayList<BankDto> result = bankController.getBankList();
        for( int i = 0 ; i < result.size() ; i++ ){
            BankDto bank = result.get(i);
            System.out.print( "작성자 : " + bank.getPhone() );
            System.out.println( " - 인원 : " + bank.getCount() );
            System.out.println( "------------------------------------" );
        }
    }
} // class end













