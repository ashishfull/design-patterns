
package com.ashishrai.design_patterns.behavioral.visitor;

import java.math.BigDecimal;

public class ScaleShape implements ShapeVisitor {

	private BigDecimal factor;

	public ScaleShape(BigDecimal factor) {

		this.factor = factor;
	}

	@Override
	public void visit(Shape shape) {

		if (shape instanceof Circle) {
			Circle circle = (Circle) shape;
			circle.scale(factor);
		} else if (shape instanceof Rectangle) {
			Rectangle rectangle = (Rectangle) shape;
			rectangle.scale(factor);
		}
	}
}
