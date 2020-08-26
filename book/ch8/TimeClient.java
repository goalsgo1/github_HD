package book.ch8;

import java.net.*;
import java.io.*;
import javax.swing.*;

public class TimeClient extends Thread {
	private JLabel jlb_time = null;
	String ip;
	int port;

	public TimeClient(JLabel jlb_time, String ip, int port) {
		this.jlb_time = jlb_time;
		this.ip = ip;
		this.port = port;
		this.jlb_time = jlb_time;
	}

	public TimeClient() {

	}

	// run() 시작
	public void run() {

		Socket socket = null;
		PrintWriter out = null;
		BufferedReader in = null;
		String timeStr = null;

		try {
			socket = new Socket("127.0.0.1", 2001);
			out = new PrintWriter(socket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			while (true) {
				// 오늘 스터디할까?\n
				while ((timeStr = in.readLine()) != null)
					jlb_time.setText(timeStr);
				// label.setText(timeStr);
				try {
					sleep(1000);
				} catch (InterruptedException i) {
					System.out.println("InterruptedException " + i.toString());
				}
			}

		} catch (IOException i) {
//         label.setText("타임서버에 접속할 수 없습니다.");
			System.out.println("타임서버에 접속할 수 없습니다.");
		} finally {
			try {
				in.close();
				out.close();
				socket.close();
			} catch (IOException e) {
			}
		}
	}
}