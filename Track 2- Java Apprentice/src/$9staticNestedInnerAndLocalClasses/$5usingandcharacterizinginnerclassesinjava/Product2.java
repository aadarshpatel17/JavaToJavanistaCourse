package $9staticNestedInnerAndLocalClasses.$5usingandcharacterizinginnerclassesinjava;

import java.util.ArrayList;
import java.util.List;

public class Product2 {

    /**
     * Changes here: setter for ReviewsAndRatings -
	 * 	-	Within the constructor, I do not create a new ReviewsAndRatings object. Instead, using setter
	 * 		method that allows me to assign a ReviewsAndRatings object to the product class.
	 * 		Now, when we create Product object then ReviewsAndRating object is not created automatically.
	 * 		We have to create one and assign it using ReviewsAndRatings.
	 */

	private final long id;
	private final String name;
	private final int price;

	private ReviewsAndRatings reviewsAndRatings;

	public Product2(String name, int price) {
		this.id = Math.round(Math.random() * 10000);
		this.name = name;
		this.price = price;
	}

	public void setReviewsAndRatings(ReviewsAndRatings reviewsAndRatings) {
		this.reviewsAndRatings = reviewsAndRatings;
	}

	public ReviewsAndRatings getReviewsAndRatings() {
		return reviewsAndRatings;
	}
	
	@Override
	public String toString() {
		return String.format("Name: %s, Price: %d, ReviewsAndRating: %s", name, price, reviewsAndRatings);
	}
	
	public class ReviewsAndRatings {
		private final double rating;
		private final List<String> reviews;
		
		public ReviewsAndRatings(double rating) {
			this.rating = rating;
			this.reviews = new ArrayList<>();
		}
		
		public void addReview(String reviews) {
			this.reviews.add(reviews);
		}
		
		@Override
		public String toString() {
			return String.format("Product: %d, %s, %d, rating: %.1f, review: %s", Product2.this.id, Product2.this.name, Product2.this.price, rating, reviews);
		}

	}
}
