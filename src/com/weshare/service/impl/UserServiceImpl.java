package com.weshare.service.impl;

import java.util.List;

import com.weshare.dao.UserDAO;
import com.weshare.entity.User;
import com.weshare.service.UserService;

public class UserServiceImpl implements UserService {

	UserDAO userDAO;
	
	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	@Override
	public User getUserById(int  id){
		
		return userDAO.getUserById(id);
	}
	
	@Override
	public List getUserByLoginAccount(String userAccount) {
		// TODO Auto-generated method stub
		return userDAO.getUserByLoginAccount(userAccount);
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userDAO.addUser(user);

	}

	@Override
	public void modifyUser(User user) {
		// TODO Auto-generated method stub
		userDAO.modifyUser(user);

	}

}
