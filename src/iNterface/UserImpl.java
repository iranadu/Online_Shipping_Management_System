package iNterface;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.User;
import dbConnection.DbConnection;




public class UserImpl implements IUser{
	public int stat;
	static Connection con;
	static PreparedStatement ps;
	@Override
	public void addUser(User u) {

		
		try {

			con= DbConnection.getDBConnection();
			ps=con.prepareStatement("insert into User values(?,?,?,?)");
			ps.setString(2, u.getUser_Name());
			ps.setString(4, u.getUser_Password());
			ps.setString(3, u.getUser_Address());
			ps.setInt(1, u.getUser_id());
			ps.execute();
			con.close();



		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	



	@Override
	public boolean Login(User User) {
		
		Connection con;
		PreparedStatement ps;
		User u = new User();
		
		
		try {
			
		con = DbConnection.getDBConnection();
		ps = con.prepareStatement("select *from User where User_Name= '?' and User_Password='?' ");
		ps.setString(1,  User.User_Name);
		ps.setString(2,  User.User_Password);

		ResultSet rs = ps.executeQuery();
		
		u.setUser_Name(rs.getString(2));
		u.setUser_Password(rs.getString(4));
		}
		catch (SQLException  | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		if(u.User_Name == User.User_Name && u.User_Password == User.User_Password )
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
		}
	}

