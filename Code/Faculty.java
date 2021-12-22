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
		JTextField aaa =new JTextField();
        JTextField bbb  = new JTextField();
        JTextField cvr  = new JTextField();
		String s[]= {"Color","Black n White"};
        JComboBox<String> box1   = new JComboBox<>(s);
		JTextField ccc =new JTextField();
		String st[]= {"single","double"};
		JComboBox<String> box2  =new JComboBox<>(st);
		String sk[]= {"A4","A3","A2","A1"};
		JComboBox <String>ddd  =new JComboBox<>(sk);
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
		aaa.setBounds(400,102,500,70);
        bbb.setBounds(400,202,500,70);
		box1.setBounds(400,302,500,70);
		ccc.setBounds(400,402,500,70);
		box2.setBounds(400,502,500,70);
		ddd.setBounds(400,602,500,70);
		cvr.setBounds(400,702,500,70);
		x.add(add);
		add.setVisible(true);
		add.setBounds(700,700,100,30);
		x.add(rid);
        x.add(name);
		x.add(print_type);
		x.add(noc);
		x.add(page_type);
		x.add(sizes);
		x.add(aaa);
        x.add(bbb);
		x.add(box1);
		x.add(ccc);
		x.add(box2);
		x.add(ddd);
		x.setLocationRelativeTo(null);
		x.setLayout(null);
		x.setVisible(true);
	}
    public static void main(String[] args) {
		Faculty c = new Faculty();
	}
}