package com.weshare.service;

import com.weshare.entity.Records;

public interface RecordsService {
	
	// 向数据库新增记录
	public void addRecords(Records record);
	
	// 删除数据库的记录
	public void removeRecords(Records record);

}
