package $8genericsTypeParameterAndWildcards.$6constrainingtypesusingupperboundedwildcards;

import java.util.Map;

public class StudentUtilUsingBoundedType {
	
	public static <T extends Number> double computeAverageScore(Map<String, T> studentMap ) {
		double totalScore = 0;
		int count = 0;
		
		for(Map.Entry<String, T> entry: studentMap.entrySet()) {
			totalScore += entry.getValue().doubleValue();
			count++;
		}
		
		return totalScore / count;
	}

}
