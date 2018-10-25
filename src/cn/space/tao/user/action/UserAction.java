package cn.space.tao.user.action;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.space.tao.user.service.UserService;
import cn.space.tao.user.vo.User;

/**
 *  �û�ģ��action
 * @author SPACE
 *
 */

//���ղ����� ʵ�� ģ������ ModelDrven
public class UserAction extends ActionSupport implements ModelDriven<User>{

	//ģ������ʹ�õĶ���
	private User user = new User();
	
	public User getModel() {
		return user;
	}
	
	//ע��UserService
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	//��תע��ҳ��
	public String registPage(){
		return "registPage";
		
	}
	
	//AJAX �����첽У���û�����ִ�з���
	public String findByName() throws IOException{
		//����Service ���в�ѯ
		User existUser = userService.findUsername(user.getUsername());
		
		//��ȡresponse������ҳ�������
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		
		//�ж�
		if(existUser != null ){
			//��ѯ�����û��� �û����Ѿ�����
			response.getWriter().println("<font color='red'>�û����Ѿ�����</font>");
			
		}else {
			//�û���������
			response.getWriter().println("<font color='green'>�û�������ʹ��</font>");
		}
		
		return NONE;
	}
	
	//�û�ע��ķ���
	public String regist(){
		userService.Save(user);
		return "loginPage";
	}
	
	//��ת��¼ҳ��
	public String loginPage(){
		return "loginPage" ;
	}
	
	//��¼����
	public String login(){
		User existUser = userService.login(user);
		if(existUser == null){
			//��¼ʧ��
			this.addActionError("��¼ʧ�ܣ��û��������������");
			return "loginPage";
		}else{
			//��¼�ɹ�
			//���û���Ϣ���뵽session��
			ServletActionContext.getRequest().getSession()
			.setAttribute("existUser",existUser);
			//ҳ����ת
			return "loginSuccess";
			
		}
	}
	
	//�û��˳��� ����session
	public String quit(){
		//����session
		ServletActionContext.getRequest().getSession().invalidate();
		
		return "quit";
	}
	
	//�޸���Ϣ
	public String userInfoUpdate(){
		userService.updateUserInfo(user);
		User existUser = userService.login(user);
		ServletActionContext.getRequest().getSession().setAttribute("existUser",existUser);
		return "userInfoUpdate";
		
	}
	
	
}
