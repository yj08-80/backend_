package libraryService과제.view;

public class LogoutView {

    private LogoutView(){}
    private static final LogoutView logoutView = new LogoutView();
    public static LogoutView getInstance(){
        return logoutView;
    }
}
