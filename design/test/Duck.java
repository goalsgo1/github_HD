package design.test;
//추상 클래스 - 단독으로는 인스턴스화 할 수 없다.
//반드시 구현체 클래스가 있어야 한다.
//그러나 일반 메소드도 가질 수 있다.
//그래서 인터페이스가 더 추상적이다.
public abstract class Duck {
	//추상클래스도 전변을 할 수 있다.
	FlyBehavior flybehavior = null;
	QuackBehavior quackbehavior = null;
	public void methodA() {
		flybehavior.fly();
	}
	public void methodB() {
		quackbehavior.quack();
	}
	//좌중괄호와 우중괄호가 있는 메소드가 일반메소드임. - 바디가 있다.
	public void display() {
		System.out.println("나는 오리 입니다.");
	}
	//추상 메소드임.
	//인터페이스에서는 abstract를 생략 할 수 있지만 - 왜냐하면 모두 다 추상메소드만 오니깐.
	// 그런데 추상메소드는 일반메소드도 같이 공존하니깐 구분할 수 있어야 겠지.
	public abstract void swimming();

}
