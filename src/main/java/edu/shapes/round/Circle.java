package edu.shapes.round;

import edu.shapes.AbstractShape;

public class Circle extends AbstractShape {
	private static final double PI = 3.14159;
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}	
	
	public double getArea() {
		return PI * radius * radius;
	}
}
