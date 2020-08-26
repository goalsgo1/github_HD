
package book.ch2;

public class P61 {
/*
 * 변수앞:상수
 * 메소드 앞:메소드 오버라이딩을 못함
 * 클래스 앞:자녀클래스를 가질  수 없다.
 */
	public static void main(String[] args) {
		int i = 5;
		i = 7;
		final double PI = 3.14;
		final String _URL = "192.168.0.244";
		//PI = 4.14;상수로 선언된 변수의 값을 재정의 불가함.
		System.out.println("i==> "+i);
		System.out.println("PI==> "+PI);

	}

}