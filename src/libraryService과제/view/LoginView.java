package libraryService과제.view;

public class LoginView { // class start

    private LoginView(){}
    private static final LoginView loginView = new LoginView();
    public static LoginView getInstance(){
        return loginView;
    }
} // class end
