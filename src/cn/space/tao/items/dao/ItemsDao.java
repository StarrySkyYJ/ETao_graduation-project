package cn.space.tao.items.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import cn.space.tao.items.vo.Items;

/**
 * 商品   持久层代码
 * @author SPACE
 *
 */
@Transactional
public class ItemsDao extends HibernateDaoSupport {

	//首页上的热门商品查询：两种方式
	public List<Items> findHot() {
		//1. 使用离线条件查询
		DetachedCriteria criteria = DetachedCriteria.forClass(Items.class);
		//查询热门的商品，条件是ishot = 1 ;
		criteria.add(Restrictions.eq("ishot", 1));
		//倒序排序输出:
		criteria.addOrder(Order.desc("times"));
		//执行查询:
		List<Items> list = (List<Items>) this.getHibernateTemplate().findByCriteria(criteria, 0, 10);
		
		
		//2. 传统Hibernate api    HibernateCallback<Object> action
		//this.getHibernateTemplate().execute(null); 
		
		return list;
	}

	

	//根据商品id 查询商品
	public Items findById(Integer id) {
		return this.getHibernateTemplate().get(Items.class, id);
	}
}
