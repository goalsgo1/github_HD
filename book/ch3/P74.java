package book.ch3;

public class P74 {

	public static void main(String[] args) {
		int x=2;
		int y=1;
		y=++x;//x=3, y=3
		System.out.println("x="+x+", y="+y);
		x=5;
		//아래에서는 대입이 먼저이고 감소가 그 다음이다.
		y=x--;//x=4, y=5
		//insert here 
		System.out.println("x="+x+", y="+y);
		x=y;
		y=x+y;//x=?, y=?
		//insert here 
		x=0;
		y=1;
		x=--y;//x=? 0
		y=++y;//
		//insert here x=0, y=1
		x=x-y;//x=?  -1   0   
		y=x++;//y=?  -1   -1
		//insert here x=0 
		System.out.println("x="+x+", y="+y);//x=0, y=-1	
		x=x-y++;//x=0-(-1):뺄셈후에 y값은 1 증가함.   
		y=--x;//y=?  -1   -1
		System.out.println("x="+x+", y="+y);//x=0, y=-1	
	}

}