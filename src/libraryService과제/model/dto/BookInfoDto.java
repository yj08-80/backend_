package libraryService과제.model.dto;

import 종합.종합예제8.Controller.BoardController;

public class BookInfoDto { // class start

    private BookInfoDto(){}
    private static final BookInfoDto bookInfoDto = new BookInfoDto();
    public static BookInfoDto getInstance(){
        return bookInfoDto;
    }
} // class end
