package game.baseball;
class Param {
		int ival;
}
public class TestParam {
		void effectParam(Param p) {
		p = new Param();		//복사본이 된다.
		p.ival=500;
		System.out.println("sub ival => "+p.ival);
	}
		public static void main(String[] args) {
		//내 안에 있는 메소드 이지만 static영역에서 effectParam메소드를 호출하려면
		//반드시 인스턴스화를 해야함.
		TestParam tp = new TestParam();
		//effectParam메소드를 호출 할 예정인데 메소드에 파라미터가 Param타입이 들어있음.
		//그래서 인스턴스화 하였음. 인스턴스화 하지 않으면 가리키는 객체는 없이 타입만
		//있는 것이 된다.
		Param p = new Param();
		//main메소드안에서 선언했기에 지변의 성격을 가지고 있다.
		//그 클래스에 선언된 ival변수는 처음에 0이었으나 아래 초기화를 통해 100이 담김.
		p.ival = 100;
		//아래에서는 내 안에 있는 메소드를 호출 함. 이때 18번 라인에 정의한 주소번지를 넘김.
		tp.effectParam(p);//참조에 의한 호출이다.
		System.out.println("main ival => "+p.ival);
	}

}