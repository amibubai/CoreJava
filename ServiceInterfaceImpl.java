package com.capgemini.service;


import com.capgemini.Dao.ServiceDao;
import com.capgemini.Dao.ServiceDaoImp;
import com.capgemini.pojo.Login;

public class ServiceInterfaceImpl implements ServiceInterface
{
	ServiceDao serviceDao=new ServiceDaoImp();
	@Override
	public boolean isValidUser(Login login) 
	{
		return serviceDao.isValidUser(login);
	}
}
 

 
 