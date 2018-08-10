package edu.shapes.round;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircleTest {

	@Test
	public void getAreaTest() {
		Circle circle = new Circle(13.12);
		
		double area = circle.getArea();
		
		assertTrue(area >= 99 && area <= 101);
	}

}
