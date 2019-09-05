package com.weshare.dao;

import com.weshare.entity.Records;

public interface RecordsDAO {
	
	// 向数据库新增记录
	public void addRecords(Records record);
	
	// 删除数据库的记录
	public void removeRecords(Records record);
	
}
