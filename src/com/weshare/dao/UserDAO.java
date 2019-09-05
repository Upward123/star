package com.weshare.dao;

import java.util.List;

import com.weshare.entity.User;

public interface UserDAO {
	
	// 通过用户id获取到用户对象
	public User	getUserById(int id);
	
	// 通过用户名获取用户对象
	public List getUserByLoginAccount(String userAccount);
	
	// 增加用户到数据库
	public void addUser(User user);
	
	// 修改数据库里面的用户信息
	public void modifyUser(User user);
	
}
