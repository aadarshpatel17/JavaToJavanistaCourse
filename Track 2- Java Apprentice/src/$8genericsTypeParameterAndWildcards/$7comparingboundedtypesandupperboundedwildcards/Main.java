package $8genericsTypeParameterAndWildcards.$7comparingboundedtypesandupperboundedwildcards;

import java.util.HashMap;
import java.util.Map;

public class Main {
	
	/**
	 * Comparing Bounded Types and Upper-bounded Wildcards
	 * 
	 * Bounded Type Parameters vs. Upper Bounded Wildcards
	 * 	-	With bounded types the type T is known, with wildcards type ? is unknown.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Double> studentsMap = new HashMap<>();
		
		studentsMap.put("Dorian", 45.4);
		studentsMap.put("Ophelia", 67.2);
		studentsMap.put("Mathew", 73.8);
		studentsMap.put("Carl", 87.0);
		
		System.out.println("Scores list (doubles): " + StudentUtil.getScoresAsList(studentsMap));

		Map<String, Integer> anotherStudentsMap = new HashMap<>();
		
		anotherStudentsMap.put("Della", 45);
		anotherStudentsMap.put("Perry", 78);
		anotherStudentsMap.put("Paul", 67);
		
		System.out.println("Scores list (integers): " + StudentUtil.getScoresAsList(anotherStudentsMap));

	}

}
