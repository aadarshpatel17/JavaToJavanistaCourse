package $9staticNestedInnerAndLocalClasses.$3usingmutliplenestedclasseswithinanouterclass;

public class Main {

	/**
	 * Using Mutliple Nested Classes Within an Outer Class
	 * 	-	Using member variable of Product class in Category class
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for Product class explaination
		Product keyboard = new Product("Dell Keyboard", 49, "Computer Accessories");
		Product mouse = new Product("HP Mouse", 19, "Computer Accessories");
		Product printer = new Product("Epson Printer", 599, "Electronics");
		
		keyboard.getCategory().printProductDetails();
		mouse.getCategory().printProductDetails();
		printer.getCategory().printProductDetails();
		
		System.out.println();
		
		
//		for Product2 class explaination
		Product2 keyboardd = new Product2("Dell Keyboard", 49, "Computer Accessories", 2.6);
		Product2 mousee = new Product2("HP Mouse", 19, "Computer Accessories", 4.6);
		Product2 printerr = new Product2("Epson Printer", 599, "Electronics", 6.7);
		
		keyboardd.getRating().printRating();
		mousee.getRating().printRating();
		printerr.getRating().printRating();
		
//		We can also directly instantiate Rating class like below
		Product2.Rating rating = new Product2.Rating(3.5, printerr);
		rating.printRating();
		
	}

}
