import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage {	
	
	JFrame frame = new JFrame();
	JLabel messageLabel = new JLabel();
	
	WelcomePage(String userID){
		
		
		messageLabel.setText("Hello"+userID);
		messageLabel.setBounds(250,250,250,35);
    	messageLabel.setFont(new Font(null,Font.BOLD,25));
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(420, 420);
	frame.add(messageLabel);
	frame.setLayout(null);;
	frame.setVisible(true);

}
}
