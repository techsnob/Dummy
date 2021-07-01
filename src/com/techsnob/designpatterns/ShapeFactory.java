package com.techsnob.designpatterns;

public class ShapeFactory {
	Shape getShape(String name) {
		if(name.equalsIgnoreCase("square"))
			return new Square();
		else if (name.equalsIgnoreCase("circle"))
			return new Circle();
		return null;
	}
	
	public static void main(String[] args) {
		ShapeFactory sf = new ShapeFactory();
		Shape s = sf.getShape("circle");
		s.draw();
	}
}
