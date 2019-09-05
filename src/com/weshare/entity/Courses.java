package com.weshare.entity;

import java.util.HashSet;
import java.util.Set;

public class Courses {
	private Integer	 CId;			//课程号
	private String CCode;			//课程代码
	private String CName;			//课程名
	private String CourseImg;		//课程图片名
	
	private Profession profession;	//定义一个专业对象
	//对资料方（多方）创建一个set对象
	private Set<FileCdut> file = new HashSet<FileCdut>();
	
	public Integer getCId() {
		return CId;
	}
	public void setCId(Integer cId) {
		CId = cId;
	}
	public String getCCode() {
		return CCode;
	}
	public void setCCode(String cCode) {
		CCode = cCode;
	}
	public String getCName() {
		return CName;
	}
	public void setCName(String cName) {
		CName = cName;
	}
	public String getCourseImg() {
		return CourseImg;
	}
	public void setCourseImg(String courseImg) {
		CourseImg = courseImg;
	}
	
	public Profession getProfession() {
		return profession;
	}
	public void setProfession(Profession profession) {
		this.profession = profession;
	}
	public Set<FileCdut> getFile() {
		return file;
	}
	public void setFile(Set<FileCdut> file) {
		this.file = file;
	}
	
	public Courses(){
	}
	public Courses(String cCode,String cName,String courseImg){
		this.CCode = cCode;
		this.CName = cName;
		this.CourseImg = courseImg;
	}
	public Courses(String cCode,String cName,String courseImg,Set<FileCdut> file){
		this.CCode = cCode;
		this.CName = cName;
		this.CourseImg = courseImg;
		this.file = file;
	}
	//将Courses对象和资料信息File关联起来
	public Set<FileCdut> addFile(FileCdut f){
		this.getFile().add(f);
		return file;
	}
	@Override
	public String toString() {
		return "Courses [CId=" + CId + ", CCode=" + CCode + ", CName=" + CName + ", CourseImg=" + CourseImg + "]";
	}
	
}
