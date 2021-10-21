package $9staticNestedInnerAndLocalClasses.$7workingwithiteratorsimplementedasaninnerclass;

public class Main {

	public static void main(String[] args) {

		/**
		 * Working with Iterators Implemented as an Inner Class
		 * 	-	Iterators: Allow iterating over elements in any collection
		 * 	-
		 */

//		instantiating StringContainer
		StringContainer names = new StringContainer("Alice", "Bob", "Charles", "Darwin");

/*
//		using Iterator for accessing the values
		Iterator<String> namesIterator = names.iterator();

		System.out.println("\nFirst element");
		System.out.println("Has next: " + namesIterator.hasNext());
		System.out.println(namesIterator.next());

		System.out.println("\nSecond element");
		System.out.println("Has next: " + namesIterator.hasNext());
		System.out.println(namesIterator.next());

		System.out.println("\nThird element");
		System.out.println("Has next: " + namesIterator.hasNext());
		System.out.println(namesIterator.next());

		System.out.println("\nFourth element");
		System.out.println("Has next: " + namesIterator.hasNext());
		System.out.println(namesIterator.next());
*/

//		for for-each loop
		for(String name: names) {
			System.out.println(name);
		}

	}

}
