package me.spring.bbs.beans;

public class BBSParser {

	public static BBSEntity parserBBSDTOtoEntity(BBSDto bbsDto) {

		return new BBSEntity(bbsDto.getNum(), bbsDto.getHit(), bbsDto.getTitle(), bbsDto.getContent(),
				bbsDto.getCategory(), bbsDto.getWrite(), bbsDto.getRegdate());

	}

	
	public static BBSDto ParserBBSEntitytoDto(BBSEntity bbsEntity) {
		
		BBSDto bbsDto = new BBSDto();
		
		bbsDto.setCategory(bbsEntity.getCategory());
		bbsDto.setContent(bbsEntity.getContent());
		bbsDto.setHit(bbsEntity.getHit());
		bbsDto.setNum(bbsEntity.getNum());
		bbsDto.setRegdate(bbsEntity.getRegdate());
		bbsDto.setTitle(bbsEntity.getTitle());
		bbsDto.setWrite(bbsEntity.getWrite());
		
		return bbsDto;
	
	}
	
}
