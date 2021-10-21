package $8genericsTypeParameterAndWildcards.$5usingmultipleboundspecificationforboundedtypes;

public class Car implements Comparable<Car>, PrettyPrintable {
	
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

	@Override
	public void prettyPrint() {
		System.out.println("++++" + this + "++++");		
	}

}
