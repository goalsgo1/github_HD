package ocjp.basic;
//배열의 시작 인덱스는 항상 0임.
//이유? a2의 주소번지와 a2의 0의 주소번지가 같기때문임.
public class IntArray {
	void a2Print(int[] a) {
		for(int i=0;i<2;i++) {//배열의 크기가 2가 됨.
//			for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);//따라서 0과 1이 오게됨.
		}
		//개선된 for문 - 너가 가진거 다 보여줘
		for(int b:a) {  //같은 배열 중, b의 칸에 a의 값이 들어있는 형태, 결국 a값만이 출력된다. b=a라고 생각하면 편함.
			System.out.println(b);
		}
	}
	public static void main(String[] args) {
		int i,j = 0;
		i=2;
		System.out.println(i+", "+j);
		int x[], y = 0;
//		int[]a, b = 0;
		int[]a2, b2;
		//선언 시에는 대괄호를 반드시 붙이지만 생성시에는 생략함.
		//파라미터 자리에 배열을 넘길 수 있다. - 연습 - 클래스 활용
		a2= new int[2];//0 0
		b2= new int[3];//0 0 0
		//insert here
		IntArray ia = new IntArray();
		ia.a2Print(a2);
	}

}
