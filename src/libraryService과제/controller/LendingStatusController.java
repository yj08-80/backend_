package libraryService과제.controller;

public class LendingStatusController { // class start

    private LendingStatusController(){}
    private static final LendingStatusController lendingStatusController = new LendingStatusController();
    public static LendingStatusController getInstance(){
        return lendingStatusController;
    }
} // class end
