package com.capgemini.Dao;

import com.capgemini.pojo.Login;

public interface ServiceDao {
	public boolean isValidUser(Login login);
}
