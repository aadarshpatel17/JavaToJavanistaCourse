package $8genericsTypeParameterAndWildcards.$2specifyingboundedtypeparameters;

import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("*****Invoke isEven() method");
		
		System.out.println("Is 50 even? : " + MathUtil.isEven(50));
		
		System.out.println("Is 103 even? : " + MathUtil.isEven(103));
		
		System.out.println("Is 5000000 even? : " + MathUtil.isEven(BigInteger.valueOf(5000000)));

		System.out.println("\n*****Invoke isPrime() method");
		
		System.out.println("Is 50 prime? : " + MathUtil.isPrime(50));
		
		System.out.println("Is 17 prime? : " + MathUtil.isPrime(17));
		
//		System.out.println("Is 5000000 prime? : " + MathUtil.isPrime(BigInteger.valueOf(5000000)));
		
		
		System.out.println("\n*****Invoke isEven() method");
		
//		System.out.println("Is fifty even? : " + MathUtil.isEven("fifty"));
		
		System.out.println("\n*****Invoke isPrime() method");
		
		System.out.println("Is 17 prime? : " + MathUtil.isPrime(17));
		
//		System.out.println("Is 17.2 prime? : " + MathUtil.isPrime(17.2));
		
//		System.out.println("Is seventeen prime? : " + MathUtil.isPrime("seventeen"));
		
	}

}
