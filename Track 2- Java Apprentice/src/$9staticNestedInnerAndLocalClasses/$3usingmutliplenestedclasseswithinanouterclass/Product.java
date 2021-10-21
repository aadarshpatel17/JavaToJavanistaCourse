package $9staticNestedInnerAndLocalClasses.$3usingmutliplenestedclasseswithinanouterclass;

public class Product {

	/**
	 * We can access Product member variables from Product to Category - We need to
	 * pass the Product instance in the Category class (here using constructor line
	 * no. 22) then, we can access
	 */

	private long id;
	private String name;
	private int price;

	private Category category;

	public Product(String name, int price, String categoryName) {
		this.id = Math.round(Math.random() * 10000);
		this.name = name;
		this.price = price;

		this.category = new Category(categoryName, this);
	}

	public void updateCategory(String name) {
		this.category.updateCategory(name);
	}

	public Category getCategory() {
		return category;
	}

	@Override
	public String toString() {
		return String.format("Product ID: %d, Name: %s, Price: %d, Category: %s", id, name, price, category);
	}

//	NOTE: The "public" modifier means that objects of this class can be instantiated outside of this class as well

	public static class Category {

		private final long id;
		private String name;
		private Product product;

		public Category(String name, Product product) {
			this.id = Math.round(Math.random() * 10000);
			this.name = name;
			this.product = product;
		}

		public void updateCategory(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return String.format("Category ID: %d, Name: %s", id, name);
		}

		/*
		 * - We can not access Product class member variables in Category class public -
		 * Category is not automatically associated with Product instance
		 * 
		 * Now, to access the Product class member variable we can do something which is
		 * shown in Product2 class
		 * 
		 * void printProductDetails() { System.out.println(price);
		 * System.out.println(this.price); System.out.println(Category.this.price);
		 * System.out.println(Product.this.price); }
		 */

		void printProductDetails() {
			System.out.println("**** Product Details ****");
			System.out.println("ID: " + product.id);
			System.out.println("Name: " + product.name);
			System.out.println("Price: " + product.price);
		}

	}

}
