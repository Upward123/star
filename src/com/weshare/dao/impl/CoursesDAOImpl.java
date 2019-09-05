package com.weshare.dao.impl;

import java.util.List;

import com.weshare.dao.CoursesDAO;
import com.weshare.entity.Courses;
import com.weshare.entity.Profession;

public class CoursesDAOImpl extends BaseDaoImpl implements CoursesDAO {

	// 新加课程
	@Override
	public void addCourses(Courses course) {
		super.save(course);
	}

	// 删除课程
	@Override
	public void removeCourses(Courses course) {
		super.delete(course);
	}

	// 修改课程
	@Override
	public void modifyCourses(Courses course) {
		super.updata(course);
	}

	// 通过课程名查询课程（模糊查询）
	@Override
	public List getCoursesByName(String name) {
		String hqlString1="from Courses where CName= ?";
		Object[] param = new Object[]{name};
		return super.find(hqlString1, param);
	}
	
	// 通过专业id查找课程列表
	@Override
	public List getCourseByProfessionId(int id) {
		String hqlString2 = "from Courses c where c.Profession.PId="+id;
		return super.find(hqlString2);
	}

	// 通过专业id查找课程
		@Override
		public List getCoursesById(int id) {
			String hqlString2 = "from Courses c where c.CId="+id;
			return super.find(hqlString2);
		}
	
}
