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
    <link rel="stylesheet" href="regist-css/regist.css">
    <title>STAR资料查询-注册</title>
    
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

    <!-- 注册主体部分开始 -->
    <s:form action="" method="post" name="regForm">
    <div class="regist-div">
        <img src="images/personal_03.png" alt="">
        <div class="register-div">
            <ul>
                <li>
                    <span class="left-txt">用户名：</span>
                    <input type="text" placeholder="用户名不可为空" name="user.UserName">
                    <span class="right-txt">
                    <s:fielderror><s:param>user.UserName</s:param></s:fielderror>
                    </span>
                </li>
                <li>
                    <span class="left-txt">账号：</span>
                    <input type="text" placeholder="账号限12位数字且首位不为0" name="user.Account">
                    <span class="right-txt">
                    <s:fielderror><s:param>user.Account</s:param></s:fielderror>
                    </span>
                </li>
                <li>
                    <span class="left-txt">密码：</span>
                    <div class="no-see-div" id="noSee">
                        <img class="no-see-img" onclick="showPsw()" src="images/eye-open.png" alt="">
                        <input id="no-see-input" type="password" placeholder="密码不少于6位" name="user.Password">
                    </div>
                    <div class="see-div" id="see" style="display:none">
                        <img class="see-img" onclick="hidePsw()" src="images/eye-close.png" alt="">
                        <input id="see-input" type="text" placeholder="密码不少于6位">
                    </div>

                    <span class="right-txt">
                    <s:fielderror><s:param>user.Password</s:param></s:fielderror>
                    </span>
                </li>
                <li>
                    <span class="left-txt">确认密码：</span>
                    <div class="no-see-div" id="noSeeSure">
                        <img class="no-see-img" onclick="showPswSure()" src="images/eye-open.png" alt="">
                        <input id="no-see-input-sure" type="password" placeholder="需与密码一致" name="re_Password">
                    </div>
                    <div class="see-div" id="seeSure" style="display:none">
                        <img class="see-img" onclick="hidePswSure()" src="images/eye-close.png" alt="">
                        <input id="see-input-sure" type="text" placeholder="需与密码一致">
                    </div>

                    <span class="right-txt">
                    <s:fielderror><s:param>re_password</s:param></s:fielderror>
                    </span>
                </li>
            </ul>
        </div>
        <div class="button-div" onclick="submitReg()">
            <button>
                <span>注册</span>
            </button>
        </div>
    </div>
    </s:form>

    <!-- 注册主体部分结束 -->
    <script src="eye-js/eye.js"></script>
        
    </body>

	<script type="text/javascript">
		function submitReg() {
			document.getElementsByName("regForm")[0].action = "doRegister";
			document.getElementsByName("regForm")[0].submit();
	
		}
	</script>
</html>