package libraryService과제.controller;

public class MemberController { // class start

    // logInMno
    private static int logInMno = 0;

    // getter and setter
    public static int getLogInMno() {
        return logInMno;
    }
    public static void setLogInMno(int logInMno) {
        MemberController.logInMno = logInMno;
    }

    // 싱글톤
    private MemberController(){}
    private static final MemberController memberController = new MemberController();
    public static MemberController getInstance(){
        return memberController;
    }


} // class end
