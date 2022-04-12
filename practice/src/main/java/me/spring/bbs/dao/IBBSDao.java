package me.spring.bbs.dao;

import java.util.List;

import me.spring.bbs.beans.BBSEntity;


public interface IBBSDao {

	public int insert(BBSEntity bbsEntity);
	public BBSEntity select(int num);
	public int update(BBSEntity bbsEntity);
	public int delete(int num);
	public List<BBSEntity> selectAll();
	

}
