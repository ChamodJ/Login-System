import java.awt.Font;

import javax.swing.*;

public class WelcomePage {

	JFrame frame = new JFrame();
	JLabel wLable = new JLabel("Welcome");
	
	WelcomePage(String uID) {
		
		wLable.setBounds(0,0,200,35);
		wLable.setFont(new Font(null, Font.PLAIN,25));
		
		wLable.setText("Hello " + uID);
		
		frame.add(wLable);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);;
	}
}
