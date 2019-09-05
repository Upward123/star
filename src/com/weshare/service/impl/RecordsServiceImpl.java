package com.weshare.service.impl;

import com.weshare.dao.RecordsDAO;
import com.weshare.entity.Records;
import com.weshare.service.RecordsService;

public class RecordsServiceImpl implements RecordsService {

	RecordsDAO recordsDAO;
	


	public void setRecordsDAO(RecordsDAO recordsDAO) {
		this.recordsDAO = recordsDAO;
	}

	@Override
	public void addRecords(Records record) {
		// TODO Auto-generated method stub
		recordsDAO.addRecords(record);

	}

	@Override
	public void removeRecords(Records record) {
		// TODO Auto-generated method stub
		recordsDAO.removeRecords(record);

	}

}
