package book.ch4;

public class PBTest2 {
	public void methodA() {
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
	}
	public static void main(String[] args) {
		PBTest2 fb=new PBTest2();
		fb.methodA();
	}
}
