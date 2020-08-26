package design.test;

/*
 * FlyBehavier는 인터페이스이다.
 * 메소드 선언만 되어잇고 바디가 없는 상태이다.
 * 반드시 구현체 클래스가 있어야 활용할 수 있다.
 * 이 세상에 나는 동물, 사물들이 많이 있다.
 * 사물이 갖는 공통분모를 찾기 위해 인터페이스를 설계한다.
 * 단독으로는 인스턴스화 할 수 없다. - 추상메소드를 가지고 있으니깐. - 결정된 메소드가 아님. - 쓸 수 없는 메소드.
 */
public class MollardDuck extends Duck {
	public MollardDuck() {
		flybehavior = new FlyWithWings();
		quackbehavior = new Quack();
	}

	@Override
	public void swimming() {
		System.out.println("나는 물 위에 뜹니다.");
	}

}