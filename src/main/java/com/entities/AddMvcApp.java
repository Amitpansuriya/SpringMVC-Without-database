package com.entities;

import java.util.Date;

public class AddMvcApp {
	private String MvcTitle;
	private String MvcContent;
	private Date Mvcdate;
	public AddMvcApp(String mvcTitle, String mvcContent, Date mvcdate) {
		super();
		MvcTitle = mvcTitle;
		MvcContent = mvcContent;
		Mvcdate = mvcdate;
	}
	public String getMvcTitle() {
		return MvcTitle;
	}
	public void setMvcTitle(String mvcTitle) {
		MvcTitle = mvcTitle;
	}
	public String getMvcContent() {
		return MvcContent;
	}
	public void setMvcContent(String mvcContent) {
		MvcContent = mvcContent;
	}
	public Date getMvcdate() {
		return Mvcdate;
	}
	public void setMvcdate(Date mvcdate) {
		Mvcdate = mvcdate;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getMvcTitle()+" : "+this.getMvcContent();
	}
	public AddMvcApp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}