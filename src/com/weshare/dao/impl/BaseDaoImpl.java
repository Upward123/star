package com.weshare.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.weshare.dao.BaseDao;

public class BaseDaoImpl<T> implements BaseDao<T> {
	
	// 获取session
	private SessionFactory sessionFactory;
	public SessionFactory getCurrentSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public Session getCurrentSession() {

		return this.sessionFactory.getCurrentSession();
	}
	
	@Override
	public Serializable save(T o) {
		return this.getCurrentSession().save(o);
	}

	@Override
	public void delete(T o) {
		this.getCurrentSession().delete(o);
		
	}

	@Override
	public void updata(T o) {
		// TODO Auto-generated method stub
		this.getCurrentSession().update(o);
	}

	@Override
	public void saveOrUpdate(T o) {
		// TODO Auto-generated method stub
		this.getCurrentSession().saveOrUpdate(o);
	}

	@Override
	public T get(Class<T> c, Serializable id) {
		// TODO Auto-generated method stub
		return (T) this.getCurrentSession().get(c, id);
	}

	@Override
	public List<T> find(String hql) {
		// TODO Auto-generated method stub
		return this.getCurrentSession().createQuery(hql).getResultList();
	}
	
	@Override
	public List<T> find(String hql, Object[] param) {
		Query<T> q = this.getCurrentSession().createQuery(hql);
		if (param != null && param.length > 0) {
			for (int i = 0; i < param.length; i++) {
				q.setParameter(i, param[i]);
			}
		}
		return q.getResultList();
	}

}
