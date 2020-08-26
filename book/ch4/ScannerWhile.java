package book.ch4;

import java.util.Scanner;

public class ScannerWhile {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int i =1;
		while(i<3) {
			i = i+1;
		System.out.println("숫자를 입력");
		String num=scan.nextLine();
		System.out.println("num"+num);
		}
	}

}
