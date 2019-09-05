package com.weshare.action;

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
import com.weshare.entity.Profession;
import com.weshare.entity.Users;
import com.weshare.service.UsersService;


import com.weshare.entity.Courses;
import com.weshare.entity.FileCdut;
import com.weshare.entity.Profession;
import com.weshare.entity.User;

public class UsersAction extends ActionSupport
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
	
	Users u;

	public Users getU() {
		return u;
	}

	public void setU(Users u) {
		this.u = u;
	}

	UsersService usersService;

	public void setUsersService(UsersService usersService) {
		this.usersService = usersService;
	}

	public String doLogins2() throws Exception {
		/*List<Users> uList = usersService.login(u);
		if (uList.size() > 0) {
			return "index";
		} else {

			return "login";
		}
	}*/
		Courses course1 = new Courses("course1", "s1", "d1");
		Courses course2 = new Courses("course2", "s2", "d1");
		Courses course3 = new Courses("course3", "s3", "d");
		
		Set<Courses> cl = new HashSet<Courses>();
		cl.add(course1);
		cl.add(course2);
		cl.add(course3);
		
		Profession pro1 = new Profession("p1", "name1");
		Profession pro2 = new Profession("p2", "name1");
		Profession pro3 = new Profession("p3", "name1");
		
		pro1.setCourses(cl);
		pro2.setCourses(cl);
		pro3.setCourses(cl);
		
		
		Set<Profession> p1 = new HashSet<Profession>();
		p1.add(pro1);
		p1.add(pro2);
		p1.add(pro3);
		//System.out.print(p1);
		request.put("ProList", p1);
		return "index";
		
	}
}
