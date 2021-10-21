package $9staticNestedInnerAndLocalClasses.$9accessingfinalandlocalfieldsfromouterclasses;

public class Main {

	public static void main(String[] args) {

		/**
		 * Accessing Final and Local Fields from Outer Classes
		 * 	-	setting up Logger for validateCustomer() method
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
