package day15;


interface DataAccessObject{
    void save();
}
public class OracleDao implements DataAccessObject{
    @Override
    public void save() {
        System.out.println( "Oracle DB에 저장");
    }
}

class MysqlDao implements DataAccessObject{
    @Override
    public void save() {
        System.out.println( "MySQL DB에 저장" );
    }
}
