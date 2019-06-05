package jsp.examples.utils;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UpdateData {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Connection connection2  = ConnectionUtils.getMyConnection();
		Statement statement=connection2.createStatement();
		String sql =" update news\r\n" + 
				"set name = 'fuck'\r\n" + 
				"where id = '700'";
		int rowCount = statement.executeUpdate(sql);
		System.out.println(rowCount);
		
	}
}