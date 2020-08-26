package design.test;

import javax.swing.JButton;
import javax.swing.JFrame;

public class InstanceTest extends JFrame {
	// 선언부
	JButton jbtn_n = null;

	// 생성자
	public InstanceTest() {
		jbtn_n = new JButton("북쪽");
	}

	public InstanceTest(String label) {
		JButton jbtn_s = new JButton(label);
	}

	// 화면처리부
	public void initDisplay() {
		if (jbtn_n != null) {
			this.add("Center", jbtn_n);
			this.setSize(500, 400);
			this.setVisible(true);
		}
	}

	// 메인메소드
	public static void main(String[] args) {
		// 아빠 타입의 변수로는 아들 타입에 선언된 메소드를 호출 할 수 없다.
		JFrame jf = new InstanceTest("남쪽");
		InstanceTest it = new InstanceTest("남쪽");
		it.initDisplay();
	}

}

//	JFrame jf = new InstanceTest(); //선언부의 타입과 생성부의 타입을 다르게 쓸 수 있다. - 다형성 