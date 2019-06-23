package com.canvas;

public class Draw {

	public void printShapes(char[][] canvasArr) {

		for (char[] cs : canvasArr) {
			StringBuilder stringBuilder = new StringBuilder();
			for (char cs2 : cs) {
				stringBuilder.append(cs2);
			}

			System.out.println(stringBuilder.toString());
		}

	}
	
}
