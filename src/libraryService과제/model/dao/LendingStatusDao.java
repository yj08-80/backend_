package libraryService과제.model.dao;

import 종합.종합예제8.model.dao.BoardDao;

public class LendingStatusDao { // class start
    private LendingStatusDao(){}
    private static final LendingStatusDao lendingStatusDao = new LendingStatusDao();
    public static LendingStatusDao getInstance(){
        return lendingStatusDao;
    }
} // class end
