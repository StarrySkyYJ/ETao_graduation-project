package cn.space.tao.search.dao;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import cn.space.tao.items.vo.Items;

@Transactional
public class SearchDao extends HibernateDaoSupport {

	public List<Items> menuSearch(String search) {
		String hql = "from Items where itemsname like ?" ;
		List<Items> ilist = (List<Items>) this.getHibernateTemplate().find(hql, "%"+search+"%");
		return ilist;
	}

}
