package libraryService과제.controller;

public class MemberController { // class start

    private MemberController(){}
    private static final MemberController memberController = new MemberController();
    public static MemberController getInstance(){
        return memberController;
    }
} // class end
