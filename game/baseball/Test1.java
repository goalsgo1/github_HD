package game.baseball;

public class Test1 {
		int g_i;//					변수의 숫자 선언 디폴트는 0임을 잊지말자.
		
	void methodA() {
		int a_i;
		a_i = 1;
		g_i++;
	}	
	void methodB() {
		g_i = g_i+5;
	}
		public static void main(String[] args) {
		//insert here - methodA를 호출하였다
		//g_i는 얼마일까요?
		Test1 t1 = new Test1();
		t1.methodA();
		System.out.println(t1.g_i); //t1.methodA => g_i => 0=0+1
		t1.methodB();
		System.out.println(t1.g_i); //1+5=6을 호출하게 된다
		Test1 t2 = new Test1();
		t2.methodA();
		System.out.println(t2.g_i); //다시 전역변수 t2.methodA => g_i => 0=0+1
	}

}
