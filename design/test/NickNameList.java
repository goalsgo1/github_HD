package design.test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

//디폴트생성자는 생략이 가능하다. 왜냐하면 파라미터가 없으니까 JVM이 대신 해줄 수 있어서...
public class NickNameList extends JFrame implements MouseListener, ActionListener {
	String imgPath = "C:\\workspace_java\\dev_java\\src\\design\\test\\";// 절대경로, 상대경로
	static NickNameList nnlist = null;
	JPanel jp_north = new JPanel(new BorderLayout());
	// BorderLayout의 경우엔 Center로 주면 기본저으로 중앙을 꽉 채움
	// 그러나 FlowLayout으로 하면 잘 안보임. 생성자 파라미터로 컬럼의 크기를 지정하여 텍스트필드의 사이즈를 결정해줌.
	Font f = new Font("맑은고딕", Font.BOLD, 20);
	JTextField jtf_search = new JTextField();
	JButton jbtn_search = new JButton("검색");
	// 전역변수 - 이유는 actionPerformed에서도 그 주소번지를 사용해야 함.
	// 선언과 생성을 분리할것인가?
	// 아니면 한번에 처리할 것인가?
	JMenuBar jmb = new JMenuBar();
	JMenu jm_edit = new JMenu("Edit");
	JMenuItem jmi_ins = new JMenuItem("입력", new ImageIcon(imgPath + "+new.gif"));
	JMenuItem jmi_upd = new JMenuItem("수정", new ImageIcon(imgPath + "+update.gif"));
	JMenuItem jmi_del = new JMenuItem("삭제", new ImageIcon(imgPath + "+delete.gif"));
	JMenuItem jmi_sel = new JMenuItem("조회", new ImageIcon(imgPath + "+detail.gif"));
//	JMenuItem jmi_close	 = new JMenuItem("나가기");
	Icon icon = new ImageIcon(imgPath + "delete.gif");
	JMenuItem jmi_close = new JMenuItem("종료", icon);
	String cols[] = { "대화명", "성별","우편번호","주소" };
	String data[][] = { { "test", "남"  }, { "apple", "여" }, { "tomato", "여" } };
	DefaultTableModel dtm = new DefaultTableModel(data, cols);
	// 테이블 생성 시 데이터 셋에 대한 헤더 초기화 부분이 필요하다. => dtm이 필요하다.
	JTable jtb = new JTable(dtm);
	JTableHeader jth = jtb.getTableHeader();
	JScrollPane jsp = new JScrollPane(jtb, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED // 순서는 무조건 vertical 다음 horizontal
			, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

	public void initDisplay() {
		jth.setBackground(new Color(154, 195, 87));
		jth.setForeground(Color.red);
		jth.setFont(f);
		jtb.setRowHeight(25);
		jtb.setGridColor(Color.blue);
		jtb.addMouseListener(this);
		jtb.setSelectionBackground(Color.PINK);
		jtb.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		jmi_ins.addActionListener(nnlist);
		jmi_upd.addActionListener(nnlist);
		jmi_del.addActionListener(nnlist);
		jmi_sel.addActionListener(nnlist);
		jmi_close.addActionListener(nnlist);
		jm_edit.add(jmi_ins);
		jm_edit.add(jmi_upd);
		jm_edit.add(jmi_del);
		jm_edit.add(jmi_sel);
		jm_edit.add(jmi_close);
		jmb.add(jm_edit);
		jp_north.add("Center", jtf_search);
		jp_north.add("East", jbtn_search);
		jp_north.setFont(f);

		nnlist.add("North", jp_north);
		nnlist.add("Center", jsp);
		nnlist.setTitle("단톡명단");
		nnlist.setSize(450, 500);
		nnlist.setVisible(true);
		nnlist.setJMenuBar(jmb);

	}

	public static void main(String[] args) {
		nnlist = new NickNameList();
		nnlist.initDisplay();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getClickCount() == 2) {
			System.out.println("더블 클릭 한거야?");
			int index[] = jtb.getSelectedRows();
			if (index.length == 0) {
				JOptionPane.showMessageDialog(this, "조회할 데이터를 선택하세요.");
				return;
			} else if (index.length > 1) {
				JOptionPane.showMessageDialog(this, "데이터를 한 건만 선택하시오.");
				return;
			} else {
				String nickName = (String) dtm.getValueAt(index[0], 0);
				System.out.println("nickName : " + nickName);
				refreshData();
			}
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	// 전체조회 혹은 조건검색 구현 - 재사용 할 수 있도록 처리된다.
	public void refreshData() {

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		Object obj = ae.getSource();
		// 너 입력할거니?
		if (obj == jmi_ins) {
			System.out.println("입력 호출");

		}
		// 수정을 원해
		else if (obj == jmi_upd) {
			System.out.println("수정 호출");

		}
		// 삭제 해줄까?
		else if (obj == jmi_del) {
			System.out.println("삭제 호출");

		}
		// 전체조회하고 싶다면?
		else if (obj == jmi_sel) {
			System.out.println("조회 호출");
			refreshData();
		}
		// 종료할때
		else if (obj == jmi_close) {
			System.out.println("나가기 호출");
			System.exit(0);
		}
	}

}
