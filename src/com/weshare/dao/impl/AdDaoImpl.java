package com.weshare.dao.impl;

import com.weshare.dao.AdDao;
import com.weshare.entity.Ad;

public class AdDaoImpl extends BaseDaoImpl implements AdDao {

	@Override
	public void addAd(Ad ad) {
		super.save(ad);
	}

	@Override
	public void removeAd(Ad ad) {
		super.delete(ad);
	}

}
