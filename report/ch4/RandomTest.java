package report.ch4;

public class RandomTest {
	void test1() {
		System.out.println("===================================");
		for (int i = 0; i < 15; i++) {
			int num = ((int) (Math.random() * 20)) % 21 - 10;
			System.out.println(num);
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			int num = (int) (Math.random() * 10);
			System.out.println(num);
		}
		RandomTest rt = new RandomTest();
		rt.test1();
	}

}