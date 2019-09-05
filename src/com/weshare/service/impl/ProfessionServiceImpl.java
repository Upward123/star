package com.weshare.service.impl;

import java.util.List;

import com.weshare.dao.ProfessionDAO;
import com.weshare.entity.Profession;
import com.weshare.service.ProfessionService;

public class ProfessionServiceImpl implements ProfessionService {

	ProfessionDAO proDAO;

	public void setProDAO(ProfessionDAO proDAO) {
		this.proDAO = proDAO;
	}

	// 增加专业
	@Override
	public void addProfession(Profession pro) {
		// TODO Auto-generated method stub
		proDAO.addProfession(pro);

	}
	
	// 增加专业
		@Override
		public List getAllProfession() {
			// TODO Auto-generated method stub
			//proDAO.addProfession(pro);
			return proDAO.getAllProfessions();
			
		}

}
