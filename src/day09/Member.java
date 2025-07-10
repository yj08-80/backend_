package day09;

public class Member {
    // private 접근 제한자를 가진 id(문자열) 멤버 변수
    private String id;
    // public 접근 제한자를 가진 setId()와 getId() 메소드(Getter/Setter)

    public void setId( String id ) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }
}
