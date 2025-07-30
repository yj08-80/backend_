package day22;

import com.sun.security.jgss.GSSUtil;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Example1 { // class start
    public static void main(String[] args) {


    /*

    [String 클래스] : 자바에서 문자열 표현하는 방법
        - 컴퓨터는 문자는 알고 문자열은 모른다
        - 문자 번역 : 바이트 <-- 번역방법 --> 문자
            1. 아스키코드 : 128문자 표현하는 규칙, 7비트
            2. 유니코드 : 전세계 공용어( 한글포함 ), 자바가 사용하는 코드
            - 65 <---> 'A' , {74, 65, 86, 65} <---> 'JAVA'

        1. 문자열 사용하는 방법
            1) "문자열" : ""큰 따옴표 안에 문자열 표현
            2) new String("문자열") : new String() 생성자 이용한 문자열 표현
        2. 문자열 비교하는 방법
            1) 문자열A == 문자열B : "리터럴" 문자만 비교 가능하다.
            2) 문자열A.equals( 문자열B )  : "리터럴"과 객체문자열을 비교 가능하다.

        3. 주요메소드
            1) 문자열A.concat( 문자열B ) : 연결 메소드
            2) String.format( "형식문자" , 문자열A ) : 지정한 형식으로 문자열 반환 메소드
            3) StringBuilder builder = new StringBuilder(); : 문자열 연결 클래스
                builder.append( 문자열A );
                builder.append( 문자열B );
            4) 문자열A.charAt( 인덱스 ) : 지정한 인덱스의 문자 1개 반환 메소드
            5) 문자열A.length() : 지정한 문자열의 문자 개수를 반환하는 메소드
            6) 문자열A.replace( 기존문자열, 새로운문자열 ) : 지정한 문자열 내 (하나)기존 문자열이 존재하면 새로운 문자열로 변경 후 반환 메소드
               문자열A.replacedAll( 기존문자열, 새로운문자열 ) : 지정한 문자열 내 (모든)기존 문자열이 존재하년 새로운 문자열로 변경 후 반환 메소드
            7) 문자열A.subString( 시작인덱스, [끝인덱스] ) : 지정한 문자열 내 시작인덱스부터 끝 인덱스 전까지 문자열 반환 메소드
            8) 문자열A.split( 구분문자 ) : 지정한 문자열 내 구분 문자가 존재하면 구분 문자 기분으로 쪼개서 String[] 타입으로 반환 메소드
            9) 문자열A.indexOf( "찾을문자열" ) : 지정한 문자열 내 찾을 문자열이 존재하면 찾은 문자열 인덱스 반환, 없으면 -1 반환
            10) 문자열A.contains( "찾을문자열" ) : 지정한 문자열 내 찾을 문자열이 존재하면 true 없으면 false 반환
            11) 문자열A.getBytes() : 지정한 문자열을 byte[] 타입으로 반환 메소드
                <---> new String( byte[]변수 ) : 지정한 byte[] 타입을 String 타입 변환

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
        // * 문자는 불변( 수정이 없음 )

        // 5. 주요 메소드
        // 1) 문자열A.concat( 문자열 B ) : 문자열 연결 메소드 vs 문자열A+문자열B
        String str9 = "자바".concat( "프로그래밍" );
        System.out.println( str9 );
        System.out.println( "자바" + "프로그래밍" );

        // 2) StringBuilder 클래스 : 문자열을 단계적으로 연결하는 메소드 제공하는 클래스
        StringBuilder builder = new StringBuilder();
        builder.append( "자바" );
        builder.append( "프로그래밍" );
        System.out.println( builder ); // 메모리 효율 좋다

        // 3) String.format( "형식문자" , "문자열A" )
        String str10 = String.format( "%s%s " , "자바" , "프로그래밍" );
        System.out.println( str10 );

        // 4) +연결연산자
        String str11 = "";
        str11 += "자바";
        str11 += "프로그래밍";
        System.out.println( str11 );

        // 활용) JDBC SQL의 매개변수 연결
        String name = "유재석";
        String sql1 = "insert into table( name ) values (" +name+ ")"; // 비권장
        String sql2 = String.format( "insert into table(name) values( %s );" , name );
        String sql3 = "";
        sql3 += "";
        sql3 += "insert into ";
        sql3 += "table(name) ";
        sql3 += "values("+name+")"; // 비권장 : 띄어쓰기 주의
        StringBuilder builder1 = new StringBuilder();
        builder1.append( "insert into table(name)");
        builder1.append("values("+name+")");


        // 5) .charAt( 인덱스 ) : 지정한 인덱스 번호의 문자 1개 반환 메소드
        char gender = "012345-1230123".charAt(7);
        System.out.println( gender );
        // 활용) nextChar() [x] ---> 문자 1개 입력 : scan.next().charAt(0)

        // 6) .length() : 문자열 내 문자수 반환 메소드
        System.out.println( "012345-1230123".length() ); // 인덱스 : 0~13, 길이 : 14
        // 활용) for( int index = 0 ; index < 문자열.length() ; index++ ){ }


        // (7) .replace( 기존문자열, 새로운문자열 )
        // : 지정한 문자열 내 기존문자열을 새로운 문자열로 생성 후 반환 메소드
        String str12 = "자바프로그래밍".replace( "자바" , "JAVA" );
        System.out.println( str12 ); // JAVA 프로그래밍

        // 활용) HTML 줄바꿈 <br> ----> JAVA 줄바꿈 \n
        String htmlData = "유재석<br/>안녕하세요";
        String newData = htmlData.replaceAll( "<br/>" , "\n");
        System.out.println( newData );

        // 8) .subString( 시작인덱스 , [끝인덱스] ); : 시작인덱스부터 끝인덱스까지 문자열 추출
        String str13 = "012345-1230123".substring( 0 , 6 ); // 0번 인덱스부터 6번 인덱스 전까지
        System.out.println( str13 ); // 012345
        String str14 = "012345-1230123".substring( 7 ); // 7번 인덱스부터 (마지막 인덱스)까지 추출
        System.out.println( str14 );
        // 활용) 차량번호 조회 : 214가7531, 차량번호 뒷자리 : 차량번호.length()-1-3

        // 9) .split( "구분문자" ); : 지정한 문자열 내 구분문자 기준으로 잘라서 배열로 반환 메소드
        String[] str15 = "012345-1230123".split( "-" ); // '-' 기준으로 문자열 쪼개기
        System.out.println( str15[0] );
        System.out.println( str15[1] );
        // 활용) CSV 형식 다루기, CSV란 ,(쉼표)로 속성을 구분하고 \n 줄바꿈 구분한다.
        // 활용) 날짜(연/월/일)
        // 활용 ) 주소(시 군 구 동)

        // 10) .indexOf("찾을문자열") : 지정한 문자열 내 찾을 문자열이 존재하면 찾은 인덱스, 없으면 -1 반환 메소드
        int findIndex = "자바 프로그래밍 언어".indexOf( "프로");
        System.out.println( findIndex ); // 띄어쓰기도 인덱스 포함

        // 11) .contains("찾을문자열"); // 지정한 문자열 내 찾을 문자열이 존재하면 true 없으면 false 반환 메소드
        boolean findBool = "자바 프로그래밍 언어".contains( "프로");
        System.out.println( findBool ); // true

        // 12) .getBytes() : 지정한 문자열을 byte[] 타입으로 반환 메소드
        byte[] str16 = "JAVA PROGRAM".getBytes();
        System.out.println( Arrays.toString( str16 ) );
        // [74, 65, 86, 65, 32, 80, 82, 79, 71, 82, 65, 77]
        String str17 = new String( str16 );
        System.out.println( str17 ); // JAVA PROGRAM
        // 활용) 문자열을 바이트 변환, 파일처리, 네트워크, 업로드/다운로드 등등

    }
} // class end
















