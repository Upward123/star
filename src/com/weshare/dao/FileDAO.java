package com.weshare.dao;

import java.util.List;

import com.weshare.entity.FileCdut;

public interface FileDAO {
	
	// 新增资料
	public void addFile(FileCdut file);
	
	// 删除资料
	public void removeFile(FileCdut file);
	
	// 修改资料
	public void modifyFile(FileCdut file);
	
	// 根据课程号查找资料
	public List getFileListByCourseId(int id);
	
	// 通过资料名搜索资料数据（模糊查询）
	public List getFileListByName(String inputName);
	
	// 通过资料名（模糊）+贡献者名字搜索资料
	public List getFileListByFileNameAndContributor(String fileName, String Contributor);
	
	// 通过文件Id获取到文件
	public FileCdut getFileById(int id);
	
}
