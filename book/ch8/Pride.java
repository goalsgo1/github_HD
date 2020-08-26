package book.ch8;

public class Pride extends Car {

	public Pride() {
		System.out.println("Pride 디폴트 생성자 입니다.");
	}

	@Override
	public void initDisplay() {
		System.out.println("나는 프라이드 입니다.");
	}

	// 아빠가 가진 메소드인지 원형을 어떻게 아는 걸까요.
	public int initDisplay(int i) {// 서로 상속관계에 있다 하더라도 메소드 오버로딩의 규칙은 적용된다.
	// 메소드 오버로딩과 오버라이딩을 둘 다 체크해야 한다.
		System.out.println("나는 프라이드 입니다.");
		return 0;
	}
	public void speedUp() {//speed를 선언하지 않고도 쓸 수 있다. - 아빠 것을 상속받아 쓰는 것이다. - 아들은 누리는 것이 많다.
		speed = speed + 1;
	}
}
