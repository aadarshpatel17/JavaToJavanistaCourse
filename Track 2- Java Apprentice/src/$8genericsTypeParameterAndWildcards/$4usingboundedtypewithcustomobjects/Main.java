package $8genericsTypeParameterAndWildcards.$4usingboundedtypewithcustomobjects;

public class Main {
	
	public static <T extends Comparable<T>> Box<T> getLarger(Box<T> box1, Box<T> box2) {
		if(box1.getValue().compareTo(box2.getValue()) > 0)
			return box1;
		return box2;
	}

	public static void main(String[] args) {
		
		Box<Car> carBox1 = new Box<>(new Car("Tesla", "Model S", 79000));
		System.out.println(carBox1);
		
		Box<Car> carBox2 = new Box<>(new Car("Toyota", "Canry", 30000));
		System.out.println(carBox2);
		
		System.out.println("Larger value " + getLarger(carBox1, carBox2));
		
	}

}
