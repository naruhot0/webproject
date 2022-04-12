package me.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.spring.beans.MemberDto;
import me.spring.beans.MemberEntity;
import me.spring.beans.MemberParser;
import me.spring.dao.MemberDao;

@Service
public class MemberService {
	private final MemberDao memberDao;

	@Autowired
	public MemberService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	public boolean signup(MemberDto member) {
		
		if(!canSignup(member)) return false;
		
		MemberEntity memberEntity = MemberParser.parserMemberDTOtoEntity(member);
		System.out.println(member);
		System.out.println(memberEntity);
		return memberDao.insert(memberEntity) > 0;

	}

	public MemberDto select(String id) {
		
		if(!canSelect(id))return null;
		
		MemberEntity memberEntity = memberDao.select(id);
		MemberDto memberDto = MemberParser.parserMemberEntitytoDto(memberEntity);
		return memberDto;
		
	}
	
	
	
	
	//예외처리
	
	public boolean canSelect(String id) {
		List<MemberEntity> memberEntitys = memberDao.selectAll();
		boolean isMember = false;
		for (MemberEntity memberEntity : memberEntitys) {
			if (memberEntity.getId() != null && memberEntity.getId().equals(id)) {
				isMember = true;
				break;

			}

		}

		return isMember;

	}
	
	public boolean canSignup(MemberDto member) {
		MemberEntity memberEntity = memberDao.select(member.getId());
		if(memberEntity != null) {
			
			return false;
			
		}
		return true;
		}
	
}
