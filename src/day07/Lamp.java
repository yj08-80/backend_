package day07;

public class Lamp {
    boolean isOn = false;
    void turnOn(){
        isOn =  true;
        System.out.println( isOn );
    }
    void turnOff(){
        isOn = false;
        System.out.println( isOn );
    }
}
