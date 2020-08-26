package book.ch5;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Main1 extends JFrame implements ActionListener {
	//선언부 - 전역변수
	JButton jbtn_east = null;
	JButton jbtn_center = null;
	JButton jbtn_west = null;
	JButton jbtn_south = null;
	JButton jbtn_north = null;
	Container cont = this.getContentPane();
	//남쪽 버튼에 대신 들어갈 JTextField를 선언하기
	//new는 이벤트가 일어났을 때 할 생각임
	JTextField jtf = null;
	//생성자 - 리턴타입이 없음,파라미터는 여러개 가짐, 메소드 오버로딩을 준수함, 전역변수의 초기화 담당
	public Main1() {//디폴트 생성자-생성자의 제1 역할은 초기화 이다
		jbtn_east = new JButton("동쪽(버튼)");
		jbtn_south = new JButton("남쪽(버튼)");
		jbtn_center = new JButton("중앙(버튼)");
		jbtn_west = new JButton("서쪽(버튼)");
		initDisplay();//내 안에 있는 메소드, 생성자, 전역변수는 인스턴스화 없이도 호출 가능
	}
	//화면처리부
	public void initDisplay() {	
		
		jbtn_south.addActionListener(this);
		jbtn_east.addActionListener(this);
		jbtn_west.addActionListener(this);
		this.add("South",jbtn_south);
		this.add("East",jbtn_east);
		this.add("West",jbtn_west);
		this.add("Center",jbtn_center);
		this.setSize(500, 400);
		this.setVisible(true);
	}
	//메인 메소드
	public static void main(String[] args) {//여기에 인스턴스화를 하면 지역변수의 성격을 갖게 되므로 외부에서 사용 불가
		//생성자 호출하기
		new Main1();
	}
	//콜백메소드-시스템에서 자동으로 호출, JVM이 감지 되엇을때 호출됨
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == jbtn_west) {
			if(jbtn_center!=null) {
				cont.remove(jbtn_center);
			}
			if(jbtn_west!=null) {
				cont.remove(jbtn_west);
			}
			if(jbtn_east!=null) {
				cont.remove(jbtn_east);
			}
			if(jbtn_north!=null) {
				cont.remove(jbtn_north);
			}
			if(jtf!=null) {
				cont.remove(jtf);
			}
			cont.revalidate();
		}
		else if(obj == jtf) {//JTextField와 주소번지가 같은지 비교함
			System.out.println("jtf 엔터 이벤트 감지함"+jtf);
			String msg = jtf.getText();//사용자가 입력한 문자열을 읽어옴
			if("북쪽".equals(msg)) {
			jbtn_north = new JButton("북쪽(버튼)");
			cont.add("North", jbtn_north);
			cont.revalidate();
			} 
			else {
				JOptionPane.showMessageDialog(this, "북쪽이라고 입력해!");
				jtf.setText("북쪽");
				return;
			}
	}
		else if(obj == jbtn_south) {
			System.out.println("남쪽버튼 클릭");
			jbtn_east.setText("메뉴");
			//insert here
			//자바에서는 삭제했다고 해서 즉시 바로 없어지는게 아님
			//일단 Candidate상태로 뺀다.(넌 쓰레기 값임)
			cont.remove(jbtn_south);
			jbtn_south = null;
			System.out.println("남쪽버튼 : "+jbtn_south);
			//위치-끼워들 위치
			jtf = new JTextField(); //화면 삭제와 화면 갱신 사이에 텍스트창이 
//보통은 initDisplay에서 이벤트 핸들러와 연결을 해왔다
//그런데 오늘은 이벤트가 발동해야 인스턴스화가 완성된다(new)
//따라서 이벤트 처리 메소드인 actionPerformed에서 이벤트가 일어나는 그 위치로
//옮겨 두어야 한다
			jtf.addActionListener(this);
			cont.add("South", jtf);
			cont.revalidate();
		}
		
	}

}