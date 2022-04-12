package me.spring.game.beans;

import org.springframework.stereotype.Component;

@Component
public class GameDto {

	String game;
	String keyword;
	String locationdata;
	String startday;
	String endday;
	String homepage;
	String memo;
	String temp;
	
	public GameDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public GameDto(String game, String keyword, String locationdata, String startday, String endday, String homepage,
			String memo, String temp) {
		super();
		this.game = game;
		this.keyword = keyword;
		this.locationdata = locationdata;
		this.startday = startday;
		this.endday = endday;
		this.homepage = homepage;
		this.memo = memo;
		this.temp = temp;
	}


	public String getGame() {
		return game;
	}
	public void setGame(String game) {
		this.game = game;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getLocationdata() {
		return locationdata;
	}
	public void setLocationdata(String locationdata) {
		this.locationdata = locationdata;
	}
	public String getStartday() {
		return startday;
	}
	public void setStartday(String startday) {
		this.startday = startday;
	}
	public String getEndday() {
		return endday;
	}
	public void setEndday(String endday) {
		this.endday = endday;
	}
	public String getHomepage() {
		return homepage;
	}
	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getTemp() {
		return temp;
	}
	public void setTemp(String temp) {
		this.temp = temp;
	}
	@Override
	public String toString() {
		return "gameEntity [game=" + game + ", keyword=" + keyword + ", locationdata=" + locationdata + ", startday="
				+ startday + ", endday=" + endday + ", homepage=" + homepage + ", memo=" + memo + ", temp=" + temp
				+ "]";
	}
	
}
