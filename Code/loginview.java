package Printing System;
import javax.swing.JButton; //labelled button that has platform independant implementation
import javax.swing.JFrame; //container that provides a window in the screen
import javax.swing.JLabel; //display short string or an image icon
import javax.swing.JPanel; //container that can store a group of containers
import javax.swing.JPasswordField; //when typed does not show original text
import javax.swing.JTextField; //allows editing of a single line of text

public class LoginView {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Demo application");
		frame.setSize(400, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close button

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);

		frame.setVisible(true);
	}

	private static void placeComponents(JPanel panel) {

		panel.setLayout(null);

		JLabel userLabel = new JLabel("Enter  ID");
		userLabel.setBounds(10, 10, 80, 25);
		panel.add(userLabel);

		JTextField userText = new JTextField(20);
		userText.setBounds(100, 10, 160, 25);
		panel.add(userText);


		JButton loginButton = new JButton("login");
		loginButton.setBounds(10, 80, 80, 25);
		panel.add(loginButton);
		
		
	}
