package libraryService과제.controller;

import libraryService과제.model.dao.BookInfoDao;

public class BookInfoController { // class start

    // 싱글톤
    private BookInfoController(){}
    private static final BookInfoController bookInfoController = new BookInfoController();
    public static BookInfoController getInstance(){
        return bookInfoController;
    }
} // class end
