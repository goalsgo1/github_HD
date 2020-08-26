package book.ch2;

public class P49 {
	//전역변수는 클래스 전역에서 사용할 수 있다.
	int i;//전역변수->Heap에 저장->heap[global variable, member variable, instance variable]
	//i=2;
	public static void main(String[] args) {
		P49 p49 = new P49();
		p49.methodA();
		int i=5;//지역변수->Stack에 저장->stack[local variable, automatic variable]
		i=10;
		float f=3.14f;
		double d=3.1456;
		boolean isOK;//1. 14,15,16중 14만 있을때 에러가 나지 않았지만 문법상 틀린 상태, 초기화가 되어있지 않음
		isOK=false;//3. 초기화를 함으로써 14 15 16 모두 정상 작동함
		System.out.println(isOK);//2. 16을 썼을 때 출력하려다 보니 에러가 드러남(초기화X)
}
	void methodA() {
		System.out.println("전역변수i==>"+i);//5
		//질문 : methodA에서 10번까지 선언한 변수  i값을 출력하고 싶은데... 가능한가요?
	}
	void methodB(int i) {//파라미터에 선언한 변수도 지변이다.
		System.out.println("지역변수i는"+i);//10
	}
}

//5번라인은 선언1(전변), 10번라인은 선언2(지변), 11번라인은 초기화, 전변은 초기화 생략 - 구분 정확하게.
//디버그 모드에서 메소드 경유=f5, 메소드 경유x= f6
//지역변수는 인스턴스 변수로 접근이 불가함.
//전역변수만이 인스턴스 변수 즉, p49.i로 접근할 수 있는 것임.