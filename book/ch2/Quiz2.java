package book.ch2;

public class Quiz2 {

	public static void main(String[] args) {
		//insert here
		int a = 1;
		int b = 2;
		int c = 3;
		int tot = a+b+c;
		//문자열 더하기는 문자열이다.
		//문자열 +숫자=문자열
		//숫자+숫자=숫자
		//숫자+문자열=문자열
		//숫자 더하기 숫자는 숫자이다.
		System.out.println(a+"+"+b+"+"+c+"="+tot);
		System.out.println(a+"+"+b+"+"+c+"="+a+b+c);
		System.out.println(a+"+"+b+"+"+c+"="+(a+b+c));
		System.out.println("a+b*c===>"+(a+b*c));
		System.out.println("(a+b)*c===>"+((a+b)*c));
	}

}