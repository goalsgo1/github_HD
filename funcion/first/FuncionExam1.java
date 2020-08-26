package funcion.first;

import book.ch2.Sonata;

public class FuncionExam1 {// 접근제한자가 public이면 다른클래스에서 접근할 수 있다.
	// 선언부

	// 생성자 - 리턴타입이 없다 -> 외적으로 볼 때 생성자의 메소드를 구분할 수 있다.
	public FuncionExam1() {

	}

	void methodA() {

		// 내 안에서 결정된 값을 외부에서 사용할 수 없다.
		// 그런데 꼭 사용하고 싶으면 어떻게 하지?
		// 해결방법은 전변에 담아주세요. - 다른메소드 영역에서도 사용할 수 있다.
		// 메소드는 스택에 담기므로 사라진다. - 유지가 안됨
	}

	// 아래의 경우 void와는 다르게 호출된 결과를 재사용할 수 있다.
	// 어디에서? - 함수에서, 다른 클래스에서(인스턴스화)
	int methodB() {
		return 50;
	}

	// 레벨3
	Sonata methodC() {
		return new Sonata();
	}

	// 메소드 오버로딩 - 무조건 파라미터의 갯수가 다르거나 타입이 달라야 함.
	private Sonata methodC(int i) {
		Sonata herCar = new Sonata();
		return herCar;
	}

	// 메인메소드 - 가능하면 main메소드는 짧게
	public static void main(String[] args) {
		FuncionExam1 fe = new FuncionExam1();
		int i = fe.methodB(); // i=10
		Sonata myCar = fe.methodC(i);
		// 출력해보기 전에 반드시 출력값을 예측해볼것.
		myCar.speed = myCar.speed + 100;
		System.out.println(myCar.speed);// 0을 출력할 것이다.
		// 메소드 C에서 생성된 소나타의 속도는 50으로 변경해 주세요.
		Sonata himCar = fe.methodC();
		himCar.speed = 50;
		System.out.println(himCar.speed);
	}
}
