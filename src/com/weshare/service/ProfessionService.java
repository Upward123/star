package com.weshare.service;

import java.util.List;

import com.weshare.entity.Profession;

// 版本v1.0 不考虑管理员系统，我们只提供有限的操作
public interface ProfessionService {

	// 增加专业
	public void addProfession(Profession pro);
	
	// 获取所有的专业
	public List getAllProfession();
	
}
