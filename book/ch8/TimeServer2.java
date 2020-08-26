package book.ch8;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TimeServer2 extends JFrame implements Runnable {
	ServerSocket server = null;
	Socket socket = null;
	List<TimeServerThread> globalList = null; // 방이 늘었다 줄었다 해야 하니까 null - 가변적이다.
	JTextArea jta_log = new JTextArea();
	JScrollPane jsp_log = new JScrollPane(jta_log, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
			JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

	public TimeServer2() {

	}

	@Override
	public void run() {// 콜백메소드 start() -> run()
		globalList = new ArrayList<>();
		boolean isStop = false;
		try {
			server = new ServerSocket(2001);
			jta_log.append("Server ready.................... \n");
			while (isStop) {
				socket = server.accept();
				jta_log.append("Client INFO " + socket.getInetAddress());
				TimeServerThread tst = new TimeServerThread(this);
				tst.start();
			} //////// 사용자를 기다림

		} catch (Exception e) {

		}
	}

	// 현재 시간 정보를 제공하는 메소드 선언 - 상황연산자
	public String pushTime() {
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		return (hour < 10 ? "0"+hour : ""+hour)
		+":"+(min < 10 ? "0"+min : ""+min)
		+":"+(sec < 10 ? "0"+sec : ""+sec);
	}

	public void initDisplay() {
		jta_log.setEditable(false);
		this.add("Center", jsp_log);
		this.setTitle("타임서버 로그");
		this.setSize(500, 400);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		TimeServer2 ts2 = new TimeServer2();
		ts2.initDisplay();
		Thread th = new Thread(ts2);
		System.out.println("현재 스레드 이름 : " + Thread.currentThread().getName());
		th.start();// run 호출된다.
	}
}
