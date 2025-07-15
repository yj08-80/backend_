package libraryService과제.model.dao;

import libraryService과제.model.dto.LendingStatusDto;

import java.util.ArrayList;

public class LendingStatusDao { // class start
    private LendingStatusDao(){}
    private static final LendingStatusDao lendingStatusDao = new LendingStatusDao();
    public static LendingStatusDao getInstance(){
        return lendingStatusDao;
    }

    private ArrayList<LendingStatusDto> lendingStatusDB = new ArrayList<>();
} // class end
