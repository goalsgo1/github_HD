package design.book;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

class Sub extends JDialog {
	Main m = null; // 여기를 new 하면 망한다.

	public Sub(Main m) {
		this.m = m;
		m.getButton().setText("가입");
		this.add("North", m.getButton());
		this.setTitle("Sub화면 입니다.");
		this.setVisible(true);
		this.setSize(300, 200);
	}

}

public class Main extends JFrame {
	JButton jbtn_add = new JButton("등록");
	Main m = null;

	public Main getInstance() {
		if (m != null) {// 널 체크를 하여 복사본이 만들어지는것을 방어
			m = new Main();// 하나 - 싱글톤
		}
		return m;
	}

	public JButton getButton() {
		return jbtn_add;
	}

	public static void main(String args[]) {
		Main m = new Main();
		Sub sub = new Sub(m);

	}

}
