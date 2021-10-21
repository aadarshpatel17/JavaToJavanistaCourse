package $8genericsTypeParameterAndWildcards.$6constrainingtypesusingupperboundedwildcards;

import java.util.Map;

public class StudentUtilUsingWildcard {
	
	public static double computeAverageScore(Map<String, ? extends Number> studentMap ) {
		double totalScore = 0;
		int count = 0;
		
		for(Map.Entry<String, ? extends Number> entry: studentMap.entrySet()) {
			totalScore += entry.getValue().doubleValue();
			count++;
		}
		
		return totalScore / count;
	}

}
