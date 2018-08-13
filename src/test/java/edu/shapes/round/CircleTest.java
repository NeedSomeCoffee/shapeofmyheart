package edu.shapes.round;

import static org.junit.Assert.*;
import org.junit.Test;

public class CircleTest {

	@Test
	public void givenValidSidesLength_ThenReturnValidAreaTest() {
		Circle circle = new Circle(13.12);

		double area = circle.getArea();		
		
		assertTrue(area >= 540.7 && area <= 540.8);
	}


	@Test
	public void givenZeroRaius_ThenReturnZeroAreaTest() {
		Circle circle = new Circle(0);

		double area = circle.getArea();
		
		assertTrue(area == 0);
	}
}
