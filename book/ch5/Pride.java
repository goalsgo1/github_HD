package book.ch5;

public class Pride extends Object{//toString()
	int speed = 0;
	
	public String toString() {
		return "그녀의 자동차";
	}
	
	public static void main(String[] args) {
		Pride herCar = new Pride();
		System.out.println(herCar.toString());
		
	}

}
