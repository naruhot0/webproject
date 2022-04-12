package me.spring.bbs.beans;

import java.sql.Timestamp;
import java.util.Objects;

import org.springframework.stereotype.Component;

@Component
public class BBSVO {

	private int num = 1 , hit = 0;
	private String title,content,category,write;
	private Timestamp regdate;
	public BBSVO() {}
	public BBSVO(int num, int hit, String title, String content, String category, String write,
			Timestamp regdate) {
		super();
		this.num = num;
		this.hit = hit;
		this.title = title;
		this.content = content;
		this.category = category;
		this.write = write;
		this.regdate = regdate;
	}
	
	
	
	public int getNum() {
		return num;
	}
	public int getHit() {
		return hit;
	}
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public String getCategory() {
		return category;
	}
	public String getWrite() {
		return write;
	}
	public Timestamp getRegdate() {
		return regdate;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(category, content, hit, num, regdate, title, write);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BBSVO other = (BBSVO) obj;
		return Objects.equals(category, other.category) && Objects.equals(content, other.content) && hit == other.hit
				&& num == other.num && Objects.equals(regdate, other.regdate)
				&& Objects.equals(title, other.title) && Objects.equals(write, other.write);
	}
	@Override
	public String toString() {
		return "BBSEntity [num=" + num + ", hit=" + hit + ", title=" + title + ", content=" + content
				+ ", category=" + category + ", write=" + write + ", regdate=" + regdate + "]";
	}
	
	
}
