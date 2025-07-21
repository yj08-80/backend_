package day14;

public class Animal { // class start
    public void makeSound(){};
} // class end

class Cat extends Animal{
    public void makeSound(){
        System.out.println( "고양이가 야옹하고 웁니다." );
    }
}
