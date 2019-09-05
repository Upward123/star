package com.weshare.dao.impl;

import java.util.List;

import com.weshare.dao.ProfessionDAO;
import com.weshare.entity.Profession;

public class ProfessionDAOImpl extends BaseDaoImpl implements ProfessionDAO {

	// 增加专业
	@Override
	public void addProfession(Profession pro) {
		super.save(pro);
	}

	// 删除专业
	@Override
	public void removeProfession(Profession pro) {
		super.delete(pro);
	}

	// 修改专业
	@Override
	public void modifyProfession(Profession pro) {
		super.updata(pro);
	}

	// 通过专业名搜索专业(模糊查询)
	@Override
	public List getProfessionByName(String ProName) {
		String hqlString1="from Profession where PName=?";
		Object[] param = new Object[]{ProName};
		return super.find(hqlString1, param);
	}

	// 通过专业号搜索专业
	@Override
	public Profession getProfessionById(int id) {
		return (Profession)super.get(Profession.class, id);
	}

	//查询所有专业
	public List getAllProfessions(){
		String hqlString2="from Profession";
		return super.find(hqlString2);
	}
}
