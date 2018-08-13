package edu.shapes.triangle;

import static org.junit.Assert.*;
import org.junit.Test;

public class TriangleTest {

	@Test
	public void givenValidSidesLength_ThenReturnValidAreaTest() {
		Triangle triangle = new Triangle(10.2, 14.3, 9.8);
		double area = triangle.getArea();
		
		assertTrue(area >= 49.96 && area <= 49.97);
	}	
}
