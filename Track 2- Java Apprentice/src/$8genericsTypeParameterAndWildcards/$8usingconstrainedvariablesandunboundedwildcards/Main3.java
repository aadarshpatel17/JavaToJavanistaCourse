package $8genericsTypeParameterAndWildcards.$8usingconstrainedvariablesandunboundedwildcards;

import java.util.HashMap;
import java.util.Map;

public class Main3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Double> studentsMap = new HashMap<>();

		studentsMap.put("Dorian", 45.4);
		studentsMap.put("Ophelia", 67.2);
		studentsMap.put("Mathew", 73.8);
		studentsMap.put("Carl", 87.0);
		
		StudentUtilUsingUnboundedWildcards3.printMapEntries(studentsMap);
		System.out.println("\n*******************");

		Map<String, Integer> anotherStudentsMap = new HashMap<>();
		
		anotherStudentsMap.put("Della", 45);
		anotherStudentsMap.put("Perry", 78);
		anotherStudentsMap.put("Paul", 67);
		
		StudentUtilUsingUnboundedWildcards3.printMapEntries(anotherStudentsMap);


		Map<String, Double> studentsMap1 = new HashMap<>();

		studentsMap1.put("Dorian", 45.4);
		studentsMap1.put("Ophelia", 67.2);
		studentsMap1.put("Mathew", 73.8);
		studentsMap1.put("Carl", 87.0);
		
		System.out.println("\n\nAverage score of the student (double scores):" + StudentUtilUsingUnboundedWildcards3.computeAverageScore(studentsMap1));

		Map<String, Integer> anotherStudentsMap1 = new HashMap<>();
		
		anotherStudentsMap1.put("Della", 45);
		anotherStudentsMap1.put("Perry", 78);
		anotherStudentsMap1.put("Paul", 67);
		
		System.out.println("Average score of the student (integer scores):" + StudentUtilUsingUnboundedWildcards3.computeAverageScore(anotherStudentsMap1));


	}

}
