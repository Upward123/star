package com.weshare.dao.impl;

import java.util.List;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.weshare.dao.UsersDAO;
import com.weshare.entity.Users;

public class UsersDAOImpl implements UsersDAO {

	SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Users> search(Users cond) {
		List<Users> uList = null;
		Session session = sessionFactory.getCurrentSession();
		String hql = "from Users u where u.loginName = ? and u.loginPwd = ?";
		Query<Users> query = session.createQuery(hql);
		query.setParameter(0, cond.getLoginName());
		query.setParameter(1, cond.getLoginPwd());
		uList = query.getResultList();
		return uList;
	}

}
