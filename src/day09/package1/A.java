package day09.package1; // A클래스의 폴더(패키지) 위치

public class A { // class에는 private 키워드 불가능
    public int 공개변수 = 1; // public
    private int 비공개변수 = 2; // private
    //default int 일반변수 = 3; (default) 생략
    int 일반변수 = 3;
    public void 메소드(){
        System.out.println( this.공개변수 ); // 가능
        System.out.println( 비공개변수 ); // 가능
        System.out.println( 일반변수 ); // 가능
    }
} // class end
