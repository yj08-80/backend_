package day15;

interface Soundable{
    void makdSound();
}

//----------------------------------//
public class Cat implements Soundable{
    @Override
    public void makdSound() {
        System.out.println( "야옹" );
    }
} // class end


//----------------------------------//
class Dog implements Soundable{
    @Override
    public void makdSound() {
        System.out.println( "멍멍" );
    }
}