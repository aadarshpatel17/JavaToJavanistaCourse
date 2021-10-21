package $9staticNestedInnerAndLocalClasses.$1workingwithstaticnestedclassesinjava;

public class Main {
	
	/**
	 * Static Nested Class
	 * 	-	A nested class defined within an outer class, thus logically associated with the outer class
	 */

	public static void main(String[] args) {
		
		/*
		 * Here we have created two classes named Category and Product and used Category
		 * in Product class we can also use static nested classes for this purpose
		 */		
		Product keyboard = new Product("Dell Keyboard", 49, "Computer Accessories");
		Product mouse = new Product("HP Mouse", 19, "Computer Accessories");
		Product printer = new Product("Epson Printer", 599, "Computer Accessories");
		
		System.out.println("Keyboard: " + keyboard);
		System.out.println("Mouse: " + mouse);
		System.out.println("Printer: " + printer);
		
		System.out.println();
		
		
		/*
		 * NOTE: We can also have categories that are not associated with any product
		 * i.e. standalone categories
		 */
		
		Category mobiles = new Category("Mobile Phones");
		Category home = new Category("Home Furnishings");
		
		System.out.println("Mobiles: " + mobiles);
		System.out.println("Home: " + home);
	
	}

}
