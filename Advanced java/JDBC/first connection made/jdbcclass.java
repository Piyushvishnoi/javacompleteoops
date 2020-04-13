package jdbctutorial;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class jdbcclass {
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql:///Db1","root","2338");
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("Select * from Employee");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+rs.getString(3));
		}
		rs.close();
		st.close();
		conn.close();
	}

}
