package 종합.과제.종합과제9.view;


import 종합.과제.종합과제9.controller.MarketController;
import 종합.과제.종합과제9.model.dto.MarketDto;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Scanner;

public class MarketView { // class start

    // 싱글톤
    private MarketView() {
    }

    private static final MarketView instance = new MarketView();

    public static MarketView getInstance() {
        return instance;
    }

    // 호출
    MarketController marketController = MarketController.getInstance();
    Scanner scan = new Scanner(System.in);

    // 메인화면
    public void index() {
        for (; ; ) {
            try {
                System.out.println("========================뚝딱마켓=========================");
                System.out.println(" 1.중고물품등록 | 2.전체물품목록조회| 3.물품정보수정 | 4.등록물품삭제");
                System.out.println("=======================================================");
                System.out.print("선택 > ");
                int choose = scan.nextInt();
                if (choose == 1) {
                    usedItemRegister();
                } else if (choose == 2) {
                    showAllItems();
                } else if (choose == 3) {
                    updateItemInfo();
                } else if (choose == 4) {
                    deleteItem();
                } else {
                    System.out.println("[경고] 없는 번호입니다.");
                }
            } catch (Exception e) {
                System.out.println("[오류] 관리자에게 문의 <010-3333-3333> ");
                scan.nextLine();
            }
        }
    } // func end

    // (1) 등록 화면 구현
    public void usedItemRegister() {

        System.out.print("판매자 닉네임 : ");
        String username = scan.next();
        System.out.print("물품명 : ");
        String pname = scan.next();
        System.out.print("설명 : ");
        scan.nextLine();
        String content = scan.nextLine();
        System.out.print("가격 : ");
        int price = scan.nextInt();
        System.out.print("비밀번호 : ");
        String pwd = scan.next();

        boolean result = marketController.usedItemRegister(username, pname, content, price, pwd);

        if (result) {
            System.out.println("[안내] 게시물 작성 성공");
        } else {
            System.out.println("[실패] 게시물 작성 실패");
        } // if end
    } // func end

    // (2) 전체조회 화면 구성
    public void showAllItems() {
        ArrayList<MarketDto> result = marketController.showAllItems();
        System.out.println("-------------------------------------------------------------------------------------------------");
        for (MarketDto dto : result) {
            System.out.println("번호 : " + dto.getNo() + "물품명 : " + dto.getPname() + "가격 : " + dto.getPrice() + "닉네임 : " + dto.getUsername() + "등록일 : " + dto.getDatetime() + "판매여부 : " + dto.isIs_sold());

        }
    } // func end


    // (3) 삭제 화면 구현
    public void deleteItem() {
        System.out.print("삭제할 물품 번호 : ");
        int no = scan.nextInt();

        System.out.print("비밀번호 : ");
        String pwd = scan.next();

        boolean result = marketController.deleteItem(no, pwd);

        if (result) {
            System.out.println("삭제가 성공적으로 완료되었습니다.");
        } else {
            System.out.println("삭제에 실패했습니다. (물품 번호 또는 비밀번호가 일치하지 않습니다.)");
        }
    } // func end

    public void updateItemInfo() {
        System.out.print("수정할 번호: ");
        int no = scan.nextInt();

        System.out.print("비밀번호: ");
        String pwd = scan.next();

        boolean result = marketController.check( no , pwd );

        if ( result ) {
            scan.nextLine(); // 버퍼 제거

            System.out.print("물품명: ");
            String pname = scan.nextLine();

            System.out.print("설명: ");
            String content = scan.nextLine();

            System.out.print("가격: ");
            int price = scan.nextInt();

            System.out.print("판매 상태 (true: 판매완료 / false: 판매중): ");
            boolean is_sold = scan.nextBoolean();

            boolean result1 = marketController.updateItemInfo( no, pname , content , price , is_sold );

            if(result1) System.out.println("[성공]");
            else System.out.println("[실패]");

        } else {
            System.out.println("[경고] 물품 번호 또는 비밀번호가 일치하지 않습니다.");
        }
    }
} // class end
