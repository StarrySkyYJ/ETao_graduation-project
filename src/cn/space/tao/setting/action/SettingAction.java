package cn.space.tao.setting.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 设置 ，我的 ， 个人信息，等
 * @author SPACE
 *
 */
public class SettingAction extends ActionSupport {
	
	public String allSetting(){
		return "allSetting"; 
		
	}
	
	//用户信息
	public String userInfo(){
		return "userInfo";
	}
	
	//留言信息
	public String userMassage(){
		return "userMassage";
	}
}
