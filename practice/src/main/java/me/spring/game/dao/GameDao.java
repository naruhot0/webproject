package me.spring.game.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import me.spring.game.beans.GameEntity;

@Repository
public class GameDao implements IGameDao {

	private final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public GameDao(JdbcTemplate jdbcTemplate) {
		
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insert(GameEntity gameEntity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public GameEntity select(String game) {
		// TODO Auto-generated method stub
		List<GameEntity> games = null;
		String SQL = "select * from game where game=?";
		games = jdbcTemplate.query(SQL, new RowMapper<GameEntity>() {

			@Override
			public GameEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				GameEntity game = new GameEntity();
				game.setGame(rs.getString("Game"));
				game.setKeyword(rs.getString("keyword"));
				game.setLocationdata(rs.getString("Locationdata"));
				game.setStartday(rs.getString("Startday"));
				game.setEndday(rs.getString("Endday"));
				game.setHomepage(rs.getString("Homepage"));
				game.setMemo(rs.getString("Memo"));
				game.setTemp(rs.getString("Temp"));
				
				return game;
			}
			},game);
		
		if(games == null || games.isEmpty()) return null;
		System.out.println(games.get(0)+"이벤트불러오기 완료");
		return games.get(0);
	}

	@Override
	public int update(GameEntity gameEntity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String game) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<GameEntity> selectAll() {
		List<GameEntity> games = null;
		String SQL = "select * from game";
		games = jdbcTemplate.query(SQL, new RowMapper<GameEntity>() {

			@Override
			public GameEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				GameEntity game = new GameEntity();
				game.setGame(rs.getString("Game"));
				game.setKeyword(rs.getString("keyword"));
				game.setLocationdata(rs.getString("Locationdata"));
				game.setStartday(rs.getString("Startday"));
				game.setEndday(rs.getString("Endday"));
				game.setHomepage(rs.getString("Homepage"));
				game.setMemo(rs.getString("Memo"));
				game.setTemp(rs.getString("Temp"));
				
				return game;
			}
			});
		
		if(games == null || games.isEmpty()) return null;
		System.out.println("이벤트 전부 불러오기 완료");
		return games;
	}
	
	
}
