package ocjp.basic;

import javax.swing.JButton;
import javax.swing.JFrame;

//A is a B이면 B가 아빠  => Sonata is a Car이면 Car가 아빠
public class JButtonArray extends JFrame {
	// 8번과 9번의 차이점에 대해 말해보시오. 8번은 초기화를 했다|아니다 초기화를 하기 전이다.
	String labels[] = { "조회", "입력", "삭제" };
	JButton jbtn[] = new JButton[3];// 나는 아직 초기화를 하지 않았다.|아니다 초기화를 한 것이다.
	// 디폴트 생성자 선언해보기
	// 디폴트 생정자의 역할은 무엇입니까?

	public JButtonArray() {///////////////// [[생성자에서 메소드 호출은 가능한가?]]/////////////////////
		// insert here - 메소드를 호출해 보세요.
		initDisplay();
	}

	public JButtonArray(String title) {///////////////// [[생성자에서 메소드 호출은 가능한가?]]/////////////////////
		// insert here - 메소드를 호출해 보세요.
		this.setTitle(title);
		initDisplay();
	}

	public JButtonArray(int height) {///////////////// [[생성자에서 메소드 호출은 가능한가?]]/////////////////////
		// insert here - 메소드를 호출해 보세요.
		this.setSize(700, height);
		;
		initDisplay();
	}

	public void initDisplay() {
		this.setSize(400, 300);// 나는 어디에 선언된 메소드 일까요? 아빠를 찾아주세요. =>아빠는 JFrame
		this.setVisible(true);// 메소드 호출시 파라미터의 갯수는 반드시맞춰야 하나요? 아님 상관없나요?
	}

	public static void main(String[] args) {
		new JButtonArray("생성자에 대해서"); // 이것은 생성자를 호출하는 문장임. 그런데 파라미터가 없는 생성자를 호출하는 것임.
		new JButtonArray(100);
	}

}
