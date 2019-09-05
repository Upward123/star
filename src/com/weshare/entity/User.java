package com.weshare.entity;

import java.util.HashSet;
import java.util.Set;

public class User {
	private Integer UId;		//用户名
	private String Account;		//账号
	private String UserName;	//用户号
	private String Password;	//密码
	private Integer Point;		//积分
	private String UserImage;	//头像
	
	//对记录方（多方）创建一个set对象
	private Set<Records> records = new HashSet<Records>();
	
	public Integer getPoint() {
		return Point;
	}
	public void setPoint(Integer point) {
		Point = point;
	}
	
	public String getAccount() {
		return Account;
	}
	public void setAccount(String account) {
		Account = account;
	}
	public Integer getUId() {
		return UId;
	}
	public void setUId(Integer uId) {
		UId = uId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	public String getUserImage() {
		return UserImage;
	}
	public void setUserImage(String userImage) {
		UserImage = userImage;
	}
	public Set<Records> getRecords() {
		return records;
	}
	public void setRecords(Set<Records> records) {
		this.records = records;
	}
	
	public User(){
	}
	public User(String account,String userName,String password,int point,String userImage,Set<Records> records){
		this.Account = account;
		this.UserName = userName;
		this.Password = password;
		this.Point = point;
		this.UserImage = userImage;
		this.records = records;
	}
	public User(String account,String userName, String password, int point,String userImage){
		this.Account = account;
		this.UserName = userName;
		this.Password = password;
		this.Point = point;
		this.UserImage = userImage;
	}
	//将User对象和记录信息关联起来
	public Set<Records> addRecords(Records R){
		this.getRecords().add(R);
		return records;
	}
	
	@Override
	public String toString() {
		return "User [Account=" + Account + ", UId=" + UId + ", UserName=" + UserName + ", Password=" + Password
				+ ", Point=" + Point + ", UserImage=" + UserImage + "]";
	}
	
}
