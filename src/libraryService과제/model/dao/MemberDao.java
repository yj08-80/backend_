package libraryService과제.model.dao;

import libraryService과제.model.dto.BookListDto;
import 종합.종합예제8.model.dao.BoardDao;

import java.util.ArrayList;

public class MemberDao { // class start

    // 싱글톤
    private MemberDao(){}
    private static final MemberDao memberDao = new MemberDao();
    public static MemberDao getInstance(){
        return memberDao;
    }

    private ArrayList<BookListDto> memberDB = new ArrayList<>();

} // class end
