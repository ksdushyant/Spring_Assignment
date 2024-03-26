package com.springcore.question_two;

public class q2 {

	private int width;
	private int height;
	private String bgcolor;
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public String getBgcolor() {
		return bgcolor;
	}
	public void setBgcolor(String bgcolor) {
		this.bgcolor = bgcolor;
	}
	
	public q2(int width, int height, String bgcolor) {
		super();
		this.width = width;
		this.height = height;
		this.bgcolor = bgcolor;
	}
	
	public q2() {
		super();
	}
	
	@Override
	public String toString() {
		return "q2 [width=" + width + ", height=" + height + ", bgcolor=" + bgcolor + "]";
	}
}
