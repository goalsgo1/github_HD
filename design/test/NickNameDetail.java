package design.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class NickNameDetail extends JDialog implements ActionListener {
	// 현재 중앙에 JScrollPane을 사용한 상태이고 그 이유는 테두리선을 활용
	// 그 위에 새로운 속지를 얹어서 추가적인 화면 콤포넌트들을 배치할 수 있다.
	// 이때 Layout대신 일일이 좌표값을 활용하여 배치해 본다.
	JPanel jp_center = new JPanel();
	JLabel jlb_gender = new JLabel("성별");
	JTextField jtf_gender = new JTextField();
	JLabel jlb_address = new JLabel("주소");
	JTextField jtf_address = new JTextField(6);
	JLabel jlb_zipcode = new JLabel("우편번호");
	JTextField jtf_zipcode = new JTextField(30);
	JButton jbtn_zipcode = new JButton("우편번호찾기");
	JPanel jp_south = new JPanel();
	JButton jbtn_save = new JButton("저장");
	JButton jbtn_close = new JButton("닫기");
	JScrollPane jspline = new JScrollPane(jp_center);

	public NickNameDetail() {
	}

	public void update() {
		System.out.println("수정 메소드 호출 성공");
	}

	public void initDisplay() {
		// JDialog의 디폴트 레이아웃은 BorderLayout임.
		// 직접 좌표값을 활용하여 배치 할때는 레이아웃이 필요없음.
		jp_center.setLayout(null);// FlowLayout임 - null 뭉갠다. - 좌표값
		jlb_gender.setBounds(20, 20, 50, 20);
		jtf_gender.setBounds(80, 20, 100, 20);
		jlb_zipcode.setBounds(20, 45, 80, 20);
		jtf_zipcode.setBounds(80, 45, 80, 20);
		jbtn_zipcode.setBounds(165, 45, 110, 20);
		jlb_address.setBounds(20, 70, 80, 20);
		jtf_address.setBounds(80, 70, 250, 20);
		jp_center.add(jlb_gender);
		jp_center.add(jtf_gender);
		jp_center.add(jlb_zipcode);
		jp_center.add(jtf_zipcode);
		jp_center.add(jbtn_zipcode);
		jp_center.add(jlb_address);
		jp_center.add(jtf_address);
		jbtn_save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {

			}
		});
		jbtn_close.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				System.exit(0);
			}
		});

		jp_south.add(jbtn_close);
		this.setTitle("상세보기");
		this.add("Center", jspline);
		this.add("South", jp_south);
		this.setSize(400, 300);
		this.setVisible(true);
	}

	///////////////////// [[setter|getter]]/////////////////////
	public void setGender(String gender) {
		jtf_gender.setText(gender);
	}

	public void getGender() {
		jtf_gender.getText();
		/*
		 * 메소드를 활용하여 초기화 하기
		 */

//		MemberVO mVO = new MemberVO();
//		mVO.setGender(jtf_gender);
		MemberVO mVO = new MemberVO(null, jtf_gender.getText());

	}

	///////////////////// [[setter|getter]]/////////////////////
	public static void main(String[] args) {
		new NickNameDetail().initDisplay();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

}
