package report.ch4;

import javax.swing.JOptionPane;

public class FibonacciTest {

	public static void main(String[] args) {
		int a1=1, a2=1, a3=0;
		System.out.println(a1+" "+a2+" ");
		for(int x=0;x<8;x++) {
			JOptionPane.showMessageDialog(null, "before a1:"+a1+", a2:"+a2);
			a3=a1+a2;
			System.out.println(a3+"");
			a1=a2;
			a2=a3;
			JOptionPane.showMessageDialog(null, "after a1:"+a1+", a2:"+a2);
		}
	}
}