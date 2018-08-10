package edu.shapes.app;

import java.util.logging.Logger;

import edu.shapes.rectangular.Square;
import edu.shapes.round.Circle;
import edu.shapes.triangle.Triangle;

public class Application {
	private static final Logger LOGGER = Logger.getLogger("Fain");
	
	public static void main(String[] args) {
		Circle circle = new Circle(13.12);
		
		Square square = new Square(13.1);
		
		Triangle triangle = new Triangle(9.13, 8.34, 7.35);
		
		LOGGER.info(String.valueOf(circle.getArea()));
		
		LOGGER.info(String.valueOf(square.getArea()));
		
		LOGGER.info(String.valueOf(triangle.getArea()));
	}
}
