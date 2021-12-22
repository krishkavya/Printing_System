package sample1;
import java.sql.*;  

public class login_connection 
{public static void main(String args[]){
	try
{  
	  Class.forName("org.postgresql.Driver");  
	  Connection connect=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Printing System","postgres","pcssql1234");  
	  Statement stmt=connect.createStatement();  
	  ResultSet rs=stmt.executeQuery("select * from Faculty_details");  
	  while(rs.next())  
		  /* if(rs==tf1)
		   * 
		   */
	  System.out.println(rs.getString(2));  
	  connect.close();  
	}
	catch(Exception e)
	{ System.out.println(e);}  
	}  

}
