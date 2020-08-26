package ocjp.basic;

public class Q12 {
	int x = 0;
	public static void main(String[] args) {
		int x=5; //main에서 선언한 지역변수.
//		Q12 P= null; //선언만 되었다. 이 주소번지를 사용하면 NullPointerException이 발생-RuntimeError라고 함.
		Q12 p=new Q12();
		p.doStuff(x);
		System.out.println(" main x=" + x); //5
		System.out.println(" main x=" + p.x); //5
	}

	void doStuff(Q12 p) { //여기는 도착 안함 주소가 아얘 생기지 않음.
		System.out.println(" doStuff x=" + (p.x+2)); //0
		
	}
	void doStuff(int x) {
		System.out.println(" doStuff x=" + ++this.x); //0
		
	}
}

//핵심:주소번지 안에 데이터가 들어있다.