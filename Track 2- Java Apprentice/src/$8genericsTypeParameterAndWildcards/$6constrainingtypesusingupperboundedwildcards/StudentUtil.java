package $8genericsTypeParameterAndWildcards.$6constrainingtypesusingupperboundedwildcards;

import java.util.Map;

public class StudentUtil {
	
	public static double computeAverageScore(Map<String, Number> studentMap ) {
		double totalScore = 0;
		int count = 0;
		
		for(Map.Entry<String, Number> entry: studentMap.entrySet()) {
			totalScore += entry.getValue().doubleValue();
			count++;
		}
		
		return totalScore / count;
	}

}
