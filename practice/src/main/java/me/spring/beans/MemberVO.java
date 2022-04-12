package me.spring.beans;

import java.util.Objects;

import org.springframework.stereotype.Component;

@Component
public class MemberVO {

	private String id;
	private String pwd;
	private String name;
	private String email;
	
	public MemberVO() {}
	public MemberVO(String id) {
		
		this.id = id;
		
		
	}
	public MemberVO(String id, String pwd, String name, String email) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
	}
	
	public String getId() {
		return id;
	}
	public String getPwd() {
		return pwd;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	@Override
	public int hashCode() {
		return Objects.hash(email, id, name, pwd);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberVO other = (MemberVO) obj;
		return Objects.equals(email, other.email) && Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(pwd, other.pwd);
	}
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", pwd=" + pwd + ", name=" + name + ", email=" + email + "]";
	}
	
	
	
	
}
