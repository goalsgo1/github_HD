package book.ch4;

public class ForTest2 {
	
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			if(i==1) break;
			System.out.println(i);//0
		}
		System.out.println("여기");
	}

}