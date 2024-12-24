
package com.ashishrai.design_patterns.behavioral.visitor;

public class AreaCalculator implements ShapeVisitor {

	@Override
	public void visit(Shape shape) {

		if (shape instanceof Circle) {
			Circle circle = (Circle) shape;
			System.out.println("Calculating area of Circle: " + circle.getArea());
		} else if (shape instanceof Rectangle) {
			Rectangle rectangle = (Rectangle) shape;
			System.out.println("Calculating area of Rectangle: " + rectangle.getArea());
		} /*else if (shape instanceof Triangle) {
		  Triangle triangle = (Triangle) shape;
		  System.out.println("Calculating area of Triangle: " + triangle.getArea());
		  }*/
	}
}
