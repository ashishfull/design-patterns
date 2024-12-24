
package com.ashishrai.design_patterns.behavioral.visitor;

import java.math.BigDecimal;

public interface Shape {

	void accept(ShapeVisitor visitor);

	BigDecimal getArea();

	void draw();

	void scale(BigDecimal factor);
}
