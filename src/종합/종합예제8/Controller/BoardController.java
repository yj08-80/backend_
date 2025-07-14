package 종합.종합예제8.Controller;

import 종합.종합예제8.model.dao.BoardDao;
import 종합.종합예제8.model.dto.BoardDto;

import java.util.ArrayList;

public class BoardController {
    // 1) 싱글톤
    private BoardController(){}
    private static final BoardController instance = new BoardController();
    public static BoardController getInstance(){
        return instance;
    }
    // 2) dao 싱글톤 가져오기
    private BoardDao boardDao = BoardDao.getInstance();

    // 3) 등록 기능 구현
    public boolean addBoard( String content , String writer ){
        boolean result = false;
        // 1) dao 에게 매개변수를 전달하고 결과(리턴) 값을 받는다.
        result = boardDao.addBoard( content , writer );
        return result;
    }

    // 4) 전체조회 기능 구현
    public ArrayList<BoardDto> getBoardList( ){
        // 1) dao 에게 요청후 모든 게시물(dto)들을 반환받아 view에게 반환한다.
        return boardDao.getBoardList();
    }

} // class end