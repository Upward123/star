<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri='/struts-tags' prefix='s'%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<%
    /* 如果已经登陆则弹出tips消息提示框 */
    String tips=(String)session.getAttribute("tips");
    if(tips!=null)
    {
        out.print(tips);
        session.removeAttribute("tips");
    }
 %>
 <%
    /* 如果已经登陆则弹出tips消息提示框 */
    String warning=(String)session.getAttribute("warning");
    if(warning!=null)
    {
        out.print(warning);
        session.removeAttribute("warning");
    }
 %>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'daohang.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="common-css/nav.css">


  </head>
  
  <body>
    <!-- 导航栏开始 -->
	<div class="nav-box">
		<div class="nav">
			<div class="nav-body">
				<!-- 标题 -->
				<ul class="nav-left">
					<li>STAR资料查询</li>
				</ul>
				<!-- 导航栏右边 -->
				<ul class="nav-right">
					<li><img src="images/myself_03.png" alt="">
					<!-- 对个人中心的显示，若已经登录则显示用户名 -->     
					<a id="person-name" href="/weshare/showUser">个人中心</a></li>
					<li><a href="regist.jsp">注册</a></li>
					<li>|</li>
					<li><a href="/weshare/judge">登录</a></li>
				</ul>
			</div>
		</div>
	</div>
	<!-- 导航栏结束 -->
	
	<script type="text/javascript">
		function myfunc(){　　 
        	var u = "<%=session.getAttribute("user")%>";
        	console.log(u);
        	if (u !== "null") {
        		document.getElementById("person-name").innerHTML="<%=session.getAttribute("userName")%>";
        		console.log("<%=session.getAttribute("userName")%>");
        		console.log(document.getElementById("person-name").innerHTML);
        	}　　
        	if(u == "null" ) {
        		document.getElementById("person-name").innerHTML="个人中心";
        		console.log("<%=session.getAttribute("userName")%>");
        		console.log(document.getElementById("person-name").innerHTML);
        	}
   		 }　
    /*用window.onload调用myfun()*/　
    　
    // 不要括号
    window.onload = myfunc;
	
	</script>

  </body>
</html>
