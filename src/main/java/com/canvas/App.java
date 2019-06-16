package com.canvas;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

import com.canvas.bean.CanvasBean;
import com.canvas.bean.CordinatesBean;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		getInput(null);
	}

	public static CanvasBean getInput(CanvasBean canvasBean) {

		InputStream stream = System.in;
		Scanner scanner = new Scanner(stream);
		System.out.println("enter command:");

		while (scanner.hasNext()) {

			String type = scanner.next();

			if ("C".equalsIgnoreCase(type)) {

				int width = scanner.nextInt();
				int hight = scanner.nextInt();

				canvasBean = new CanvasBean(width, hight);
				createCanvas(canvasBean);
				printShapes(canvasBean.getCanvasArrt());

				getInput(canvasBean);
			} if ("L".equalsIgnoreCase(type)) {

				int leftX = scanner.nextInt();
				int leftY = scanner.nextInt();
				int rightX = scanner.nextInt();
				int rightY = scanner.nextInt();

				CordinatesBean cordinatesBean = 
						new CordinatesBean(type, leftX, rightX, leftY, rightY);

				createLine(cordinatesBean, canvasBean);
				printShapes(canvasBean.getCanvasArrt());
				
				getInput(canvasBean);
			} else if ("Q".equalsIgnoreCase(type)) {
				scanner.close();
				System.out.println("Thank You !!!!!");
			}

		}

		return canvasBean;
	}

	private static void createCanvas(final CanvasBean canvasBean) {

		char[][] canvasArr = canvasBean.getCanvasArrt();

		Arrays.fill(canvasArr[0], '-');
		Arrays.fill(canvasArr[canvasBean.getHight() + 1], '-');

		int j = 1;

		while (j < canvasBean.getHight() + 1) {
			canvasArr[j][0] = '|';
			canvasArr[j][canvasBean.getWidth() - 1] = '|';

			j++;
		}

	}
	
	private static void createLine(CordinatesBean cordinatesBean, CanvasBean canvasBean) {
		
		char[][] canvasArr = canvasBean.getCanvasArrt();
		
		int i = cordinatesBean.getLeftX();
		int j = cordinatesBean.getLeftY();
		
		while(i<=cordinatesBean.getRightX() || j<=cordinatesBean.getRightY()) {
			
			if(i>cordinatesBean.getRightX()) {
				i = cordinatesBean.getRightX();
			}
			
			if(j>cordinatesBean.getRightY()) {
				j = cordinatesBean.getRightY();
			}
			
			canvasArr[i][j] = 'x';
			
				i++;
				j++;
			
		}
		
	}
	
private static void createQuadrilateral(CordinatesBean cordinatesBean, CanvasBean canvasBean) {
		
		char[][] canvasArr = canvasBean.getCanvasArrt();
		
		int i = cordinatesBean.getLeftX();
		int j = cordinatesBean.getLeftY();
		
		while(i<=cordinatesBean.getRightX() || j<=cordinatesBean.getRightY()) {
			
			if(i>cordinatesBean.getRightX()) {
				i = cordinatesBean.getRightX();
			}
			
			if(j>cordinatesBean.getRightY()) {
				j = cordinatesBean.getRightY();
			}
			
			canvasArr[i][j] = 'x';
			
				i++;
				j++;
			
		}
		
	}
	
	private static void printShapes(char[][] canvasArr) {
		
		for (char[] cs : canvasArr) {
			StringBuilder stringBuilder = 
					new StringBuilder();
			for (char cs2 : cs) {
				stringBuilder.append(cs2);
			}
			
			System.out.println(stringBuilder.toString());
		}
		
	}

}
