package interfaceandabstract;

import java.awt.Font;
import java.awt.GridLayout;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Time extends JFrame{
	private JLabel heading;
	private JLabel clocklabel;
	private Font font = new Font("", Font.BOLD, 30);
	Time(){
		super.setTitle("Ritvik");
		super.setSize(400,400);
		super.setLocation(300, 300);
	this.Tick();
	this.startclock();
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
public void Tick() {
	heading = new JLabel("THAKUR");
	clocklabel = new JLabel("Clock");
	heading.setFont(font);
	clocklabel.setFont(font);
	this.setLayout(new GridLayout(2, 1));
	this.add(heading);
	this.add(clocklabel);
	
}
public void startclock() {
	Thread t = new Thread() {
		public void run() {
			try {
				while(true) {
					Date d = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat("hh : mm : ss a");
					String Datetime = sdf.format(d);
					clocklabel.setText(Datetime);
					Thread.sleep(1000);
					
					
					
				}
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	};
t.start();
}
}
