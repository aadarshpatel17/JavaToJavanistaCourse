package $8genericsTypeParameterAndWildcards.$10constrainingtypeusinglowerboundedwildcards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
	
	/**
	 * Constraining Type Using Lower-Bounded Wildcards
	 * 	-	
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> courses = new ArrayList<>();
		
		System.out.println("ArrayList instanceof List: " + (courses instanceof List) );
		System.out.println("ArrayList instanceof Collection: " + (courses instanceof Collection) );
		System.out.println("ArrayList instanceof Iterable: " + (courses instanceof Iterable) );


	}

}
