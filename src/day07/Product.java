package day07;

public class Product {

    String name = null;
    int stock = 10;

    boolean sell( int 구매수량 ){
        if( stock >= 구매수량 ){
            stock -= 구매수량;
            return true;
        }else{
            System.out.println( "재고 부족" );
            return false;
        }
    }
}
