package book.ch8;

//TimeServer.java: 1초간격으로 현재의 시간 문자열을 접속한 클라이언트에게 전송하는 프로그램
import java.net.*;
import java.io.*;
import java.util.*;

public class TimeServer extends Thread {

	private Socket socket;

	public TimeServer(Socket s) {
		this.socket = s; //원본 : 쓰는 연습을 많이 해야 함
	}

	// run() 시작
	public void run() {
		try {
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while (true) {
				out.println(getTimeStr()); //여기의 out은 컴퓨터의, system out이 아님.
				try {
					sleep(1000);
				} catch (InterruptedException i) {
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("\nClient disconnected...\n");
			try {
				socket.close();
			} catch (IOException e) {
			}
		}
	}
	// run() 종료
	
	// getTimeStr() 시작
	private String getTimeStr() {
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);

		return (hour < 10 ? "0" + hour : "" + hour) + ":" + (min < 10 ? "0" + min : "" + min) + ":"
				+ (sec < 10 ? "0" + sec : "" + sec);
	}
	// getTimeStr() 종료

	// main() 시작
	public static void main(String args[]) {
		int port = 3000;
		ServerSocket server = null;
		Socket client = null;
		try {
			server = new ServerSocket(port);
		} catch (IOException e) {
			System.out.println("Can't bind port: " + port);
			e.printStackTrace();
			try {
				server.close();
			} catch (IOException i) {
			}
			System.exit(1);
		}
		System.out.println("Time Server started successfully...");
		while (true) {
			try {
				client = server.accept();
				System.out.println("New Client connected...");
				TimeServer tServer = new TimeServer(client);
				tServer.start();
				System.out.println("New Time Server Thread started...");
			} catch (IOException e) {
				System.out.println("Can't start server thread!!");
				e.printStackTrace();
				try {
					client.close();
				} catch (IOException i) {
				}
			}
		}
	}
	// main() 종료
}
