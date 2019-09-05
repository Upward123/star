package com.weshare.dao;

import com.weshare.entity.Ad;

public interface AdDao {
	
	// 新加广告
	public void addAd(Ad ad);
	
	// 删除广告
	public void removeAd(Ad ad);
}
