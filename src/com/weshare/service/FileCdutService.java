package com.weshare.service;

import java.util.List;

import com.weshare.entity.FileCdut;

public interface FileCdutService {
	
	// 新增资料
	public void addFile(FileCdut file);
	
	// 删除资料
	public void removeFile(FileCdut file);
	
	// 修改资料
	public void modifyFile(FileCdut file);
	
	// 根据课程号，返回资料列表
	public List getFileListByCourseId(int courseId);
	
	// 通过file的文件id查找file
	public FileCdut getFileByFileId(int id);
	
	// 通过文件名模糊查询文件列表
	public	List getFileListByName(String inputName);
	
	// 通过文件名（模糊）和贡献者名字查找资料
	public	List getFileListByFileNameAndContributor(String fileName, String contributor);
	
}
