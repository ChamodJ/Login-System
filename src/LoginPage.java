import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.*;


public class LoginPage implements ActionListener {
	
	JFrame frame = new JFrame();
	JButton loginBtn = new JButton("Login");
	JButton resetBtn = new JButton("Reset");
	JTextField uIdInput = new JTextField();
	JPasswordField uPassInput = new JPasswordField();
	JLabel uIdLable = new JLabel("User Id");
	JLabel uPassLable = new JLabel("Password");
	JLabel messageLable = new JLabel("This is a message");
	
	HashMap<String , String> loginInfo = new HashMap<String , String>();
	
	LoginPage(HashMap<String , String> loginInfoOg) {
		
		loginInfo = loginInfoOg;
		
		uIdLable.setBounds(50, 100, 75, 25);
		uPassLable.setBounds(50, 150, 75, 25);
		messageLable.setBounds(105,250,250,35);
		messageLable.setFont(new Font(null, Font.ITALIC,25));
		
		uIdInput.setBounds(125,100,200,25);
		uPassInput.setBounds(125,150,200,25);
		
		loginBtn.setBounds(125,200,100,25);
		loginBtn.addActionListener(this);
		loginBtn.setFocusable(false);
		
		resetBtn.setBounds(225,200,100,25);
		resetBtn.addActionListener(this);
		resetBtn.setFocusable(false);
		
		
		frame.add(uIdLable);
		frame.add(uPassLable);
		frame.add(messageLable);
		frame.add(uIdInput);
		frame.add(uPassInput);
		frame.add(loginBtn);
		frame.add(resetBtn);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == resetBtn ) {
			uIdInput.setText("");
			uPassInput.setText("");
		}
		
		if (e.getSource() == loginBtn) {
			String uId = uIdInput.getText();
			String uPass = String.valueOf(uPassInput.getPassword());
			
			if (loginInfo.containsKey(uId)) {
				if(loginInfo.get(uId).equals(uPass)) {
					messageLable.setForeground(Color.green);
					messageLable.setText("Login Succefull");
					frame.dispose();
					WelcomePage welcomePage = new WelcomePage(uId);
				}
				
				else {
					messageLable.setForeground(Color.red);
					messageLable.setText("Invalid Password");
			}
			
		}
			else {
				messageLable.setForeground(Color.red);
				messageLable.setText("Invalid Username");
			}
	}

	}
}
