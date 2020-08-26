package book.ch5;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ObjectArray extends JFrame {
	JButton jbtns[] = new JButton[10];
	int nums[]= {0,1,2,3,4,5,6,7,8,9};
	public ObjectArray() {
		initDisplay();
	}
	public void initDisplay() {
		this.setLayout(new GridLayout(1,10));
		for(int i=0;i<jbtns.length;i++) {			//핵
			jbtns[i] = new JButton(nums[i]+"");		//심
			this.add(jbtns[i]);						//코
		}											//드
		this.setSize(600,200);
		this.setVisible(true);
	}
		public static void main(String[] args) {
		new ObjectArray();
	}

}
