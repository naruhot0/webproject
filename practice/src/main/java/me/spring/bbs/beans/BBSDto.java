package me.spring.bbs.beans;

import java.sql.Timestamp;

import org.springframework.stereotype.Component;

@Component
public class BBSDto {

	private int num = 1 , hit = 0;
	private String title,content,category,write;
	private Timestamp regdate;
	
	public BBSDto() {}
	public BBSDto(int num, int hit, String title, String content, String category, String write,
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
	public void setNum(int num) {
		this.num = num;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getWrite() {
		return write;
	}
	public void setWrite(String write) {
		this.write = write;
	}
	public Timestamp getRegdate() {
		return regdate;
	}
	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "BBSDto [num=" + num + ", hit=" + hit + ", title=" + title + ", content=" + content
				+ ", category=" + category + ", write=" + write + ", regdate=" + regdate + "]";
	}
	
	
}
