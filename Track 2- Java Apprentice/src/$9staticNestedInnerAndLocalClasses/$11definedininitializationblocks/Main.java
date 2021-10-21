package $9staticNestedInnerAndLocalClasses.$11definedininitializationblocks;

public class Main {

	public static void main(String[] args) {

		/**
		 * Using Local Classes Defined in Initialization Blocks
		 * 	-
		 */

		Customer jason = new Customer(1234, "jason", "123-456-7891, jason@gmail.com");
		System.out.println(jason);

		Customer mona = new Customer(2345, "mona", "1234567891, mona@gmail.com");
		System.out.println(mona);

		Customer lucy = new Customer(2541, "lucy", "123-456-7891, jason@somemail");
		System.out.println(lucy);

	}

}
