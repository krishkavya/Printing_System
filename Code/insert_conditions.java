package project;
import java.sql.*;  
public class insert_conditions {
	 
	public static void main(String[] args) throws Exception
    {
		String url = "jdbc:postgresql://localhost:5432/Printing System"; // url connection 
		String uname = "postgres"; 
		String pass = "postgres";
		String print_side = "";
		String Color = "";
		String Paper_type = "";
		String doc_name = "";
		String doc_type = "";
		String paper_sizes = "";
		String query = "insert into   Print_Request values (?,?,?,?,?,?) ";
		
		Class.forName("org.postgresql.Driver"); // driver class
		Connection con = DriverManager.getConnection(url, uname, pass);
		PreparedStatement st = con.prepareStatement(query);
		st.setString(1, print_side);
		st.setString(2, Color);
		st.setString(3, Paper_type);
		st.setString(4,doc_name);
		st.setString(5, doc_type);
		st.setString(6, paper_sizes);
        int count  = st.executeUpdate();
		
		
		
	   
		System.out.println(count + "row/s affected");
		
	   
		st.close();
		con.close();
    }
}
