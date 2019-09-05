package com.weshare.service.impl;

import java.util.List;

import com.weshare.dao.FileDAO;
import com.weshare.entity.FileCdut;
import com.weshare.service.FileCdutService;

public class FileCdutServiceImpl implements FileCdutService {

	FileDAO fileDAO;
	
	public void setFileDAO(FileDAO fileDAO) {
		this.fileDAO = fileDAO;
	}

	@Override
	public void addFile(FileCdut file) {
		// TODO Auto-generated method stub
		fileDAO.addFile(file);

	}

	@Override
	public void removeFile(FileCdut file) {
		// TODO Auto-generated method stub
		fileDAO.removeFile(file);

	}
	
	@Override
	public void modifyFile(FileCdut file){
		fileDAO.modifyFile(file);
	}

	// 通过课程号查找文件列
	@Override
	public List getFileListByCourseId(int courseId) {
		// TODO Auto-generated method stub
		return fileDAO.getFileListByCourseId(courseId);
	}

	// 通过文件名id获取文件
	@Override
	public FileCdut getFileByFileId(int id) {
		// TODO Auto-generated method stub
		return fileDAO.getFileById(id);
	}

	// 根据用户输入模糊查找文件
	@Override
	public List getFileListByName(String inputName) {
		// TODO Auto-generated method stub
		return fileDAO.getFileListByName(inputName);
	}
	
	@Override
	public List getFileListByFileNameAndContributor(String fileName, String contributor) {
		// TODO Auto-generated method stub
		return fileDAO.getFileListByFileNameAndContributor(fileName, contributor);
	}
	
}
