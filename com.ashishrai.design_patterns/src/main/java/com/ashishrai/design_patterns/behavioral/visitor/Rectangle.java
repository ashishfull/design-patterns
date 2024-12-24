
package com.ashishrai.design_patterns.behavioral.visitor;

import java.math.BigDecimal;

public class Rectangle implements Shape {

	private BigDecimal length, breadth;

	public Rectangle(BigDecimal length, BigDecimal breadth) {

		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void accept(ShapeVisitor visitor) {

		visitor.visit(this);
	}

	@Override
	public BigDecimal getArea() {

		return length.multiply(breadth);
	}

	@Override
	public void draw() {

		System.out.println(String.format("Drawing a Rectange with length %s and breadth %s ", length, breadth));
	}

	@Override
	public void scale(BigDecimal factor) {

		this.length = length.multiply(factor);
		this.breadth = breadth.multiply(factor);
	}
}
