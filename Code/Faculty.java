package project;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
public class Faculty extends JFrame{
	public Faculty()
	{
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JTextField brr=new JTextField();
        JTextField err = new JTextField();
		String s[]= {"Color","Black n White"};
        JComboBox<String> box= new JComboBox<>(s);
		JTextField drr=new JTextField();
		String st[]= {"single","double"};
		JComboBox<String> box2=new JComboBox<>(st);
		String sk[]= {"A4","A3","A2","A1"};
		JComboBox <String>frr=new JComboBox<>(sk);
		JFrame x=new JFrame("Faculty Portal");
		x.setSize(1500,1000);
		JLabel label=new JLabel("Request");
		JLabel rid=new JLabel("Faculty ID: ");
		rid.setBounds(0,102,200,100);
        JLabel name =new JLabel("Document Name");
        name.setBounds(0,202,200,100);
		JLabel print_type=new JLabel("Print Type :");
		print_type.setBounds(0,302,200,100);
		JLabel noc=new JLabel("Number of prints:");
		noc.setBounds(0,402,200,100);
		JLabel page_type=new JLabel("Page Type :");
		page_type.setBounds(0,502,200,100);
		JLabel sizes=new JLabel("Size of page");
		sizes.setBounds(0,602,200,100);
		JButton add=new JButton("Request");
		brr.setBounds(400,102,500,70);
        err.setBounds(400,202,500,70);
		box.setBounds(400,302,500,70);
		drr.setBounds(400,402,500,70);
		box2.setBounds(400,502,500,70);
		frr.setBounds(400,602,500,70);
		x.add(add);
		add.setVisible(true);
		add.setBounds(700,700,100,30);
		x.add(rid);
        x.add(name);
		x.add(print_type);
		x.add(noc);
		x.add(page_type);
		x.add(sizes);
		x.add(brr);
        x.add(err);
		x.add(box);
		x.add(drr);
		x.add(box2);
		x.add(frr);
		x.setLocationRelativeTo(null);
		x.setLayout(null);
		x.setVisible(true);
	}
    public static void main(String[] args) {
		Faculty c = new Faculty();
	}
}