package design.test;

class Father {
	public void methodA() {
		System.out.println("Father ==> methodA 호출 성공");
	}
}

class Son extends Father {
	@Override
	public void methodA() {
		System.out.println("Father ==> methodA 호출 성공");
	}
}

public class FatherSimulation {

	public static void main(String[] args) {
		Father fs = new Father();
		fs.methodA();
		Son so = new Son();
		so.methodA();
		// 두 개의 클래스 사이가 부자 관계에 있을 때만 사용할 수 있다.
		// 출력결과는 자녀에 정의된 내용이 동일하게 적용됨
		// 이에 Father가 정의하고 있는 메소드는 은닉메소드가 됨
		Father fa2 = new Son();
		fa2.methodA();
	}

}
