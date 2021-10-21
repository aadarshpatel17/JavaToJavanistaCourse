package $8genericsTypeParameterAndWildcards.$4usingboundedtypewithcustomobjects;

public class Car implements Comparable<Car> {
	
	private String make;
	private String model;
	private Integer price;
	
	public Car(String make, String model, Integer price) {
		this.make = make;
		this.model = model;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return String.format("{Make: %s, Model: %s, Price: %s}", make, model, price);
	}
	
	@Override	
	public int compareTo(Car o) {
		return this.price.compareTo(o.price);
	}

}
