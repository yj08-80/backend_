package 종합.과제.종합과제9.controller;

import 종합.과제.종합과제9.model.dao.MarketDao;
import 종합.과제.종합과제9.model.dto.MarketDto;

import java.util.ArrayList;

public class MarketController { // class start

    // 싱글톤
    private MarketController(){}
    private static final MarketController instance = new MarketController();
    public static MarketController getInstance(){
        return instance;
    }

    // boardDao 싱글톤 가져오기
    private MarketDao marketDao = MarketDao.getInstance();


    // (1) 등록 기능 구현
    public boolean usedItemRegister( String username , String pname , String content , int price , String pwd ){
        MarketDto marketDto = new MarketDto( username , pname , content , price , pwd );
        boolean result = marketDao.usedItemRegister( marketDto );
        return result;
    }



    // (2) 전체조회 기능 구현
    public ArrayList< MarketDto > showAllItems(){
        ArrayList< MarketDto > result = marketDao.showAllItems();
        return result;
    }


    // (3) 삭제 기능 구현
    public boolean deleteItem( int no , String pwd ){
        boolean result = marketDao.deleteItem( no );
        return result;
    }


    // (4) 수정 기능 구현
    public boolean updateItemInfo( int no , String pname , String content , int price , boolean is_sold ){
        MarketDto marketDto = new MarketDto( no , pname , content , price , is_sold );
        boolean result = marketDao.updateItemInfo( marketDto );
        return result;
    }

    public boolean check (int no , String pwd) {
        MarketDto marketDto = new MarketDto( no , pwd );

        return marketDao.check( marketDto );
    }
} // class end
























