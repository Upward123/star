/*package com.weshare.entity;

import org.hibernate.Session;
import org.junit.Test;

import sessionfactory.HibernateSessionFactory;
import model.*;

public class Test_all {
	@Test
	//测试所有表
	public void dataPrepare(){
		Session session = HibernateSessionFactory.getSession();
		
		try {
			session.beginTransaction();
			//给记录对象赋初值
			Records record1=new Records("1:02:03",true);
			Records record2=new Records("2:03:04",false);
			Records record3=new Records("3:04:05",true);
			
			//给用户对象赋初值
			User user=new User("罗浩","abc","0");
			//将用户（User）对象和记录（Record）信息关联起来
			user.addRecords(record1);
			user.addRecords(record2);
			user.addRecords(record3);
			
			//给资料对象赋初值
			File file1=new File("4:01:02",10,"文件名","a/b/c");
			File file2=new File("6:03:06",10,"文件名2","a/b");
			File file3=new File("7:07:02",12,"文件名3","a/b/r");
			//将记录（Record）对象和资料（File）信息关联起来
			record2.setFile(file1);
			
			//给课程对象赋初值
			Courses courses1=new Courses("C1","image1");
			Courses courses2=new Courses("C2","image2");
			Courses courses3=new Courses("C3","image3");
			//将Courses对象和数据信息关联起来
			courses1.addFile(file1);
			courses1.addFile(file2);
			courses1.addFile(file3);
			
			//给专业对象赋初值
			Profession profession1 = new Profession("计算机");
			//将专业（Profession1）对象和课程（Courses）信息关联起来
			profession1.addCourses(courses1);
			profession1.addCourses(courses2);
			profession1.addCourses(courses3);
			
			session.save(user);
			session.save(profession1);
//			session.save(record2);
//			session.save(courses1);

			session.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			session.beginTransaction().rollback();
		}		
	}
	
}

*/