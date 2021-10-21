package $9staticNestedInnerAndLocalClasses.$5usingandcharacterizinginnerclassesinjava;

import java.util.ArrayList;
import java.util.List;

public class Product {

	/**
	 * Changes here:
	 * 	-	the instance of Product class is not passed to the ReviewsAndRatings class as in line 24
	 */
	
	private final long id;
	private final String name;
	private final int price;
	
	private ReviewsAndRatings reviewsAndRatings;
	
	public Product(String name, int price, double rating) {
		this.id = Math.round(Math.random() * 10000);
		this.name = name;
		this.price = price;
		
		this.reviewsAndRatings = new ReviewsAndRatings(rating);
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
			return String.format("Product: %d, %s, %d, rating: %.1f, review: %s", Product.this.id, Product.this.name, Product.this.price, rating, reviews);
		}

	}
}
