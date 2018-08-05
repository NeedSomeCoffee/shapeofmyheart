package edu.shapes.rectangular;

import edu.shapes.AbstractShape;

public class Square extends AbstractShape {
	private double side;

	public Square(double side) {
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}
	
	public double getArea() {
		return side * side;
	}
}
