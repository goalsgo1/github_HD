package book.ch2;
/*
 * 대입연산자 오른쪽에 있는 값을 왼쪽에 대입한다.
 * 주의사항
 * 작은 값을 더 큰 타입에 대입하는 건 합법
 * 그러나 큰 타입을 작은 타입의 변수에 대입하는 건 불법임.
 * 내 논리로 이해가 안되면 질문하세요.
 * 내 논리로 이해가 된게 아니면 내꺼가 아닙니다.
 */
public class D {

	public static void main(String[] args) {
		int i = 1;
		double d = i;//d는 1
		i = (int)d;//강제 형전환 i=1
		float f = 1.5f;//f=1.5f
		i = (int)f;//1
		float f1 = (float)d;//1
		System.out.println("f1:"+f1);//1
		
	}

}