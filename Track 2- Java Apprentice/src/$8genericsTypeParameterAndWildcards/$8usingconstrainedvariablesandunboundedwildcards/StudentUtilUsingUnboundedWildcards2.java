package $8genericsTypeParameterAndWildcards.$8usingconstrainedvariablesandunboundedwildcards;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudentUtilUsingUnboundedWildcards2 {
	
	public static List<Object> getScoresAsList(Map <String, ?> studentsMap) {
		
		List<Object> list = new ArrayList<>();
		 
		for(Map.Entry<String, ?> entry: studentsMap.entrySet()) {
			Object score = entry.getValue();
			
			list.add(score);
		}
		
		return list;
	}

}
