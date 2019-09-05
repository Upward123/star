package com.weshare.dao.impl;

import java.util.List;

import com.weshare.dao.FileDAO;
import com.weshare.entity.Courses;
import com.weshare.entity.FileCdut;
import com.weshare.entity.Profession;

public class FileCdutDAOImpl extends BaseDaoImpl implements FileDAO {

	// 新增资料
	@Override
	public void addFile(FileCdut file) {
		super.save(file);
	}

	// 删除资料
	@Override
	public void removeFile(FileCdut file) {
		super.delete(file);
	}

	// 修改资料
	@Override
	public void modifyFile(FileCdut file) {
		super.updata(file);
	}

	// 根据课程号查找资料
	@Override
	public List getFileListByCourseId(int id) {
		String hqlString1 = "from FileCdut f where f.courses.CId="+id;
		return super.find(hqlString1);
	}

	// 通过资料名搜索资料数据（模糊查询）
	@Override
	public List getFileListByName(String inputName) {
		String hqlString="from FileCdut as f where f.FileName like '%"+inputName+"%'";
		System.out.println("搜索内容："+hqlString);
		return super.find(hqlString);
	}
	@Override
	public List getFileListByFileNameAndContributor(String fileName, String Contributor) {
	
		String hqlString1 = "from FileCdut as f where f.FileName like '%"+fileName+"%'";

		if(Contributor != null){
//			hqlString1="from FileCdut as f where f.FileName like '%"+fileName+"%'"+" and f.Contributor="+Contributor;
			hqlString1 += " and f.Contributor like '%"+Contributor+"%'";
		}
		return super.find(hqlString1);
	}

	
	// 通过文件Id获取到文件
	@Override
	public FileCdut getFileById(int id) {
		return (FileCdut)super.get(FileCdut.class, id);
	}

}
