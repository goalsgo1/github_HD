  
package book.ch2;

public class Method1_1 {
	int i = 3;
	public static void main(String[] args) {
		Method1 m1 = new Method1();//인스턴스화 했다.
		m1.methodA();//내안에 있는 메소드를 호출했다.
		System.out.println("main 호출 성공");		
	}
	void methodA() {//메소드를 선언한 것이다.
		System.out.println("methodA 호출 성공");//실행문이다.
	}/////////////end of methodA-다시 나를 부른곳으로 돌아감.
/* 11-12-13-5-6-7-14
 * 	
*/	

}