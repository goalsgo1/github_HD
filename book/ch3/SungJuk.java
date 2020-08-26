package book.ch3;

public class SungJuk {
	/***************************************************
	 * 홍길동 학생의 국어,수학,영어 점수를 파라미터로 받아옵니다.
	 * hap메소드를 설계할 때 리턴타입을 int로 한 이유는 avg메소드에서
	 * 재사용하기 위함이다.
	 * @param jumsu1 = 75
	 * @param jumsu2 = 80
	 * @param jumsu3 = 90
	 * @return int
	 ***************************************************/
	int hap(int jumsu1, int jumsu2, int jumsu3) {
		return jumsu1+jumsu2+jumsu3;
	}
	double avg(int hap){
		return 0.0;
	}
	public static void main(String[] args) {
		SungJuk sj = new SungJuk();
		sj.hap(75, 80, 90);
//insert here
		
		
	}

}