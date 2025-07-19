package com.vcube.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.vcube.dbconnection.DbConnection;
import com.vcube.dto.Dto;

public class DaoLayer implements DaoInterface {
static Connection con;
	@Override
	public String insertValues(Dto dt) {
		// TODO Auto-generated method stub
		String status="Fail";
		try {
		DbConnection db= new DbConnection();
		con=db.getConnection();
		PreparedStatement ps = con.prepareStatement("insert into studnent2(FirstName,UserName,PassWord) values(?,?,?)");
	ps.setString(1,dt.getFirstName());
	ps.setString(2,dt.getUserName());
	ps.setString(3,dt.getPassword());
	int n= ps.executeUpdate();
	if (n>0) {
		return status="true";
	}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		return status;
		
		
	}

}
