package book.ch2;

import javax.swing.JOptionPane;

//non-static변수나 메소드는 static영역에서 사용할 수 있다|없다.

public class Addition2 {

	public static void main(String[] args) {
		//사용자에 의한 첫번째 문자열 입력
		String firstNumber="2";
		firstNumber = JOptionPane.showInputDialog("첫번째 숫자 입력하세요.");
		//사용자에 의한 두번째 문자열 입력
		String secondNumber="2";
		String thirdNumber="2";
		int number1;//첫번째 숫자 추가
		int number2;//두번째 숫자 추가
		int number3;//두번째 숫자 추가
		int sum;//number1과 number2더하기
		//사용자 스트링으로 부터 첫번째 숫자 읽기
		number1=Integer.parseInt(firstNumber);
		number2=Integer.parseInt(secondNumber);
		number3=Integer.parseInt(thirdNumber);
		sum = number1*number2*number3;
		System.out.println(sum);//
		//결과를 나타내기
		JOptionPane.showMessageDialog
		(null, "The sum si "+sum, "처리 결과", JOptionPane.INFORMATION_MESSAGE);
	}///////////////////////////end of main

}