package com.canvas;

import com.canvas.shapes.Line;
import com.canvas.shapes.Rectangle;
import com.canvas.shapes.Shape;

public class ShapeFactory {
	
	public Shape getShapeToDraw(final String shapeType){
		
		Shape shape = null;
		
		if("L".equalsIgnoreCase(shapeType)) {
			shape = new Line();
		}else if("R".equalsIgnoreCase(shapeType)) {
			shape = new Rectangle();
		}
		
		return shape;
	}

}
