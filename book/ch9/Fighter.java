package book.ch9;

public class Fighter extends Unit implements Fightable {

	@Override
	public void attack(Unit u) {

	}

//오버라이드 할 떄, 접근 제한자는 반드시 더 넓은 범위로 처리해야 한다.
	@Override
	public void move(int x, int y) {

	}

}
