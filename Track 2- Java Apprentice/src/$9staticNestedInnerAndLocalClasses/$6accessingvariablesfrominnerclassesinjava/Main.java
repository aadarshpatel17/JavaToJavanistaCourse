package $9staticNestedInnerAndLocalClasses.$6accessingvariablesfrominnerclassesinjava;

public class Main {

	public static void main(String[] args) {

		/**
		 * Accessing Variables from Inner Classes in Java
		 * 	- Outer class variables can be access using ClassName.this.variableName;
		 * 	- Inner class variables can be accessed using this.variableName;
		 * 	- Inner class method variables can be accessed using variableName directly;
		 */

/*
		Shape triangle = new Shape("triangle", "red", "glossy");
		Shape rectangle = new Shape("rectangle", "blue", "feathery");
		Shape circle = new Shape("circle", "green", "grainy");

		Shape.Brush triangleBrush = triangle.new Brush();
		Shape.Brush rectangleBrush = rectangle.new Brush();
		Shape.Brush circleBrush = circle.new Brush();

		triangleBrush.draw();
		rectangleBrush.draw();
		circleBrush.draw();
*/

//		for Shape2 class
		Shape2 triangle = new Shape2("triangle");
		Shape2 rectangle = new Shape2("rectangle");
		Shape2 circle = new Shape2("circle");

		Shape2.Brush triangleBrush = triangle.new Brush("red", "glossy");
		Shape2.Brush rectangleBrush = rectangle.new Brush("blue", "feathery");
		Shape2.Brush circleBrush = circle.new Brush("green", "grainy");

		triangleBrush.draw();
		rectangleBrush.draw();
		circleBrush.draw();

/*
		creating another object of Brush using triangle, rectangle and circle shapes
		with different color and texture
*/
		Shape2.Brush anotherTriangleBrush = triangle.new Brush("shiny gold", "matte");
		anotherTriangleBrush.draw();

		Shape2.Brush anotherRectangleBrush = rectangle.new Brush("shiny silver", "matte");
		anotherRectangleBrush.draw();

		Shape2.Brush anotherCircleBrush = circle.new Brush("moon silver", "glossy");
		anotherCircleBrush.draw();

	}

}
