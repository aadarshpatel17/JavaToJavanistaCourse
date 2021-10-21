package $8genericsTypeParameterAndWildcards.$6constrainingtypesusingupperboundedwildcards;

import java.util.HashMap;
import java.util.Map;

public class Main {
	
	/**
	 * Constraining Types Using Upper-bounded Wildcards
	 * 	
	 * 	Wildcard:
	 * 	-	The "?" in Java is the wildcard which represents an unknown type parameter
	 * 
	 * 	3 Types of Wildcards:
	 * 	-	Upper bounded
	 * 	-	Unbounded
	 * 	-	Lower bounded
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Number> studentsMap = new HashMap<>();
		
		/**
		 * Map<String, Integer> studentsMap = new HashMap<>();
		 * Map<String, Float> studentsMap = new HashMap<>();
		 * 
		 * 	-	These cannot be used because we have specific a Map of String and Number as agrument in StudentUtil's 
		 * 		computeAverageScore method.
		 * 
		 * 	-	After using wildcard we can do these initialisation as well.
		 * 
		 * 	-	We can also use bounded type parameter for these but their is a difference.
		 * 
		 */
		
		studentsMap.put("Dorian", 45.5f);
		studentsMap.put("Ophelia", 67);
		studentsMap.put("Mattew", 73);
		studentsMap.put("Carl", 87);
		
		System.out.println("Average score of students: " + StudentUtil.computeAverageScore(studentsMap));


		Map<String, Float> anotherStudentsMap = new HashMap<>();
		
		anotherStudentsMap.put("Dorian", 45.5f);
		anotherStudentsMap.put("Ophelia", 67.1f);
		anotherStudentsMap.put("Mattew", 73.9f);
		anotherStudentsMap.put("Carl", 87.3f);
		
		System.out.println("Average score of students: " + StudentUtilUsingWildcard.computeAverageScore(anotherStudentsMap));

		Map<String, Integer> studentsMapUsingBoundedType = new HashMap<>();
		
		studentsMapUsingBoundedType.put("Dorian", 45);
		studentsMapUsingBoundedType.put("Ophelia", 67);
		studentsMapUsingBoundedType.put("Mattew", 73);
		studentsMapUsingBoundedType.put("Carl", 87);
		
		System.out.println("Average score of students: " + StudentUtilUsingBoundedType.computeAverageScore(studentsMapUsingBoundedType));

	}

}
