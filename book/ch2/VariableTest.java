package book.ch2;

public class VariableTest {
	int tot=0;
	//사용자로 부터 세 개의 점수를 입력 받는다.-  지역변수 자리이다.
	//초기화는 언제 이루어지나요? - when, where, what, how, why, 
	/****************************************************************
	 * 
	 * @param jumsu1 - 90
	 * @param jumsu2 - 85
	 * @param jumsu3 - 95
	 * @param inwon - 응시원수
	 * @return
	 */
	int hap(int jumsu1, int jumsu2, int jumsu3, int inwon) {
		//내안에서 초기화를 하지 않았다.
		//그렇다면 언제 초기화가 되는 걸까요?
		System.out.println(jumsu1+" "+jumsu2+" "+jumsu3+" 응시원수:"+inwon);
		double avg = (jumsu1+jumsu2+jumsu3)/(double)inwon;
		double avg2 = (jumsu1+jumsu2+jumsu3)/inwon;
		System.out.println("평균은 1:"+avg);
		System.out.println("평균은 2:"+avg2);
		return jumsu1+jumsu2+jumsu3;
	}
	public static void main(String[] args) {
		//내가 가진 메소드 일지라도 static영역에서 호출할 때는
		//반드시 인스턴스화를 할것.
		VariableTest vt = new VariableTest();
		//vt.jumsu1=0;//지변은 인스턴스 변수.변수이름으로 초기화 및 호출 불가함.
		vt.tot = 10;
		vt.hap(90, 85, 95, 3);//값에 의한 호출이다. call by value
	}

}