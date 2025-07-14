package day11;

import java.util.ArrayList;
import java.util.Scanner;

public class 실습11 { // class start
    public static void main(String[] args) {
        //[JAVA] 실습11 : ArrayList 클래스
//[ 문제 ] 아래 ArrayList 관련 문제를 해결하시오.
//[ 제출방법 ] 코드가 작성된 파일이 위치한 깃허브 상세 주소를 제출하시오.
//
//[문제 1] String 타입의 요소를 저장할 수 있는 ArrayList를 nameList 라는 이름으로 생성하세요.
//1. .add() 메소드를 사용하여 "유재석", "강호동", "신동엽" 세 개의 이름을 리스트에 추가하세요.
//2. 리스트의 모든 요소를 System.out.println()으로 한 번에 출력하세요.
        // nameList 리스트
        ArrayList<String> nameList = new ArrayList<>();
        // 리스트에 추가
        nameList.add("유재석");
        nameList.add("강호동");
        nameList.add("신동엽");
        // 출력
        System.out.println( nameList );

//
//[문제 2] 다음과 같이 초기화된 ArrayList가 있습니다.
//1. ArrayList<String> fruits = new ArrayList<>();
//2. fruits.add("사과"); fruits.add("바나나"); fruits.add("딸기");
//3. 일반 for문을 사용하여, 각 인덱스와 해당 인덱스의 요소를 "인덱스 0: 사과" 형식으로 모두 출력하세요.
        ArrayList<String> fruits = new ArrayList<>();
        // 리스트에 추가
        fruits.add("사과");
        fruits.add("바나나");
        fruits.add("딸기");
        // 반복문
        for( int i = 0 ; i < fruits.size() ; i++ ){
            String fruit = fruits.get(i);
            // 출력
            System.out.println( "인덱스 " + i + " : " + fruit );
        }
//
//[문제 3] 문제 3의 fruits 리스트를 사용합니다.
//1. 향상된 for문 을 사용하여 리스트의 모든 요소를 하나씩 출력하세요.
        for( String fruit : fruits ){
            System.out.println( fruit );
        }
//
//[문제 4] "A", "B", "C", "D", "E"를 요소로 가지는 ArrayList를 생성하세요.
//1. .remove() 메소드를 사용하여 2번 인덱스의 요소("C")를 삭제하세요.
//2. 삭제 후의 리스트 전체를 출력하여 결과가 올바른지 확인하세요.
        // 알파벳 배열
        ArrayList< String > alpabet = new ArrayList<>();
        // 추가
        alpabet.add( "A" );
        alpabet.add( "B" );
        alpabet.add( "C" );
        alpabet.add( "D" );
        alpabet.add( "E" );
        // 2번 인덱스 요소 제거
        alpabet.remove(2);
        // 출력
        System.out.println( alpabet );
//
//[문제 5] "자바", "파이썬", "C++"를 요소로 가지는 ArrayList를 생성하세요.
//1. .add(인덱스, 요소) 메소드를 사용하여 1번 인덱스에 "자바스크립트"를 삽입하세요.
//2. 삽입 후의 리스트 전체를 출력하여 순서가 올바르게 변경되었는지 확인하세요.
        ArrayList< String > a = new ArrayList<>();
        // 추가
        a.add( "자바" );
        a.add( "파이썬" );
        a.add( "C++" );
        // 1번 인덱스에 추가
        a.add( 1, "자바스크립트" );
        // 출력
        System.out.println( a );
//
//[문제 6] title(문자열)과 author(문자열) 멤버 변수를 가진 Book 클래스를 만드세요.
//1. Book 객체를 저장할 수 있는 ArrayList를 library 라는 이름으로 생성하세요.
//2. new Book(...)을 사용하여 3권의 책 객체를 생성하고 library 리스트에 추가하세요.
//3. 향상된 for문을 사용하여 library에 저장된 모든 책의 제목과 저자를 출력하세요.
        ArrayList < Book > library = new ArrayList<>();
        // 책 객체 생성
        Book l1 = new Book( "책1" , "작가1" );
        Book l2 = new Book( "책2" , "작가2" );
        Book l3 = new Book( "책3" , "작가3" );
        // library 리스트에 추가
        library.add( l1 );
        library.add( l2 );
        library.add( l3 );
        // 반복문
        for( Book book : library ){
            // 출력
            System.out.println( "책 제목 : " + book.getTitle() + " , 저자 : " + book.getAuthor());
        }
//
//[문제 7] Scanner를 사용하여 사용자로부터 문자열을 계속해서 입력받습니다.
//1. 입력받은 문자열은 ArrayList에 순서대로 저장합니다.
//2. 만약 사용자가 "종료" 라는 단어를 입력하면, 입력을 멈추고 그때까지 리스트에 저장된 모든 내용을 출력한 뒤 프로그램을 종료하세요.
        ArrayList< String > array = new ArrayList<>();
        Scanner scan = new Scanner( System.in );
        // 무한반복문
        for( ; ; ){
            System.out.println( "문자열 입력 ( 종료하려면 종료라고 입력 )");
            String string = scan.next();
            // 종료라고 입력하면
            if (string.equals( "종료" )){
                break;
            } // if end
            array.add( string );
        } // for end
        System.out.println( array );

//
//[문제 8] "국어", "수학", "사회", "과학"을 요소로 가지는 ArrayList를 생성하세요.
//1. .set(인덱스, 요소) 메소드를 사용하여 1번 인덱스의 "수학"을 "영어"로 수정하세요.
//2. 수정 후의 리스트 전체를 출력하여 결과가 올바른지 확인하세요.
        ArrayList< String > subject = new ArrayList<>();
        // 국어 수학 사회 과학 요소를 가지는
        subject.add( "국어" );
        subject.add( "수학" );
        subject.add( "사회" );
        subject.add( "과학" );
        // 1번 인덱스 영어로 변경
        subject.set( 1, "영어" );
        // 출력
        System.out.println( subject );

    }
} // class end
