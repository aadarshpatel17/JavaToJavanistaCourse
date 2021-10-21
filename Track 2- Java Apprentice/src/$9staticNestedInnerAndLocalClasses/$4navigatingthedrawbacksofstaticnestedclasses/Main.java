package $9staticNestedInnerAndLocalClasses.$4navigatingthedrawbacksofstaticnestedclasses;

public class Main {
	
	/**
	 * Navigating the Drawbacks of Static Nested Classes
	 * 	-	Static Nested classes use only when there is connection between classes or coupling between classes.
	 * 	
	 * 	Drawbacks:
	 * 	-	passing null to product input argument indicates that review and rating can associated with no product
	 * 		(null product) that make no sense.
	 * 
	 * 		-	We can remove this drawback using:  
	 * 			-	throwing an exception within reviewsandrating constructor 
	 * 				which is a bad practice (we don't know till runtime that product cannot be null that not good)	
	 * 	-	
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product keyboard = new Product("Dell Keyboard", 49, 4.3);
		keyboard.getReviewsAndRatings().addReview("Very good!");
		
		Product mouse = new Product("HP Mouse", 19, 3.9);
		
		Product printer = new Product("Epson Printer", 599, 4.5);
		printer.getReviewsAndRatings().addReview("Works smoothly");
		
		System.out.println(keyboard);
		System.out.println(mouse);
		System.out.println(printer);
		
		System.out.println();
		
		
		Product.ReviewsAndRatings reviewsAndRatings1 = new Product.ReviewsAndRatings(4.5, null);
		Product.ReviewsAndRatings reviewsAndRatings2 = new Product.ReviewsAndRatings(2.5, null);
		
		System.out.println(reviewsAndRatings1);
		System.out.println(reviewsAndRatings2);	

	}

}
