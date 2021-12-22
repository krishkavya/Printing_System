package project;

import java.sql.*;

public class insert_conditions {
	 
	public static void main(String[] args) throws Exception
    {
		String url = "jdbc:postgresql://localhost:5432/Printing System";
		String uname = "postgres";
		String pass = "postgres";
		String f_id = "";
		String f_name = "";
		String query = "insert into   Faculty_Details values (?,?) ";
		
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		PreparedStatement st = con.prepareStatement(query);
		st.setString(1, f_name);
		st.setString(2, f_id);
		int count  = st.executeUpdate();
		
		
		
	   
		System.out.println(count + "row/s affected");
		
	   
		st.close();
		con.close();
    }

	public static int insert(faculty_conditions ss) {
		// TODO Auto-generated method stub
		return 0;
	}
}

	

