package project;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class clerk extends Faculty {
    String str;
    JTextField txt1,txt2,txt3,txt4;
    JLabel C_name, C_ID,show1,show2,l1,l2;
    JButton show;
    JFrame x,x2;
    clerk()
    {
        txt1=new JTextField();
		txt1.setBounds(400,102,500,70);
	    txt2=new JTextField();
		txt2.setBounds(400,202,500,70);
		JFrame x=new JFrame("Clerk Portal");
		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		x.setSize(1000,700);
		C_name=new JLabel("Name of clerical staff: ");
		C_name.setBounds(0,102,200,100);
        x.add(C_name);
	    C_ID=new JLabel("CLerk ID:");
		C_ID.setBounds(0,202,200,100);
        x.add(C_ID);
        show=new JButton("submit");
        x.add(txt1);
		x.add(txt2);
        x.add(show);
        show.setVisible(true);
		show.setBounds(500,300,300,50);
        x.setLocationRelativeTo(null);
		x.setLayout(null);
		x.setVisible(true);
    }
    void check_val()
    {
        try
        {
            Class.forName("org.postgresql.Driver");
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/kavyadb", "kavya", "kavya");
			PreparedStatement ps=connection.prepareStatement("Update Print_Request set checking = 'valid' where doc_type='official");
            ps.executeUpdate();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        new clerk();

	}
}

