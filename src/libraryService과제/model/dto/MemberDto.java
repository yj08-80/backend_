package libraryService과제.model.dto;

public class MemberDto { // class start

    // 싱글톤
    private MemberDto(){}
    private static final MemberDto memberDto = new MemberDto();
    public static MemberDto getInstance(){
        return memberDto;
    }
} // class end
