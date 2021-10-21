package $8genericsTypeParameterAndWildcards.$12identifyingvalidandinvalidtypeparameternames;

import java.math.BigInteger;

public class Main {
	
	/**
	 * Identifying Valid and Invalid Type Parameter Names
	 * 	-	
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product<Integer> product = new Product<>("iPhone", 1001, 699, 10);
		System.out.println("\nInteger id, price and discount: " + product);
		
		Product<BigInteger> tv = new Product<>("Samsung", BigInteger.valueOf(10001), BigInteger.valueOf(2000), BigInteger.valueOf(500));
		System.out.println("\nBigInteger id, price and discount: " + tv);

	}

}
