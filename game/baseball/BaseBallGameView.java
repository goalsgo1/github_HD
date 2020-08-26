package game.baseball;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class BaseBallGameView extends JFrame{
	String imgPath = "C:\\workspace_java\\dev_java\\src\\game\\baseball\\";
	Image img = null;
//	Image background=null;
  ImageIcon    titleIcon = new ImageIcon(imgPath+"yagu.png");
  ImageIcon    bg = new ImageIcon(imgPath+"dreamballpark.jpg");
		JButton     jbtn_inew  = new JButton();
	   JMenuBar    jmb        = new JMenuBar();
	   JMenu       jm_game    = new JMenu("게임");
	   JMenuItem   jmi_new    = new JMenuItem("새게임");
	   JMenuItem   jmi_dap    = new JMenuItem("정답");
	   JMenuItem   jmi_clear  = new JMenuItem("지우기");
	   JMenuItem   jmi_exit   = new JMenuItem("나가기");
	   JMenu       jm_info    = new JMenu("도움말");
	   JMenuItem   jmi_detail = new JMenuItem("야구숫자게임이란?");
	   JMenuItem	jmi_create = new JMenuItem("만든사람들");
	   JToolBar		toolBar    = new JToolBar(); 
	   JPanel		jp_center = new JPanel();
	   JTextArea jta_display = null;
	   JScrollPane jsp_display = new JScrollPane
			   (JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	   JTextField jtf_user   = new JTextField();
	   Font f = new Font("Thoma",Font.BOLD,14);
	   JPanel jp_east   = new JPanel();
	   JButton jbtn_new    = new JButton("새게임");
	   JButton jbtn_dap    = new JButton("정답");
	   JButton jbtn_clear  = new JButton("지우기");
	   JButton jbtn_exit   = new JButton("나가기");
	   // 배경 이미지 구현
	   class BgPanel extends JPanel{
	      public void paintComponent(Graphics g) {
	         g.drawImage(bg.getImage(), 0,0,null);
	         setOpaque(false);
	         super.paintComponent(g);
	      }
	   }
	   public void initDisplay() {
		      img = this.getToolkit().getImage(imgPath+"dreamballpark.jpg");
		      jta_display = new JTextArea() {
		         private static final long serialVersionUID = 1L;
		         
		public void paint(Graphics g) {
		   g.drawImage(img, 0, 0, null);
		   Point p= jsp_display.getViewport().getViewPosition();
		   g.drawImage(img, p.x, p.y, null);
		   paintComponent(g);
		         }
		      };
		      this.setContentPane(new BgPanel());
		      jsp_display = new JScrollPane(jta_display);
		      jta_display.setOpaque(true);
		      jbtn_inew.setIcon(new ImageIcon(imgPath+"new.gif"));
		      toolBar.add(jbtn_inew);
		      jm_game.add(jmi_new);
		      jm_game.add(jmi_dap);
		      jm_game.add(jmi_clear);
		      jm_game.add(jmi_exit);
		      jm_info.add(jmi_detail);
		      jm_info.add(jmi_create);
		      jmb.add(jm_game);
		      jmb.add(jm_info);
		      jbtn_new.setBackground(new Color(158,9,9));
		      jbtn_new.setForeground(new Color(212,212,212));
		      jbtn_dap.setBackground(new Color(7,84,170));
		      jbtn_dap.setForeground(new Color(212,212,212));
		      jbtn_clear.setBackground(new Color(19,99,57));
		      jbtn_clear.setForeground(new Color(212,212,212));
		      jbtn_exit.setBackground(new Color(54,54,54));
		      jbtn_exit.setForeground(new Color(212,212,212));
		      jp_east.setLayout(new GridLayout(4,1));
		      jp_east.add(jbtn_new);
		      jp_east.add(jbtn_dap);
		      jp_east.add(jbtn_clear);
		      jp_east.add(jbtn_exit);
		      jta_display.setFont(f);
		      jta_display.setBackground(new Color(255,255,200));
		      jta_display.setForeground(new Color(57,109,165));

		      this.setJMenuBar(jmb);
		      jtf_user.setBackground(new Color(255,255,200));
		      jp_center.setBackground(Color.green);
		      jp_east.setBackground(Color.black);
		      jp_center.setLayout(new BorderLayout(0,10));
		      jp_center.add("Center",jsp_display);
		      jp_center.add("South",jtf_user);
		      jta_display.setLineWrap(true);
		      this.setLayout(new BorderLayout(10,20));
		      this.add("North",toolBar);
		      this.add("Center",jp_center);
		      this.add("East",jp_east);
		      this.setTitle("야구 숫자 게임 Ver1.0");
		      this.setSize(400, 300);
		      this.setVisible(true);
	   }
	   
	   
	public static void main(String[] args) {
		BaseBallGame bbGame = new BaseBallGame();
		bbGame.initDisplay();
	}

}
