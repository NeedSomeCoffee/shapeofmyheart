package edu.shapes.rectangular;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

	@Test
	public void  givenValidSideLength_ThenReturnValidAreaTest() {
		Square square = new Square(13.12);
		
		double area = square.getArea();
		
		System.out.print(area);
		
		assertTrue(area >= 172.1 && area <= 173.2);
	}
	
	
	@Test
	public void givenZeroRaius_ThenReturnZeroAreaTest() {
		Square square = new Square(0);

		double area = square.getArea();
		
		assertTrue(area == 0);
	}
}
