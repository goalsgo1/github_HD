package book.ch6;

public class LocalVariable {
	/*
	 * methodA에 선언한 지변을 외부 다른 메소드에서 유지 또는 사용할 수 있나요?
	 * 1) static으로 선언한 변수를 사용하는 것
	 * 2) 전변과 초기화 하기. this.i = i;
	 */
	int i=1;
	static int j=2;//싱글톤이다.
	//static 타입의 변수를 non-static영역에서 사용하는 것은 가능.
	void methodA() {
		int i;
		i=10;
		this.i=i;
		System.out.println(i);//10
		System.out.println(j);//2
	}
	/*
	 * 스태틱 영역에서는 non-static을 사용 불가함.
	 * 해결방법은?
	 * 인스턴스화를 하면 사용가능함.
	 */
	public static void main(String[] args) {
		//메인메소드에서 지역변수 i는 접근이 불가함.
		LocalVariable lv =new LocalVariable();
		System.out.println(lv.i);//출력 가능한 것은 전역변수뿐이다. - 그래서 인스턴스화 함.
		System.out.println(LocalVariable.j);//1
		j = 100;
		lv.methodA();
	}

}
