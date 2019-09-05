package com.weshare.entity;

import java.util.HashSet;
import java.util.Set;

public class Profession {
	private Integer PId;	//专业号
	private String PCode;	//专业代码
	private String PName;	//专业名
	//对课程方（多方）创建一个set对象
	private Set<Courses> courses = new HashSet<Courses>();

	public Integer getPId() {
		return PId;
	}

	public void setPId(Integer pId) {
		PId = pId;
	}

	public String getPCode() {
		return PCode;
	}

	public void setPCode(String pCode) {
		PCode = pCode;
	}

	public String getPName() {
		return PName;
	}

	public void setPName(String pName) {
		PName = pName;
	}

	public Set<Courses> getCourses() {
		return courses;
	}

	public void setCourses(Set<Courses> courses) {
		this.courses = courses;
	}
	
	public Profession(){
	}
	public Profession(String pCode,String pName){
		this.PCode = pCode;
		this.PName = pName;
	}
	public Profession(String pCode,String pName,Set<Courses> courses){
		this.PCode = pCode;
		this.PName = pName;
		this.courses = courses;
	}
	
	public Set<Courses> addCourses(Courses C){
		this.getCourses().add(C);
		return courses;
	}

	@Override
	public String toString() {
		return "Profession [PId=" + PId + ", PCode=" + PCode + ", PName=" + PName + ", courses=" + courses + "]";
	}
	
}
