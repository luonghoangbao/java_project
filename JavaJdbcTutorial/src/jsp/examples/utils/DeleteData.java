package jsp.examples.utils;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DeleteData {

	public static void main(String[] args)throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Connection connection1  = ConnectionUtils.getMyConnection();
		Statement statement=connection1.createStatement();
		String sql =" delete from news\r\n" + 
				"where id = '700'";
		System.out.println(sql);
		int rowCount = statement.executeUpdate(sql);
		System.out.println(rowCount);
	}
}