package book.ch8;

public abstract class Car { //추상클래스
	int speed;
	int wheelNum;

	public Car() {
		System.out.println("Car 디폴트 생성자 입니다.");

	}

	// 호출 할 때 자녀클래스보다 부모클래스가 먼저 호출 된다.
	public abstract void initDisplay();

	public void stop() {
		if (speed > 0)
			speed = 0;
	}
}
