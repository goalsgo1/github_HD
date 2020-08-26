package book.ch2;

public class Quiz4 {

	public static void main(String[] args) {
		int tot = 0;//0으로 초기화 해야함
		int a = 1;//핫스팟
		for(int i=0;i<10;i=i+1) {
			//System.out.println(i);
			tot = tot+a;//tot=0+1, tot=1+1, tot= 2+1
//			System.out.println(tot+a);//1,3,6
//			a = a + 1;
			//System.out.println(tot);//1,3,6
			a = a + 1;
			
		}
		System.out.println(tot);//1,3,6
	}

}