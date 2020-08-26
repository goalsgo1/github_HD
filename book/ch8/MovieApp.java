package book.ch8;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MovieApp extends JFrame {
	JLabel jlb_time = null;
	// 타임 서버 기동시키기
	TimeServer ts = null;
	TimeClient tc = null;

	public MovieApp() {
		// ts = new TimeServer();
	}

	public void initDisplay() {
		jlb_time = new JLabel("현재시간 출력할 곳", JLabel.CENTER);
		Font f = new Font("돋움체", Font.BOLD, 55);
		jlb_time.setFont(f);
		// 이 때 주의사항은 반드시 jlb_time이 인스턴스화 되어있다.
		this.add("North", jlb_time);
		this.setSize(400, 300);
		this.setVisible(true);
		tc = new TimeClient(jlb_time);
		tc.start();
	}

	public static void main(String[] args) {
		MovieApp ma = new MovieApp();
		ma.initDisplay();
	}

}
