package com.weshare.service.impl;

import java.util.List;

import com.weshare.dao.UsersDAO;
import com.weshare.entity.Users;
import com.weshare.service.UsersService;

public class UsersServiceImpl implements UsersService {

	UsersDAO usersDAO;

	public void setUsersDAO(UsersDAO usersDAO) {
		this.usersDAO = usersDAO;
	}

	@Override
	public List<Users> login(Users cond) {
		return usersDAO.search(cond);
	}

}
