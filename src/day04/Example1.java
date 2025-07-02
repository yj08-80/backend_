package day04;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Example1 { // class start
    public static void main(String[] args) { // main start

        /*

        [ 반복문 ]
            1. 조건에 따른 결과가 충족(true)했을 때 (반복)코드 실행
            2. 형태
                for( 초기값 ; 조건문 ; 증감식 ){
                실행문;
                }
                - 초기값 : 반복문에서 사용되는 변수 *주로 반복횟수 , int i = 1;
                - 조건문 : 반복변수의 조건문 * 주로 반복횟수 제한 , i <= 10;
                - 증감식 : 반복변수의 증가 또는 감소 변화식 * 주로 반복횟수 증감 , i++
            3. 실행순서
                1) 초기값 -> 2) 조건문 -> 3) 실행문 -> 4) 증감식


            4. for 중첩 가능 : 상위 for문이 1회전마다 하위 for문의 전체 회전
                for(){
                    for(){}
                }

            5. 주요 키워드
                1) break; : 가장 가까운 반복문 종료/탈출
                2) continue : 가장 가까운 반복문(증감식) 이동

            6. 무한루프
                1) for( ; ; ){}
                2) while(true){}
        */
        //[1] 1부터 5까지 출력
            // 반복문 없이
        System.out.println( 1 );
        System.out.println( 2 );
        System.out.println( 3 );
        System.out.println( 4 );
        System.out.println( 5 );
            // 반복문 , : 1부터 5까지 1씩 증가
        for( int i = 1 ; i <= 5 ; i++ ){
            System.out.println( i );
        }

        //[2] 중첩 : 구구단
            // 단 반복 : 2부터 9까지 1씩 증가
//        for( int 단 = 2 ; 단 <= 9 ; 단++ ){
//            System.out.println( 단 );
//        }
            // 곱 반복 : 1부터 9까지 1씩 증가
//        for( int 곱 = 1 ; 곱 <= 9 ; 곱++ ){
//            System.out.println( 곱 );
//        }
            // 합치기
        for( int 단 = 2 ; 단 <= 9 ; 단++ ){
            for( int 곱 = 1 ; 곱 <= 9 ; 곱++ ){
                System.out.printf( "%d X %d = %d\n" , 단 , 곱, 단*곱 );
            }
        }


        //[3] break : 1부터 10까지 반복, 만약에 5를 찾았으면 반복문 종료
        for( int index = 1 ; index <= 10 ; index++ ){
            if( index == 5 ){
                break; // 만약에 현재 index가 5이면 반복문 종료
            }
            System.out.println( index );
        } // for end


        //[4] continue : 1부터 10까지 반복, 만약에 5를 찾았으면 출력 생략
        for( int i = 0 ; i <= 10 ; i++ ){
            if( i == 5 ){
                continue;
            }
            System.out.println( i );
        }


        //[5] for( ; ; ){} : 무한반복, 종료 조건이 필요
        for( ; ; ){  // while(true) 도 가능
            System.out.print( "무한입력(종료:'x') : " );
            String input = new Scanner( System.in ).next();
            if( input.equals("x") ){
                break;
            }
        }


    } // main end
} // class end
