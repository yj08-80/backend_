package libraryService과제.model.dao;

public class BookInfoDao { // class start

    private BookInfoDao(){}
    private static final BookInfoDao bookInfodao = new BookInfoDao();
    public static BookInfoDao getInstance(){
        return bookInfodao;
    }

} // class end
