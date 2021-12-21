package sample1;
import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JPanel; 
import javax.swing.JPasswordField; 
import javax.swing.JTextField; 
public class LoginView {

	public static void main(String[] args) {
		JFrame title = new JFrame("Welcome to ICTS");
		title.setSize(400, 150);
		title.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

		JPanel panel = new JPanel();
		title.add(panel);
		placeComponents(panel);

		title.setVisible(true);
	}

	private static void placeComponents(JPanel panel) {

		panel.setLayout(null);

		JLabel id = new JLabel("Enter  ID");
		id.setBounds(10, 10, 80, 25);
		panel.add(id);

		JTextField text = new JTextField(20);
		text.setBounds(100, 10, 160, 25);
		panel.add(text);


		JButton login = new JButton("login");
		login.setBounds(10, 80, 80, 25);
		panel.add(login);
		
		
	}
}