package $8genericsTypeParameterAndWildcards.$3definingclasseswithboundedtypeparameters;

import java.math.BigInteger;

public class Main {
	
	public static <T extends Comparable<T>> Box<T> getLarger(Box<T> box1, Box<T> box2) {
		if(box1.getValue().compareTo(box2.getValue()) > 0)
			return box1;
		return box2;
	}

	public static void main(String[] args) {
		
		Box<Integer> integerBox1 = new Box<>(22);
		System.out.println(integerBox1);

		Box<Integer> integerBox2 = new Box<>(99);
		System.out.println(integerBox2);

		Box<Float> floatBox = new Box<>(22.2f);
		System.out.println(floatBox);

		Box<BigInteger> bigIntegerBox = new Box<>(BigInteger.valueOf(10000000));
		System.out.println(bigIntegerBox);

		Box<String> stringBox = new Box<>("zoe");
		System.out.println(stringBox);
		
		
		System.out.println("Larger value " + getLarger(integerBox1, integerBox2));
		
	}

}
