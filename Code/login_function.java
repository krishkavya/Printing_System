package sample1;
import javax.swing.*;  


public class login_function {
	
	JFrame f= new JFrame("ICTS Login");  
	

    JTextField tf1;  
    JButton b1;
    JLabel f1;
    
    login_function(){ 
    	
    	f1= new JLabel("Enter ID ");
    	f1.setBounds(10, 10, 80, 25);
    	
     tf1=new JTextField();  
     tf1.setBounds(100, 10, 160, 25); 
     
     
        b1=new JButton("LOGIN");  
        b1.setBounds(70, 80, 80, 25);  
       
        f.add(f1);
        f.add(tf1);
        f.add(b1);  
        f.setSize(300,300);  
        f.setLayout(null);  
        f.setVisible(true);
    } 

    public static void main(String[] args) {  
        new login_function();  
    } 
}

  



