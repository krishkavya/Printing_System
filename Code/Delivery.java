package project;

import javax.swing.*;   
public class Delivery extends JFrame {  
//Initializing Components  
    JLabel lb, name,fid,dept,col,fid2,size,pur,pri,cost;  
    JTextField tf_name,tf_fid,tf_dept,tf_col,tf_fid2,tf_size,tf_pur,tf_pri,tf_cost;  
    JButton btn;  
    //Creating Constructor for initializing JFrame components  
    Delivery() {  
        //Providing Title  
        super("Delivery portal");  
        fid2 = new JLabel("Faculty ID:");  
        fid2.setBounds(20, 20, 100, 20);  
        tf_fid2 = new JTextField(20);  
        tf_fid2.setBounds(130, 20, 200, 20);  
        btn = new JButton("Submit");  
        btn.setBounds(50, 50, 100, 20);     
        setVisible(true);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setSize(500, 500);  
        name = new JLabel("Name:");  
        name.setBounds(20, 120, 100, 20);  
        tf_name = new JTextField(50);  
        tf_name.setBounds(130, 120, 200, 20);  
        fid = new JLabel("Faculty ID:");  
        fid.setBounds(20, 150, 100, 20);  
        tf_fid = new JTextField(100);  
        tf_fid.setBounds(130, 150, 200, 20);  
        dept = new JLabel("Department:");  
        dept.setBounds(20, 180, 100, 20);  
        tf_dept = new JTextField(50);  
        tf_dept.setBounds(130, 180, 200, 20);  
        col = new JLabel("Colour");  
        col.setBounds(20, 210, 100, 20);  
        tf_col = new JTextField(50);  
        tf_col.setBounds(130, 210, 100, 20); 
        size = new JLabel("Size");  
        size.setBounds(20, 240, 100, 20);  
        tf_size = new JTextField(50);  
        tf_size.setBounds(130, 240, 100, 20); 
        pur = new JLabel("Purpose:");  
        pur.setBounds(20, 270, 100, 20);  
        tf_pur = new JTextField(50);  
        tf_pur.setBounds(130, 270, 100, 20); 
        pri = new JLabel("Number of prints:");  
        pri.setBounds(20, 300, 100, 20);  
        tf_pri = new JTextField(50);  
        tf_pri.setBounds(130, 300, 100, 20);
        cost = new JLabel("Total Cost");  
        cost.setBounds(20, 330, 100, 20);  
        tf_cost = new JTextField(50);  
        tf_cost.setBounds(130, 330, 100, 20);

        setLayout(null);  
        //Add components to the JFrame  
        add(fid2);  
        add(tf_fid2);  
        add(btn);   
        add(name);  
        add(tf_name);  
        add(fid);  
        add(tf_fid);  
        add(dept);  
        add(tf_dept);  
        add(col);  
        add(tf_col); 
        add(size);  
        add(tf_size); 
        add(pur);  
        add(tf_pur); 
        add(pri);
        add(tf_pri);
        add(cost);
        add(tf_cost);
        
        //Set TextField Editable False  
        tf_name.setEditable(false);  
        tf_fid.setEditable(false);  
        tf_dept.setEditable(false);  
        tf_col.setEditable(false);  
        tf_size.setEditable(false);  
        tf_pur.setEditable(false); 
        tf_pri.setEditable(false);
        tf_cost.setEditable(false);
        
    } 
    //Running Constructor  
    public static void main(String args[]) {  
        new Delivery() ;
    }  
}  
