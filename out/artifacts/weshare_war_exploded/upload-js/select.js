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
    	
    	//将课程的数组传到页面option里面
    	if(pro[i].selected){
    		for(var j=0;j<coursesArr[i].length;j++){
    			//创建节点对象，创建节点的内容，将内容写入到节点对象中去，并添加到上一个父节点
    			  var coursesSel=document.createElement("option");
    			  var coursesTxt=document.createTextNode(coursesArr[i][j]);
    			  coursesSel.appendChild(coursesTxt);
    			  courses.appendChild(coursesSel);
    			            
    		}
    	}
}

//构造函数，点击profession下拉列表，响应onchange事件，对courses进行操作
function showCourses(){
	//先清空上一次操作可能留下的数据
        delAll("courses");	
	
	            for(var i=0;i<pro.length;i++){
	            	if(pro[i].selected){
                        //选择专业后记录专业
                        finalpro = pro[i].value;
                        console.log(finalpro);
	            		for(var j=0;j<coursesArr[i].length;j++){
	            			var coursesSel=document.createElement("option");
	                        var coursesTxt=document.createTextNode(coursesArr[i][j]);
	                        coursesSel.appendChild(coursesTxt);
	                        courses.appendChild(coursesSel);           
	        }
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



