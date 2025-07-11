package 종합.종합예제7;

import 종합.종합예제7.view.BoardView;

// (역할) 프로그램 시작 클래스
public class AppStart {
    public static void main(String[] args) {

        //boardView index() 호출하는 방법
        // 1. 메소드가 static이면
        // BoardView.index();
        // 2. 메소드가 static이 아니면
        // BoardView view = new BoardView();1
        // 3. 해당 클래스가 싱글톤이면
        BoardView.getInstance().index();

    }
}
