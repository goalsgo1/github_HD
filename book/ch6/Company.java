package book.ch6;

public class Company {
	private static Company instance = null;
	private Company() {
		System.out.println("Company 디폴트 생성자 호출 성공");
	}
	public static Company getInstance()	{
		if (instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
