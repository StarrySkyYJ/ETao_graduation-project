package cn.space.tao.user.dao;

import java.util.List;

import javax.websocket.Session;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import cn.space.tao.user.vo.User;

/**
 * 用户模块持久层代码
 * @author SPACE
 *
 */
@Transactional
public class UserDao extends HibernateDaoSupport{
	//按名次查询是否有该用户：
	public User findUserName(String username){
		String hql = "from User where username =?" ;
		List<User> list = (List<User>) this.getHibernateTemplate().find(hql, username);
		System.out.println("数据大小： "+list.size());
		if(list != null && list.size() > 0){
			return list.get(0);
		}
		
		return null;
	}

	//注册用户存入数据库代码实现
	public void Save(User user) {
		this.getHibernateTemplate().save(user);
	}
	
	//用户登录查询
	public User login(User user) {
		String hql = "from User where username = ? and password = ? ";
		List<User> list = (List<User>) this.getHibernateTemplate().find(hql, user.getUsername(),user.getPassword());
		if(list != null && list.size() > 0 ){
			return list.get(0);
		}
		return null;
	}
	
	//用户信息修改
	public void updateUserInfo(User user){
		this.getHibernateTemplate().update(user);
	}
}
