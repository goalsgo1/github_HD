  
package game.baseball;

import javax.swing.JFrame;//MVC패턴 적용된 패키지
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.lang.String;

public class MenuBarTest {
	int width;//전역변수 선언해 보기 - JFrame의 가로길이를 담을 변수
	int height;//전역변수 선언해 보기
	//JMenuBar클래스를 활용하여 JFrame에 메뉴바를 구성할 수 있다.
	JMenuBar jmb = new JMenuBar();
	//JMenuBar에 추가할 JMenu를 생성한다.
	JMenu     jm_file = new JMenu("File");
	//JMenu에 들어갈 하위 메뉴 아이템을 생성하기(New, Open, 나가기)
	JMenuItem jmi_new   = new JMenuItem("New");
	JMenuItem jmi_open  = new JMenuItem("Open");
	JMenuItem jmi_exit  = new JMenuItem("나가기");
	JMenu     jm_edit   = new JMenu("Edit");
	JMenuItem jmi_copy  = new JMenuItem("Copy");
	JMenuItem jmi_cut   = new JMenuItem("Cut");
	JMenuItem jmi_paste = new JMenuItem("Paste");
	//화면을 그리기
	//재사용을 위한 첫걸음이 메소드 중심의 코딩을 전개하는 것이다.
	public void initDisplay() {
		System.out.println("initDispaly 호출 성공");
		///////////////메뉴 바 구성하기 시작////////////////
		jm_file.add(jmi_new);
		jm_file.add(jmi_open);
		jm_file.add(jmi_exit);
		jm_edit.add(jmi_copy);
		jm_edit.add(jmi_cut);
		jm_edit.add(jmi_paste);
		jm_file.setMnemonic('F');
		jm_edit.setMnemonic('E');
		jmb.add(jm_file);
		jmb.add(jm_edit);
		///////////////메뉴 바 구성하기   끝/////////////////
		//JAVA API를 활용하여 윈도우 운영체제에서 화면을 열기
		//java.lang패키지를 제외한 모든 패키지는 반드시 import를 해주어야 해당 클래스를 JDK가 찾을 수 있다.
		JFrame jf = new JFrame();
		boolean isView;
		isView = true;
		int width=600;//지역변수이다.
//		int height=600;
		//이 메소드는 non-static영역이다. (인스턴스화를 하지 않는다.)
		this.width=300;
		this.height=400;
		jf.setJMenuBar(jmb);
		jf.setSize(width, height);
		jf.setVisible(isView);//true-음악을 듣고 있을 때 false-음악을 듣고 있는데 전화가 들어온다.
	}
	public static void main(String[] args) {
//내 안에 있는 메소드 이더라도 static영역에서 non-static 메소드를 호출하려면 반드시 인스턴스화
		MenuBarTest mbt = new MenuBarTest();
		mbt.initDisplay();
	}//////////////end of main

}