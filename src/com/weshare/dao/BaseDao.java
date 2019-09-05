package com.weshare.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T> {

	// 内部自带机制
	public Serializable save(T o);
	public void delete(T o);
	public void updata(T o);
	public void saveOrUpdate(T o);
	
	public T get(Class<T> c, Serializable id);
	
	// 根据需要额外添加
	// 通过hql语句查询数据库
	public List<T> find(String hql);
	
	// 需要传参形式的hql
	public List<T> find(String hql, Object[] param);
}
