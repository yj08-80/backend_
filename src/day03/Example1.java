package day03;

public class Example1 { // class start
    public static void main(String[] args) { // main start
        /*

        조건문(if)
            1.조건에 따른 결과를 제어
            2.종류
                (1) if( 조건문 ) 참일때코드;
                (2) if( 조건문 ){
                    참일때명령어1;
                    참일때명령어2;
                    }
                (3) if( 조건문 ){ 참일때명령어; };
                    else{ 거짓일때명령어; }
                (4) if( 조건문1 ){ 참1일때명령어 }
                    else if( 조건문2 ){ 참2일때명령어 }
                    else if ( 조건문3 ){ 참3일때명령어 }
                    else{ 거짓일때명령여 }
                (5) if( 조건문1 ){ 참1일때명령어 };
                    if( 조건문2 ){ 참2일때명령어 };
                    if( 조건문3 ){ 참3일때명령어 };

            3.주의할 점
                (1) 조건문 자리에는 true/false만 가능
                (2) {} 중괄호 관리
                (3) if() : if소괄호 뒤에 ;세미콜론
                (4) if, if~else, if~else if 하나의 결과
                    ->


        */
        //[1] 참일때명령어가 1개이면 {} 생략 가능
        int 온도 = 5;
        if (온도 <= 10) System.out.println("외투를 입는다.");
        //[2] = 참일때며령어가 (;세미콜론) 2개 이상이면 무조건 {} 묶어준다
        int 나이 = 10;
        if (나이 >= 19) {
            System.out.println("성인입니다.");
            System.out.println("19세 이상입니다.");
        }
        //[3] 참과 거짓으로 제어
        boolean 회원검사 = false;
        if (회원검사 == true) {
            System.out.println("안녕하세요. 회원님");
        } else {
            System.out.println("비회원입니다.");
        }

        //[4] 다수조건일 때 하나의 결과 추출
        int 지갑돈 = 1750;
        if (지갑돈 >= 3000) {
            System.out.println("택시를 탄다");
        } else if (지갑돈 >= 1700) {
            System.out.println("버스를 탄다");
        } else if (지갑돈 >= 1200) {
            System.out.println("자전거를 탄다");
        } else {
            System.out.println("걸어간다");
        }

        //[5] 다수 조건일때 여러 결과를 추출
        if (지갑돈 >= 3000) {
            System.out.println("택시를 탄다.2");
        }
        if (지갑돈 >= 1700) {
            System.out.println("버스를 탄다");
        }
        if (지갑돈 >= 1200) {
            System.out.println("자전거를 탄다");
        }

        //[6] if 중첩
        int age = 25;
        char gender = 'w'; // 여자
        if( age >= 19 ){
            System.out.println( "[성인]" );
            if( gender == 'w' ){
                System.out.println( "[성인여자]" );
            }else{
                System.out.println( "[성인남자]" );
            }
        }else{
            System.out.println("[미성년자]" );
        }




    } // main end
} // class end
