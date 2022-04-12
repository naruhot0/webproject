package me.spring.game.service;

import java.util.List;
import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.spring.game.beans.GameDto;
import me.spring.game.beans.GameEntity;
import me.spring.game.beans.GameParser;
import me.spring.game.dao.GameDao;

@Service
public class GameService {

	private final GameDao gameDao;
	
	@Autowired
	public GameService(GameDao gameDao) {
		
		this.gameDao = gameDao;
	}
	
	
	public List<GameDto> sellectAll(){
		//백터로 선언하여 멀티스레드 환경에서도 안전
		List<GameDto> gameDtos = new Vector<>();
		List<GameEntity> gameEnts = gameDao.selectAll();
		
		for(GameEntity gameEnt : gameEnts) {
			
			gameDtos.add(GameParser.parserGameEntToDto(gameEnt));
			
			
		}
		
		return gameDtos;
		
	}
	
	public GameDto selectGame(String game) {
		
		GameEntity gameEnt = gameDao.select(game);
		
		GameDto gameDto = GameParser.parserGameEntToDto(gameEnt);
		
		return gameDto;	
	}
	
	
	
	
}
