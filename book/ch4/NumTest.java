package book.ch4;

public class NumTest {

	public static void main(String[] args) {
		int i=0;
		int is[]=new int[2];
		
		for(i=1;i<=100;i++) {
		
		if((i%3==0)||(is[1]==3)) {	
			System.out.println("짝");	
		}
		if(is[1]==3) {
			System.out.println("짝");
		}
		else if(is[1]==6) {
			System.out.println("짝");
		}	
		else if(is[1]==9) {
			System.out.println("짝");
		}
		else {
			System.out.println(i);
		}
		}
	}
}
