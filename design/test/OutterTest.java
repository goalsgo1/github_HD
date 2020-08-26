package design.test;

import design.test.Outter.Inner;

class Outter {
	int i = 10;

	public void come() {
		System.out.println("come()호출 성공");
	}

	// 내부 클래스라고 한다.
	// 반드시 외부 클래스를 인스턴스화 해야만 접근이 가능하다.
	// 외부 클래스에 멤버변수를 사용가능하다.
	class Inner {
		public void go() {
			System.out.println("go()호출 성공 " + i);
		}
	}
}

public class OutterTest {
	public static void main(String[] args) {
		Outter ott = new Outter();
		ott.come();
		Inner inn = ott.new Inner();
		inn.go();
	}

}
