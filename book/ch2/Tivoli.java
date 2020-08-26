  package book.ch2;
//가상머신과의 연결 고리가 끊어 졌으므로 다시 처음부터 실행할 수 없다.
public class Tivoli {

	public static void main(String[] args) {
		int first=1;
		int second=2;
//println메소드에는 파라미터 두 개를 정의하고 있지 않거나
//타입이 같지 않기때문이다.		
//println메소드는 내가 정의한 메소드 인가? 아니면 JDK에 
//내장되어 있는 메소드 입니까?
		System.out.println(first);//3
		System.out.print(5);
	}
	//public void print() {}
	public void println(int first, int second) 
	{
		
	}
}