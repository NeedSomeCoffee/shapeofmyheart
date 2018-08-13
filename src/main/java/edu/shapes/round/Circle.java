package edu.shapes.round;

import edu.shapes.AbstractShape;

public class Circle extends AbstractShape {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}	
	
	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Circle [radius=");
		builder.append(radius);
		builder.append("]");
		return builder.toString();
	}
}
