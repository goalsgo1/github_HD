package design.book;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginForm extends JFrame implements ActionListener {
	// 선언부
	String imgPath = "src\\images\\";
	ImageIcon iicon = new ImageIcon(imgPath + "main.png");
	JLabel jlb_id = new JLabel("아이디");
	JLabel jlb_pw = new JLabel("패스워드");
	JTextField jtf_id = new JTextField("test");
	JPasswordField jtf_pw = new JPasswordField("123");
	Font f = new Font("휴먼매직체", Font.BOLD, 17);
	JButton jbtn_login = new JButton(imgPath + "login");
	JButton jbtn_pw = new JButton(imgPath + "sign");

	class MyPicture extends JPanel {
		public void paintComponent(Graphics g) {
			g.drawImage(iicon.getImage(), 0, 0, null);
			setOpaque(false);
			super.paintComponent(g);
		}
	}

	// 생성자
	public LoginForm() {

	}

	// 화면처리부
	public void initDisplay() {
		setContentPane(new MyPicture());
		jbtn_login.addActionListener(this);
		this.setLayout(null);
		jlb_id.setBounds(45, 200, 80, 40);
		jlb_id.setFont(f);
		jtf_id.setBounds(110, 200, 185, 40);
		jtf_id.setFont(f);
		jlb_pw.setBounds(45, 240, 80, 40);
		jlb_pw.setFont(f);
		jtf_pw.setBounds(110, 200, 80, 40);
		jtf_pw.setFont(f);
		jbtn_login.setBounds(175, 285, 120, 40);
		jbtn_pw.setBounds(45, 285, 120, 40);
		this.add
		this.add(jtf_id);
		this.setSize(350, 600);
		this.setLocation(800, 250);
		this.setVisible(true);

	}

	// 메인메소드
	public static void main(String[] args) {
		LoginForm lf = new LoginForm();
		lf.initDisplay();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();// 이벤트가 감지된 주소번지 담기
		if (obj == jbtn_login) {
			if ("".equals(jtf_id.getText())) {
				JOptionPane.showMessageDialog(this, 
						"아이디를 확인 하세요.", 
						"INFO", 
						JOptionPane.INFORMATION_MESSAGE);
				return;
			} else {
				this.dispose();
				BookManager bookMgr = new BookManager();
				bookMgr.initDisplay();
			}
		}
	}

}
