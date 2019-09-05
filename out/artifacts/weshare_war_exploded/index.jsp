<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri='/struts-tags' prefix='s'%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
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
<link rel="stylesheet" href="index-css/slideShow.css">
<link rel="stylesheet" href="index-css/course.css">
<link rel="stylesheet" href="index-css/file.css">
<link rel="stylesheet" href="common-css/middle.css">
<link rel="stylesheet" href="common-css/bottom.css">
<title>STAR资料查询</title>
</head>

<body>
	<%--    欢迎您，登录成功！<br>
    
   <!-- 产品循环开始 -->
	<s:iterator var="proItem" value="#request.ProList">
		<p>分类：${proItem.PName }</p>
			<s:iterator var="crsItem" value="#proItem.courses">
			<p>分类：${crsItem.CName }</p>
			</s:iterator>	
	</s:iterator>
	<!-- 产品循环结束 --> 
	<p>大小：${request.ProList.size()}</p>
	<p>大小：${request.ProList}</p> --%>


	<!-- 导航栏开始 -->
	
	<!-- 引入导航栏jsp -->
    <jsp:include page="daohang.jsp"></jsp:include>

	<!-- 导航栏结束 -->

	<!-- 搜索栏开始 -->
	<div class="search">
		<div class="search-body">
			<img class="logo" src="images/logo_03.png" alt="">
			<s:form method="post" action="searchFiles">
				<div class="kuang">
				<input class="in" name="file.FileName" type="text" placeholder="请输入搜索内容"> <input
					class="out" type="submit" value=""> <img
					src="images/search_logo_03.png" alt="">
				</div>
			</s:form>
			<img class="star" src="images/star_03.gif" alt="">
		</div>
	</div>
	<!-- 搜索栏结束 -->

	<!-- 轮播图开始 -->
	<div class="slideShow clearfix">
		<div class="slideShow-body">
			<!-- 左边 -->
			<div class="slideShow-left">
				<ul class="f-ul">

					<%-- <s:iterator var="proItem" value="#request.ProList">
						<p>分类：${proItem.PName }</p>
						<s:iterator var="crsItem" value="#proItem.courses">
							<p>分类：${crsItem.CName }</p>
						</s:iterator>
					</s:iterator> --%>
					
					<s:iterator var="proItem" value="#request.ProfessionList" status="L">
						<c:if test="${L.index < 8 }">
							<li class="f-li"><a class="f-a" href="#">${proItem.PName }
										<span class="f-span"> > </span>
								</a>
									<div class="slidehide" style= 'top:-${L.index*60+35}px'>
										<ul>
											<s:iterator var="crsItem" value="#proItem.courses">
												<%-- <li><a href="/weshare/showFiles?course.CId=${crsItem.getCId()}&course.CName=${crsItem.getCName()}"> <span></span> <span class="s-span">${crsItem.CName }</span>
												</a></li> --%>
												<s:form>
													<li><a href="/weshare/showFiles?course.CId=${crsItem.getCId()}"> <span></span> <span class="s-span">${crsItem.CName }</span>
												</a></li>
												</s:form>
											</s:iterator>
										</ul>
									</div></li>
						</c:if>
						
					</s:iterator>
				</ul>
			</div>
			<!-- 右边 -->
			<div class="slideShow-right">
				<div class="slide-div">
					<s:iterator var="courseItem" value="#request.CourseList" status="L">
						<c:if test="${L.index < 3 }">
						<a href="/weshare/showFiles?course.CId=${crsItem.getCId()}">
							<img class="slide-img" src="${courseItem.getCourseImg()}" alt=""> 
						</a>
						</c:if>
					</s:iterator>
					<span class="left-arrow"> <img
						src="images/left_arrow_03.png" alt="">
					</span> <span class="right-arrow"> <img
						src="images/right_arrow_03.png" alt="">
					</span>
					<ul class="list">
						<li class="active"></li>
						<li></li>
						<li></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<!-- 轮播图结束 -->

	<!-- 课程页面开始 -->
    <div class="course clearfix">
        <div class="up">
            <span>课程</span>
            <a href="/weshare/weShare">更多 > </a>
        </div>
        <div class="down">
            <ul>
            	<s:iterator var="courseItem" value="#request.CourseList" status="L">
            		<c:if test="${L.index < 9 }">
						<li>
                   		  <a href="/weshare/showFiles?course.CId=${courseItem.getCId()}">
                   		  	<div class="image"><img src="${courseItem.getCourseImg()}" alt=""></div>
                    	   <div class="txt">${courseItem.getCName()}</div>
                   		  </a>
               		    </li>
               		    </c:if>
				</s:iterator>
            </ul>
      		
        </div>
    </div>
    <!-- 课程页面结束 -->

	<!-- 资料页面开始 -->
	<div class="file clearfix">
		<div class="up">
			<span>资料</span> <a href="/weshare/weShare">更多 > </a>
		</div>
		<div class="down">
			<ul>
				<s:iterator var="FileItem" value="#request.FileList" status="L">
					<c:if test="${L.index < 9 }">
					<li>
						<div class="every">
							<img src="images/file_10.png" alt="">
						</div>
						<div class="txt-div">
							<div class="txt">${FileItem.getFileName()}</div>
							<div>
								<span>需要</span> <span class="price">${FileItem.getFPoint()}</span> <span>积分</span> <a
									href="/weshare/downLoadFile?downId=${FileItem.getFId()}&page=${1}">下载</a>
							</div>
						</div>
					</li>
					</c:if>
				</s:iterator>
			</ul>
		</div>
	</div>
	<!-- 资料页面结束 -->

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
					<li><a href="#">代群-201613161028</a></li>
					<li><a href="#">叶铖铖-201613161126</a></li>
					<li><a href="#">周靖枫-201613161021</a></li>
					<li><a href="#">周亮-201613160916</a></li>
					<li><a href="#">林光成-201613160917</a></li>
					<li><a href="#">肖菡-201613161026</a></li>
				</ul>
			</div>
		</div>
	</div>
	<!-- 底栏部分结束 -->

	<script src="index-js/jquery-1.11.3.js"></script>
	<script src="index-js/index-side.js"></script>
	<script src="index-js/index-slide.js"></script>
	<script src="index-js/dealStr.js"></script>


</body>
</html>
