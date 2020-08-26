package oracle.db;

public class StringTest {

	public static void main(String[] args) {
		String msg = "hello";
		msg = msg.replace('e', 'o');
		System.out.println(msg);
		StringBuilder sb = new StringBuilder("hello");
		sb.append(" world!!!");
		System.out.println(sb.toString());
		String str = "hello";
		str = str + " world";
		str += " java";
		System.out.println(str);
	}

}