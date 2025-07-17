package project.view;



public class LogOutView { // class start


    // 싱글톤
    private LogOutView(){}
    private static final LogOutView logOutView = new LogOutView();
    public static LogOutView getInstance(){
        return logOutView;
    }


} // class end


















