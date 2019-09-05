package com.weshare.entity;

public class Records {
	private Integer RId;	//记录号
	private String Time;	//操作时间
	private boolean Type;	//上传（true)或者下载（false）

	private FileCdut file;		//创建一个资料对象
	
	public Integer getRId() {
		return RId;
	}
	public void setRId(Integer rId) {
		RId = rId;
	}
	public String getTime() {
		return Time;
	}
	public void setTime(String time) {
		Time = time;
	}
	public boolean isType() {
		return Type;
	}
	public void setType(boolean type) {
		Type = type;
	}
	public FileCdut getFile() {
		return file;
	}
	public void setFile(FileCdut file) {
		this.file = file;
	}
	
	public Records(){
	}
	public Records(String time ,boolean type){
		this.Time = time;
		this.Type = type;
	}
	public Records(String time ,boolean type,FileCdut file){
		this.Time = time;
		this.Type = type;
		this.file = file;
	}
	
	@Override
	public String toString() {
		return "Records [RId=" + RId + ", Time=" + Time + ", Type=" + Type + "]";
	}
	
}
