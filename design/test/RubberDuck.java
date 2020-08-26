package design.test;

public class RubberDuck extends Duck {
	public RubberDuck() {
		flybehavior = new FlyNoWay();
//			flybehavier.fly();
		quackbehavior = new Squeak();

	}

	@Override
	public void swimming() {
		System.out.println("나는 물에 뜹니다.");
	}

}
