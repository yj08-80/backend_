package libraryService과제.model.dao;

import 종합.종합예제8.model.dao.BoardDao;

public class MemberDao { // class start

    // 싱글톤
    private MemberDao(){}
    private static final MemberDao memberDao = new MemberDao();
    public static MemberDao getInstance(){
        return memberDao;
    }



} // class end
