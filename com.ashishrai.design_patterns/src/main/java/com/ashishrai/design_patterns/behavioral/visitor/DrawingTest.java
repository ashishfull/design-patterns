
package com.ashishrai.design_patterns.behavioral.visitor;

import java.math.BigDecimal;

public class DrawingTest {

	public static void main(String[] args) {

		Shape[] shapes = { new Circle(BigDecimal.valueOf(5)), new Rectangle(BigDecimal.valueOf(4), BigDecimal.valueOf(6))/*,
		                                                                                                                 new Triangle(3, 4)*/
		};
		ShapeVisitor areaCalculator = new AreaCalculator();
		ShapeVisitor drawShape = new DrawShape();
		ScaleShape scaleShape = new ScaleShape(BigDecimal.valueOf(3));
		System.out.println("Performing Area Calculation:");
		for (Shape shape : shapes) {
			shape.accept(drawShape);
			shape.accept(areaCalculator);
			shape.accept(scaleShape);
			shape.accept(areaCalculator);
		}
	}
}
