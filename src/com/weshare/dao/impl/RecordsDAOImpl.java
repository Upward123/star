package com.weshare.dao.impl;

import com.weshare.dao.RecordsDAO;
import com.weshare.entity.Records;

public class RecordsDAOImpl extends BaseDaoImpl implements RecordsDAO {

	// 向数据库新增记录
	@Override
	public void addRecords(Records record) {
		super.save(record);
	}

	// 删除数据库的记录
	@Override
	public void removeRecords(Records record) {
		super.delete(record);
	}

}
