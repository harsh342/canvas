package com.canvas.shapes;

import com.canvas.bean.CanvasBean;
import com.canvas.bean.CordinatesBean;

public interface Shape {
	
	void draw(CordinatesBean cordinatesBean, CanvasBean canvasBean);
	
}
