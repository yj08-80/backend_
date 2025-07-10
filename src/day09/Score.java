package day09;

public class Score { // class start
    // private 접근 제한자를 가진 score(정수) 멤버 변수
    private int score;
    // setScore(int score) 메소드
    public void setScore(int score) {
        // 점수가 0 이상 100 이하일 경우에만 멤버 변수 score에 값을 저장
        if( score >= 0 && score <= 100 ){
            this.score = score;
            System.out.println( score );
            //범위를 벗어나면 "유효하지 않은 점수입니다."라고 출력
        }else{
            System.out.println( "유효하지 않은 점수입니다." );
        }
    }



} // class end
