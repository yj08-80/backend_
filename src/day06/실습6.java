package day06;

import java.util.Arrays;
import java.util.Scanner;

public class 실습6 { // class start
    public static void main(String[] args) {

//        [JAVA] 실습6 : 배열과반복문
//                [ 문제 ] 아래 배열과반복문 관련 문제
//[ 제출방법 ] 코드가 작성된 파일이 위치한 깃허브 상세 주소를 제출하시오.
//
//[문제 1] 정수 5개(10, 20, 30, 40, 50)를 저장할 수 있는 int 타입의 배열 numbers를 선언과 동시에 초기화하세요.
//        배열의 2번 인덱스에 저장된 값을 콘솔에 출력하세요.
        int[] numbers = { 10 , 20 , 30 , 40 , 50 };
        System.out.println( numbers[2] );
//
//[문제 2] String 타입의 데이터를 3개 저장할 수 있는 배열 season을 new 키워드를 사용하여 생성하세요.
//        각 인덱스에 "봄", "여름", "가을" 값을 순서대로 할당하세요.
//        Arrays.toString()을 사용하여 배열의 모든 요소를 한 번에 출력하세요.
        String[] season = new String[3]; // 변수 3개 저장
        season[0] = "봄";
        season[1] = "여름";
        season[2] = "가을";
        System.out.println(Arrays.toString( season )); // 한 번에 출력
//
//[문제 3] 다음과 같은 과일 배열이 있습니다. for 반복문을 사용하여 배열의 모든 요소를 하나씩 콘솔에 출력하시오.
//        선언 코드: String[] fruits = {"사과", "바나나", "포도", "딸기"};
        String[] fruits = {"사과", "바나나", "포도", "딸기"};
        for( int i = 0 ; i <= fruits.length-1 ; i++ ){
            String fruit = fruits[i];
            System.out.println( fruit );
        }
//
//[문제 4] 다음 학생들의 점수가 담긴 배열이 있습니다. for 반복문을 사용하여 모든 점수의 합계와 평균을 계산하여 콘솔에 출력하시오.
//                요구 조건: 평균은 소수점까지 정확하게 계산되어야 합니다.
//                선언 코드: int[] scores = {85, 92, 78, 65, 95};
//        int[] scores = {85, 92, 78, 65, 95};
//        // 밖에서 사용할 변수
//        int sum = 0;
//        double ave = 0; // 소수점 필요
//        //반복문 사용
//        for( int i = 0 ; i <= scores.length-1 ; i++ ){
//            int score = scores[i];
//            sum += score;
//        }
//        ave = sum/5.0;
//        System.out.println( "합계 : " + sum );
//        System.out.println( "평균 : " + ave );
//
//[문제 5] 점수 배열에서 100점 만점자가 처음 나타나면, "100점 만점자를 찾았습니다!"라고 출력하고 반복문을 즉시 종료하는 프로그램을 작성하시오.
//                선언 코드: int[] scores = {77, 82, 100, 54, 96};
        int[] scores = {77, 82, 100, 54, 96};
        for( int i = 0 ; i <= scores.length-1 ; i++ ){
            int score = scores[i];
            if( score == 100 ){
                System.out.println( "100점 만점자를 찾았습니다!" );
                break;
            } // if end
        } // for end
//
//[문제 6] 다음 배열에서 'A'형 혈액형을 가진 사람이 몇 명인지 for 반복문을 통해 세고, 그 수를 콘솔에 출력하시오.
//                선언 코드: String[] bloodTypes = {"A", "B", "O", "AB", "A", "B", "A"};
        String[] bloodTypes = {"A", "B", "O", "AB", "A", "B", "A"};
        int num = 0;
        for( int i = 0 ; i <= bloodTypes.length-1 ; i++ ){
            String bloodType = bloodTypes[i];
            if( bloodType == "A" ){
                num = num+1;
            }
        } // for end
        System.out.println( num );
//
//[문제 7] 주어진 숫자 배열에서 가장 큰 값을 찾아 콘솔에 출력하는 프로그램을 작성하시오.
//                선언 코드: int[] numbers = {23, 5, 67, 12, 88, 34};
        int[] numbers1 = {23, 5, 67, 12, 88, 34};
        int max = 0;
        for( int number : numbers1 ){
            if( max <= number ){
                max = number;
            }
        }
        System.out.println( max );
//
//[문제 8] products(상품 목록)와 stock(재고 수량) 배열이 있습니다.
//        Scanner를 이용해 사용자로부터 구매할 상품명과 수량을 입력받아, 재고가 충분하면 "구매 완료!"를 출력하고 재고를 차감하세요.
//        재고가 부족하면 "재고가 부족합니다."를, 없는 상품이면 "없는 제품명입니다."를 출력합니다.
//        선언 코드:
        String[] products = {"볼펜", "노트", "지우개"};
        int[] stock = {10, 5, 20};
        // 상품명과 수량 입력받기
        Scanner scan = new Scanner( System.in );
        System.out.print( "상품명 : " );
        String pname = scan.next();
        System.out.print( "수량 : " );
        int pnum = scan.nextInt();
        int check = 0; // 0 : 없는 제품 , 1:구매완료 , 2:재고부족
        // 배열 순회
        for( int i = 0 ; i <= products.length-1 ; i++ ) {
            String product = products[i];
            int st = stock[i];
            // 재고가 충분하면 "구매 완료!"를 출력하고 재고를 차감
            if (product.equals(pname)) {
                if (st >= pnum) {
                    check = 1;
                    st -= pnum;
                    break;
                }else{
                    check = 2;
                    break;
                }
            }
            //재고가 부족하면 "재고가 부족합니다."를, 없는 상품이면 "없는 제품명입니다."
        }
        if( check == 0){
            System.out.println( "없는 제품명입니다." );
        }else if( check == 1 ){
            System.out.println( "구매 완료!" );
        }else if( check == 2 ){
            System.out.println( "재고가 부족합니다." );
        }
//
//[문제 9] 주어진 영화 이름과 평점 배열을 이용하여, 각 영화의 평점을 별(★, ☆)로 시각화하여 출력하는 프로그램을 작성하시오.
//                요구 조건: 각 영화의 평점(10점 만점)만큼 꽉 찬 별(★)을, 나머지 점수만큼 빈 별(☆)을 출력합니다.
//        예시: 평점이 8점이면 ★★★★★★★★☆☆ (총 10개의 별)
//        선언 코드:
//        String[] movieNames = {"히든페이스", "위키드", "글래디에이터2", "청설"};
//        int[] movieRatings = {8, 4, 7, 6};
//        출력 예시:
//        히든페이스      ★★★★★★★★☆☆
//        위키드         ★★★★☆☆☆☆☆☆
//        글래디에이터2  ★★★★★★★☆☆☆
//        청설          ★★★★★★☆☆☆☆

        //선언 코드
        String[] movieNames = {"히든페이스", "위키드", "글래디에이터2", "청설"};
        int[] movieRatings = {8, 4, 7, 6};
        //html
        String html = "";
        //배열 순회
        for( int i = 0 ; i <= movieNames.length-1 ; i++ ){
            // 영화 이름 출력
            String movieName = movieNames[i];
            System.out.println( movieName );
            for( int star = 1 ; star <= 10 ; star++ ){

            }
        }
//
//[문제 10] 차량별 주차 시간 데이터가 주어졌을 때, 아래의 요금 규정에 따라 각 차량이 지불해야 할 최종 주차 요금을 계산하여 출력하시오.
//        요금 규정:
//        기본 요금: 최초 30분까지 1,000원
//        추가 요금: 30분 초과 시, 매 10분마다 500원씩 추가
//        일일 최대 요금: 20,000원 (아무리 오래 주차해도 20,000원을 초과할 수 없음)
//        선언 코드:
//        String[] carNumbers = {"210어7125", "142가7415", "888호8888", "931나8234"};
//        int[] usageMinutes = {65, 30, 140, 420};
//        출력 예시:
//        210어7125: 65분 주차, 최종 요금: 2500원
//        142가7415: 30분 주차, 최종 요금: 1000원
//        888호8888: 140분 주차, 최종 요금: 6500원
//        931나8234: 420분 주차, 최종 요금: 20000원
    } // main end
} // class end