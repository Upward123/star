package com.weshare.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.weshare.entity.Courses;
import com.weshare.entity.FileCdut;
import com.weshare.entity.Profession;
import com.weshare.entity.Records;
import com.weshare.entity.WeShareUtils;
import com.weshare.entity.User;
import com.weshare.service.CoursesService;
import com.weshare.service.FileCdutService;
import com.weshare.service.ProfessionService;
import com.weshare.service.UserService;

import net.sf.json.JSONObject;

/*
 * 传输动作
 * 处理动作包括：
 * 	(1)doUpLoadFile() 上传资料，file用来保存页面参数，其实可以走注册流程，不过要选择一个文件路径 ,返回用户页user.jsp
 * 	(2)downLoadFile() 检查用户登录状态
 * 		a、已经登录，通过传入资料id，返回资料路径，用户下载,回到首页index
 * 		b、未登录，直接跳到登录界面login
 * 	(3)searchFiles() 通过传入资料名称，查询资料列表，返回给files.jsp展示信息
 */
public class FileAction extends ActionSupport
implements RequestAware, ServletRequestAware, SessionAware, ServletResponseAware {
	Map<String, Object> request;
	HttpServletRequest req;
	Map<String, Object> session;
	HttpServletResponse resp;

	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
		
	}

	@Override
	public void setServletRequest(HttpServletRequest req) {
		this.req = req;
	/*	try {
			this.req.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	@Override
	public void setServletResponse(HttpServletResponse resp) {
		this.resp = resp;
		//resp.setCharacterEncoding("utf-8");
	}

	FileCdut   file;		// 资料实体，用于封装页面资料传入信息参数
	FileCdutService fileService;
	CoursesService	courseSercive;
	UserService		userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public void setCourseSercive(CoursesService courseSercive) {
		this.courseSercive = courseSercive;
	}

	public void setFileService(FileCdutService fileService) {
		this.fileService = fileService;
	}

	public FileCdut getFile() {
		return file;
	}

	public void setFile(FileCdut file) {
		this.file = file;
	}

	/* ------------Action----------------*/
	
	private File uf;
	private String ufFileName;
	
	public File getUf() {
		return uf;
	}

	public void setUf(File uf) {
		this.uf = uf;
	}

	public String getUfFileName() {
		return ufFileName;
	}

	public void setUfFileName(String ufFileName) {
		this.ufFileName = ufFileName;
	}
	String courseName;
	String proName;
	int point;
	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	// 根据传入 的资料id，在表单中填写相关信息注入到file中，上传到数据库
	public String upLoadFile()
	{
		// 获取用户选择文件，上传到服务器
		if(ufFileName!=null){
			try{
				String path = ServletActionContext.getServletContext().getRealPath("/CDUTFILES");
				System.err.println(path);
				SimpleDateFormat df0 = new SimpleDateFormat("yyyy-MM-dd-hh-ss");//设置日期格式
				String uique = df0.format(new Date());
				uique+=ufFileName;

				File destFile = new File(path, uique);
				FileUtils.copyFile(uf, destFile);
				// 上传成功则向数据库注入数据	
				SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");//设置日期格式
				String nowTime = df.format(new Date());
				User user = (User)session.get("user");
				FileCdut newFile = new FileCdut();
				newFile.setContributor(user.getUserName());
				newFile.setContributorId(user.getUId());
				newFile.setFPoint(point);
				newFile.setUploadTime(nowTime);
				newFile.setDownloadCount(0);
				newFile.setFileName(ufFileName);
				newFile.setFilePath(destFile.getAbsolutePath());
				List<Courses> crList = courseSercive.getCoursesByName(courseName);
				
				if(!crList.isEmpty()){
					newFile.setCourses(crList.get(0));
					fileService.addFile(newFile);
				}
				
				// 给用户增加记录
				Records rd = new Records();
				rd.setTime(nowTime);
				rd.setType(true);
				rd.setFile(newFile);
				user.addRecords(rd);
				//user.setPoint(user.getPoint()+point); // 上传不加积分，别人下载后给他加上
				userService.modifyUser(user);	
			}catch(IOException e){
			}
			
		}
		return "person";
	}
	
	// 需要下载文件的id
	int downId;
	String fileName;
	int page;	// 进入下载的页面：主页为1   个人页2  详情页3
	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public int getDownId() {
		return downId;
	}

	public void setDownId(int downId) {
		this.downId = downId;
	}

	// 下载文件
	public String downLoadFile() throws IOException 
	{
		
		FileCdut downFile = fileService.getFileByFileId(downId);
		User user = (User)session.get("user");
		if(user.getPoint()<= downFile.getFPoint()){
			session.put("warning","<script>alert('积分不足，请通过上传资料获得！!')</script>");
			if(page==3){
				return "detail";
			}
			else if(page==2){
				return "person";
			}
			else{
				return "index";
			}
		}
		if(downFile!=null){
			File mfile=new File(downFile.getFilePath());
			
			// 中文转码
			String codeName = new String(downFile.getFileName().getBytes(), "ISO8859-1");
			resp.setCharacterEncoding("utf-8");
			resp.setContentLength((int)mfile.length());//文件长度默认为long，这里暂时设为转换为int
			resp.setContentType("application/octet-stream");
			resp.setHeader("Content-Disposition", "attachment;filename="+ codeName);
			
			try{
				
				InputStream is= new FileInputStream(mfile);
				OutputStream os=resp.getOutputStream();
				
				int len=0;
				byte[]buffer=new byte[200];
				while ((len=is.read(buffer))!=-1) {
					os.write(buffer, 0, len);
				}
				if(os!=null){
					os.close();
				}
				if(is!=null){
					is.close();
				}
				resp.flushBuffer();
				
				// 下载次数增加一次
				downFile.setDownloadCount(downFile.getDownloadCount()+1);
				fileService.modifyFile(downFile);
				downFile = fileService.getFileByFileId(downId);
				
				//  下载的用户积分减少
				user.setPoint(user.getPoint() - downFile.getFPoint());
				userService.modifyUser(user);
				
				// 给贡献者加上积分
				User contributor = userService.getUserById(downFile.getContributorId());
				if(contributor!=null){
					contributor.setPoint(contributor.getPoint() + downFile.getFPoint());
					userService.modifyUser(contributor);
				}

			}catch(Exception e){
				throw e;
			}
			
		}
		
		if(page==3){
			return "detail";
		}
		else if(page==2){
			return "person";
		}
		else{
			return "index";
		}
	}
	
	// 根据用户输入的搜索信息（放在file名中封装），搜索数据库，返回名字相似的资料列表给fileList.jsp
	public String searchFiles()
	{
		List<FileCdut> fileList = fileService.getFileListByFileNameAndContributor(file.getFileName(), file.getContributor());
		// 通过搜索的文件名（模糊）和贡献者名查询资料，贡献者为空时来自首页
		if(file!=null){
			request.put("detailName", "搜索");
			request.put("fileList", fileList);
			request.put("fileName", file.getFileName());
		}
		
		return "files";
	}
	
	
	
	ProfessionService	professionService;
	public void setProfessionService(ProfessionService professionService) {
		this.professionService = professionService;
	}

	// 选择专业和课程后返回相应的内容
	public String toUpLoad(){
		List<Profession>  proList = professionService.getAllProfession();
		String str= WeShareUtils.proToJson(proList);
		request.put("ProList", str);
		return "upload";
	}
	

}