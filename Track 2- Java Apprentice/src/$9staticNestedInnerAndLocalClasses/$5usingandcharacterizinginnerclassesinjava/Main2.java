package $9staticNestedInnerAndLocalClasses.$5usingandcharacterizinginnerclassesinjava;

public class Main2 {

	public static void main(String[] args) {

        /**
		 * Using and Characterizing Inner Classes in Java
		 * 	-	An inner class in java can not be created in the absence of outer class instance.
		 * 		So, the instance of an inner class is automatically associated with an instance of
		 * 		outer class and the outer class instance can be referenced by the name of the class,
		 * 		which in our case is Product.this.variableName.
		 * 	-
		 */

//		creating object for Product2 class
		Product2 keyboard = new Product2("Dell Keyboard", 49);
		Product2 mouse = new Product2("HP Mouse", 19);
		Product2 printer = new Product2("Epson Printer", 599);

//		way to instantiate ReviewsAndRatings object
		Product2.ReviewsAndRatings reviewsAndRatingsKeyboard = keyboard.new ReviewsAndRatings(4.3);
		reviewsAndRatingsKeyboard.addReview("Very Good!");

		Product2.ReviewsAndRatings reviewsAndRatingsMouse = keyboard.new ReviewsAndRatings(3.9);

		Product2.ReviewsAndRatings reviewsAndRatingsPrinter = keyboard.new ReviewsAndRatings(4.5);
		reviewsAndRatingsPrinter.addReview("Work Smoothly!");

		System.out.println(reviewsAndRatingsKeyboard);
		System.out.println(reviewsAndRatingsMouse);
		System.out.println(reviewsAndRatingsPrinter);

		System.out.println();

//		NOTE: The Product2 instance is not automatically linked to the right ReviewsAndRatings instance
		System.out.println(keyboard.getReviewsAndRatings());
		System.out.println(mouse.getReviewsAndRatings());
		System.out.println(printer.getReviewsAndRatings());

		System.out.println("\n*** Need to explicitly specify reviews and ratings on product ");
		keyboard.setReviewsAndRatings(reviewsAndRatingsKeyboard);
		mouse.setReviewsAndRatings(reviewsAndRatingsMouse);
		printer.setReviewsAndRatings(reviewsAndRatingsPrinter);

		System.out.println(keyboard.getReviewsAndRatings());
		System.out.println(mouse.getReviewsAndRatings());
		System.out.println(printer.getReviewsAndRatings());

	}

}
