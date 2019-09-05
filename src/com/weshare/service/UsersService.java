package com.weshare.service;

import java.util.List;

import com.weshare.entity.Users;

public interface UsersService {
	public List<Users> login(Users cond);
}
