package me.spring.beans;

public class MemberParser {

	public static MemberEntity parserMemberDTOtoEntity(MemberDto memberDto) {

		return new MemberEntity(memberDto.getId(), memberDto.getPwd(), memberDto.getName(), memberDto.getEmail());

	}

	public static MemberDto parserMemberEntitytoDto(MemberEntity memberEntity) {

		MemberDto memberDto = new MemberDto();

		memberDto.setId(memberEntity.getId());
		memberDto.setPwd(memberEntity.getPwd());
		memberDto.setName(memberEntity.getName());
		memberDto.setEmail(memberEntity.getEmail());

		return memberDto;

	}

}
