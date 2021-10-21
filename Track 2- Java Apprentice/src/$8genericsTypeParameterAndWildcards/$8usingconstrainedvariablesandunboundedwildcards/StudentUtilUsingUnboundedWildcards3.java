package $8genericsTypeParameterAndWildcards.$8usingconstrainedvariablesandunboundedwildcards;

import java.util.Map;

public class StudentUtilUsingUnboundedWildcards3 {
	
	public static void printMapEntries(Map<?, ?> map) {
		for(Map.Entry<?, ?> entry: map.entrySet()) {
			System.out.format("Key: %s, Value: %s\n", entry.getKey(), entry.getValue());
		}
	}
	
	public static double computeAverageScore(Map<?, ? extends Number> scoreMap) {
		double totalScore = 0;
		int count = 0;
		
		for(Map.Entry<?, ? extends Number> entry: scoreMap.entrySet()) {
			totalScore += entry.getValue().doubleValue();
			count++;
		}
		return totalScore / count;		
	}

}
