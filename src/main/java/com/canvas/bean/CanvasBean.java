   package com.canvas.bean;

public final class CanvasBean {
	
	private final int width;
	private final int hight;
	private final char[][] canvasArrt;
	
	public CanvasBean(final int width, final int hight) {
		super();
		this.width = width;
		this.hight = hight;
		canvasArrt = new char[hight+2][width+2];
	}
	public int getWidth() {
		return width;
	}
	public int getHight() {
		return hight;
	}
	public char[][] getCanvasArrt() {
		return canvasArrt;
	}
	
}
