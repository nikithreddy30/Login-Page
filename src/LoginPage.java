import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage implements ActionListener{
	
	JFrame frame = new JFrame();
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");
	JTextField userIDField = new JTextField(); 
	JPasswordField userPasswordField = new JPasswordField();
	JLabel userIDLabel = new JLabel("userID:");
	JLabel userPasswordLabel = new JLabel("password:");
	JLabel messageLabel = new JLabel();
	HashMap<String, String> userInfo = new HashMap<String,String>();
      public  LoginPage(HashMap<String,String> loginInfoOriginal){
        	userInfo = loginInfoOriginal;
        	
        	userIDLabel.setBounds(50, 100, 75, 25);
        	userPasswordLabel.setBounds(50, 150, 75, 25);
        	userIDField.setBounds(125, 100, 200, 25);
        	userPasswordField.setBounds(125, 150, 200, 25);
        	
        	messageLabel.setBounds(125,250,250,35);
        	messageLabel.setFont(new Font(null,Font.ITALIC,25));
        	loginButton.setBounds(125,200,70,25);
        	loginButton.addActionListener(this);
        	loginButton.setFocusable(false);
        	resetButton.setBounds(200,200,60,25);
        	resetButton.addActionListener(this);
        	resetButton.setFont(new Font(null, Font.LAYOUT_RIGHT_TO_LEFT,8));
        	resetButton.setFocusable(false);
        	
        	frame.add(userPasswordField);
        	frame.add(userIDField);
        	frame.add(userIDLabel);
        	frame.add(userPasswordLabel);
        	frame.add(messageLabel);
        	frame.add(loginButton);
        	frame.add(resetButton);
        	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	frame.setSize(420, 420);
        	frame.setLayout(null);
        	frame.setVisible(true);
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
        	if(e.getSource()==resetButton) {
        		userIDField.setText("");
        		userPasswordField.setText("");
        	}
        	
        	if(e.getSource()==loginButton) {
        		String userID = userIDField.getText();
        		String password = String.valueOf(userPasswordField.getPassword());
        		
        		if(userInfo.containsKey(userID)) {
        			if(userInfo.get(userID).equals(password)) {
        				messageLabel.setForeground(Color.GREEN);
        				messageLabel.setText("Login Successful");
        				frame.dispose();
        				WelcomePage welcome = new WelcomePage(userID);
        			}else {
            			messageLabel.setForeground(Color.RED);
        				messageLabel.setText("Invalid Password");
            			
            		}
        		}else {
        			messageLabel.setForeground(Color.RED);
    				messageLabel.setText("Invalid UserName");
        	}
        	
        }
}
}
