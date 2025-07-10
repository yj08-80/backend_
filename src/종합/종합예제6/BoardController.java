package 종합.종합예제6;

public class BoardController { // class start
    // 1.멤버변수
    private static final Board[] boards = new Board[100];
        // private : 현재 클래스에서만 접근 키워드
        // static : 객체 없이 접근 가능한 키워드
        // final : 수정 불가능 키워드
    // 2.생성자
    // 3. 메소드
    // 1) 등록 메소드
        // public 다른 클래스에서 접근
    public static boolean doPost( String content , String writer ){
        Board board = new Board( content , writer );
        for( int i = 0 ; i <= boards.length-1 ; i++ ){
            if( boards[i] == null ){
                boards[i] = board;
                return true;
            } // if end
        } // for end
        return false;
    }
    // 2) 조회 메소드
    public static Board[] doGet(){
        return boards;
    }
} // class end


