package book.ch2;

public class Student {
	//변수 선언과 초기화 하였다.
	//변수의 타입 변수명 = 값;
	int std_no=0;
	void go() {
		System.out.println("go호출 성공");
	}
	//11-12-13-7
	public static void main(String[] args) {
		Student std = new Student();
		std.go();
		System.out.println("main");
	}
}