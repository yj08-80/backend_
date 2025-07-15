package libraryService과제.model.dto;

public class LendingStatusDto { // class start

    // 싱글톤
    private LendingStatusDto(){}
    private static final LendingStatusDto lendingStatusDto = new LendingStatusDto();
    public static LendingStatusDto getInstance(){
        return lendingStatusDto;
    }
} // class end
