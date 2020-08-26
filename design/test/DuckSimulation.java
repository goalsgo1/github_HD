package design.test;

public class DuckSimulation {
//선언부와 생성부의 이름이 다르면 다형성(Polymorphism)을 기대할 수 있다.
//다형성이란 같은 이름의 메소드를 호출했는데 결과가 서로 다르다.
//다형성의 전제 조건은 선언부 타입과 생성부 타입이 무조건 다를 때 기대할 수 있다.
//재사용성을 높이는 코딩 방법으로 중요하다.
	public static void main(String[] args) {
		// 추상클래스도 구현체 클래스가 있어야만 할 것이다.
		Duck myDuck = new MollardDuck();
		myDuck.methodA();// flybehavier.fly();
		myDuck.methodB();
		myDuck.swimming();
		WoodDuck herDuck = new WoodDuck();
		herDuck.methodA();
		herDuck.methodB();
		herDuck.swimming();
		RubberDuck himDuck = new RubberDuck();
		himDuck.methodA();
		himDuck.methodB();
		himDuck.swimming();
		// myduck.fly();

	}

}
