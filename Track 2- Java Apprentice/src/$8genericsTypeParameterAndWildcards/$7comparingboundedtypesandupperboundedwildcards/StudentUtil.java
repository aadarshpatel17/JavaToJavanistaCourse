package $8genericsTypeParameterAndWildcards.$7comparingboundedtypesandupperboundedwildcards;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudentUtil {
	
	public static <T extends Number> List<T> getScoresAsList(Map<String, T> studentMap ) {
		
		List<T> list = new ArrayList<>();
		
		for(Map.Entry<String, T> entry: studentMap.entrySet()) {
			T score = entry.getValue();
			list.add(score);
		}
		
		return list;
	}

}
