package cn.space.tao.user.action;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.space.tao.user.service.UserService;
import cn.space.tao.user.vo.User;

/**
 *  用户模块action
 * @author SPACE
 *
 */

//接收参数， 实现 模型驱动 ModelDrven
public class UserAction extends ActionSupport implements ModelDriven<User>{

	//模型驱动使用的对象
	private User user = new User();
	
	public User getModel() {
		return user;
	}
	
	//注入UserService
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	//跳转注册页面
	public String registPage(){
		return "registPage";
		
	}
	
	//AJAX 进行异步校验用户名的执行方法
	public String findByName() throws IOException{
		//调用Service 进行查询
		User existUser = userService.findUsername(user.getUsername());
		
		//获取response对象，向页面输出：
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		
		//判断
		if(existUser != null ){
			//查询到该用户： 用户名已经存在
			response.getWriter().println("<font color='red'>用户名已经存在</font>");
			
		}else {
			//用户名不存在
			response.getWriter().println("<font color='green'>用户名可以使用</font>");
		}
		
		return NONE;
	}
	
	//用户注册的方法
	public String regist(){
		userService.Save(user);
		return "loginPage";
	}
	
	//跳转登录页面
	public String loginPage(){
		return "loginPage" ;
	}
	
	//登录方法
	public String login(){
		User existUser = userService.login(user);
		if(existUser == null){
			//登录失败
			this.addActionError("登录失败：用户名或者密码错误！");
			return "loginPage";
		}else{
			//登录成功
			//将用户信息存入到session中
			ServletActionContext.getRequest().getSession()
			.setAttribute("existUser",existUser);
			//页面跳转
			return "loginSuccess";
			
		}
	}
	
	//用户退出： 销毁session
	public String quit(){
		//销毁session
		ServletActionContext.getRequest().getSession().invalidate();
		
		return "quit";
	}
	
	//修改信息
	public String userInfoUpdate(){
		userService.updateUserInfo(user);
		User existUser = userService.login(user);
		ServletActionContext.getRequest().getSession().setAttribute("existUser",existUser);
		return "userInfoUpdate";
		
	}
	
	
}
