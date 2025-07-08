package day07;

public class ParkingLot{ // class start
    // 매개변수 주차시간(분) 반환값 주차요금
    int calculateFee( int time ){
        // 기본 요금
        int money;
        if( time <= 30 ){
            money = 1000;
            return money;
        }
        // 최종 주차 요금 계산
        else if( time > 30 ){
            money = (time - 30 )/10 * 500 + 1000;
            return money;
        }else{
            money = 20000;
            return money;
        }
    }
} // class end
