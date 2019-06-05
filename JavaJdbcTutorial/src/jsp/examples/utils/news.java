package jsp.examples.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class news {
	private static final Connection String = null;
	private int id;
	private int category_id;
	private String description;
	private String name;
	private String detail;
	private String image;
	private Date date;
	private int user_id;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<news> newsList = new ArrayList<news>();
		Connection conn= null;
		  /*try {
			  //conn = getMyConnection();
			  String sql = "select * from news" ;
			  Statement statement = conn.createStatement();
			  ResultSet rs = statement.executeQuery(sql);
			  while(rs.next()) {
				  news news1 = new news();
				  int id = rs.getInt("id");
				  String name = rs.getString("name");
				  Date date = (Date) rs.getDate("date");
				  //news.setId("id");
				  //news.setName("name");
				  //news.setDate("date");
				  }
		  	} 
	}*/
}
}

