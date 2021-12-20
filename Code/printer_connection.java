package Printing System;
public class printer_connection {
	try 
	{ Class.forName("org.postgresql.Driver");
	Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Printing System", "username", "password");
	}
	catch(Exception e)
	  {
	   System.out.println(e);
	  }


}
}
