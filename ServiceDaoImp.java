package com.capgemini.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.capgemini.pojo.Login;

public class ServiceDaoImp implements ServiceDao{

	@Override
	public boolean isValidUser(Login login) {
		boolean flag=false;
		String sql="select * from login where username=? and pass=?";
		try {
			PreparedStatement pst=getConnection().prepareStatement(sql);
			
			pst.setString(1, login.getUserName());
			pst.setString(2, login.getPassWord());
			
			ResultSet rs=pst.executeQuery();
			if(rs.next())
				flag=true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
	public Connection getConnection()
	 {
Connection con=null;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/classroom","root","India123");
		 
		     } 
			catch (ClassNotFoundException e) 
			{
			 
			 e.printStackTrace();
		    }
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
		 
		 return con;
	 }

}
