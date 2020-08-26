package book.ch8;

import java.net.Socket;
import java.util.StringTokenizer;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UserInput extends JFrame {
	
	JOptionPane jp_center = null;
	
	public void initDisplay()	{
		String ip = "192.168.0.244";
		int port = 2001;
	}
	public UserInput()	{
		UserInput ui = new UserInput();
		ui.initDisplay();
	}
	public static void main(String[] args) {
		String user = JOptionPane.showInputDialog("아이피 주소, 포트번호로 입력하세요");
		String ip = "192.168.0.211";
		System.out.println("사용자가 입력한 값은 " + user);
		int port = 8008;
		StringTokenizer st = new StringTokenizer(ip, "#");
		ip = st.nextToken();
		String imsi = st.nextToken();
		port = Integer.parseInt(imsi);
		System.out.println("사용자가 입력한 ip의 값은 port는 "+ip+", "+port);
	}

}
