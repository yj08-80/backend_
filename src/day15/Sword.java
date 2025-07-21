package day15;

interface Attackble{ // interface start
    void attack();
} // interface end

//--------------------------------//

public class Sword implements Attackble{
    @Override
    public void attack() {
        System.out.println( "검으로 공격" );
    }
}


//--------------------------------//
class Gun implements Attackble{
    @Override
    public void attack() {
        System.out.println( "총으로 공격" );
    }
}

class Character {
    // 3. 다형성을 활용한 메소드
    public void useWeapon( Attackble weapon) {
        weapon.attack(); // 전달된 무기에 따라 다르게 동작

    }
}