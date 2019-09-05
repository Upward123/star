package com.weshare.interceptor;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.weshare.entity.User;
public class AuthorityInterceptor extends AbstractInterceptor{
	@Override
	public String intercept(ActionInvocation invocation) throws Exception{
		Map session=invocation.getInvocationContext().getSession();
		if(session==null){
			return "login";
		}else{
			User user=(User) session.get("user");
			if(user==null){
				return "login";
			}else{
				return invocation.invoke();
			}
		}
	}
}
