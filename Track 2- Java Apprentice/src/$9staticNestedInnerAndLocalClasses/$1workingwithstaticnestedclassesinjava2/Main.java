package $9staticNestedInnerAndLocalClasses.$1workingwithstaticnestedclassesinjava2;

public class Main {
	
	/**
	 * Static Nested Class
	 * 	-	A nested class defined within an outer class, thus logically associated with the outer class
	 */

	public static void main(String[] args) {
		
		/*
		 * Here we have created two classes named Category and Product and used Category
		 * in Product class we can also use static nested classes for this purpose
		 * 
		 * 	The things changes here
		 * 	-	we can not directly instantiate category class like:
		 * 			Category name = new Category("name");
		 * 	-	So, we can use Product.Category for this
		 */		
		Product keyboard = new Product("Dell Keyboard", 49, "Computer Accessories");
		Product mouse = new Product("HP Mouse", 19, "Computer Accessories");
		Product printer = new Product("Epson Printer", 599, "Computer Accessories");
		
		System.out.println("Keyboard: " + keyboard);
		System.out.println("Mouse: " + mouse);
		System.out.println("Printer: " + printer);
		
		printer.updateCategory("Computer Peripherals");
		System.out.println(printer);
		
		System.out.println();

		System.out.println("Keyboard category: " + keyboard.getCategory());
		System.out.println("Mouse category: " + mouse.getCategory());
		System.out.println("Printer category: " + printer.getCategory());
		
	}

}
