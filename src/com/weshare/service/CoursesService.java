package com.weshare.service;

import java.util.List;

import com.weshare.entity.Courses;

public interface CoursesService {

	// 新加课程
	public void addCourses(Courses course);
		
	// 删除课程
	public void removeCourses(Courses course);
		
	// 修改课程
	public void modifyCourses(Courses course);
		
	// 通过课程名查询课程（模糊查询）
	public List getCoursesByName(String name);
	
	// 通过课程id查找课程
	public Courses getCoursesById(int id);
}
