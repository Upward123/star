package com.weshare.action;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.weshare.entity.Courses;
import com.weshare.entity.FileCdut;
import com.weshare.entity.Profession;
import com.weshare.entity.WeShareUtils;
import com.weshare.service.CoursesService;
import com.weshare.service.FileCdutService;
import com.weshare.service.ProfessionService;

/*
 * 当前版本v.1.0，未考虑管理员系统，不做专业以及课程管理
 * 
 * 课程动作
 * 处理动作包括：
 * 	(0)weShare() 根据目前选择的专业(将给出默认专业)，将对应的课程信息发回index.jsp
 * 	(1)showFiles() 通过传入课程的名字，返回该课程下的资料列表给files.jsp展示信息
 * 	
 */
public class ShareShowAction extends ActionSupport
		implements RequestAware, ServletRequestAware, SessionAware, ServletResponseAware {

	Map<String, Object> request;
	HttpServletRequest req;
	Map<String, Object> session;
	HttpServletResponse resp;
	
	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}

	@Override
	public void setServletRequest(HttpServletRequest req) {
		this.req = req;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	@Override
	public void setServletResponse(HttpServletResponse resp) {
		this.resp = resp;
	}
	
	/* ------------Action----------------*/
	ProfessionService professionService;

	public void setProfessionService(ProfessionService professionService) {
		this.professionService = professionService;
	}

	FileCdutService fileService;
	public void setFileService(FileCdutService fileService) {
		this.fileService = fileService;
	}
	
	// 启动主页时，将课程列表数据注入到页面中
	public String weShare()
	{
		
		/*// 注入测试数据
		List<Profession> proList =WeShareUtils.getTest();
		for(int i=0; i<proList.size(); i++){
			professionService.addProfession(proList.get(i));
		}*/
		
		
		// 查询到所以的专业
		List <Profession> professionList = professionService.getAllProfession();

		// 找到每个专业的第一个课程，得到课程列表
		if(!professionList.isEmpty()){
			request.put("ProfessionList", professionList);
			Set <Courses> courseList = new HashSet<Courses>();
			for(int i=0;i<professionList.size(); i++){
				Profession proFirst = professionList.get(i);
				List CoursesListT = new ArrayList(proFirst.getCourses());
				if(!CoursesListT.isEmpty()){
					courseList.add((Courses)CoursesListT.get(0));
				}
			}
			request.put("CourseList", courseList);
		}
		
		// 准备文件数据
		List<FileCdut>	fileList = fileService.getFileListByName(".");
		if(!fileList.isEmpty()){
			
			request.put("FileList", fileList);
			
		}
		
		return "weshare";
	}

	
	Courses course;			// 课程实体，用于封装页面传入课程信息参数
	public Courses getCourse() {
		return course;
	}

	public void setCourse(Courses course) {
		this.course = course;
	}
	

	CoursesService coursesService;
	
	public void setCoursesService(CoursesService coursesService) {
		this.coursesService = coursesService;
	}

	// 根据具体的课程名，将资料列表获取出来，返回给files.jsp
	public String showFiles()
	{
		course = coursesService.getCoursesById(course.getCId());
		if(course!=null){
			List <FileCdut> fileList = fileService.getFileListByCourseId(course.getCId());
			request.put("detailName", course.getCName());
			request.put("fileList", fileList);
			
		}
		
		return "files";
		
	}
	

}
