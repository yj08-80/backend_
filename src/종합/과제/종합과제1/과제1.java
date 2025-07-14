package 종합.과제.종합과제1;

import java.util.Scanner;

public class 과제1 { // class start
    public static void main(String[] args) { // main start

        String tel1 = null;
        String tel2 = null;
        String tel3 = null;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        for (; ; ) { // 무한루프 시작
            System.out.println("=========== 맛집 대기 시스템 ===========");
            System.out.println("\t\t1.대기 등록 | 2.대기 현황 ");
            System.out.println("====================================");
            System.out.print("선택 > ");

            Scanner scan = new Scanner(System.in);

            int choose = scan.nextInt();

            if (choose == 1) {
                System.out.print("전화번호 : ");
                String tel = scan.next(); // 입력받기
                System.out.print("인원수 : ");
                int num = scan.nextInt();

                if (tel1 == null) { // 게시물1 이 비어있는지 확인
                    tel1 = tel;
                    num1 = num;
                    System.out.println("[글쓰기] 성공");
                } else if (tel2 == null) { // 게시물2 이 비어있는지 확인
                    tel2 = tel;
                    num2 = num;
                    System.out.println("[글쓰기] 성공");
                } else if (tel3 == null) { // 게시물3 이 비어있는지 확인
                    tel3 = tel;
                    num3 = num;
                    System.out.println("[글쓰기] 성공");
                } else { // 자리 없으면
                    System.out.println("[경고] 게시물을 등록할 공간이 부족합니다.");
                }

            } else if (choose == 2) {
                System.out.println("============= 게시물 목록 =============");

                if (tel1 != null) {
                    System.out.println("작성자 : " + tel1);
                    System.out.println("내용 : " + num1);
                    System.out.println("------------------------------------");
                }
                if (tel2 != null) {
                    System.out.println("작성자 : " + tel2);
                    System.out.println("내용 : " + num2);
                    System.out.println("------------------------------------");
                }
                if (tel3 != null) {
                    System.out.println("작성자 : " + tel3);
                    System.out.println("내용 : " + num3);
                    System.out.println("------------------------------------");
                }
            }
        } // for end
    } // main end
} // class end