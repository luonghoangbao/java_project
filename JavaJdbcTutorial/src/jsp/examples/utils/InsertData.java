package jsp.examples.utils;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertData {

	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		// TODO Auto-generated method stub
		Connection connection  = ConnectionUtils.getMyConnection();
		Statement statement=connection.createStatement();
		try {
		String sql = "insert into news(id, category_id, name, description, detail, image, date, user_id) values ('800', '2', 'MBA', 'good', 'so good', '27', 'July 11,2017', '1')";
		System.out.println(sql);
		int rowCount = statement.executeUpdate(sql);
		System.out.println(rowCount);
		}catch(SQLException e) {
		  e.printStackTrace();
		}
	}
}

