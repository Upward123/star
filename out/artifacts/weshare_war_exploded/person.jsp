<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri='/struts-tags' prefix='s'%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
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
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
	<link rel="stylesheet" href="common-css/common.css">
    <link rel="stylesheet" href="common-css/nav.css">
    <link rel="stylesheet" href="common-css/search.css">
    <link rel="stylesheet" href="person-css/body.css">
    <link rel="stylesheet" href="common-css/middle.css">
    <link rel="stylesheet" href="common-css/bottom.css">
    <title>STAR资料查询-个人中心</title>

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
                    <li>
                        <!-- <a href="#">
                            <img src="images/myself_03.png" alt="">
                        </a> -->
                        <img src="images/myself_03.png" alt="">
                        <s:iterator var="userItem" value="#request.uList">
                        <a href="/weshare/showUser">${userItem.getUserName()}</a>
                        </s:iterator>
                    </li>
                    <li>
                        <a href="regist.jsp">注册</a>
                    </li>
                    <li>|</li>
                    <li>
                        <a href="/weshare/quitLog">退出登录</a>
                    </li>
                </ul>
            </div>
        </div>
    </div>
    <!-- 导航栏结束 -->

    <!-- 个人中心主体部分开始 -->
    <div class="personal">
        <!-- title部分开始 -->
        <div class="personal-title">
            <a href="/weshare/weShare"><span>首页</span></a>
            <span> > 个人中心 </span>
        </div>
        <!-- title部分结束 -->
        <!-- body部分开始 -->
        <div class="personal-body">
            <!-- 头像栏部分开始 -->
            <div class="avator">
                <div class="avator-left">
                    <a href="#"><img src="images/personal_03.png" alt=""></a>
                    <s:iterator var="userItem" value="#request.uList">
                    <div class="avator-left-txt">
                        <h1>${userItem.getUserName()}</h1>
                        <h5>
                            <span>积分余额：</span>
                            <span>${userItem.getPoint()}</span>
                            <span>积分</span>
                        </h5>
                        <a href="/weshare/showUser"><span>修改个人信息 ></span></a>
                    </div>
                    </s:iterator>
                </div>
                <div class="avator-right">
                    <a href="/weshare/toUpLoad"><span>上传资料</span></a>
                </div>
            </div>
            <!-- 头像栏部分结束 -->
            <!-- 资料展示栏开始 -->
            <div class="file-display">
            <s:iterator var="item" value="#request.rList">
            	<div class="file">
                    <div class="file-icon">
                        <div class="img-div">
                            <img src="images/personal_07.png" alt="">
                        </div>
                        <div class="txt-div">
                            <span>上传时间：</span>
                            <span>${item.getFile().getUploadTime()}</span>
                        </div>
                    </div>
                    <div class="file-name">
                        <span>${item.getFile().getFileName()}</span>
                    </div>
                    <div class="file-upload">
                        <a href="/weshare/downLoadFile?downId=${item.getFile().getFId()}&page=${2}">
                            <span>下载</span>
                        </a>
                    </div>
                </div>
            </s:iterator>
               
            <!-- 资料展示栏结束 -->
        </div>
        <!-- body部分结束 -->
    </div>
    <!-- 个人中心主体部分结束 -->

    <!-- middle部分开始 -->
    <div class="middle">
        <div class="middle-body">
            <dl>
                <dt>帮助中心</dt>
                <a href="#">
                    <dd>账户管理</dd>
                </a>
                <a href="#">
                    <dd>订单操作</dd>
                </a>
                <a href="#">
                    <dd>购物指南</dd>
                </a>
            </dl>
            <dl>
                <dt>服务支持</dt>
                <a href="#">
                    <dd>售后政策</dd>
                </a>
                <a href="#">
                    <dd>自助服务</dd>
                </a>
                <a href="#">
                    <dd>相关下载</dd>
                </a>
            </dl>
            <dl>
                <dt>线下门店</dt>
                <a href="#">
                    <dd>STAR之家</dd>
                </a>
                <a href="#">
                    <dd>服务网点</dd>
                </a>
                <a href="#">
                    <dd>授权体验店</dd>
                </a>
            </dl>
            <dl>
                <dt>关于STAR</dt>
                <a href="#">
                    <dd>了解STAR</dd>
                </a>
                <a href="#">
                    <dd>加入STAR</dd>
                </a>
                <a href="#">
                    <dd>投资者关系</dd>
                </a>
            </dl>
            <dl>
                <dt>关注我们</dt>
                <a href="#">
                    <dd>新浪微博</dd>
                </a>
                <a href="#">
                    <dd>官方微信</dd>
                </a>
                <a href="#">
                    <dd>联系我们</dd>
                </a>
            </dl>
            <dl>
                <dt>特色服务</dt>
                <a href="#">
                    <dd>F码通道</dd>
                </a>
                <a href="#">
                    <dd>礼物码</dd>
                </a>
                <a href="#">
                    <dd>防伪查询</dd>
                </a>
            </dl>
    
            <dl class="middle-right">
                <dt>666-666-666</dt>
                <dd>周一至周五 9:00 - 17:00</dd>
                <dd>（仅收市话费）</dd>
                <a href="#">
                    <dd>联系客服</dd>
                </a>
            </dl>
        </div>
    </div>
    <!-- middle部分结束 -->
    
    <!-- 底栏部分开始 -->
    <div class="bottom">
        <div class="left">
            <img src="images/logo-bottom_03.png" alt="">
        </div>
        <div class="right">
            <div>
                <a href="#">STAR资料查询</a>
            </div>
            <div>
                <ul>
                    <li>
                        <a href="#">代群-201613161028</a>
                    </li>
                    <li>
                        <a href="#">叶铖铖-201613161126</a>
                    </li>
                    <li>
                        <a href="#">周靖枫-201613161021</a>
                    </li>
                    <li>
                        <a href="#">周亮-201613160916</a>
                    </li>
                    <li>
                        <a href="#">林光成-201613160917</a>
                    </li>
                    <li>
                        <a href="#">肖菡-201613161026</a>
                    </li>
                </ul>
            </div>
        </div>
    </div>
    <!-- 底栏部分结束 -->

  </body>
</html>
