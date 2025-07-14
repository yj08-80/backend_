package 종합.과제.종합과제4;

public class Waiting { // class start
//    1. Waiting.java 클래스 설계 (Model - 캡슐화)
//        · private 접근 제한자를 사용하여 phone(문자열)과 count(정수) 멤버 변수를 선언하여
//        외부로부터의 직접적인 접근을 막습니다.
//        · public 접근 제한자를 가진 생성자를 만들어,
//        객체가 생성될 때 전화번호와 인원수 정보를 받아 초기화하도록 합니다.
//        · private 멤버 변수에 안전하게 접근할 수 있도록,
//        각 변수에 대한 public Getter와 Setter 메소드를 정의합니다.
//        (예: getPhone(), setPhone(), ...)

    // phone(문자열)과 count(정수) 멤버 변수를 선언 private
    private String phone;
    private int count;

    // public 접근 제한자를 가진 생성자
    public Waiting( String phone , int count ){
        this.phone = phone;
        this.count = count;
    }

    // public Getter와 Setter 메소드를 정의
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

    @Override
    public String toString() {
        return "phone='" + phone + '\'' + ", count='" + count + '\'' + '}';
    }
} // class end
