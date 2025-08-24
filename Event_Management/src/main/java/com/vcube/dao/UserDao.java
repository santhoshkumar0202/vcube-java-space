package com.vcube.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.vcube.dto.UserDto;
import com.vcube.utill.dbconnection.GetConnection;

public class UserDao implements UserDaoInterface {



	@Override
	public String insertToUserDb(UserDto dt) {
		// TODO Auto-generated method stub
		String status="fail";
		try {
			Connection con=GetConnection.getConnection();
			PreparedStatement ps= con.prepareStatement("insert into users(name,email,password,phone) values(?,?,?,?)" );
			ps.setString(1, dt.getName());
			ps.setString(2, dt.getEmail());
			ps.setString(3, dt.getPassword());
			ps.setLong(4, dt.getPhone());
//			ps.setString(5, null);
			
			int n=ps.executeUpdate();
			
			if(n>0) {
				
				return status="success";
			}
			
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		return status;
	}

	@Override
	public String updateToUserDb(UserDto dt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUserDetails(UserDto dt) {
		// TODO Auto-generated method stub
		return null;
	}

}
