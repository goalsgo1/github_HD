package book.ch4;

public class PBTest3 {
	public void methodA(int start, int end) {
	for(int i=1;100>=i;i=i+1) {
			
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
		}
	//insert here =i 값은 얼마?
	}
	public static void main(String[] args) {
		PBTest3 fb=new PBTest3();
		fb.methodA(5,10);
	}
}
