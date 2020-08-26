package design.test;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.uitl.DBConnectionMgr;

public class ZipCodeSearch extends JFrame implements FocusListener, ActionListener {
	// 선언부
	// 물리적으로 열어져 있는 DB서버와 연결통로 만들기.
	Connection con = null;
	// 위에서 연결되면 쿼리문을 전달할 전령의 역할을 하는 인터페이스 객체 생성하기.
	PreparedStatement pstmt = null;
	// 조회한 결과를 화면에 처리해야 하므로 오라클에 커서를 조작하기 위해 ResultSet추가하기.
	ResultSet rs = null;
	JScrollPane jspline = null;
	JPanel jp_north = new JPanel();
	JTextField jtf_search = new JTextField("동 이름을 입력하세요.");
	JButton jbtn_search = new JButton("조회");
	String cols[] = { "우편번호", "주소" };
	String data[][] = new String[0][2];
	DefaultTableModel dtm_zipcode = new DefaultTableModel(data, cols);
	JTable jtb_zipcode = new JTable(dtm_zipcode);
	JScrollPane jsp_zipcode = new JScrollPane(jtb_zipcode, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
			JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	// 생성자

	// 화면처리부
	public void initDisplay() {
		jbtn_search.requestFocus();
		jbtn_search.addActionListener(this);
		// jtf_search.addFocusListener(this);
		jp_north.setLayout(new BorderLayout());
		jp_north.add("Center", jtf_search);
		jp_north.add("East", jbtn_search);
		this.add("North", jp_north);
		this.add("Center", jsp_zipcode);
		this.setTitle("우편번호 검색");
		this.setSize(430, 400);
		this.setVisible(true);
	}

	// 메인메소드
	public static void main(String[] args) {
		ZipCodeSearch zcs = new ZipCodeSearch();
		zcs.initDisplay();
	}

	@Override
	public void focusGained(FocusEvent e) {
		if (e.getSource() == jtf_search) {
			jtf_search.setText("");
		}
	}

	@Override
	public void focusLost(FocusEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void refreshData(String dong) {
		DBConnectionMgr dbMgr = DBConnectionMgr.getInstance();
		con = dbMgr.getConnetcion();
		StringBuilder sql = new StringBuilder();
		sql.append(" SELECT ZIPCODE, ADDRESS");
		sql.append(" FROM zipcode_t");
		sql.append(" WHERE 1=1 ");
		if (dong != null) {
			sql.append(" AND dong LIKE '%'||?||'%' ");
		}
		try {
			// 파라미터로 넘어온 select문을 스캔 - ?갯수를 파악
			pstmt = con.prepareStatement(sql.toString());
			// 위에서 물음표 자리에 들어갈 값을 파라미터로 받아서 설정하기
			pstmt.setString(1, dong);
			rs = pstmt.executeQuery();
			// 내 안에 있는 타입을 꺽쇠안에 직접 써주면 타입체크를 별도로 안한다.
			// 제네틱이라고 한다.
			// 선언부에는 반드시 써야하고 생성부에는 생략가능하다.
			// 그러나 다이아몬드 연산자는 작성한다
			Vector<ZipCodeVO> v = new Vector<>();
			// List v2 = new Vector();
			ZipCodeVO zVOS[] = null;
			ZipCodeVO zVO = null;
			while (rs.next()) {
				zVO = new ZipCodeVO();
				zVO.setZipcode(rs.getInt("zipcode"));
				zVO.setAddress(rs.getString("address"));
				v.add(zVO);
			}
			// List타입으로 선언된 v2로는 copyInto라는 메소드를 호출 할 수 없다.
			// 이유:부모가 가진 메소드를 재정의한것만 호출 가능하기 때문이다.
			zVOS = new ZipCodeVO[v.size()];
			v.copyInto(zVOS);
			// 질문:두 번 조회할 경우 앞에 조회결과가 남아있어요. 이것을 초기화 하고 싶습니다.
			// 어떡하죠?
			if (v.size() > 0) {
				while (dtm_zipcode.getRowCount() > 0) {
					dtm_zipcode.removeRow(0);
				}
			}
			// 조회한 결과를 DefaultTableModel에 매칭시키기
			for (int x = 0; x < zVOS.length; x++) {
				Vector<Object> oneRow = new Vector<>();
				oneRow.add(0, zVOS[x].getZipcode());
				oneRow.add(1, zVOS[x].getAddress());
				dtm_zipcode.addRow(oneRow);
			}
		} catch (SQLException se) {
			System.out.println(se.toString());
			System.out.println("[[Query]]==" + sql.toString());
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == jbtn_search) {
			String user = jtf_search.getText();
			refreshData(user);
		}

	}

}
