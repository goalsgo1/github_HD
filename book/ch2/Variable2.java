package book.ch2;
//주석은 실행되지 않습니다.
//주석에는 업무에 대한 내용과 담당자 이름, 버전정보등 회사 고유 업무내용이
//포함됩니다.
//따라서 배포할땐 XXX.class만 배포함.
public class Variable2 {
	//젼변의 위치
	int i;//0
	//j=5;
	/***********************************************
	 * 로그인 버튼을 누르면 이 메소드를 호출,선언
	 * @param id - 사용자가 입력하는 값을 받음.
	 * @param pw - 사용자가 입력한 비번을 받음
	 * @return -  아이디와 비번을 비교해서 모두 일치하면(교집합)
	 * 학습목표
	 * 나는 메소드의 파라미터 자리에 선언되는 변수가 무엇인지 
	 * 설명할 수 있다.
	 * 내안에 있는 메소드라 하더라도 메인메소드에서 호출하려면 
	 * 인스턴스화한 후 인스턴스변수.login("apple","123");
	 * 회원가입 - 등록 - 오라클
	 * 로그인 - 조회(찾기)
	 ***********************************************/
	String login(String id, String pw) {
		return "홍길동님 환영합니다.";
	}
	void methodA(int i) {//i는 지변임. methodA안에서만 접근가능
		System.out.println("지역변수 i :"+i);
		//내 안에 있는 메소드는 인스턴스화 없이 호출 할 수 있음.
		login("haha","123");//메소드 호출
	}
	public static void main(String[] args) {
		Variable2 v2 = new Variable2();
		v2.methodA(5);
		//insert here - 전역변수 i를 찍어주는 코드를 추가하세요.
		//인스턴스 변수.변수명으로 호출할 수 있어요.
		System.out.println("전역변수 i : "+v2.i);
		//Variable1 v2 = new Variable1();
		//v2.login("haha","123");//여기서는 왜 문법 에러가 나는 걸까요?
	}

}
