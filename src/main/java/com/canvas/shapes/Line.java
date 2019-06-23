package com.canvas.shapes;

import com.canvas.bean.CanvasBean;
import com.canvas.bean.CordinatesBean;

public class Line implements Shape{

	@Override
	public void draw(final CordinatesBean cordinatesBean, final CanvasBean canvasBean) {
		
		char[][] canvasArr = canvasBean.getCanvasArrt();

		int i = 0;
		int j = 0;

		while (i <= (cordinatesBean.getRightX() - cordinatesBean.getLeftX())
				|| j <= (cordinatesBean.getRightY() - cordinatesBean.getLeftY())) {

			if (cordinatesBean.getRightX() == cordinatesBean.getLeftX()) {
				i = 0;
			}

			if (cordinatesBean.getRightY() == cordinatesBean.getLeftY()) {
				j = 0;
			}

			canvasArr[cordinatesBean.getLeftY() + j][cordinatesBean.getLeftX() + i] = 'x';

			i++;
			j++;

		}
		
	}

}
