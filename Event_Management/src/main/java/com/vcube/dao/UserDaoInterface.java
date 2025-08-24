package com.vcube.dao;

import com.vcube.dto.UserDto;

public interface UserDaoInterface {

	public  String insertToUserDb(UserDto dt);
	public  String updateToUserDb(UserDto dt);
	public  String getUserDetails(UserDto dt);
	
}
