package $9staticNestedInnerAndLocalClasses.$2instantiatingstaticnestedclassesinjava;

public class Main {

	/**
	 * Instantiating Static Nested Classes in Java
	 * 	-	We can access Category (nested class) as Product.Category if it is accessible (public, default)
	 * 	-	If we want to use Product in different package then it should be public and same for Category class
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product keyboard = new Product("Dell Keyboard", 49, "Computer Accessories");
		Product mouse = new Product("HP Mouse", 19, "Computer Accessories");
		Product printer = new Product("Epson Printer", 599, "Electronics");
		
		Product.Category keyboardCategory = keyboard.getCategory();
		Product.Category mouseCategory = mouse.getCategory();
		Product.Category printerCategory = printer.getCategory();
		
		System.out.println("Keyboard: " + keyboardCategory);
		System.out.println("Mouse: " + mouseCategory);
		System.out.println("Printer: " + printerCategory);
		
		System.out.println();
		
		/*
		 * NOTE: We can still have categories that are not associated with any product
		 * i.e. standalone categories
		 */
		
		Product.Category mobiles = new Product.Category("Mobile Phones");
		Product.Category home = new Product.Category("Home Furnishings");
		
		System.out.println("Mobile: " + mobiles);
		System.out.println("Home: " + home);
		
	}

}
