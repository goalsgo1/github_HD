package book.ch5;

import javax.swing.JButton;
import javax.swing.JFrame;

public class DeptManager extends JFrame {
	int deptno;//10 -> 30
	//BorderLayout - 안드로이드 수업
	JButton jbtn_center = new JButton();
	JButton jbtn_north = new JButton("북쪽");
	JButton jbtn_south = new JButton("남쪽");
	JButton jbtn_east = new JButton("동쪽");
	JButton jbtn_west = new JButton("서쪽");
//오늘 부터 되도록이면 메인 메소드에 코딩을 하지 않는다.
//한번에 어렵다면 조금씩 부피를 줄여본다.
//생성자는 의존관계를 실제로 표현할 수 있다. - 클래스 쪼개기 할 때 꼭 활용해 볼 것.
//주의사항1 : 스태틱은 사용하지 말 것.
//주의사항2 : while문은 i=i+1; 반드시 추가할 것. if문과 for문에 break 반드시 추가할 것.
	//역할은 전변에 초기화를 대신 해준다. - 그래서 생략이 가능하다.
	//지변은 초기화를 반드시 해야 한다.
	public DeptManager() {//디폴트 생성자는 호출할 수 있다.
		System.out.println("디폴트  생성자");
	}
	public DeptManager(int deptno) {//디폴트 생성자는 호출할 수 있다.
		this.deptno = deptno;
		this.deptno = 30;
		System.out.println("디폴트  생성자");
		initDisplay();
	}
	void methodA(){
		System.out.println("methodA에서"+deptno);
	}
	//화면그리기
	public void initDisplay() {
		jbtn_center.setText("중앙");
		this.add("Center", jbtn_center);
		this.add("North", jbtn_north);
		this.add("South", jbtn_south);
		this.add("East", jbtn_east);
		this.add("West", jbtn_west);
		this.setSize(400, 300);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		new DeptManager(10);
	}

}
