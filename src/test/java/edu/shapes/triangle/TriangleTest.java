package edu.shapes.triangle;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void getAreaTest() {
		Triangle triangle = new Triangle(10, 10, 10);
		double area = triangle.getArea();
		
		assertTrue(area >= 99 && area <= 101);
	}

}
