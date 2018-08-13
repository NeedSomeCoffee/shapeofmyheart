package edu.shapes.app;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import edu.shapes.AbstractShape;
import edu.shapes.rectangular.Square;
import edu.shapes.round.Circle;
import edu.shapes.triangle.Triangle;

public class Application {
	private static final Logger LOGGER = Logger.getLogger("Fain");
	
	public static void main(String[] args) {		
		List<AbstractShape> shapes = getRandomShapesList();
		
		AbstractShape smallestShape = getMinimalAreaShape(shapes);
		
		LOGGER.info("Shape with minimal area is: " + smallestShape.getClass().getSimpleName()+ ", with area: " + String.valueOf(smallestShape.getArea()));
		
		shapes = getRandomShapesList(); 
		
		AbstractShape largestShape = getMaximalAreaShape(shapes);
		
		LOGGER.info("Shape with maximal area is: " + largestShape.getClass().getSimpleName()+ ", with area: " + String.valueOf(largestShape.getArea()));
	}
	
	private static AbstractShape getMinimalAreaShape(List<AbstractShape> shapes) {
		AbstractShape smallestShape = null;
		double minimalArea = Double.MAX_VALUE;
		
		for(AbstractShape shape : shapes) {			
			double currentArea = shape.getArea();
			
			if(currentArea < minimalArea) {
				smallestShape = shape;
				minimalArea = currentArea;
			}
			
		}
		
		return smallestShape;
	}
	
	private static AbstractShape getMaximalAreaShape(List<AbstractShape> shapes) {
		AbstractShape largestShape = null;
		double maximalArea = Double.MIN_VALUE;
		
		for(AbstractShape shape : shapes) {			
			double currentArea = shape.getArea();
			
			if(currentArea > maximalArea) {
				largestShape = shape;
				maximalArea = currentArea;
			}
			
		}
		
		return largestShape;
	}
	
	private static List<AbstractShape> getRandomShapesList() {
		List<AbstractShape> shapes = new ArrayList<>();
		int shapesCount = 10;
		
		for(int i = 0; i <= shapesCount; i++) {
			shapes.add(getRandomShape());
		}
		
		return shapes;
	}
	
	private static AbstractShape getRandomShape() {
		int randomiser = (int)(Math.random() * 12);
		
		if(randomiser <= 4 ) {
			return new Circle(Math.random() * 20);
		} else if( randomiser > 4 && randomiser <= 8) {
			return new Square(Math.random() * 30);
		} else {
			return new Triangle(Math.random() * 60, Math.random() * 60, Math.random() * 60);
		}
		
	}
}
