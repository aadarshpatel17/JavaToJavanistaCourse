package $8genericsTypeParameterAndWildcards.$5usingmultipleboundspecificationforboundedtypes;

public class Main { 

	/**
	 * Bounded Types:
	 * 	-	can specify inheritance as well as mutliple interface implementation.
	 */
	
	public static <T extends Comparable<T> & PrettyPrintable> void prettyPrintLarger( Box<T> box1, Box<T> box2 ) {
		if(box1.compareTo(box2) > 0) {
			box1.prettyPrint();
			return;
		}
		
		box2.prettyPrint();
	}
	
	public static <T extends Comparable<T> & PrettyPrintable> void prettyPrintSmaller( Box<T> box1, Box<T> box2 ) {
		if(box1.compareTo(box2) < 0) {
			box1.prettyPrint();
			return;
		}
		
		box2.prettyPrint();
	}
	
	public static void main(String[] args) {
		
		Box<Car> carBox1 = new Box<>(new Car("Tesla", "Model S", 79000));
		Box<Car> carBox2 = new Box<>(new Car("Toyota", "Canry", 30000));
		
		System.out.println("\n----------Larger");
		prettyPrintLarger(carBox1, carBox2);
		
		System.out.println("\n----------Smaller");
		prettyPrintSmaller(carBox1, carBox2);
		
	}
	
}
