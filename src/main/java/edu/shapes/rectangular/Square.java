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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Square [side=");
		builder.append(side);
		builder.append("]");
		return builder.toString();
	}
}
