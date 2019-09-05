package com.weshare.dao;

import java.util.List;

import com.weshare.entity.*;

public interface UsersDAO {
	public List<Users> search(Users cond);
}
