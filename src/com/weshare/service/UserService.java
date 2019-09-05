package com.weshare.service;

import java.util.List;

import com.weshare.entity.User;

public interface UserService {
	
	// 通过用户id获取用户
	public User getUserById(int  id);
	
	// 通过用户名获取用户对象
	public List getUserByLoginAccount(String userAccount);
		
	// 增加用户到数据库
	public void addUser(User user);
		
	// 修改数据库里面的用户信息
	public void modifyUser(User user);

}
