package edu.shapes.rectangular;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.shapes.round.Circle;

public class SquareTest {

	@Test
	public void getAreaTest() {
		Square circle = new Square(13.12);
		
		double area = circle.getArea();
		
		assertTrue(area >= 99 && area <= 101);
	}

}
