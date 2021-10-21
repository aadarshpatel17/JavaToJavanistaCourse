package $9staticNestedInnerAndLocalClasses.$8usingandcharacterizinglocalclassesinjava;

public class Main {

	public static void main(String[] args) {

		/**
		 * Using and Characterizing Local Classes in Java
		 * 	-	LOCAL CLASSES: Defined locally within a block of Java code, rather than in its own file, or
		 * 		nested within another class
		 * 	-	can also define in Initialized block (both instance and static initialized block)
		 */

		Customer jason = new Customer(1234, "jason", "123-456-7891, jason@gmail.com");
		jason.validateCustomer();
		System.out.println(jason);

		Customer mona = new Customer(2345, "mona", "1234567891, mona@gmail.com");
		mona.validateCustomer();
		System.out.println(mona);

		Customer lucy = new Customer(2541, "lucy", "123-456-7891, jason@somemail");
		lucy.validateCustomer();
		System.out.println(lucy);

	}

}
