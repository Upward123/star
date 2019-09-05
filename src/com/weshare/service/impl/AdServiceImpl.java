package com.weshare.service.impl;

import com.weshare.dao.AdDao;
import com.weshare.entity.Ad;
import com.weshare.service.AdService;

/*  暂时不使用，后期可扩展 */
public class AdServiceImpl implements AdService {

	AdDao adDao;
	@Override
	public void addAd(Ad d) {
		// TODO Auto-generated method stub
		adDao.addAd(d);
	}

	@Override
	public void removeAd(Ad d) {
		// TODO Auto-generated method stub
		adDao.removeAd(d);
	}

}
