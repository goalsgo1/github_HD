package book.ch4;

public class SwitchTest1 {
	public int others(int x) {//x=5 일때를 기준으로 말해 본다.
//		switch(x%35) {
		switch(x) {
			case 6: x--;
			case 5: x--;//4
			case 4: x--;//3
			case 3: x--;//2
			break;//switch탈출
			default: x--;
			break;
		}////////////////end of switch	
		return x;//2
	}
	//메소드 앞에 static이 있으면 인스턴스화가 필요없다.
	//static이 없는 메소드를 호출 할땐 무조건 인스턴스화 한다.
	//파라미터 자리는 지역변수 자리 이다. - 반드시 초기화를 해주어야 한다. - 선언만 하는것은 문제 되지 않지만 사용할 땐 문제가 된다.(코딩해본사람)
	public static int switchit(int x) {//파라미터 자리에 x값은 호출할 때 결정 됩니다.
		int j = 1;
		switch(x) {
			case 1: j++;
			case 2: j++;
			case 3: j++;
			case 4: j++;//2
			case 5: j++;//3
			default: j++;//4
		}////////////////end of switch
		return j+x;//8
	}
	public static void main(String[] args) {
		//insert here - switchit 호출시 x값을 4로 한다면 출력 결과는 얼마일까요?
		//static메소드인 main안에서 static으로 선언된 switchit메소드를 호출 할때는 클래스이름.메소드이름으로 호출함.
//		int x=SwitchTest1.switchit(4);
		SwitchTest1 st1 = new SwitchTest1();//복사본
		int x=st1.others(5);
		System.out.println(x);
		System.out.println("=====================================");
		int x2=SwitchTest1.switchit(4);//공유
		System.out.println(x2);
		
		
	}

}