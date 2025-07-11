package 종합.종합과제5.model.dto;

public class WaitingDto { // class start
    // 1. 멤버변수 - private
    private String phone;
    private String count;

    // 2. 생성자 - 기본생성자, 매개변수가 있는 생성자
    public WaitingDto(){}
    public WaitingDto(String phone, String count) {
        this.phone = phone;
        this.count = count;
    }

    // 3. getter and setter
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getCount() {
        return count;
    }
    public void setCount(String count) {
        this.count = count;
    }

    // 4. toString()

    @Override
    public String toString() {
        return "WaitingDto{" +
                "phone='" + phone + '\'' +
                ", count='" + count + '\'' +
                '}';
    }
} // class end
