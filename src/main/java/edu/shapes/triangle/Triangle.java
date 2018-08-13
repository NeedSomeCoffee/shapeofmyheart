package edu.shapes.triangle;

import edu.shapes.AbstractShape;

public class Triangle extends AbstractShape {
	private double sideOne;
	private double sideTwo;
	private double sideThree;
	
	public Triangle(double sideOne, double sideTwo, double sideThree) {		
		this.sideOne = sideOne;
		this.sideTwo = sideTwo;
		this.sideThree = sideThree;
	}
	
	public double getSideOne() {
		return sideOne;
	}

	public double getSideTwo() {
		return sideTwo;
	}

	public double getSideThree() {
		return sideThree;
	}	
	
	public double getArea() {
		double halfPerimeter = getHalfPerimeter();
		
		return Math.sqrt(halfPerimeter * (halfPerimeter - sideOne) * (halfPerimeter - sideTwo) * (halfPerimeter - sideThree));
	}
	
	private double getHalfPerimeter() {
		return (sideOne + sideTwo + sideThree) / 2;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Triangle [sideOne=");
		builder.append(sideOne);
		builder.append(", sideTwo=");
		builder.append(sideTwo);
		builder.append(", sideThree=");
		builder.append(sideThree);
		builder.append("]");
		return builder.toString();
	}
}
