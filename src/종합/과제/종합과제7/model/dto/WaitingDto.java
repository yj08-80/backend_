package 종합.과제.종합과제7.model.dto;

public class WaitingDto { // class start

    // 멤버변수
    private String phone;
    private int count;

    // 생성자
    public WaitingDto(String phone, int count) {
        this.phone = phone;
        this.count = count;
    }

    // setter and getter
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    // toString()
    @Override
    public String toString() {
        return "WaitingDto{" +
                "phone='" + phone + '\'' +
                ", count=" + count +
                '}';
    }
} // class end
