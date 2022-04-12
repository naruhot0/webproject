package me.spring.game.beans;

public class GameParser {

	//dto를 ent로 변환해서 db랑 연동하여 활용할수 있게 한다
	// 근데 난 dto랑 entity랑 같아서 크게 필요는 없는데 
	// 데이터 수정하는 코드가 추가되거나 할때는 분리해두는게 낫다
	public static GameEntity parserGameDtoToEnt(GameDto gameDto) {
		
		return new GameEntity(
				gameDto.getGame(),
				gameDto.getKeyword(),
				gameDto.getLocationdata(),
				gameDto.getStartday(),
				gameDto.getEndday(),
				gameDto.getHomepage(),
				gameDto.getMemo(),
				gameDto.getTemp());
	}
	
	//위의 코드와 역방향코드이다 위의코드는 생성과 동시에 추가 밑은 생성하고 추가
	public static GameDto parserGameEntToDto(GameEntity gameEnt) {
		
		GameDto gameDto = new GameDto();
		
		gameDto.setGame(gameEnt.getGame());
		gameDto.setKeyword(gameEnt.getKeyword());
		gameDto.setLocationdata(gameEnt.getLocationdata());
		gameDto.setStartday(gameEnt.getStartday());
		gameDto.setEndday(gameEnt.getEndday());
		gameDto.setHomepage(gameEnt.getHomepage());
		gameDto.setMemo(gameEnt.getMemo());
		gameDto.setTemp(gameEnt.getTemp());
		return gameDto;
	
	}
	
	
	
	
	
}
