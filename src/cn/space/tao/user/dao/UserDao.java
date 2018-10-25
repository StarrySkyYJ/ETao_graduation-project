package cn.space.tao.user.dao;

import java.util.List;

import javax.websocket.Session;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import cn.space.tao.user.vo.User;

/**
 * �û�ģ��־ò����
 * @author SPACE
 *
 */
@Transactional
public class UserDao extends HibernateDaoSupport{
	//�����β�ѯ�Ƿ��и��û���
	public User findUserName(String username){
		String hql = "from User where username =?" ;
		List<User> list = (List<User>) this.getHibernateTemplate().find(hql, username);
		System.out.println("���ݴ�С�� "+list.size());
		if(list != null && list.size() > 0){
			return list.get(0);
		}
		
		return null;
	}

	//ע���û��������ݿ����ʵ��
	public void Save(User user) {
		this.getHibernateTemplate().save(user);
	}
	
	//�û���¼��ѯ
	public User login(User user) {
		String hql = "from User where username = ? and password = ? ";
		List<User> list = (List<User>) this.getHibernateTemplate().find(hql, user.getUsername(),user.getPassword());
		if(list != null && list.size() > 0 ){
			return list.get(0);
		}
		return null;
	}
	
	//�û���Ϣ�޸�
	public void updateUserInfo(User user){
		this.getHibernateTemplate().update(user);
	}
}
