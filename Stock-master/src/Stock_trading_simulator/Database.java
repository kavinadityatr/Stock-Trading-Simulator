package Stock_trading_simulator;
import java.sql.*;
public class Database {
	
	private Connection con;
	
	Database()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stocks","root","kavin053");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Database.java"+e.getCause());
		}
	}
	public Connection getConnection()
	{
		return con;
	}
}
