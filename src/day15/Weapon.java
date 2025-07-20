package day15;

public class Weapon {
    public void attack(){
        System.out.println( "무기로 공격합니다." );
    }
}
class Sword extends Weapon{
    public void attack(){
        System.out.println( "검으로 공격합니다." );
    }
}
class Gun extends Weapon{
    public void attack(){
        System.out.println( "총으로 공격합니다." );
    }
}

class Character{
    public void use( Weapon weapon ){
        weapon.attack();
    }
}