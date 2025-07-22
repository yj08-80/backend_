package 종합.과제.종합과제7;

import 종합.과제.종합과제7.controller.WaitingController;
import 종합.과제.종합과제7.model.dto.WaitingDto;
import 종합.과제.종합과제7.view.WaitingView;

import java.util.ArrayList;

public class AppStart { // class start
    public static void main(String[] args) { // main start
//        WaitingController waitingController = WaitingController.getInstance();
//        waitingController.waitWrite( "010-1111-2222" , 3 );
//        ArrayList<WaitingDto> result = waitingController.waitingPrint();
//        System.out.println( result );

        WaitingView.getInstance().index();
    } // main end
} // class end
