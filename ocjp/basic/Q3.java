package ocjp.basic;

public class Q3 {

	// 조건문 안에 실행문이 한 개 일때는 좌중괄호와 우중괄호를 생략할 수 있다.
	public static void main(String[] args) {
		int x = 5;
		boolean b1 = true;
		boolean b2 = false;

		if ((x == 4) & !b2) // 연산자가 두 개 일때는 첫번째 조건이 거짓이면 뒤에 조건은 안본다.
			System.out.print("1");
		System.out.print("2"); // 얘는 무조건 당첨 혼자 if문에 해당하지 않고 출력함.
		if ((b2 = true) && b1) {
			System.out.print("3");
		}
	}
}