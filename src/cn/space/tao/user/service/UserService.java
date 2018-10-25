package cn.space.tao.user.service;

import org.springframework.transaction.annotation.Transactional;

import cn.space.tao.user.dao.UserDao;
import cn.space.tao.user.vo.User;

/**
 * 用户模块业务层代码
 * @author SPACE
 *
 */

@Transactional
public class UserService {
	//注入UserDao ， 对UserDao进行调用
	private UserDao userDao ;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	//按用户名查询用户的方法：
	public User findUsername(String username){
		return userDao.findUserName(username);
	}

	//业务层完成用户注册代码
	public void Save(User user) {
		//调用Dao 存入数据库
		userDao.Save(user);
	}
	
	//用户登录查询
	public User login(User user) {
		//调用Dao用户查询
		return userDao.login(user);
	}
	
	//用户信息修改
	public void updateUserInfo(User user){
		userDao.updateUserInfo(user);
	}
	
}
