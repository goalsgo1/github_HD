  
package book.ch4;

public class GuGuDan {
	void test() {
		int i = 2;
		int j = 1;
		while(i<=9) {
			j=1;
			while(j<=9) {
				System.out.println(i+"*"+j+"="+(i*j));
				j = j + 1;
				
			}////////////end of inner while
			i = i + 1;
		}////////////////end of outter while
	}
	//반복문 사용시 무한루프를 방지할 수 있는 코드를 생각해 보세요.
	public static void main(String[] args) {
		GuGuDan gg = new GuGuDan();
		gg.test();
		for(int i=2;i<=9;i++) {
			for(int j=1;j<10;j++) {
				System.out.println(i+", "+j);
			}
		}

	}

}
//while문으로 바꾸고, 인스턴스화를 이용해 while문과 동시에 만들어보기.
