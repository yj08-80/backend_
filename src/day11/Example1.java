package day11;

import java.util.ArrayList;
import java.util.Arrays;

public class Example1 { // class start

    /*

    [ 배열 ] 고정길이, 메소드(기능) 없다.
    [ ArrayList ] 가변길이, 다양한 메소드(기능) 제공
        - 자바 회사에서 미리 제공하는 클래스
        1. 정의 : 컬렉션프레임워크 중 리스트 자료형 클래스
        2. 목적 : 가변길이의 배열
        3. 사용법
            1) 선언방법
                ArrayList<항목타입>변수명= new ArrayList<>();
                * <제네릭타입> : 리스트에 저장할 항목/요소들의 타입
            2) 요소추가
                (1) 변수명.add(요소값); 마지막 인덱스 뒤로 요소를 추가
                (2)


     */

    public static void main(String[] args) { // main start
        // [1] ArrayList 객체 생성하기
        ArrayList< String > 리스트객체 = new ArrayList<>();

        // [2] .add(); 요소 추가하기
        리스트객체.add( "유재석" );

        // [3] 변수명
        System.out.println( 리스트객체 );

        // !요소 추가
        리스트객체.add( "강호동" );
        리스트객체.add( "신동엽" );
        System.out.println( 리스트객체 );

        // !중간에 요소 추가
        리스트객체.add( 1, "박명수" );
        System.out.println( 리스트객체 );
    } // main end
} // class end














