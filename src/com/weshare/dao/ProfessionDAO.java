package com.weshare.dao;

import java.util.List;

import com.weshare.entity.Profession;

public interface ProfessionDAO {

	// 增加专业
	public void addProfession(Profession pro);
	
	// 删除专业
	public void removeProfession(Profession pro);
	
	// 修改专业
	public void modifyProfession(Profession pro);
	
	// 通过专业名搜索专业(模糊查询)
	public List getProfessionByName(String ProName);
	
	// 通过专业号搜索专业
	public Profession getProfessionById(int id);
	
	//查询所有专业
	public List getAllProfessions();
}
