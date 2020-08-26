package book.ch4;

public class PBTest5 {
	public void methodA(int start, int end) {
	int i=1;
	//1부터 100까지 쓴다
	//for(int i=start;i<=end;i++) {
	while(101>i) {
		switch(i%35) {
		case 0: {
				System.out.println("fizzbuzz");	
				break;
			}
		case 5: case 10: case 15: case 20: case 25:  {
				System.out.println("fizz");	
				break;
			}
		case 7: case 14: case 21: case 28: {
				System.out.println("buzz");				
				break;
		}
		default: {
				System.out.println(i);
			}
//		return;
		}
		i=i+1;
	}
	//insert here =i 값은 얼마?
	}
	public static void main(String[] args) {
		PBTest5 fb=new PBTest5();
		fb.methodA(5,10);
	}
}
