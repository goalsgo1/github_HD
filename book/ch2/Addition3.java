package book.ch2;

import javax.swing.JOptionPane;

//non-static변수나 메소드는 static영역에서 사용할 수 있다|없다.

public class Addition3 {

	public static void main(String[] args) {
		int x, y, z, result;
		String xVal, yVal, zVal;
		xVal = JOptionPane.showInputDialog("첫번째 숫자 입력해요");
		yVal = JOptionPane.showInputDialog("두번째 숫자 입력해요");
		zVal = JOptionPane.showInputDialog("세번째 숫자 입력해요");
		x=Integer.parseInt(xVal);
		y=Integer.parseInt(yVal);
		z=Integer.parseInt(zVal);
		result = x*y*z;
		System.out.println(result);//
		//결과를 나타내기
		JOptionPane.showMessageDialog
		(null, "The result is "+result, "처리 결과", JOptionPane.INFORMATION_MESSAGE);
		//자바 가상 머신과의 연결고리를 끊어버림.
		System.exit(0);
	}///////////////////////////end of main

}