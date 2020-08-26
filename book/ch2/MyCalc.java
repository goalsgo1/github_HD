package book.ch2;

import javax.swing.JFrame;
//이 프로그램은 전자계산기를 구현한 것입니다.
//사칙연산이 가능합니다.
public class MyCalc {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		int width=300;
		width=600;
		int height=400;
		jf.setSize(width, height);
		String title = "전자 계산기";
		title ="카카오톡";
		jf.setTitle(title);
		boolean isOk = true;
		jf.setVisible(isOk);
	}//////////////end of main
}//////////////////end of MyCalc