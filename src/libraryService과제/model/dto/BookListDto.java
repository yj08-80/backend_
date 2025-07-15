package libraryService과제.model.dto;

public class BookListDto { // class start

    // 싱글톤
    private BookListDto(){}
    private static final BookListDto bookListDto = new BookListDto();
    public static BookListDto getInstance(){
        return bookListDto;
    }
} // class end
