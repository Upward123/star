package com.weshare.dao;

import java.util.List;

import com.weshare.entity.Courses;

public interface CoursesDAO {
	
	// 新加课程
	public void addCourses(Courses course);
	
	// 删除课程
	public void removeCourses(Courses course);
	
	// 修改课程
	public void modifyCourses(Courses course);
	
	// 通过课程名查询课程（模糊查询）
	public List getCoursesByName(String name);
	
	// 通过专业id查找课程列表
	public List getCourseByProfessionId(int id);
	
	// 通过id获取到课程名
	public List getCoursesById(int id);
}
