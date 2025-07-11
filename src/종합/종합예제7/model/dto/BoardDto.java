package 종합.종합예제7.model.dto;


// (역할) 데이터의 모델이면서 이동객체
public class BoardDto { // class start
    // 1. 멤버변수 : 모두 private 한다
    private String content;
    private String writer;

    // 2. 생성자 : 기본생성자, 풀생성자는 기본, 추후 추가
    public BoardDto(){}
    public BoardDto( String content , String writer ){
        this.content = content;
        this.writer = writer;
    }

    // 3-1 : getter and setter
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

    // 3-2 : toString
    @Override
    public String toString() {
        return "BoardDto{" +
                "content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }
} // class end
