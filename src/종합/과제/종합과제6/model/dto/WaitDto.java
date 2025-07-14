package 종합.과제.종합과제6.model.dto;

public class WaitDto { // class start

    // 멤버변수
    String phone;
    int count;
    // 생성자
    public WaitDto(){}
    public WaitDto(String phone, int count) {
        this.phone = phone;
        this.count = count;
    }

    // 메소드
    // getter and setter
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
        return "WaitDto{" +
                "phone='" + phone + '\'' +
                ", count=" + count +
                '}';
    }
} // class end
