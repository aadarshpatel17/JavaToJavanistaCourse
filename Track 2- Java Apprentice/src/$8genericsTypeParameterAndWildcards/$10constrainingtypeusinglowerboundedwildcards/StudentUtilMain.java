package $8genericsTypeParameterAndWildcards.$10constrainingtypeusinglowerboundedwildcards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class StudentUtilMain {
	
	/**
	 * Constraining Type Using Lower-Bounded Wildcards
	 * 	-	
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Called using ArrayList<String>: ");

		ArrayList<String> juliesCourses = new ArrayList<>();
		juliesCourses.add("Math");
		juliesCourses.add("Art");
		juliesCourses.add("Java");
		
		ArrayList<String> andrewCourses = new ArrayList<>();
		andrewCourses.add("Chemstry");
		andrewCourses.add("English");
		
		Map<String, ArrayList<String>> coursesMap = new HashMap<>();
		coursesMap.put("Julie", juliesCourses);
		coursesMap.put("Andrew", andrewCourses);	
		
		StudentUtil.printMapEntries(coursesMap);
		
		
		System.out.println("\nCalled using List<String>: ");

		LinkedList<String> andyCourses = new LinkedList<>();
		andyCourses.add("English");
		andyCourses.add("Pysics");
		andyCourses.add("Python");
		
		LinkedList<String> jonesCourses = new LinkedList<>();
		jonesCourses.add("Science");
		jonesCourses.add("CSE");
		
		Map<String, List<String>> anotherCoursesMap = new HashMap<>();
		anotherCoursesMap.put("Andy", andyCourses);
		anotherCoursesMap.put("Jones", jonesCourses);	
		
		StudentUtil.printMapEntries(anotherCoursesMap);

		
		System.out.println("\nCalled using Collection<String>: ");

		ArrayList<String> messiCourses = new ArrayList<>();
		messiCourses.add("Talent");
		messiCourses.add("Dribbling");
		messiCourses.add("Goals");
		
		ArrayList<String> cristianoCourses = new ArrayList<>();
		cristianoCourses.add("Dedication");
		cristianoCourses.add("Hardwork");
		
		Map<String, Collection<String>> otherCoursesMap = new HashMap<>();
		otherCoursesMap.put("Messi", messiCourses);
		otherCoursesMap.put("Cristiano", cristianoCourses);	
		
		StudentUtil.printMapEntries(otherCoursesMap);

	}

}
