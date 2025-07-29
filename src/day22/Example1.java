package day22;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Example1 { // class start
    public static void main(String[] args) {


    /*

    [String 클래스] : 자바에서 문자열 표현하는 방법
        - 컴퓨터는 문자는 알고 문자열은 모른다
        - 문자 번역 : 바이트 <-- 번역방법 --> 문자
            1. 아스키코드 : 128문자 표현하는 규칙, 7비트
            2. 유니코드 : 전세계 공용어( 한글포함 ), 자바가

     */

        // 1. 배열을 이용한 문자열 표현
        char str1 = '유'; // '' 작은 따옴표로 감싼 문자 1개는 char타입
        char[] str2 = {'유', '재', '석'}; // '' 작은 따옴표 3개를 char 배열 타입으로


        // 2. char 타입의 아스키코드 10진수
        char str3 = 45;
        System.out.println( str3 );
        char[] str4 = {74, 65, 86, 65};
        System.out.println(Arrays.toString( str4 ) ); // [J, A, V, A]
        char str5 = '김';
        System.out.println( (int)str5 ); // 44608

        // 3. 문자열 리터럴 : "" 큰따옴표, String 클래스
        String str6 = "유재석"; // new String 사용하지 않고 문자열 생성할 경우
        String str7 = "유재석"; // 문자열이 동일한 경우 동일한 객체 취급
        String str8 = new String( "유재석" ); // new String 사용시 동일한 문자열이라도 다른 객체 취급

        // 4. == vs .equals(), == 주소값( 객체가 저장된 위치 ) 비교 / .equals() 객체내 값 비교
        System.out.println( str6 == str7 ); // true
        System.out.println( str6 == str8 ); // false
        System.out.println( str6.equals( str7 ) ); // true
        System.out.println( str6.equals( str8 ) ); // true
    }
} // class end
