package $9staticNestedInnerAndLocalClasses.$6accessingvariablesfrominnerclassesinjava;

public class Main2 {

	public static void main(String[] args) {

		/**
		 * Accessing Variables from Inner Classes in Java
		 * 	- Outer class variables can be accessed using ClassName.this.variableName;
		 * 	- Inner class variables can be accessed using this.variableName;
		 * 	- Inner class method variables can be accessed using variableName directly;
		 */

/*
		Shape3 triangle = new Shape3("triangle", "red", "glossy");
		Shape3 rectangle = new Shape3("rectangle", "blue", "feathery");
		Shape3 circle = new Shape3("circle", "green", "grainy");

		Shape3.Brush triangleBrush = triangle.new Brush("shiny gold", "matte");
		Shape3.Brush rectangleBrush = rectangle.new Brush("shiny silver", "matte");
		Shape3.Brush circleBrush = circle.new Brush("moon silver", "glossy");

		triangleBrush.draw();
		rectangleBrush.draw();
		circleBrush.draw();
*/
		Shape4 triangle = new Shape4("triangle", "red", "glossy");
		Shape4 rectangle = new Shape4("rectangle", "blue", "feathery");
		Shape4 circle = new Shape4("circle", "green", "grainy");

		Shape4.Brush triangleBrush = triangle.new Brush("shiny gold", "matte");
		Shape4.Brush rectangleBrush = rectangle.new Brush("shiny silver", "matte");
		Shape4.Brush circleBrush = circle.new Brush("moon silver", "glossy");

		triangleBrush.draw("black" , "leathery");
		rectangleBrush.draw("black" , "leathery");
		circleBrush.draw("black" , "leathery");

	}

}
