package com.weshare.action;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.weshare.entity.Courses;
import com.weshare.entity.FileCdut;
import com.weshare.entity.Records;
import com.weshare.entity.User;
import com.weshare.service.UserService;

/*
 * 用户动作
 * 处理动作包括：
 * 	(1)doLogin() 传入用户名以及密码（封装在user中），判断用户是否存在
 * 		a、存在则进入首页index，并将登录信息存到session（查资料明确如何记录登录信息）
 * 		b、不存在则再次回到登录页面login
 * 	(2)doRegister() 将当前注册用户存入数据库 返回到login
 * 	(3)showUser() 检查是否登录
 * 		a、未登录在则进入登录页面login.jsp
 * 		b、登录则直接进入user.jsp
 * 	(4)movetoModify() modifyUser() 修改资料
 * 	(5)quit()		退出登录，清除登录信息
 */
public class UserAction extends ActionSupport
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

	User user;		// 封装用户信息
	UserService userService;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public void setUserService(UserService userService){
		this.userService=userService;
	}

	/* ------------Action----------------*/
	
	// 登录验证
	public String doLogin() throws Exception
	{
		
		System.out.println("Lin98密码："+user.getPassword());
		System.out.println("line90账户："+user.getAccount());
		List list=null;
		//根据用户名获取数据库中匹配的相应的用户对象
		list=userService.getUserByLoginAccount(user.getAccount());
		
		if(list.size()>0)  //判断账号是否存在
		{
			User validUser = (User)list.get(0);
			System.out.println("数据库内容："+validUser);
			
			//判断密码是否正确
			if(user.getPassword().equals(validUser.getPassword()))
			{
				System.out.println("好了好了");
				//验证通过，将用户信息存入session
				session.put("user",validUser);
				session.put("userName",validUser.getUserName());
			}
			else
			{
				System.out.println("密码真正不对");
				this.addFieldError("user.Password","*密码不正确!");
				return "login";     //返回登录页重新进行登录 
			}
		}
		else      //账号不存在
		{
			this.addFieldError("user.Account", "*账号不存在!");
			return"login";     //返回登录页重新进行登录
		}
		return "success";     //登陆成功进入首页
	}

	// 注册,将注册和strusts结合起来，使表单数据直接注入到user中，这里保存到数据库即可
	public String doRegister()
	{
		List list=null;
		//根据用户名获取数据库中匹配的相应的用户对象
		list=userService.getUserByLoginAccount(user.getAccount());
		if(list.size()>0)    //判断账号是否存在，若已存在则不能注册!
		{
			this.addFieldError("user.Account", "*该账号已存在!");
			return "input";
		}
		else{
			HttpServletRequest request = ServletActionContext.getRequest();
			String re_password=request.getParameter("re_Password");
			if(!(user.getPassword().equals(re_password)))
			{
				this.addFieldError("re_password", "*两次密码不一致!");
				return "input";
			}
			else
			{
				user.setPoint(50);
				userService.addUser(user);
			}
		return "login";
		}
	}
	
	// 展示个人中心，先判断是否登录
	public String showUser()
	{
		User user1;
		user1=(User)session.get("user");  //从session中取出已登录的用户的信息
		if(user1!=null){
			List<User> uList=new ArrayList<User>();
			uList.add(user1);    //将用户信息存入列表
			request.put("uList",uList);   //将列表存入request，以便能在前台获取到用户的信息
			List<Records> rList=new ArrayList(user1.getRecords());
			request.put("rList",rList);
		}
		
		return "person";
	}
	
	// 修改用户信息,跟新数据库、跳回个人中心
	public String moveTomodify(){ return "modifyUser";}
	public String modifyUser()
	{
		return "user";
	}
	
	//点击登录按钮先要验证是否已经登录，已登录则弹出提示框，在struts.xml中配置该方法
	public String judge(){
		session.put("tips","<script>alert('请勿重复登录!')</script>");
		return "index";
	}

	
	// 将用户登录信息抹掉，返回主页面
	public String quitLog(){
		ActionContext ac = ActionContext.getContext();
		Map session = ac.getSession();
		session.clear();
		return "index";
		
	}
}
