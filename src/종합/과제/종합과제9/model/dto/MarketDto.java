package 종합.과제.종합과제9.model.dto;

import java.util.Date;

public class MarketDto { // class start

    // 멤버변수
    private int no;
    private String username;
    private String pname;
    private String content;
    private int price;
    private String pwd;
    private Date datetime;
    private boolean is_sold;

    // 생성자
    //public MarketDto(int no, String username, String pname, String content, int price, String pwd){

    //}


    public MarketDto(String username, String pname, String content, int price, String pwd) {
        this.username = username;
        this.pname = pname;
        this.content = content;
        this.price = price;
        this.pwd = pwd;
    }

    public MarketDto(int no, String pwd) {
        this.no = no;
        this.pwd = pwd;
    }

    public MarketDto(int no, String pname , String content, int price, boolean is_sold) {
        this.pname = pname;
        this.no = no;
        this.content = content;
        this.price = price;
        this.is_sold = is_sold;
    }

    public MarketDto(int no , String username, String pname, String content, int price, String pwd, Date datetime, boolean is_sold ) {
        this.no = no;
        this.username = username;
        this.pname = pname;
        this.content = content;
        this.price = price;
        this.pwd = pwd;
        this.datetime = datetime;
        this.is_sold = is_sold;
    }

    // setter and getter
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPname() {
        return pname;
    }
    public void setPname(String pname) {
        this.pname = pname;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getPwd() {
        return pwd;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    public Date getDatetime() {
        return datetime;
    }
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
    public boolean isIs_sold() {
        return is_sold;
    }
    public void setIs_sold(boolean is_sold) {
        this.is_sold = is_sold;
    }

    @Override
    public String toString() {
        return "MarketDto{" +
                "no=" + no +
                ", username='" + username + '\'' +
                ", pname='" + pname + '\'' +
                ", content='" + content + '\'' +
                ", price=" + price +
                ", pwd='" + pwd + '\'' +
                ", datetime=" + datetime +
                ", is_sold=" + is_sold +
                '}';
    }
} // class end
