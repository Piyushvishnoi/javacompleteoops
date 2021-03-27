package jdbctutorial;         
//Step 1: importing packages            
import java.sql.Connection;                      
import java.sql.DriverManager;                            
import java.sql.ResultSet;                        
import java.sql.Statement;                   
public class jdbcclass {          
	public static void main(String[] args) throws Exception     
	{  
		//Step 2: Registering JDBC drivers  
		Class.forName("com.mysql.jdbc.Driver");   
		//Step 3: Database url formation 
		Connection conn=DriverManager.getConnection("jdbc:mysql:///Db1","root","2338");
		//step 4:Statement preperation 
		Statement st=conn.createStatement();
		//Step 5: executing queries
		ResultSet rs=st.executeQuery("Select * from Employee");
		//Step 6: getting results of queries
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+rs.getString(3));
		}
		//Step 7: closing all connections
		rs.close();
		st.close();
		conn.close();
	} 
  
}
 
