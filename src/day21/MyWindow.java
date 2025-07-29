package day21;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame("나의 첫 화면");  // 창 제목 설정
        frame.setSize(400, 300);                  // 창 크기 설정 (가로 400, 세로 300)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 닫으면 프로그램 종료

        JLabel label = new JLabel("안녕하세요!", JLabel.CENTER);  // 라벨(텍스트)
        frame.add(label);                   // 창에 라벨 추가

        frame.setVisible(true);             // 화면에 창 보이기
    }
}