package me.spring.game.dao;

import java.util.List;

import me.spring.game.beans.GameEntity;

public interface IGameDao {

	public int insert (GameEntity gameEntity);
	public GameEntity select (String game);
	public int update(GameEntity gameEntity);
	public int delete(String game);
	public List<GameEntity> selectAll();
	
	
	
	
	
}
