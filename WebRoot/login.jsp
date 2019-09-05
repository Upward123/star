<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri='/struts-tags' prefix='s'%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <link rel="stylesheet" href="common-css/common.css">
    <link rel="stylesheet" href="common-css/nav.css">
    <link rel="stylesheet" href="login-css/login.css">
    <title>STAR资料查询-登录</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>  
    <!-- 导航栏开始 -->
    <!-- 引入导航栏jsp -->
    <jsp:include page="daohang.jsp"></jsp:include>

    <!-- 导航栏结束 -->

    <!-- 登录主体部分开始 -->
    <s:form action="" method="post" name="loginForm">
    <div class="login-div">
        <img src="images/personal_03.png" alt="">
        <div class="s-login-div">
            <ul>
                <li>
                    <span class="left-txt">账号：</span>
                    <input type="text" name=user.Account>
                    <span class="right-txt">
                    <s:fielderror>
                             <s:param>user.Account</s:param>
                        </s:fielderror>
                    </span>
                </li>
                <li>
                    <span class="left-txt">密码：</span>
                    <div class="no-see-div" id="noSee">
                        <img class="no-see-img" onclick="showPsw()" src="images/eye-open.png" alt="">
                        <input id="no-see-input" type="password" name="user.Password">
                    </div>
                    <div class="see-div" id="see" style="display:none">
                        <img class="see-img" onclick="hidePsw()" src="images/eye-close.png" alt="">
                        <input id="see-input" type="text">
                    </div>

                    <span class="right-txt">
                    <s:fielderror>
                             <s:param>user.Password</s:param>
                        </s:fielderror>
                    </span>
                </li>
                <li>
                    <a href="regist.jsp">
                        沒有账号，注册一个
                    </a>
                </li>
            </ul>
        </div>
        <div class="button-div">
            <button onclick="submitLogin()">
                <span>登录</span>
            </button>
        </div>
    </div>
    </s:form>

    <!-- 登录主体部分结束 -->
    
    <script src="eye-js/eye.js"></script>
    
    </body>

<script type="text/javascript">
	function submitLogin() {
		document.getElementsByName("loginForm")[0].action = "doLogin";
		document.getElementsByName("loginForm")[0].submit();
	}
</script>


</html>
