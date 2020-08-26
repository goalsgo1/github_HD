package book.ch4;

import javax.swing.JOptionPane;
//모든 클래스는 Object로 부터 상속받아서 만들어진 것이다.
public class IfTest extends Object{

	public static void main(String[] args) {
		//사용자로부터 점수를 입력 받는다
		//사용자가 입력한 점수를 담을 변수로 선언하세요
		//사용자가 입력한 값을 받는 방법은 무엇입니까?
		//또 그 값을 받았을때 타입은 뭐죠?
		String Jumsu=JOptionPane.showInputDialog("점수를 입력 하세요.");
		int i_Jumsu=Integer.parseInt(Jumsu);
		if(i_Jumsu>=90) {
			System.out.println("당신은 A학점을 받았습니다.");
		}
		else if(90>i_Jumsu&&i_Jumsu>=80) {
			System.out.println("당신은 B학점을 받았습니다.");
		}
		else if(80>i_Jumsu&&i_Jumsu>=70) {
			System.out.println("당신은 C학점을 받았습니다.");
		}
		else if(70>i_Jumsu&&i_Jumsu>=60) {
			System.out.println("당신은 D학점을 받았습니다.");
		}
		else {
			System.out.println("당신은 F학점을 받았습니다.");

			
		}
	
	}

}
