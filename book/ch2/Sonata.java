package book.ch2;

public class Sonata {
	public int speed = 0;
	void speedUp() {
		speed = speed + 1;
	}
	void speedDown() {
		speed = speed - 1;
	}
	//메인 스레드(Thread)-우선순위 1번
	public static void main(String[] args) {
		Sonata myCar = new Sonata();
		System.out.println(myCar);
		Sonata herCar = new Sonata();
//내안에 있는 메소드라 하더라도 주소번지를 붙여서 호출함.
//이유는 static이 붙어 있는 메소드에서는 내안에 있는 메소드라 하더라도 반드시 주소번지를 붙여야 함.		
		herCar.speedUp();
//내안에 있는 변수 이더라도 static이 붙어있는 main메소드에서 호출 할때는 주소번지를 붙여줌.		
		System.out.println(herCar.speed);
		System.out.println(herCar);
	}//end of main
}