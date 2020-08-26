package design.test;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("v.size()==0   " + v.size());
		v.add("바나나");
		v.add("수박");
		v.add(1, "체리");
		for (Object obj : v) {
			String f = (String) obj;
			System.out.println(f);
		}
	}

}
