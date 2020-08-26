package book.ch8;

import java.util.List;
import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// Vector는 멀티스레드에 안전하다. - 속도는 느리다.
		List list = new ArrayList();// 싱글스레드에 안전하다.
		Dog d = new Dog();
		list.add(d);
		Cat c = new Cat();
		list.add(c);
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			if (obj instanceof Dog) {
				System.out.println("개~~~");
			}
			if (obj instanceof Cat) {
				System.out.println("고양이~~~");
			}
			System.out.println(obj);
		}
	}

}
