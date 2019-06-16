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
				System.out.println(width+":::"+hight);
				canvasBean = new CanvasBean(width, hight);
				createCanvas(canvasBean);
				printShapes(canvasBean.getCanvasArrt());

				getInput(canvasBean);
			} else if ("L".equalsIgnoreCase(type)) {

				int leftX = scanner.nextInt();
				int leftY = scanner.nextInt();
				int rightX = scanner.nextInt();
				int rightY = scanner.nextInt();

				CordinatesBean cordinatesBean = 
						new CordinatesBean(leftX, rightX, leftY, rightY);

				createLine(cordinatesBean, canvasBean);
				printShapes(canvasBean.getCanvasArrt());
				
				getInput(canvasBean);
			} else if ("R".equalsIgnoreCase(type)) {

				int leftX = scanner.nextInt();
				int leftY = scanner.nextInt();
				int rightX = scanner.nextInt();
				int rightY = scanner.nextInt();

				CordinatesBean cordinatesBean = 
						new CordinatesBean(leftX, rightX, leftY, rightY);

				createQuadrilateral(cordinatesBean, canvasBean);
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
			canvasArr[j][canvasBean.getWidth()+1] = '|';

			j++;
		}

	}
	
	private static void createLine(CordinatesBean cordinatesBean, CanvasBean canvasBean) {
		
		char[][] canvasArr = canvasBean.getCanvasArrt();
		
		int i = 0;
		int j = 0;
		
		while(i<=(cordinatesBean.getRightX()-cordinatesBean.getLeftX()) 
					|| j<=(cordinatesBean.getRightY()-cordinatesBean.getLeftY())) {
			
			
			  if(cordinatesBean.getRightX() == cordinatesBean.getLeftX()) {
				  i = 0; 
				  }
			  
			  if(cordinatesBean.getRightY()==cordinatesBean.getLeftY()) {
				  j = 0;
				  }
			 
			
			canvasArr[cordinatesBean.getLeftX()+i][cordinatesBean.getLeftY()+j] = 'x';
			
				i++;
				j++;
			
		}
		
	}
	
private static void createQuadrilateral(CordinatesBean cordinatesBean, CanvasBean canvasBean) {
		
		char[][] canvasArr = canvasBean.getCanvasArrt();
		
		int i = 0;
		int j = 0;
		
		while(i<= (cordinatesBean.getRightX()-cordinatesBean.getLeftX())) {
			
			canvasArr[cordinatesBean.getLeftY()][cordinatesBean.getLeftX()+i] = 'x';
			canvasArr[cordinatesBean.getRightY()][cordinatesBean.getLeftX()+i] = 'x';
			
				i++;
		}
		
		while(j <= (cordinatesBean.getRightY()-cordinatesBean.getLeftY())) {
			
			canvasArr[cordinatesBean.getLeftY()+j][cordinatesBean.getLeftX()] = 'x';
			canvasArr[cordinatesBean.getLeftY()+j][cordinatesBean.getRightX()] = 'x';
			
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
