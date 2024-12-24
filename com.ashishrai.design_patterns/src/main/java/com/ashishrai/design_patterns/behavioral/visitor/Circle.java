
package com.ashishrai.design_patterns.behavioral.visitor;

import java.math.BigDecimal;

public class Circle implements Shape {

	private BigDecimal radius;

	public Circle(BigDecimal radius) {

		this.radius = radius;
	}

	@Override
	public void accept(ShapeVisitor visitor) {

		visitor.visit(this);
	}

	@Override
	public BigDecimal getArea() {

		return BigDecimal.valueOf(Math.PI).multiply(radius).multiply(radius);
	}

	@Override
	public void draw() {

		System.out.println("Drawing a Circle with radius " + radius);
	}

	@Override
	public void scale(BigDecimal factor) {

		this.radius = radius.multiply(factor);
	}
}
