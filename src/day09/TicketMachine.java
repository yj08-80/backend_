package day09;

public class TicketMachine {
    // 총 티켓 수를 저장할 정적 변수를 선언
    static int totalTickets = 0;
    // 티켓을 한 장 발권하는 issueTicket() 인스턴스 메소드
    int issueTicket(){
        // 호출될 때마다 totalTickets를 1씩 증가시키고,
        totalTickets++;
        //"티켓 1장을 발권했습니다."라고 출력합니다.
        System.out.println( "티켓 1장을 발권했습니다." );
        return totalTickets;
    }

    //총 티켓 수를 출력하는 static void printTotalTickets() 정적 메소드
    static void printTotalTickets(){
        System.out.println( totalTickets );
    }

    // static void printTotalTickets() 정적 메소드
}
