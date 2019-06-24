package com.canvas.bean;

public final class CordinatesBean {
	
	private final int leftX;
	private final int rightX;
	private final int leftY;
	private final int rightY;
	
	public CordinatesBean(int leftX, int rightX, int leftY, int rightY) {
		super();
		this.leftX = leftX;
		this.rightX = rightX;
		this.leftY = leftY;
		this.rightY = rightY;
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
