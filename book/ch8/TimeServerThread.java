package book.ch8;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class TimeServerThread extends Thread {
	TimeServer2 ts = null; // null을 쓰는 것이 중요하다.
	ObjectOutputStream oos = null;
	ObjectInputStream ois = null;
	Socket client = null;
	String timeStr = null;

	public TimeServerThread(TimeServer2 ts) {// 이 코드도 중요.
		this.ts = ts;
		this.client = ts.socket;// 여기까지 도달하는 흐름이 가장 중요.
		timeStr = ts.pushTime();
		try {
			oos = new ObjectOutputStream(client.getOutputStream());
			ois = new ObjectInputStream(client.getInputStream());
			for (TimeServerThread tst : ts.globalList) {// 개선된 for문 - 전체 조회할 때 - 가진거 다 나와
				oos.writeObject(timeStr);
			}
			// 현재 서버에 입장한 클라이언트 스레드 추가하기.
			ts.globalList.add(this);// 분석해보기, 중요함.
			this.broadCasting(timeStr);// 분석해보기, 중요함.
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	// 현재 입장해 있는 모든 친구들에게 모두 메세지를 전송하고 싶어요
	public void broadCasting(String msg) {
		for (TimeServerThread tst : ts.globalList) {
			try {
				oos.writeObject(msg);
			} catch (Exception e) {
				e.printStackTrace();// stack영역에 쌓여 있는 에러 메세지 모두 출력해준다.
			}
		}
	}
	//run 메소드에는 뭘 써야 하지?
	@Override
	public void run() {
		System.out.println("TimeServerThread run 호출 성공");
	}
}
