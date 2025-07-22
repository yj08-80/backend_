package 종합.종합예제9.model.dto;

public class BoardDto { // class start

    // 멤버변수
    private String content;
    private String writer;

    // 생성자
    public BoardDto(String content, String writer) {
        this.content = content;
        this.writer = writer;
    }

    // setter and getter
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

    // toString()
    @Override
    public String toString() {
        return "BoardDto{" +
                "content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                '}';

    }
} // class end
