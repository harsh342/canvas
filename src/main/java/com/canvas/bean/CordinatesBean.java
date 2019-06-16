package com.canvas.bean;

public final class CordinatesBean {
	
	private final String type;
	private final int leftX;
	private final int rightX;
	private final int leftY;
	private final int rightY;
	
	public CordinatesBean(String type, int leftX, int rightX, int leftY, int rightY) {
		super();
		this.type = type;
		this.leftX = leftX;
		this.rightX = rightX;
		this.leftY = leftY;
		this.rightY = rightY;
	}
	
	public String getType() {
		return type;
	}

	public int getLeftX() {
		return leftX;
	}
	public int getRightX() {
		return rightX;
	}
	public int getLeftY() {
		return leftY;
	}
	public int getRightY() {
		return rightY;
	}
	
}
