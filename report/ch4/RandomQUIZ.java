package report.ch4;

import java.util.Random;

public class RandomQUIZ {
	public static void main(String[] args) {
		int plusNum = 0;
		int minusNum = 0;

		for (int i = 1; i <= 10; i++) {
			Random r = new Random();
			int num = r.nextInt(20);
			num = num - 10;
			if (num > 0) {

				plusNum = plusNum + num;
			} else {
				minusNum = minusNum + num;
			}
		}
		System.out.println("양수의 합 = " + plusNum);
		System.out.println("음수의 합 = " + minusNum);
		// 핵심:양수, 음수의 합을 출력하는 것을 생각하여 위치를 선정해야 한다.
		// for문 안에 출력식을 넣으면 반복 할 때마다 출력하게 된다.
	}

}
