package me.spring.bbs.service;

import java.util.List;
import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.spring.bbs.beans.BBSDto;
import me.spring.bbs.beans.BBSEntity;
import me.spring.bbs.beans.BBSParser;
import me.spring.bbs.dao.BBSDao;

@Service
public class BBSService {
	private final BBSDao bbsDao;
	
	@Autowired
	public BBSService(BBSDao bbsDao) {
		
		this.bbsDao = bbsDao;
	
	}
	
	public boolean writePost(BBSDto bbsPost) {
		
		BBSEntity bbsEntity = BBSParser.parserBBSDTOtoEntity(bbsPost);
		
		return bbsDao.insert(bbsEntity) > 0;
		
	}
	
	public List<BBSDto> sellectAll(){
		List<BBSDto> bbsDtos = new Vector<>();
		List<BBSEntity> bbsEntitys = bbsDao.selectAll();
		for(BBSEntity bbsEntity : bbsEntitys) {
			
			bbsDtos.add(BBSParser.ParserBBSEntitytoDto(bbsEntity));
			
		}
	
		return bbsDtos;
	
	}
	
	public BBSDto selectPage(String bbsID) {
		
		int bbsid = Integer.parseInt(bbsID);
		BBSEntity bbsEntity = bbsDao.select(bbsid);//아직 hit가 기존
		//hit를 1올려라 
		System.out.println("갱신전"+bbsEntity);
		bbsEntity.setHit(bbsEntity.getHit()+1);
		System.out.println("갱신후"+bbsEntity);
		//db의 hit 1올림
		bbsDao.update(bbsEntity);
		System.out.println("업데이트중?"+bbsEntity);
		//entity = > dto로 바꾸고
		BBSDto bbsDto = BBSParser.ParserBBSEntitytoDto(bbsEntity);
		System.out.println("page의 내용물??"+bbsDto);
		return bbsDto;
		
	}
	
	
	
}
