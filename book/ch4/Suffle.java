package book.ch4;

public class Suffle {

	public static void main(String[] args) {
		int a=10, b=100, c=500;
		int temp=0;
		temp=a;
		a=b;
		b=c;
		c=temp;
		System.out.println("a=>"+a);
		System.out.println("b=>"+b);
		System.out.println("c=>"+c);
	}

}
