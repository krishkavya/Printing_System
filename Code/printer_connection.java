package sample1;

import java.sql.*;  

class printer_connection {  
public static void main(String args[]){
 int cost;

try
{  
  Class.forName("org.postgresql.Driver");  
  Connection connect=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Printing System","postgres","pcssql1234");  
  PreparedStatement ps = null;
  Statement stmt=connect.createStatement();  
  
  ResultSet rs=stmt.executeQuery("select doc_type from Print_request;");  
  
  while(rs.next()) 
  cost=1;
  if(rs=="black and white")
  {cost=cost*2;
  }
  if(rs=="colour")
  {cost=cost*4;
  }
  
  String sql = "insert into  printer (cost) values"+cost);
  ps = connect.prepareStatement(sql);
  ps.execute(); 
  
  connect.close();  
}
catch(Exception e)
{ System.out.println(e);}  
}  
} 
