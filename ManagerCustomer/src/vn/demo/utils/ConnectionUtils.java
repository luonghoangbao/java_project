package vn.demo.utils;

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
	  String database = "manager_customer";
	  String userName = "sa";
	  String password = "1234";
	  String connectionURL = "jdbc:jtds:sqlserver://" + hostName + ":1433/" + database + ";";
	  Connection conn = DriverManager.getConnection(connectionURL, userName, password);
      return conn;
  }
}