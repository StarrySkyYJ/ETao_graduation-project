package cn.space.tao.setting.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * ���� ���ҵ� �� ������Ϣ����
 * @author SPACE
 *
 */
public class SettingAction extends ActionSupport {
	
	public String allSetting(){
		return "allSetting"; 
		
	}
	
	//�û���Ϣ
	public String userInfo(){
		return "userInfo";
	}
	
	//������Ϣ
	public String userMassage(){
		return "userMassage";
	}
}
