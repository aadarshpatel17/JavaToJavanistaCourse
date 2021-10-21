package $8genericsTypeParameterAndWildcards.$11recognizingjavasuseofwildcardcapture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	
	/**
	 * Recognizing Java's Use of Wildcard Capture
	 * 	Wildcard Capture:
	 * 	-	Java's ability to infer the type of data that you're working with, 
	 * 		and handle that data correctly.s
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Using ListUtil class: ");
		List<String> nameList = new ArrayList<>(Arrays.asList("Alice", "Boris", "Carlie", "Denver"));
		System.out.println("Original list: " + nameList);
		
		ListUtil.swap(nameList, 1, 2);
		System.out.println("Swapped list: " + nameList);
		
		System.out.println("\nUsing ListUtil2 class: ");
		List<String> anotherNameList = new ArrayList<>(Arrays.asList("Alice", "Boris", "Carlie", "Denver"));
		System.out.println("Original list: " + anotherNameList);
		
		ListUtil.swap(anotherNameList, 0, anotherNameList.size()-1);
		System.out.println("Swapped list: " + anotherNameList);
		
	}

}
