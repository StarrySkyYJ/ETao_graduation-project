package cn.space.tao.items.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import cn.space.tao.items.vo.Items;

/**
 * ��Ʒ   �־ò����
 * @author SPACE
 *
 */
@Transactional
public class ItemsDao extends HibernateDaoSupport {

	//��ҳ�ϵ�������Ʒ��ѯ�����ַ�ʽ
	public List<Items> findHot() {
		//1. ʹ������������ѯ
		DetachedCriteria criteria = DetachedCriteria.forClass(Items.class);
		//��ѯ���ŵ���Ʒ��������ishot = 1 ;
		criteria.add(Restrictions.eq("ishot", 1));
		//�����������:
		criteria.addOrder(Order.desc("times"));
		//ִ�в�ѯ:
		List<Items> list = (List<Items>) this.getHibernateTemplate().findByCriteria(criteria, 0, 10);
		
		
		//2. ��ͳHibernate api    HibernateCallback<Object> action
		//this.getHibernateTemplate().execute(null); 
		
		return list;
	}

	

	//������Ʒid ��ѯ��Ʒ
	public Items findById(Integer id) {
		return this.getHibernateTemplate().get(Items.class, id);
	}
}
