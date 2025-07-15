package libraryService과제.model.dao;

import libraryService과제.model.dto.BookListDto;

import java.util.ArrayList;

public class BookInfoDao { // class start

    private BookInfoDao(){}
    private static final BookInfoDao bookInfodao = new BookInfoDao();
    public static BookInfoDao getInstance(){
        return bookInfodao;
    }

    private ArrayList<BookListDto> booklistDB = new ArrayList<>();

}
