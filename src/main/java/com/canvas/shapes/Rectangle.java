package com.canvas.shapes;

import com.canvas.bean.CanvasBean;
import com.canvas.bean.CordinatesBean;

public class Rectangle implements Shape {

	@Override
	public void draw(CordinatesBean cordinatesBean, CanvasBean canvasBean) {
		char[][] canvasArr = canvasBean.getCanvasArrt();

		int i = 0;
		int j = 0;

		while (i <= (cordinatesBean.getRightX() - cordinatesBean.getLeftX())) {

			canvasArr[cordinatesBean.getLeftY()][cordinatesBean.getLeftX() + i] = 'x';
			canvasArr[cordinatesBean.getRightY()][cordinatesBean.getLeftX() + i] = 'x';

			i++;
		}

		while (j <= (cordinatesBean.getRightY() - cordinatesBean.getLeftY())) {

			canvasArr[cordinatesBean.getLeftY() + j][cordinatesBean.getLeftX()] = 'x';
			canvasArr[cordinatesBean.getLeftY() + j][cordinatesBean.getRightX()] = 'x';

			j++;

		}

	}

}
