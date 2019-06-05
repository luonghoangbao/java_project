package jsp.examples.utils;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement; 
import jsp.examples.utils.ConnectionUtils;
	import java.util.Scanner;

	public class InsertUpdateDeleteDataTest {
		public static Scanner scanner = new Scanner(System.in);
		
	  public static void main(String[] args) throws ClassNotFoundException,
	          SQLException {
		  Connection connection = ConnectionUtils.getMyConnection();
	      Statement statement = connection.createStatement();
		  /*System.out.println("nhap ten can insert: ");
		  String name1 = scanner.nextLine();
		  System.out.println("Ten da insert:  "+ name1);
	      // Lấy ra kết nối tới cơ sở dữ liệu.
	      
	      
	      //INSERT
	      //Tuong tu voi update,delete
	      String sql = "insert into news values('1000', '2', "+"'"+name1+"'"+", 'showbiz_news2', 'good', '23', 'July 11,2017', '1')";
	      System.out.println(sql);
	      
	      // Thực thi câu lệnh.
	      // executeUpdate(String) sử dụng cho các loại lệnh Insert,Update,Delete.
	      int rowCount = statement.executeUpdate(sql);
	      System.out.println("Row Count affected = " + rowCount);*/
	      
	      //Update
	      System.out.println("nhap ten can update: ");
		  String name2 = scanner.nextLine();
		  System.out.println("Ten da update:  "+ name2);
	      String sql1 = " update news \r\n" + 
	    		  		" set name2 = "+"'" +name2+"'"+" \r\n" +
	    		  		" where id = '800' ";
	      System.out.println(sql1);
	      int rowCount1 = statement.executeUpdate(sql1);
	      System.out.println("Row Count affected = " + rowCount1);
	      // In ra số dòng được chèn vào bởi câu lệnh trên.		
	      /*Delete
		  System.out.println("nhap id can delete: ");
		  String id = scanner.nextInt();
		  System.out.println("Id da delete:  "+ id);
		  String sql2 = "delete from news \r\n" +
		  				" where id ="+"'" + id+ "'"+ ";";
		  System.out.println(sql2);
		  int rowCount2 = statement.executeUpdate(sql2);
	      System.out.println("Row Count affected = " + rowCount2);
	      */
		  }
}