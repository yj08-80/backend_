package 종합.종합예제4;

// BoardController : 로직/제어 담당
public class BoardController {

    // 1. 멤버변수
    Board[] boards = new Board[100];

    // 2. 메소드
    // 2-1. 등록 메소드
    boolean doPost( String content , String writer ){
        Board board = new Board(); // 객체 생성
        board.content = content; // 매개변수로 받은 값들을 객체의 멤버 변수에 저장
        board.writer = writer;
        // boards 배열의 빈 공간(null)을 찾아 생성된 객체를 저장합니다.
        for( int index = 0 ; index <= boards.length -1 ; index++ ){
            if( boards[index] == null ){ // 만약에 index 번째 요소의 값이 null 이면
                boards[index] = board; // index 번째에 생성한 객체를 대입
                return  true; // 저장 성공시 true
            }
        } //for end
        return false;
    } //func end
    Board[] doGet(){
        return boards;
        // boards 배열 전체를 반환( return )
        // boards 타입은 board[]
    }
}
