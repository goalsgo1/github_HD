package design.test;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
/* 인스턴스화를 할 수 있다 - A a = new A(), A a = methodA();
 * 인스턴스 변수를 활용하여 변수사용[전역변수] 및 메소드를 호출[파라미터, 리턴타입]할 수 있다
 * UI부분과 업무처리 부분을 나눈다
 * 화면과 조직을 분리해야 한다
 * 화면과 이벤트 처리 - 50%(소통-업무의 시작-리턴타입, 파라미터)
 * 업무내용 - 20%(업무에 대한 복잡도-조인이 거의 없거나 단순 조인문장)
 * DB연동 및 업무처리 - 30%
 */
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Exam1 extends JFrame implements ActionListener {
	// 선언부 - 주의:선언부에서 메소드 호출이나 값에 대한 재정의 불가
	// 테이블 추가하기
	JTable jtb_list = null;// 처리버튼을 눌러야 테이블이 생성
	JScrollPane jsp_list = null;// 스크롤바를 생성하기
	DefaultTableModel dtm_list = null;// 테이블 안에 들어갈 데이터 설정하기
	String cols[] = { "성명", "자바", "오라클", "총점", "평균", "석차" };
	String data[][] = null;
	JPanel jp_north = new JPanel();
	JTextField jtf_inwon = new JTextField();// 화면이 열리자마자 보여져야 하니까 한번에 생성
	JButton jbtn_create = new JButton("생성");
	// 남쪽에 붙일 속지 생성
	JPanel jp_south = new JPanel();
	// 속지에 들어갈 버튼 2개
	JButton jbtn_account = new JButton("처리");
	JButton jbtn_exit = new JButton("종료");
	int inwon = 0;
	// 화면을 갱신할때는 Container를 활용하자
	Container cont = this.getContentPane();

	// 생성자
	public Exam1() {

	}

	// 화면처리부
	public void initDisplay() {
		jbtn_create.addActionListener(this);// 이 부분이 없다면 actionPerformed가 반응을 하지 않는다
		jbtn_exit.addActionListener(this);// JVM이 이용자가 누른 나가기 종료 버튼을 감지 했을 때 actionPerformed가 호출됨
		jbtn_account.addActionListener(this);
		// 속지의 레이아웃을 BorderLayout으로 해야한다. center에 jtf_inwon을, east jbtn_create를 담기
		jp_north.setLayout(new BorderLayout());
		jp_north.add("Center", jtf_inwon);
		jp_north.add("East", jbtn_create);
		// 남쪽 속지 레이아웃 FlowLayout으로 설정하기-파라미터로 정렬하기 가능
		jp_south.setLayout(new FlowLayout(FlowLayout.RIGHT));
		jp_south.add(jbtn_account);
		jp_south.add(jbtn_exit);
		this.add("South", jp_south);
		this.add("North", jp_north);
		this.setSize(500, 400);
		this.setVisible(true);
	}

	// 성적 처리 메소드 구현 - 업무처리 - 알고리즘 공부해라
	public void account() {
		System.out.println("성적처리 메소드 호출 성공");
	}

	// 메인메소드 - 메인 스레드이다. 라이프사이클 관리 start() service() destroy()
	public static void main(String[] args) {
		// 생각해볼 문제:initDisplay()를 메인메소드에서 호출 하는것과 생성자에서 호출하는것
		// 사이에는 어떤 차이가 있는 걸까
		Exam1 e1 = new Exam1();
		e1.initDisplay();
	}

	// 두 클래스가 서로 상속관계 이거나 인터페이스를 구현하는 구현체 클래스이라면
	// 반드시 재정의해야 한다
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == jbtn_account) {
			account();
		} else if (obj == jbtn_exit) {
			System.exit(0);// 자바가상머신과 어플사이에 연결고리를 끊는다 - 스레드 반납, 메모리 회수, 다시 사용불가
		} else if (obj == jbtn_create) {// 너 생성버튼 누른거야?
			System.out.println("생성버튼 호출 성공");
			try {
				inwon = Integer.parseInt(jtf_inwon.getText());
			} catch (NumberFormatException e2) {
				JOptionPane.showMessageDialog(this, "숫자만 입력하세요");
				jtf_inwon.setText("");
				return;// actionPerformed를 빠져나감
			}
			// 여기
			jtf_inwon.setEnabled(false);
			jbtn_create.setEnabled(false);
			dtm_list = new DefaultTableModel(data, cols);
			jtb_list = new JTable(dtm_list);
			jsp_list = new JScrollPane(jtb_list, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
					JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			cont.add("Center", jsp_list);
			cont.revalidate();
			this.setLocation(100, 100);// 위치를 잡아줄 때 쓰는 좌표값
			this.pack();
		}

	}

}
