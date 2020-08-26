package book.ch4;

public class PBTest4 {
	public void methodA(int start, int end) {
	int i=1;
	//1부터 100까지 쓴다
	//for(int i=start;i<=end;i++) {		
	while(101>i) {
			if(i%5==0&&i%7==0) {
				System.out.println("fizzbuzz");	
			}
			else if(i%5==0) {
				System.out.println("fizz");				
			}			
			else if(i%7==0) {
				System.out.println("buzz");				
			}
			else {
				System.out.println(i);
			}
			i=i+1;
		}
	//insert here =i 값은 얼마?
	}
	public static void main(String[] args) {
		PBTest4 fb=new PBTest4();
		fb.methodA(5,10);
	}
}
