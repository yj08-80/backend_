package libraryService과제.model.dao;

import libraryService과제.model.dto.BookListDto;
import 종합.종합예제8.model.dao.BoardDao;

import java.util.ArrayList;

public class BookListDao { // class start

    // 싱글톤 세팅
    private BookListDao(){}
    private static final BookListDao bookListDao = new BookListDao();
    public static BookListDao getInstance(){
        return bookListDao;
    }

    private ArrayList<BookListDto> booklistDB = new ArrayList<>();
} // class end
