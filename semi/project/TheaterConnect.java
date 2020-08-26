package semi.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.uitl.DBConnectionMgr;

import oracle.db.DeptApp;

public class TheaterConnect extends JFrame {
	JMenuBar jmb = new JMenuBar();
	JMenu jm_db = new JMenu("오라클연계");
	JMenuItem jmi_con = new JMenuItem("오라클연결");
	JMenuItem jmi_sel = new JMenuItem("조회");
	JMenuItem jmi_ins = new JMenuItem("등록");
	JMenuItem jmi_upd = new JMenuItem("수정");
	JMenuItem jmi_del = new JMenuItem("삭제");
	JMenuItem jmi_exit = new JMenuItem("나가기");
	// 양식, 폼을 그려주는 클래스임.
	JTable jt_dept = null;
	// JTable에 스크롤바를 붙여 줄 속지임.
	JScrollPane jsp_dept = null;
	String cols[] = { "상영관번호", "좌석명", "예매여부" };
	String data[][] = new String[0][3];
	DefaultTableModel dtm = null;
	DBConnectionMgr dbMgr = new DBConnectionMgr();
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;// 오라클에 살고 있는 일꾼이 있다. 옵티마이저


public TheaterConnect() {
	initDisplay();
}
public void initDisplay() {
	dtm = new DefaultTableModel(data, cols);
	jt_dept = new JTable(dtm);
	//jt_dept.addMouseListener(this);
	jsp_dept = new JScrollPane(jt_dept, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
			JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	//jmi_sel.addActionListener(this);// actionPerformed
	jm_db.add(jmi_sel);
	jm_db.add(jmi_ins);
	jm_db.add(jmi_upd);
	jm_db.add(jmi_del);
	jm_db.add(jmi_exit);
	jmb.add(jm_db);
	this.add("Center", jsp_dept);
	this.setJMenuBar(jmb);
	this.setSize(450, 320);
	this.setVisible(true);
	}


public static void main(String[] args) {
	new TheaterConnect();
}



}