<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri='/struts-tags' prefix='s'%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML>

<html lang="en">

<head>
    <link rel="stylesheet" href="common-css/nav.css">
    <link rel="stylesheet" href="upload-css/upload.css">
    <link rel="stylesheet" href="common-css/middle.css">
    <link rel="stylesheet" href="common-css/bottom.css">
    <title>上传</title>
</head>
<body>  
    <!-- 导航栏开始 -->
    <!-- 引入导航栏jsp -->
    <jsp:include page="daohang.jsp"></jsp:include>

    <!-- 导航栏结束 -->
    <!-- 上传框开始 -->
        <div class="upload_border">
            <s:form action="" method="post" enctype="multipart/form-data" name="upFrom" >
                <div class="choose-file-div">
                    <div class="choose-file">
                        <input class="change-file" type="file" id="fileUpload" name="uf" onchange="fileName.value=this.value">
                        <input id="fileName" type="text" placeholder="请选择要上传的文件">
                        <div>浏览文件</div>
                    </div>
                </div>

                <div class="choose1">
                    <li>请选择上传资料所属的专业：</li>
                    <li>
                        <select id="profession" name="proName" onchange="showCourses()"></select>
                    </li>
                    
                 </div>
                 <div class="choose2">
                    <li>请选择上传资料所属的课程：</li>
                    <li>
                        <select id="courses" name="courseName" onchange="selectCourses()"></select>
                    </li>
                </div>
                <div class="choose3">
                    <li>请选择下载资料所需的积分：</li>
                    <li>
                        <select id="score" name="point" onchange="selectScore()">
                            <option value="0" >0</option>
                            <option value="5"  >5</option>
                            <option value="10" >10</option>
                            <option value="15" >15</option>
                            <option value="20" >20</option>
                            <option value="25" >25</option>
                            <option value="30" >30</option>
                        </select>
                    </li>
                </div>
            
                    <button type="button" onclick="submitFrom()">
                        确认上传
                    </button>
            </s:form>
        </div>
    <!-- 上传框结束 -->

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
                    <a href="#"><dd>联系客服</dd></a>
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
                <div><a href="#">STAR资料查询</a></div>
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




		<script>
		
function submitFrom(){
	
	document.getElementsByName("upFrom")[0].action = "upLoadFile";
	document.getElementsByName("upFrom")[0].submit();

}
		
		var professionArr=["请选择专业"];
		var coursesArr=[["请选择课程"]];
console.log(professionArr)

console.log(coursesArr)


		var se = <%=request.getAttribute("ProList")%>
        console.log(se);
		
		for(var i=0;i<se.length;i++) {
            professionArr.push(se[i].profession);
            var arr = [];
            for (var j = 0; j < se[i].course.length; j++) {
                arr.push(se[i].course[j].name);
            }
            coursesArr.push(arr);
        }




//定义全局变量
var pro=document.getElementById("profession");
var courses=document.getElementById("courses");
var score=document.getElementById("score");

var finalpro;
var finalcourses;
var finalscore;


// 初始化，将专业的数组传到页面option里面
for(var i=0;i<professionArr.length;i++){
	//创建节点对象，创建节点的内容，将内容写入到节点对象中去，并添加到上一个父节点
    	var proSel=document.createElement("option");
    	var proTxt=document.createTextNode(professionArr[i]);
    	proSel.appendChild(proTxt);
    	pro.appendChild(proSel);
    	proSel.value = professionArr[i];
    	
    	//将课程的数组传到页面option里面
    	if(pro[i].selected){
    		for(var j=0;j<coursesArr[i].length;j++){
    			//创建节点对象，创建节点的内容，将内容写入到节点对象中去，并添加到上一个父节点
    			  var coursesSel=document.createElement("option");
    			  var coursesTxt=document.createTextNode(coursesArr[i][j]);
    			  coursesSel.appendChild(coursesTxt);
    			  courses.appendChild(coursesSel);
    			  coursesSel.value = coursesArr[i][j];
  
    		}
    	}
}

//构造函数，点击profession下拉列表，响应onchange事件，对courses进行操作
function showCourses(){

	
    for(var i=0;i<pro.length;i++){
        if(pro[i].selected){
            //先清空上一次操作可能留下的数据
            delAll("courses");
            //选择专业后记录专业
            finalpro = pro[i].value;
            console.log(finalpro);
            for(var j=0;j<coursesArr[i].length;j++){
                var coursesSel=document.createElement("option");
                var coursesTxt=document.createTextNode(coursesArr[i][j]);
                coursesSel.appendChild(coursesTxt);
                courses.appendChild(coursesSel);
                coursesSel.value = coursesArr[i][j];
            }
            console.log(courses.innerHTML);
        }
	}
}

//选择课程后记录课程
function selectCourses(){
    for(var i=0;i<pro.length;i++){
        if(pro[i].selected){
            for(var j=0;j<coursesArr[i].length;j++){
                if(courses[j].selected){
                    finalcourses = courses[j].value;
                    console.log(finalcourses);
                }	           
            }
        }
    }
}

//选择所需积分后记录积分
function selectScore(){
    for(i=0;i<score.length;i++)
    if(score[i].selected){
        finalscore = score[i].value;
        console.log(finalscore); 
    }   
     
}

//清空二次级联后的重复值（一层级联可不用）
function delAll(theId){
    var theOb=document.getElementById(theId);
    var arr=theOb.childNodes;
    for(var j=arr.length;j>0;j--){  
    	theOb.removeChild(arr[j-1]);   
    }
}
 
</script>
    </body>
</html>    
