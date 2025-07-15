package libraryService과제.model.dao;

import 종합.종합예제8.model.dao.BoardDao;

public class BookListDao { // class start

    // 싱글톤 세팅
    private BookListDao(){}
    private static final BookListDao bookListDao = new BookListDao();
    public static BookListDao getInstance(){
        return bookListDao;
    }
} // class end
