package bank.managment;

import java.sql.*;

public class Conn {
	
	Connection c;
	Statement st;
	public Conn()
	{
		try {
			c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","2309");
			st=c.createStatement();
		}
		catch (Exception e) {
			System.out.println(e);
		
		}
	}

}
