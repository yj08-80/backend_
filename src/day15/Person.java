package day15;

interface Runnable{
    void run();
}

public class Person implements Runnable{ // class start

    @Override
    public void run() {
        System.out.println( "사람이 달립니다." );
    }

} // class end

class Car implements Runnable{
    @Override
    public void run() {
        System.out.println( "차가 달립니다." );
    }
}
