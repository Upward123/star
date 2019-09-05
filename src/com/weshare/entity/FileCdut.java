package com.weshare.entity;

public class FileCdut {
	private Integer FId;			// 资料号
	private Integer FPoint;			// 下载资料需要积分
	private String UploadTime;		// 上传时间
	private Integer DownloadCount;	// 下载次数
	private String FileName;		// 文件名
	private String FilePath;		// 文件实际存储路径
	private Courses courses;		// 定义一个课程对象
	private String Contributor;		// 贡献者（前期挖的坑，其实我们该存贡献者id  2019.7.2）
	private	Integer	ContributorId;	// 贡献者的Id（填坑   2019.7.2）

	public Integer getContributorId() {
		return ContributorId;
	}
	public void setContributorId(Integer contributorId) {
		ContributorId = contributorId;
	}
	public Integer getFId() {
		return FId;
	}
	public void setFId(Integer fId) {
		FId = fId;
	}
	public String getContributor() {
		return Contributor;
	}
	public void setContributor(String contribute) {
		Contributor = contribute;
	}
	public Integer getFPoint() {
		return FPoint;
	}
	public void setFPoint(Integer fPoint) {
		FPoint = fPoint;
	}
	public String getUploadTime() {
		return UploadTime;
	}
	public void setUploadTime(String uploadTime) {
		UploadTime = uploadTime;
	}
	public Integer getDownloadCount() {
		return DownloadCount;
	}
	public void setDownloadCount(Integer downloadCount) {
		DownloadCount = downloadCount;
	}
	public String getFileName() {
		return FileName;
	}
	public void setFileName(String fileName) {
		FileName = fileName;
	}
	public String getFilePath() {
		return FilePath;
	}
	public void setFilePath(String filePath) {
		FilePath = filePath;
	}
	public Courses getCourses() {
		return courses;
	}
	public void setCourses(Courses courses) {
		this.courses = courses;
	}
	
	public FileCdut(){
	}
	public FileCdut(Integer ContributorId, String ContributorName, Integer fPoint,String uploadTime,Integer downloadCount,String fileName,String filePath){
		this.ContributorId = ContributorId;
		this.Contributor = ContributorName;
		this.FPoint = fPoint;
		this.UploadTime = uploadTime;
		this.DownloadCount = downloadCount;
		this.FileName = fileName;
		this.FilePath = filePath;
	}
	@Override
	public String toString() {
		return "FileCdut [FId=" + FId + ", FPoint=" + FPoint + ", UploadTime=" + UploadTime + ", DownloadCount="
				+ DownloadCount + ", FileName=" + FileName + ", FilePath=" + FilePath + ", courses=" + courses
				+ ", Contributor=" + Contributor + ", ContributorId=" + ContributorId + "]";
	}
	
}
