package me.spring.dao;

import java.util.List;

import me.spring.beans.MemberEntity;

public interface IMemberDao {

	public int insert(MemberEntity mEt);
	public MemberEntity select(String id);
	public int update(MemberEntity mEt);
	public int delete(String id);
	public List<MemberEntity> selectAll();
	
}
