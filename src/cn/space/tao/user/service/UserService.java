package cn.space.tao.user.service;

import org.springframework.transaction.annotation.Transactional;

import cn.space.tao.user.dao.UserDao;
import cn.space.tao.user.vo.User;

/**
 * �û�ģ��ҵ������
 * @author SPACE
 *
 */

@Transactional
public class UserService {
	//ע��UserDao �� ��UserDao���е���
	private UserDao userDao ;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	//���û�����ѯ�û��ķ�����
	public User findUsername(String username){
		return userDao.findUserName(username);
	}

	//ҵ�������û�ע�����
	public void Save(User user) {
		//����Dao �������ݿ�
		userDao.Save(user);
	}
	
	//�û���¼��ѯ
	public User login(User user) {
		//����Dao�û���ѯ
		return userDao.login(user);
	}
	
	//�û���Ϣ�޸�
	public void updateUserInfo(User user){
		userDao.updateUserInfo(user);
	}
	
}
