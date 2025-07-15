package libraryService과제.view;

public class LogInView { // class start

    // 싱글톤
    private LogInView(){}
    private static final LogInView logInView = new LogInView();
    public static LogInView getInstance(){
        return logInView;
    }
} // class end
