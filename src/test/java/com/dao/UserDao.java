package com.dao;

public class UserDao {
	
	static UserDao userDao = null;

	public static UserDao getUserDao() {
	
		if(userDao == null){
			userDao = new UserDao();
		}
		
		return userDao;
	}

}
