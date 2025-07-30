package day22;

import day09.package1.A;

import java.security.spec.RSAOtherPrimeInfo;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Random;

public class Example2 { // class start
    public static void main(String[] args) {
        // 1. Random 객체 생성
        Random random = new Random();
        System.out.println( random );

        // 2. 1~10 사이의 난수 생성( int 타입 )
        int value1 = random.nextInt();
        System.out.println( value1 );
        int value2 = random.nextInt( 10 ) + 1;
        System.out.println( value2 );

        // 3. 0 ~ ( n-1 ) 사이의 난수 생성
        int value3 = random.nextInt( 100 );
        System.out.println( value3 );

        // 4. 0과 1 사이의 실수 생성
        double value4 = random.nextDouble();
        System.out.println( value4 );

        // 5. true와 false 생성
        boolean value5 = random.nextBoolean();
        System.out.println( value5 );

        // 활용1)  임의 여러 개 데이터 중 하나 선택하기
        ArrayList< String > nameList = new ArrayList<>();
        nameList.add( "유재석" );
        nameList.add( "강호동" );
        nameList.add( "신동엽" );
        int randomIndex = random.nextInt( nameList.size() ); // .size() : arrayList 길이 반환 메소드
        System.out.println( "추첨된 이름 : " + nameList.get( randomIndex ) );

        // 활용2) 새로운 비밀번호, 인증코드 문자 난수 표현
        String code = "";
        for( int i = 0 ; i <= 6 ; i++ ){
            Random ran = new Random();
            int val = ran.nextInt( 26 ) + 97;
            // a : 97 ~ z : 122
            char str = (char)val;
            System.out.println( str );
            code += str;
        } // for end
        System.out.println( "생성된 코드 : " + code );

        // 활용3) 아스키코드 패턴으로 난수 계산식 못만들 경우 직접 난수에 넣을 데이터를 배열로 선택
        char[] ranStr = { '0' , '1' , '2' , '3' , 'a' , 'A' , '!' };
        String newPwd = "";
        for( int i = 1 ; i <= 8 ; i++ ){
            Random ran = new Random();
            int index = ran.nextInt( ranStr.length );
            newPwd += ranStr[ index ];
        }
        System.out.println( "생성된 패스워드 : " + newPwd );

        // 활용4) 주사위 : 1~6 사이
        int dice = random.nextInt( 6 ) + 1;
        System.out.println( dice );

        // 활용5) 로또 번호 생성 : 1 ~ 45 사이의 중복값이 6번 생성
        ArrayList< Integer > lottoList = new ArrayList<>();
        for( int i = 0 ; i <= 6 ; i++ ){
            int lotto = random.nextInt( 45 ) + 1; // 생성된 로또 번호
            if( lottoList.contains( lotto ) ){ // 리스트에 생성된 로또번호가 존재하면
                continue; // 이번 반복문 무효처리
            }
            lottoList.add( lotto ); // 생성된 로또 번호 리스트에 담기
            if( lottoList.size() == 6 ) break;

        }
        System.out.println( lottoList );


        // 활용6) 하나의 문자열에서 추출한 문자로 문자열 난수 생성
        String ranStr2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int strlen = ranStr2.length(); // (1) 문자열 길이 구하기
        int ranIndex = random.nextInt(); // (2) 문자열 길이 내 난수 생성
        ranStr2.charAt( ranIndex ); // (3) 문자열 내 인덱스 위치한 문자 1개 추출



    }


} // class end









