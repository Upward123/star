package com.weshare.dao.impl;

import java.util.List;

import com.weshare.dao.UserDAO;
import com.weshare.entity.User;

public class UserDAOImpl extends BaseDaoImpl implements UserDAO {

	
	@Override
	public User getUserById(int  id) {
		String hqlString="from User where UId="+id;
		List<User>	userL =  super.find(hqlString);
		if(!userL.isEmpty()) return userL.get(0);
		return null;
	}
	
	// 通过用户名获取用户对象
	@Override
	public List getUserByLoginAccount(String userAccount) {
		String hqlString="from User where Account= ?";
		Object[] param = new Object[]{userAccount};
		return super.find(hqlString, param);
	}

	// 增加用户到数据库
	@Override
	public void addUser(User user) {
		super.save(user);
	}

	// 修改数据库里面的用户信息
	@Override
	public void modifyUser(User user) {
		super.updata(user);
	}

}
