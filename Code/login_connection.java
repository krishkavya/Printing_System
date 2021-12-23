package sample1;
import java.sql.*;  

public class login_connection extends login_function
{public static void main(String args[]){
	try
{  
	  Class.forName("org.postgresql.Driver");  
	  Connection connect=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Printing System","postgres","pcssql1234");  
	  Statement stmt=connect.createStatement();  
	  ResultSet f_id=stmt.executeQuery("select F_ID from Faculty_details");  
	  while(f_id.next())  
		     
	  { if(f_id==tf1)
		    {break;}
	  }
         ResultSet c_id=stmt.executeQuery("select C_ID from Clerk");  
	  while(c_id.next())  
		     
	  { if(c_id==tf1)
		    {break;}
	  }    
		   
	 
	  connect.close();  
	}
	catch(Exception e)
	{ System.out.println(e);}  
	}  

}
