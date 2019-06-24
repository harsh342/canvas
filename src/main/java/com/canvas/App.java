package com.canvas;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

import com.canvas.bean.CanvasBean;
import com.canvas.bean.CordinatesBean;
import com.canvas.shapes.Shape;

/**
 * Canvas App
 *
 */
public class App {

	public static void main(String[] args) {
		(new App()).getInput(null);
	}

	public CanvasBean getInput(CanvasBean canvasBean) {

		//Reading the input from STD IN 
		InputStream stream = System.in;
		Scanner scanner = new Scanner(stream);
		System.out.println("Enter Command:");

		while (scanner.hasNext()) {

			String type = scanner.next();

			if ("C".equalsIgnoreCase(type)) {

				int width = scanner.nextInt();
				int hight = scanner.nextInt();
				canvasBean = new CanvasBean(width, hight);
				createCanvas(canvasBean);
				
				(new Draw()).printShapes(canvasBean.getCanvasArrt());

				getInput(canvasBean);
				
			} else if ("Q".equalsIgnoreCase(type)) {
				scanner.close();
				System.out.println("Thank You !!!!!");
			}else {
				
				int leftX = scanner.nextInt();
				int leftY = scanner.nextInt();
				int rightX = scanner.nextInt();
				int rightY = scanner.nextInt();

				CordinatesBean cordinatesBean = 
						new CordinatesBean(leftX, rightX, leftY, rightY);
				
				Shape shape = (new ShapeFactory()).getShapeToDraw(type);
				
				shape.draw(cordinatesBean, canvasBean);
				
				(new Draw()).printShapes(canvasBean.getCanvasArrt());
				
				getInput(canvasBean);
			}

		}

		return canvasBean;
	}

	private void createCanvas(final CanvasBean canvasBean) {

		char[][] canvasArr = canvasBean.getCanvasArrt();

		Arrays.fill(canvasArr[0], '-');
		Arrays.fill(canvasArr[canvasBean.getHight() + 1], '-');

		int j = 1;

		while (j < canvasBean.getHight() + 1) {
			canvasArr[j][0] = '|';
			canvasArr[j][canvasBean.getWidth() + 1] = '|';

			j++;
		}

	}

}
