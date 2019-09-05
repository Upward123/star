package com.weshare.service.impl;

import java.util.List;

import com.weshare.dao.CoursesDAO;
import com.weshare.entity.Courses;
import com.weshare.service.CoursesService;

public class CoursesServiceImpl implements CoursesService {

	CoursesDAO coursesDAO;
	
	

	public void setCoursesDAO(CoursesDAO coursesDAO) {
		this.coursesDAO = coursesDAO;
	}

	@Override
	public void addCourses(Courses course) {
		// TODO Auto-generated method stub
		coursesDAO.addCourses(course);
	}

	@Override
	public void removeCourses(Courses course) {
		// TODO Auto-generated method stub
		coursesDAO.removeCourses(course);

	}

	@Override
	public void modifyCourses(Courses course) {
		// TODO Auto-generated method stub
		coursesDAO.modifyCourses(course);

	}

	// 模糊查询课程
	@Override
	public List getCoursesByName(String name) {
		// TODO Auto-generated method stub
		return coursesDAO.getCoursesByName(name);
	}
	
	// 模糊查询课程
		@Override
		public Courses getCoursesById(int id) {
			// TODO Auto-generated method stub
			List<Courses> tar = coursesDAO.getCoursesById(id);
			if(!tar.isEmpty()){return  tar.get(0);}
			return null;
		}


}
