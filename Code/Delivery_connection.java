package project;

import java.sql.Connection;
import java.sql.DriverManager;

public class Delivery_connection {
	public static void main(String[] args){
		Connection connection=null;
		
		try {
			Class.forName("org.postgresql.Driver");
			connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Printing System","postgres","ssrd211");
			 if(connection!=null) {
				 System.out.println("Connection OK");
			 }else {
				 System.out.println("Connection failed");
		} 
			 
		}catch (Exception e) {
			System.out.println(e);
		}
		}
	}


