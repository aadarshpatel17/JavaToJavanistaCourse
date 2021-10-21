package $8genericsTypeParameterAndWildcards.$8usingconstrainedvariablesandunboundedwildcards;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	
	/**
	 * Using Constrained Variables and Unbounded Wildcards
	 * 
	 * 	Unbounded Wilcards:
	 * 	-	Method can be implemented using functionality in the Object base class
	 * 	-	When the code of the method is such that it does not depend on the exact type
	 * 	
	 * 
	 * Map<String, Integer> studentsMap = new HashMap<>();
	 * Map<String, Double> studentsMap = new HashMap<>();
	 * 	-	These will produce errors because java is enable to specify type parameter in these manner.
	 * 	-	It can be fixed as StudentUtilUsingUnboundedWildcards (Object -> ?)
	 * 	
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Object> studentsMap = new HashMap<>();

		studentsMap.put("Dorian", 45.4);
		studentsMap.put("Ophelia", 67.2);
		studentsMap.put("Mathew", 73.8);
		studentsMap.put("Carl", 87.0);
		
		List<Object> scoresList = StudentUtil.getScoresAsList(studentsMap);
		System.out.println("Scores list (Object): " + scoresList);
		

		Map<String, Object> anotherStudentsMap = new HashMap<>();
		
		anotherStudentsMap.put("Della", 45);
		anotherStudentsMap.put("Perry", 78);
		anotherStudentsMap.put("Paul", 67);
		
		List<Object> anotherScoresList = StudentUtil.getScoresAsList(anotherStudentsMap);
		System.out.println("Another scores list (Object): " + anotherScoresList);

	}

}
