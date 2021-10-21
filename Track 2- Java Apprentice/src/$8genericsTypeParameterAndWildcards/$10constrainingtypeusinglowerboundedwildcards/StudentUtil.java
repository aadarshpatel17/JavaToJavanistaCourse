package $8genericsTypeParameterAndWildcards.$10constrainingtypeusinglowerboundedwildcards;

import java.util.ArrayList;
import java.util.Map;

public class StudentUtil {
	
	/**
	 * ? super ArrayList<String>
	 * 	here map 2 argument can be a ArrayList<String> or any super class of ArrayList<String> like
	 * 	List<String>, Collection<String>, Iterable<String> Object
	 */
	
	public static void printMapEntries(Map<String, ? super ArrayList<String>> map) {
		for(Map.Entry<String, ? super ArrayList<String>> entry: map.entrySet()) {
			System.out.println("-------------");
//			NOTE: We only access the toString() method of the key and the value
//			which is a part of Object base class
			System.out.println(entry);			
			System.out.println("-------------");			
		}
	}

}
