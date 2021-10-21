package $9staticNestedInnerAndLocalClasses.$5usingandcharacterizinginnerclassesinjava;

public class Main {

	public static void main(String[] args) {

		/**
		 * Using and Characterizing Inner Classes in Java
		 * 	-	An inner class in java can not be created in the absence of outer class instance.
		 * 		So, the instance of an inner class is automatically associated with an instance of
		 * 		outer class and the outer class instance can be referenced by the name of the class,
		 * 		which in our case is Product.this.variableName.
		 * 	-
		 */

		Product keyboard = new Product("Dell Keyboard", 49, 4.3);
		keyboard.getReviewsAndRatings().addReview("Very good!");

		Product mouse = new Product("HP Mouse", 19, 3.9);

		Product printer = new Product("Epson Printer", 599, 4.5);
		printer.getReviewsAndRatings().addReview("Work Smoothly!");

		System.out.println(keyboard.getReviewsAndRatings());
		System.out.println(mouse.getReviewsAndRatings());
		System.out.println(printer.getReviewsAndRatings());

/*
		Instantiating ReviewsAndRatings object without a corresponding product, this is no longer possbile
		because ReviewsAndRatings is an inner class.
*/
//		Product.ReviewsAndRatings reviewsAndRatingsKeyboard = new Product.ReviewsAndRatings();

	}

}
