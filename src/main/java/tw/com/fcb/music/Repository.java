package tw.com.fcb.music;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Repository {


	
	public Connection getConnection() throws SQLException{
		String dbUrl = "jdbc:mysql://localhost:3306/music";
		String username = "root";
		String passward = "root";
		Connection connection = DriverManager.getConnection(dbUrl, username, passward);	
		return connection;		
	}

	
	public int insert(Music music) throws SQLException{		
		Connection conn = this.getConnection();
		Statement stmt = conn.createStatement();
		String sqlCmd = "insert into album values ("
				+ "'"+music.getCode()+"',"
				+ "'"+music.getName()+"',"
				+ "'"+music.getSingerName()+"',"
				+ "'"+music.getPrice()+"'"
				+")";
		System.out.println(sqlCmd);
		stmt.executeUpdate(sqlCmd);
        return -1;
	}
	
	public void select() throws SQLException{		
		Connection conn = this.getConnection();
		Statement stmt = conn.createStatement();
		String sqlCmd = "select * from  album";	
		System.out.println(sqlCmd);
		ResultSet resultSet = stmt.executeQuery(sqlCmd);
		while(resultSet.next()) {
			String a = resultSet.getString("code");
			String b = resultSet.getString("name");
			String c = resultSet.getString("singerName");
			int d = resultSet.getInt("price");
			System.out.println(a+ " " + b + " " +c+ " " +d);
		}
	}
	
	public Music getBycode(String code) throws SQLException{		
		Connection conn = this.getConnection();
		Statement stmt = conn.createStatement();
		String sqlCmd = "select * from  album  where code = '"+code+"'";
		
		
		//String sqlCmd = "select * from  album  where code = ?";
		//PreparedStatement pstmt = conn.prepareStatement(sqlCmd);
		//pstmt.setString(1,"1"); 
		//ResultSet resultSet = pstmt.executeQuery();
		//123456
		
		System.out.println(sqlCmd);
		ResultSet resultSet = stmt.executeQuery(sqlCmd);
        Music music = new Music();
        while(resultSet.next()) {
        	music.setCode(resultSet.getString("code"));
        	music.setName(resultSet.getString("name"));
        	music.setSingerName(resultSet.getString("singerName"));
        	music.setPrice(resultSet.getInt("price"));
        }
        
        return music;
	}
	
	
	public int delete(String code) throws SQLException{		
		Connection conn = this.getConnection();
		Statement stmt = conn.createStatement();
		String sqlCmd = "delete from  album  where code = '"+code+"'";
		System.out.println(sqlCmd);
		stmt.executeUpdate(sqlCmd);
        return -1;
	}
}
