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
    <link rel="stylesheet" href="common-css/search.css">
    <link rel="stylesheet" href="detail-css/body.css">
    <link rel="stylesheet" href="common-css/middle.css">
    <link rel="stylesheet" href="common-css/bottom.css">
    <title>STAR资料查询-资料详情</title>
    
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
    
  	<!-- 搜索栏开始 -->
	<div class="search">
		<div class="search-body">
			<img class="logo" src="images/logo_03.png" alt="">
			<s:form method="post" action="searchFiles">
				<div class="kuang">
				<input class="in" name="file.Contributor" type="text" placeholder="请输入搜索内容"> <input
					class="out" type="submit" value=""> <img
					src="images/search_logo_03.png" alt="">
					<s:hidden name="file.FileName" value="%{#request.fileName}"/>
				</div>
			</s:form>
			<img class="star" src="images/star_03.gif" alt="">
		</div>
	</div>
	<!-- 搜索栏结束 --
    
    <!-- 详情页主体部分开始 -->
    <div class="personal">
        <!-- title部分开始 -->
        <div class="personal-title">
            <a href="/weshare/weShare">
                <span>首页</span>
            </a>
            <span> > ${request.detailName}详情 </span>
        </div>
        <!-- title部分结束 -->
        <!-- body部分开始 -->
        <div class="personal-body">
            
            <!-- 资料展示栏开始 -->
			<div class="file-display">
				<s:iterator var="fileItem" value="#request.fileList">
					<div class="file">
					<div class="clearfix">
						<div class="file-icon">
							<div class="img-div">
								<img src="images/personal_07.png" alt="">
							</div>
						</div>
						<div class="file-name">
							<span>${fileItem.getFileName()}</span>
						</div>
						<div class="file-upload">
							<a href="/weshare/downLoadFile?downId=${fileItem.getFId()}&page=${3}"> <span>下载</span>
							</a>
							<div class="upload-man">
								<span> <img src="images/detail.png" alt="">
								</span> <span>${fileItem.getContributor()}</span> <span> | </span> <span>上传时间：</span> <span>${fileItem.getUploadTime()}</span>
							</div>
						</div>
					</div>
					<div class="file-upload-txt">
						<div>
							<span>下载</span> <span>${fileItem.getDownloadCount()}</span> <span>次</span>
						</div>
						<div></div>
						<div>
							<span>下载需用</span> <span>${fileItem.getFPoint()}</span> <span>积分</span>
						</div>
					</div>
				</div>
				</s:iterator>


			</div>
			<!-- 资料展示栏结束 -->
        </div>
        <!-- body部分结束 -->
    </div>
    <!-- 详情页主体部分结束 -->
    
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
<%-- 
	<script language="JavaScript">
		function myrefresh() {
			window.location.reload();
		}
		setTimeout('myrefresh()', 10000); //指定10秒刷新一次
	</script> --%>

</body>
</html>
