package design.book;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

import book.ch8.TimeClient;

//public class BookManager extends JFrame implements ActionListener{
public class BookManager extends JFrame {
	JMenuBar jmb = new JMenuBar();
	JMenu jm_edit = new JMenu("Edit");
	JMenuItem jmi_ins = new JMenuItem("입력");
	JMenuItem jmi_upd = new JMenuItem("수정");
	JMenuItem jmi_det = new JMenuItem("상세보기");
	JSeparator jsl = new JSeparator();
	JMenuItem jmi_exit = new JMenuItem("나가기");
	JLabel jlb_time = new JLabel();
	// 생성자는 디폴트 생성자를 제외하고는 무조건 개발자가 추가로 작성한다.
	BookManagerEventHandler handler = new BookManagerEventHandler(this); // 여기서 this는 BookManager
	BookCRUD bookCRUD = new BookCRUD();

	public BookManager() {

	}

	public void initDisplay() {
		// insert here

		// 이벤트 소스와 이벤트 처리 핸들러 클래스를 매칭하기
		jmi_ins.addActionListener(handler); // this는 BookManager. 이 클래스 안에 actionPerformed가 있어야 된다.
		jmi_upd.addActionListener(handler); // this는 BookManager. 이 클래스 안에 actionPerformed가 있어야 된다.
		jmi_det.addActionListener(handler);
		jmi_exit.addActionListener(handler);
		jm_edit.add(jmi_ins);
		jm_edit.add(jmi_upd);
		jm_edit.add(jmi_det);
		jm_edit.add(jmi_exit);
		jm_edit.add(jsl);
		jmb.add(jm_edit);
		TimeClient tc = new TimeClient(jlb_time); //이게 중요 코드
		tc.start();// 콜백메소드인 run();이 자동으로 호출
		this.add(jlb_time,"South");
		this.setJMenuBar(jmb);
		this.setTitle("도서관리 시스템 Ver1.0");
		this.setSize(700, 450);
		this.setVisible(true);
		System.out.println();
	}

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		BookManager bm = new BookManager();
		bm.initDisplay();
	}

	// 어노테이션-오버라이드:부모가 선언한 메소드를 재정의하는것.
//	@Override
//	public void actionPerformed(ActionEvent e) {//ActionEvent e를 건들면 안된다-아빠차를 함부로 안건드리는것.
//		
//	}
//
}
