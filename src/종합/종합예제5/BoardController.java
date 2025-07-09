package 종합.종합예제5;

// (2) (게시물 이벤트) 기능 제어/로직 담당
public class BoardController { // class start

    Board[] boards = new Board[100];

    // 등록 이벤트 : 입력받은 자료를 받아서 객체를 생성하여 배열에 저장
    // 메소드 이름 : doPost
    // 매개변수 : 저장할 내용과 작성자 , String content , String writer
    // 반환값 : 성공/실패 == boolean
    boolean doPost( String content , String writer ){
        boolean check = false;
            Board board = new Board( content , writer ); // (1) 생성자를 이용한 객체 만들기
            // (2) 배열 내 빈공간을 찾아서 생성된 객체 대입
            for( int index = 0 ; index <= boards.length-1 ; index++ ){
                if( boards[index] == null ){ // -만약에 index번째 요소가 null이면
                    boards[index] = board; // index번째에 생성한 객체 대입
                    return true;
                } // if end
            } // for end
        return false; // for에서 null이 존재하지 않을 때 false 반환
    } // func end

    // (출력) 조회 이벤트 : 현재 저장된 모든 객체들을 가지고 있는 배열 호출
    // 메소드 이름 : getPost
    // 매개변수 : x
    // 반환값 : boards ,  반환타입 : Board[]
    Board[] doGet(){
        return boards;
    }
} // class end

// 담당이 필요한 이유?
// - 복잡한 로직/코드를 역할/담당 나누어 유지 보수나 관리한다.
