package book.ch8;

public class CarSimulation {

	public static void main(String[] args) {
		Car myCar = new Pride();
		// 부모 클래스가 같을뿐 아반떼와 프라이드는 관계 없다.
		// 결론 : 아래와 같이 인스턴스화 불가.
		// Avante herCar = new Pride();
		Pride himCar = new Pride();
		// himCar = myCar;
		himCar = (Pride) myCar;

		// myCar.initDisplay();
		himCar.speedUp();
		System.out.println("myCar.speed" + myCar.speed);
		System.out.println("himCar.speed" + himCar.speed);
		// myCar.speedUp(); Car에서는 Pride에서 선언된 speedUp을 사용할 수 없다.
		// 설계는 안하더라도 활용 가능해야 한다.
	}

}
