package edu.shapes.app;

import java.util.logging.Logger;

import edu.shapes.round.Circle;

public class Application {
	private static final Logger LOGGER = Logger.getLogger("Main");
	
	public static void main(String[] args) {
		Circle circle = new Circle(13.12);
	}
}
