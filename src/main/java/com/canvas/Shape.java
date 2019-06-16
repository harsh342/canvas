package com.canvas;

public interface Shape {
	
	public void draw();

	/*
	 * int i = 0;
	 * 
	 * while (i < (canvasBean.getHight() + 2)) {
	 * 
	 * int j = 0;
	 * 
	 * StringBuilder stringBuilder = new StringBuilder();
	 * 
	 * while (j < canvasBean.getWidth()) {
	 * 
	 * if (i == 0 || i == canvasBean.getHight() + 1) { stringBuilder.append("-"); }
	 * else if (j == 0 || j == canvasBean.getWidth() - 1) {
	 * stringBuilder.append("|"); } else { stringBuilder.append(" "); }
	 * 
	 * j++; }
	 * 
	 * System.out.println(stringBuilder.toString());
	 * 
	 * i++; }
	 */
	
}
