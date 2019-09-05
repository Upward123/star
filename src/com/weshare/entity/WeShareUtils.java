package com.weshare.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

// 生成指定格式的json文件
public class WeShareUtils {
	
	// 将课程列表转换为JSON格式
	public static String proToJson(List<Profession> proList){
		
		JSONArray proArr = new JSONArray();
		for(int i=0;i<proList.size(); i++){
			Profession pro = proList.get(i);
			List<Courses> CoursesListT = new ArrayList(pro.getCourses());
			JSONArray cArr = new JSONArray();
			for(int j=0; j<CoursesListT.size(); j++){
				Courses course=CoursesListT.get(j);
				JSONObject cj = new JSONObject();
				cj.put("name", course.getCName());
				cArr.add(cj);
				}
			
			JSONObject proObj = new JSONObject();
			proObj.put("profession", pro.getPName());
			proObj.put("course", cArr);
			proArr.add(proObj);			
		}
	
		return proArr.toString();
	}
	
	
	public String userToJson(User u){
		JSONObject	js = new JSONObject();
		js.put("name", u.getUserName());
		return js.toString();
	}
	
	// 得到测试类
	public static List<Profession> getTest(){
		
		List<Profession> testProList = new ArrayList<Profession>();
		// 生成课程方式如下 参数（课程代号、课程名、课程图片）
		Courses course1 = new Courses("c1", "大数据基础及应用", "images/J/J_dashujujichujiyingyong.jpg");
		Courses course2 = new Courses("c2","电路与模拟电子技术","images/J/J_dianluyumonidianzijishu.jpg");
		Courses course3 = new Courses("c3","汇编语言程序设计","images/J/J_huibianyuyanchengxusheji.jpg");
		Courses course4 = new Courses("c4","计算机安全与密码学","images/J/J_jisuanjianquanyumimaxue.jpg");
		Courses course5 = new Courses("c5","计算机科学导论","images/J/J_jisuanjikexuedaolun.jpg");
		Courses course6 = new Courses("c6","嵌入式操作系统原理与应用","images/J/J_qianrushicaozuoxitong.jpg");
		Courses course7 = new Courses("c7","人工智能","images/J/J_rengongzhineng.jpg");
		Courses course8 = new Courses("c8","数据挖掘与机器学习","images/J/J_shujuwajueyujiqixuexi.jpg");
		Courses course9 = new Courses("c9","数值计算方法","images/J/J_shuzhijisuanfangfa.jpg");
		Courses course10 = new Courses("c10","数字图像处理","images/J/J_shuzituxiangchuli.jpg");
		Courses course11 = new Courses("c11","工程力学","images/T/T_gongchenglixue.jpg");
		Courses course12 = new Courses("c12","弹性力学","images/T/T_tanxinglixue.jpg");
		Courses course13 = new Courses("c13","结构力学","images/T/T_jiegoulixue.jpg");
		Courses course14 = new Courses("c14","电子商务专业英语","images/Y/Y_dianzishangwuzhuanyeyingyu.jpg");
		Courses course15 = new Courses("c15","大学英语翻译教程","images/Y/Y_daxueyingyufanyijiaocheng.jpg");
		Courses course16 = new Courses("c16","现代大学英语","images/Y/Y_xiandaidaxueyingyu.jpg");
		Courses course17 = new Courses("c17","环境工程学","images/H/H_huanjinggongchengxue.jpg");
		Courses course18 = new Courses("c18","给水工程","images/H/H_jishuigongcheng.jpg");
		Courses course19 = new Courses("c19","大学化学基础教程","images/H/H_daxuehuaxuejichujiaocheng.jpg");
		Courses course20 = new Courses("c20", "嵌入式操作系统原理与应用", "images/J/J_qianrushicaozuoxitong.jpg");
		Courses course21 = new Courses("c21", "大数据技术原理与应用", "images/J/J_dashujujichujiyingyong.jpg");
		Courses course22 = new Courses("c22", "电路与模拟电子技术", "images/J/J_dianluyumonidianzijishu.jpg");
		Courses course23 = new Courses("c23", "汇编语言程序设计", "images/J/J_huibianyuyanchengxusheji.jpg");
		Courses course24 = new Courses("c24", "数值计算方法",  "images/J/J_shuzhijisuanfangfa.jpg");
		Courses course25 = new Courses("c25", "计算机科学导论",  "images/J/J_jisuanjikexuedaolun.jpg");
		Courses course26 = new Courses("c26", "数据挖掘与机器学习", "images/J/J_shujuwajueyujiqixuexi.jpg");
		Courses course27 = new Courses("c27", "计算机安全与密码学",  "images/J/J_jisuanjianquanyumimaxue.jpg");
		Courses course28 = new Courses("c28", "人工智能",  "images/J/J_rengongzhineng.jpg");
		Courses course29 = new Courses("c29", "数字图像处理",  "images/J/J_shuzituxiangchuli.jpg");
		Courses course30 = new Courses("c30", "高等数学",  "images/S/S_gaodengshuxue.jpg");
		Courses course31 = new Courses("c31", "概率论与数理统计",  "images/S/S_gailvlunyushulitongji.jpg");
		Courses course32 = new Courses("c32", "数学分析",  "images/S/S_gaodengshuxue.jpg");
		Courses course33 = new Courses("c33", "建筑力学",  "images/JZ/JZ_jianzhulixue.jpg");
		Courses course34 = new Courses("c34", "中外建筑史", "images/JZ/JZ_zhongwaijianzhushi.jpg");
		Courses course35 = new Courses("c35", "计算机绘图",  "images/JZ/JZ_jisuanjihuitu.jpg");
		Courses course36 = new Courses("c36", "电视摄像与非线性编辑",  "images/X/X_dianshishexiangyufeixianxingbianji.jpg");
		Courses course37 = new Courses("c37", "广播电视新闻学",  "images/X/X_guangbodianshixinwenxue.jpg");
		Courses course38 = new Courses("c38", "广播电视概论", " images/X/X_guangbodianshigailun.jpg");
		
		// 生成专业方式 参数（专业代号，专业名）
		Profession pro1 = new Profession("p1", "软件工程");
		Profession pro2 = new Profession("p2", "土木工程");
		Profession pro3 = new Profession("p2", "英语");
		Profession pro4 = new Profession("p2", "环境工程");
		Profession pro5 = new Profession("p5", "计算机科学与技术");
		Profession pro6 = new Profession("p6", "数学");
		Profession pro7 = new Profession("p7", "建筑学");
		Profession pro8 = new Profession("p8", "新闻传播");
		
		// 往专业中添加课程
		pro1.addCourses(course1);
		pro1.addCourses(course2);
		pro1.addCourses(course3);
		pro1.addCourses(course4);
		pro1.addCourses(course5);
		pro1.addCourses(course6);
		pro1.addCourses(course7);
		pro1.addCourses(course8);
		pro1.addCourses(course9);
		pro1.addCourses(course10);
		pro2.addCourses(course11);
		pro2.addCourses(course12);
		pro2.addCourses(course13);
		pro3.addCourses(course14);
		pro3.addCourses(course15);
		pro3.addCourses(course16);
		pro4.addCourses(course17);
		pro4.addCourses(course18);
		pro4.addCourses(course19);
		pro5.addCourses(course20);
		pro5.addCourses(course21);
		pro5.addCourses(course22);
		pro5.addCourses(course23);
		pro5.addCourses(course24);
		pro5.addCourses(course25);
		pro5.addCourses(course26);
		pro5.addCourses(course27);
		pro5.addCourses(course28);		
		pro5.addCourses(course29);
		pro6.addCourses(course30);
		pro6.addCourses(course31);
		pro6.addCourses(course32);
		pro7.addCourses(course33);
		pro7.addCourses(course34);
		pro7.addCourses(course35);
		pro8.addCourses(course36);
		pro8.addCourses(course37);	
		pro8.addCourses(course38);

			
		// 将课程装入列表
		testProList.add(pro1);
		testProList.add(pro2);
		testProList.add(pro3);
		testProList.add(pro4);
		testProList.add(pro5);
		testProList.add(pro6);
		testProList.add(pro7);
		testProList.add(pro8);
		
		
		return testProList;
	}
	

}
