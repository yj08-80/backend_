package day15;


interface Device{
    void turnOn();
    void turnOff();
    public default void setMute(boolean mute){
        if( mute ){
            System.out.println( "무음 처리합니다.");
        }else{
            System.out.println( "무음 처리 해제합니다." );
        }

    }
}

//Television 클래스가 Device를 구현하도록 하되, turnOn(), turnOff()만 오버라이딩하세요.
public class Television implements Device{
    @Override
    public void turnOn() {
        System.out.println( "켭니다" );
    }

    @Override
    public void turnOff() {
        System.out.println( "끕니다" );
    }
}
