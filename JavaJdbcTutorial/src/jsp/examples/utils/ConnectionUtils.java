package jsp.examples.utils;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class ConnectionUtils {
 
  public static Connection getMyConnection() throws SQLException{
	  String hostName = "localhost";
	  String sqlInstanceName = "DESKTOP-96MPUKT";
	  String database = "manage1_customer";
	  String userName = "sa";
	  String password = "1234";
	  String connectionURL = "jdbc:jtds:sqlserver://" + hostName + ":1433/" + database + ";";
	  Connection conn = DriverManager.getConnection(connectionURL, userName, password);
      return conn;
  }
 
  public static void main(String[] args){
	  //Input from user
	  Connection conn= null;
	  try {
		  conn = getMyConnection();
		  String sql= "select * from news" ;
		  Statement statement = conn.createStatement();
		  ResultSet rs = statement.executeQuery(sql);
		  System.out.println("Information of News :");
		  while(rs.next()) {
			  int id = rs.getInt("id");
			  int category_id = rs.getInt("category_id");
			  String description = rs.getString("description");
			  String name = rs.getString("name");
			  String detail = rs.getString("detail");
			  String image = rs.getString("image"); 
			  Date date = (Date) rs.getDate("date");
			  int user_id = rs.getInt("user_id");
<<<<<<< HEAD
			  System.out.println("id:" + id + "   " + "category_id:" + category_id + "    " +  "name :" + name +   "     "  +   "description:"  + description +  "   " +  "detail:" + detail +  "   " +  "image:" + image + "   " + "date:" + date.toString() + "    " + "user_id:" + user_id);
=======
			  System.out.println("id:" + id + "   " + "category_id:" + category_id + "    " +  "name :" + name +   "     "  +   "description:"  + description +  "   " +  "detail:" + detail +  "   " +  "image:" + image + "   " /*+ "date:" + date.toString()*/ + "user_id:" + user_id);
		  }
		  String sql1 = "select categories.name, news.category_id"
		  			  + "from categories"
		  			  + "left join news on news.category_id = categories.id";
		  Statement statement1 = conn.createStatement();
		  ResultSet rs1 = statement1.executeQuery(sql);
		  System.out.println("Information of name from Categories:");
		  while(rs1.next()) {
			  String name = rs1.getString("name");
			  System.out.println("name:" + name);
>>>>>>> 27fc1303dc1b86cb95ba099967ef83d28a700c21
		  }
	  }catch(SQLException e) {
		  e.printStackTrace();
	  }
	  System.out.println("connection successful: " + conn);
  }
}
 
