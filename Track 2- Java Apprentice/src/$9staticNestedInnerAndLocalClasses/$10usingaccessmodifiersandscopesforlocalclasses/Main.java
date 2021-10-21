package $9staticNestedInnerAndLocalClasses.$10usingaccessmodifiersandscopesforlocalclasses;

public class Main {

	public static void main(String[] args) {

		/**
		 * Using Access Modifiers and Scopes for Local Classes
		 * 	-	Local classes can not be defined using access modifier
		 * 	-	Local classes can be accessed only within the block where they are defined
		 * 		(validateCustomer method in our case)
		 * 	-	You can define local classes with static methods, but those local classes cannot access
		 * 		the member variables of the Outer Class instance (Customer in our case)
		 * 			- 	Local classes defined within static methods can only access the static variables
		 * 				of the outer class.
		 * 	-	Local classes can not have static variables
		 *
		 */

	}

}
