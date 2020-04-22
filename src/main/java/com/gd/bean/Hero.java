package com.gd.bean;

public class Hero {
	private Integer hid;
	private String hname;
	private Integer price;
	private Integer have;
	private Camp camp;
	public Integer getHid() {
		return hid;
	}
	public void setHid(Integer hid) {
		this.hid = hid;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getHave() {
		return have;
	}
	public void setHave(Integer have) {
		this.have = have;
	}
	public Camp getCamp() {
		return camp;
	}
	public void setCamp(Camp camp) {
		this.camp = camp;
	}
	@Override
	public String toString() {
		return "Hero [hid=" + hid + ", hname=" + hname + ", price=" + price + ", have=" + have + ", camp=" + camp + "]";
	}
	public Hero(Integer hid, String hname, Integer price, Integer have, Camp camp) {
		super();
		this.hid = hid;
		this.hname = hname;
		this.price = price;
		this.have = have;
		this.camp = camp;
	}
	public Hero() {
		super();
	}
	
}
