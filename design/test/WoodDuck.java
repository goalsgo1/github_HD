package design.test;

public class WoodDuck extends Duck {
	public WoodDuck() {
		flybehavior = new FlyNoWay();
		quackbehavior = new MuteQuack();
//			flybehavier.fly();

	}

	@Override
	public void swimming() {
		System.out.println("나는 물에 가라앉습니다.");
	}

}
