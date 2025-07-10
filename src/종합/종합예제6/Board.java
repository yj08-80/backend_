package 종합.종합예제6;

//(1) 데이터 모델 : 게시물 모델링
// 데이터를 객체로 갖는 형식
public class Board { // class start
    // 1. 멤버변수 : 주로 멤버변수는 private
    // 모델링에 들어갈 속성
    private String content;
    private  String writer;
    // 2. 생성자 : 주로 기본생성자 1개와 전체매개변수생성자 1개를 가지고 시작한다.
    // 자동 : 해당 클래스에서 오른쪽 클릭 -> [ 생성 ]
    // 기본생성자
    public Board(){}
    // 전체매개변수를 갖는 생성자
    public Board(String content, String writer) {
        this.content = content;
        this.writer = writer;
    }

    // 3. 메소드
    //  1) private으로 선언된 멤버변수를 외부(다른 클래스)로부터 접근할 수 있도록 getter/setter 지원한다.
    //  자동 : 해당 클래스에서 오른쪽 클릭 -> [ 생성 ] -> getter and setter

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    //  2) 개발자가 작업하면서 객체의 주소값이 아닌 객체내 멤버변수 값 반환, toString() 지원한다.

    @Override
    public String toString() {
        return "Board{" +
                "content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }

    // 자동 : 해당 클래스에서 오른쪽 클릭 -> [ 생성 ]

} // class end


















