
package com.ashishrai.design_patterns.behavioral.visitor;

public class DrawShape implements ShapeVisitor {

	@Override
	public void visit(Shape shape) {

		if (shape instanceof Circle) {
			Circle circle = (Circle) shape;
			circle.draw();
		} else if (shape instanceof Rectangle) {
			Rectangle rectangle = (Rectangle) shape;
			rectangle.draw();
		}
	}
}
