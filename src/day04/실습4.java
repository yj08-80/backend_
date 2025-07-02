package day04;

import java.util.Scanner;

public class 실습4 { // class start
    public static void main(String[] args) { // main start

//[JAVA] 실습4 : 제어문
//[ 문제 ] 아래 제어문 관련 문제
//[ 제출방법 ] 코드가 작성된 파일이 위치한 깃허브 상세 주소를 제출하시오.
//
        Scanner scan = new Scanner( System.in );
//[문제 1] Scanner를 이용해 두 개의 점수(int)를 입력받아 총점을 계산하세요. 총점이 90점 이상이면 '성공'을, 그렇지 않으면 '실패'를 출력하는 프로그램을 작성하시오.
//        입력 예시:
//        첫 번째 점수: 40
//        두 번째 점수: 55
//        출력 예시:
//        성공
//        System.out.print( "첫 번째 점수: "); //sout
//        int score1 = scan.nextInt();
//        System.out.print( "두 번째 점수: "); //sout
//        int score2 = scan.nextInt();
//        int sum = score1 + score2;
//        System.out.println( sum >= 90 ? "성공" : "실패" ); // 총점>=90? 성공 : 실패
//
// [문제 2] Scanner를 이용해 서로 다른 두 개의 정수를 입력받아, 더 큰 수를 출력하는 프로그램을 작성하시오.
//        입력 예시:
//        첫 번째 정수: 10
//        두 번째 정수: 25
//        출력 예시:
//        더 큰 수: 25
//        System.out.print( "첫 번째 정수: " );
//        int num1 = scan.nextInt();
//        System.out.print( "두 번째 정수: " );
//        int num2 = scan.nextInt();
//        if( num1 > num2 ){ // num1이 더 크면
//            System.out.println( num1 ); // num1 출력
//        }else {
//            System.out.println( num2 ); // num2 출력
//        }

//
//[문제 3] Scanner를 이용해 아이디와 비밀번호를 String으로 입력받습니다. 아이디가 'admin'이고 비밀번호가 '1234'와 모두 일치하면
// '로그인 성공'을, 하나라도 다르다면 '로그인 실패'를 출력하는 프로그램을 작성하시오.
//        요구 조건: 문자열 비교는 .equals() 메소드를 사용하세요.
//        입력 예시:
//        아이디: admin
//        비밀번호: 1234
//        출력 예시:
//        로그인 성공
//        System.out.print( "아이디: " ); // sout
//        String id = scan.next();
//        System.out.print( "비밀번호: " ); // sout
//        String pwd = scan.next();
//        if( id.equals( "admin" ) && pwd.equals( "1234" ) ){ // admin, 1234 둘 다 맞으면
//            System.out.println( "로그인 성공" );
//        }else{
//            System.out.println( "로그인 실패" );
//        }

//
//[문제 4] Scanner를 이용해 비밀번호를 문자열로 입력받아, 길이에 따라 보안 등급을 출력하는 프로그램을 작성하시오.
//        요구 조건: 비밀번호의 길이는 .length() 메소드로 구할 수 있습니다.
//        8자 미만: '보안 등급: 약함 (8자 이상으로 설정해주세요.)'
//        8자 이상 12자 미만: '보안 등급: 보통'
//        12자 이상: '보안 등급: 강함'
//        입력 예시:
//        비밀번호를 입력하세요: mypassword123
//        출력 예시:
//        보안 등급: 강함
//        System.out.print( "비밀번호를 입력하세요: " );
//        String pwd2 = scan.next();
//        // pwd2 길이 비교
//        if( pwd2.length() < 8 ){
//            System.out.println( "보안 등급 : 약함 (8자 이상으로 설정해주세요." );
//        }else if( pwd2.length() < 12 ){
//            System.out.println( "보안 등급 : 보통" );
//        }else{
//            System.out.println( "보안 등급 : 강함" );
//        }
//
//[문제 5] Scanner를 이용해 주민등록번호 13자리(-포함)를 문자열로 입력받습니다.
// 성별을 나타내는 8번째 숫자가 '1' 또는 '3'이면 '남자'를, '2' 또는 '4'이면 '여자'를 출력하는 프로그램을 작성하시오.
//        요구 조건: 8번째 문자는 .charAt(7)으로 가져올 수 있습니다.
//        입력 예시:
//        주민등록번호(-포함) 13자리를 입력하세요: 950101-2******
//        출력 예시:
//        여자
//        System.out.print( "주민등록번호(-포함) 13자리를 입력하세요: " );
//        String num3 = scan.next();
//        if( num3.charAt(7) == '1' || num3.charAt(7) == '3' ) {
//            System.out.println( "남자" );
//        }else{
//            System.out.println( "여자" );
//        }
//
//[문제 6] Scanner를 이용해 게임 점수를 정수로 입력받아, 아래 기준에 따라 지급될 상품을 출력하는 프로그램을 작성하시오.
//        900점 이상: 'A급 경품'
//        700점 이상 900점 미만: 'B급 경품'
//        500점 이상 700점 미만: 'C급 경품'
//        500점 미만: '참가상'
//        입력 예시:
//        점수를 입력하세요: 750
//        출력 예시:
//        B급 경품
//        System.out.print( "점수를 입력하세요: " );
//        int score3 = scan.nextInt();
//        if( score3 >= 900 ){ // 900점 이상
//            System.out.println( "A급 경품" ); // 700점 이상 900점 미만
//        }else if( score3 >= 700 ){
//            System.out.println( "B급 경품" ); // 500점 이상 700점 미만
//        }else if( score3 >= 500 ){
//            System.out.println( "C급 경품" ); // 500점 이상 700점 미만
//        }else{
//            System.out.println( "참가상" ); // 500점 미만
//        }

//
//[문제 7] Scanner를 이용해 사용자 역할(role)을 문자열로 입력받습니다. 역할에 따라 다른 접근 권한 메시지를 출력하는 프로그램을 작성하시오.
//        admin: '모든 기능에 접근할 수 있습니다.'
//        editor: '콘텐츠 수정 및 생성 기능에 접근할 수 있습니다.'
//        viewer: '콘텐츠 조회만 가능합니다.'
//        그 외 역할: '정의되지 않은 역할입니다.'
//        입력 예시:
//        역할을 입력하세요: editor
//        출력 예시:
//        콘텐츠 수정 및 생성 기능에 접근할 수 있습니다.
//        System.out.print( "역할을 입력하세요: " );
//        String role = scan.next();
//        if( role.equals( "admin" ) ){ // admin
//            System.out.println( "모든 기능에 접근할 수 있습니다." );
//        } else if ( role.equals( "editor" ) ) { // editor
//            System.out.println( "콘텐츠 수정 및 생성 기능에 접근할 수 있습니다." );
//        } else if ( role.equals( "viewer" ) ) { //viewer
//            System.out.println( "콘텐츠 조회만 가능합니다." );
//        }else{
//            System.out.println( "정의되지 않은 역할입니다.");
//        }
//
//[문제 8] Scanner를 이용해 사용자의 나이를 정수로 입력받아, 아래 기준에 따라 입장료를 출력하는 프로그램을 작성하시오.
//        8세 미만: '무료'
//        8세 이상 19세 이하: '5,000원'
//        20세 이상 65세 미만: '10,000원'
//        65세 이상: '3,000원'
//        입력 예시:
//        나이를 입력하세요: 22
//        출력 예시:
//        10,000원
//        System.out.print( "나이를 입력하세요: " );
//        int age = scan.nextInt();
//        if( age < 8 ){
//            System.out.println( "무료" );
//        }else if( age <= 19 ){
//            System.out.println( " 5,000원" );
//        } else if ( age <= 65 ) {
//            System.out.println( "10,000원" );
//        }else{
//            System.out.println( "3,000원" );
//        }
//
//[문제 9] Scanner를 이용해 하나의 점수를 입력받아 다음 조건에 따라 등급을 출력하는 프로그램을 작성하시오.
//        90점 이상: 'A등급'
//        80점 이상 90점 미만: 'B등급'
//        70점 이상 80점 미만: 'C등급'
//        70점 미만: '재시험'
//        입력 예시:
//        점수를 입력하세요: 85
//        출력 예시:
//        B등급
//        System.out.print( "점수를 입력하세요: " );
//        int score4 = scan.nextInt();;
//        if( score4 >= 90 ){
//            System.out.println( "A등급" );
//        }else if( score4 >= 80 ){
//            System.out.println( "B등급" );
//        }else if( score4 >= 70){
//            System.out.println( "C등급" );
//        }else{
//            System.out.println( "재시험" );
//        }
//
//[문제 10] Scanner를 이용해 총 구매 금액을 입력받습니다. 구매 금액에 따라 할인율을 적용하여 최종 결제 금액을 출력하는 프로그램을 작성하시오.
//        50,000원 이상: 10% 할인
//        30,000원 이상 50,000원 미만: 5% 할인
//        10,000원 이상 30,000원 미만: 1% 할인
//        10,000원 미만: 할인 없음
//        입력 예시:
//        총 구매 금액: 60000
//        출력 예시:
//        최종 결제 금액: 54000원
//        System.out.print( "총 구매 금액: " );
//        double price = scan.nextDouble();
//        if( price >= 50000 ){
//            System.out.println( price * 0.9 + "원" );
//        }else if( price >= 30000 ){
//            System.out.println( price * 0.95 + "원" );
//        }else if( price >= 10000 ){
//            System.out.println( price * 0.99 + "원" );
//        }else{
//            System.out.println( price );
//        }
//
//[문제 11] 1부터 12 사이의 월(Month)을 숫자로 입력받아, 해당하는 계절을 출력하는 프로그램을 작성하시오.
// 만약 1~12 이외의 숫자를 입력하면 '잘못된 월입니다.'를 출력하세요.
//        봄: 3, 4, 5월
//        여름: 6, 7, 8월
//        가을: 9, 10, 11월
//        겨울: 12, 1, 2월
//        입력 예시:
//        월(1~12)을 입력하세요: 9
//        출력 예시:
//        가을
//        System.out.print( "월(1~12)을 입력하세요: " );
//        int month = scan.nextInt();
//        if( month == 3 || month == 4 || month == 5 ){
//            System.out.println( "봄" );
//        }else if( month == 6 || month == 7 || month == 8 ){
//            System.out.println( "여름" );
//        }else if( month == 9 || month == 10 || month == 11 ){
//            System.out.println( "가을" );
//        }else if( month == 12 || month == 1 || month == 2 ){
//            System.out.println( "겨울" );
//        }else{
//            System.out.println( "잘못된 월입니다." );
//        } // 먼저 있는지 확인하는 것이 효율적임. "잘못된 월입니다" 먼저 출력

//
//[문제 12] Scanner를 이용해 서로 다른 세 개의 정수를 입력받아, 가장 큰 수를 출력하는 프로그램을 작성하시오.
//        입력 예시:
//        첫 번째 정수: 45
//        두 번째 정수: 12
//        세 번째 정수: 78
//        출력 예시:
//        가장 큰 수: 78
//        System.out.print( "첫 번쩨 정수: ");
//        int num1 = scan.nextInt();
//        System.out.print( "두 번쩨 정수: ");
//        int num2  = scan.nextInt();
//        System.out.print( "세 번쩨 정수: ");
//        int num3  = scan.nextInt();
//        if( num1 > num2 && num1 > num3 ){
//            System.out.println( num1 );
//        }else if( num2 > num1 && num2 > num3 ){
//            System.out.println( num2 );
//        }else{
//            System.out.println( num3 );
//        }

//
//[문제 13] Scanner를 이용해 연도(year)를 입력받아 해당 연도가 윤년인지 평년인지 판별하는 프로그램을 작성하시오.
//        윤년 조건:
//        연도가 4의 배수이면서, 100의 배수는 아닐 때
//        또는 연도가 400의 배수일 때
//        입력 예시:
//        연도를 입력하세요: 2024
//        출력 예시:
//        2024년은 윤년입니다.
//        System.out.print( "연도를 입력하세요: " );
//        int year = scan.nextInt();
//        if( year%4 == 0 && year%100 != 0 ){ // 연도가 4의 배수이면서, 100의 배수는 아닐 때
//            System.out.printf( "%d은 윤년입니다\n" , year );
//        }else{
//            System.out.printf( "%d은 평년입니다\n" , year );
//        }
//
//[문제 14] Scanner를 이용해 서로 다른 세 개의 정수를 입력받아, 오름차순(작은 수부터 큰 수 순서)으로 정렬하여 출력하는 프로그램을 작성하시오.
//        입력 예시:
//        첫 번째 정수: 17
//        두 번째 정수: 4
//        세 번째 정수: 8
//        출력 예시:
//        4, 8, 17

         // 첫번째 입력값을 가진 큰 수로 임의 지정
//        System.out.print( "첫 번째 정수 ");
//        int num4 = scan.nextInt();
//        System.out.print( "두 번째 정수 ");
//        int num5 = scan.nextInt();
//        System.out.print( "세 번째 정수 ");
//        int num6 = scan.nextInt();
//        int max;
//        int mid;
//        int min;
//
//        if (num4 < num5 && num4 < num6) {
//            min = num4;
//        }else if(num5 < num4 && num5 < num6) {
//            min = num5;
//        } else {
//            min = num6;
//        }
//        if (num4 > num5 && num4 > num6) {
//            max = num4;
//        }else if(num5 > num4 && num5 > num6) {
//            max = num5;
//        } else {
//            max = num6;
//        }
//
//        mid = ( num4 + num5 + num6 ) - min - max;
//        System.out.println( min + "," + mid + "," + max );

        System.out.print( "첫 번째 정수 ");
        int a = scan.nextInt();
        System.out.print( "두 번째 정수 ");
        int b = scan.nextInt();
        System.out.print( "세 번째 정수 ");
        int c = scan.nextInt();
        if( a > b ){
            int temp = a;
            a = b;
            b = temp;
        }
        if( a > c ){
            int temp = a;
            a = c;
            c = temp;
        }
        if( b > c ){
            int temp = b;
            b = c;
            c = temp;
        }
        System.out.printf( "%d , %d , %d" , a , b , c );
//
//[문제 15] 가위바위보 게임
//        지시: 두 명의 플레이어가 참여하는 가위바위보 게임을 만드시오.
//        입력: 플레이어 1과 플레이어 2는 각각 0(가위), 1(바위), 2(보) 중 하나의 숫자를 Scanner로 입력합니다.
//        출력:
//        플레이어 1이 이기면 '플레이어1 승리'를 출력합니다.
//        플레이어 2가 이기면 '플레이어2 승리'를 출력합니다.
//        두 플레이어가 같은 것을 내면 '무승부'를 출력합니다.
//        입력 예시:
//        플레이어1 (0:가위, 1:바위, 2:보): 1
//        플레이어2 (0:가위, 1:바위, 2:보): 0
//        출력 예시:
//        플레이어1 승리
        // 플레이어1 승리 경우의 수 :  1가위 2보 , 1바위 2가위 , 1보 2바위
//        System.out.print( "플레이어1 (0:가위, 1:바위, 2:보):" );
//        int game1 = scan.nextInt();
//        System.out.print( "플레이어2 (0:가위, 1:바위, 2:보):" );
//        int game2 = scan.nextInt();
//        if( game1 == game2 ){
//            System.out.println( "무승부" );
//        }else if( game1 == 0 && game2 == 1 ){
//            System.out.println( "플레이어1 승리" );
//        }else if( game1 == 1 && game2 == 0 ){
//            System.out.println( "플레이어1 승리" );
//        }else if( game1 == 2 && game2 == 1 ){
//            System.out.println( "플레이어1 승리" );
//        }else{
//            System.out.println( "플레이어2 승리" );
//        }





    } // main end
} // class end
