package $9staticNestedInnerAndLocalClasses.$4navigatingthedrawbacksofstaticnestedclasses;

import java.util.ArrayList;
import java.util.List;

public class Product {
	
	private final long id;
	private final String name;
	private final int price;
	
	private ReviewsAndRatings reviewsAndRatings;
	
	public Product(String name, int price, double rating) {
		this.id = Math.round(Math.random() * 10000);
		this.name = name;
		this.price = price;
		
		this.reviewsAndRatings = new ReviewsAndRatings(rating, this);
	}
	
	public ReviewsAndRatings getReviewsAndRatings() {
		return reviewsAndRatings;
	}
	
	@Override
	public String toString() {
		return String.format("Name: %s, Price: %d, ReviewsAndRating: %s", name, price, reviewsAndRatings);
	}
	
	public static class ReviewsAndRatings {
		private final Product product;
		private final double rating;
		private final List<String> reviews;
		
		public ReviewsAndRatings(double rating, Product product) {
			this.rating = rating;
			this.product = product;
			
			this.reviews = new ArrayList<>();
		}
		
		public void addReview(String reviews) {
			this.reviews.add(reviews);
		}
		
		@Override
		public String toString() {
			return String.format("Product: %s, rating: %.1f, review: %s", product==null? "<unknown>": product.name, rating, reviews);
		}
		
		
	}
}
