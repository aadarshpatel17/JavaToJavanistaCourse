package $8genericsTypeParameterAndWildcards.$8usingconstrainedvariablesandunboundedwildcards;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Double> studentsMap = new HashMap<>();

		studentsMap.put("Dorian", 45.4);
		studentsMap.put("Ophelia", 67.2);
		studentsMap.put("Mathew", 73.8);
		studentsMap.put("Carl", 87.0);
		
		List<Object> scoresList = StudentUtilUsingUnboundedWildcards2.getScoresAsList(studentsMap);
		System.out.println("Scores list (Object): " + scoresList);
		

		Map<String, Integer> anotherStudentsMap = new HashMap<>();
		
		anotherStudentsMap.put("Della", 45);
		anotherStudentsMap.put("Perry", 78);
		anotherStudentsMap.put("Paul", 67);
		
		List<Object> anotherScoresList = StudentUtilUsingUnboundedWildcards2.getScoresAsList(anotherStudentsMap);
		System.out.println("Another scores list (Object): " + anotherScoresList);

	}

}
