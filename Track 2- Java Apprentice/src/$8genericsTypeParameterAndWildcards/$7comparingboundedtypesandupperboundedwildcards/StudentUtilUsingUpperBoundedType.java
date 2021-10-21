package $8genericsTypeParameterAndWildcards.$7comparingboundedtypesandupperboundedwildcards;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudentUtilUsingUpperBoundedType {
	
	public static List<? extends Number> getScoresAsList(Map<String, ? extends Number> studentMap ) {
		
		List<? extends Number> list = new ArrayList<>();
		
		for(Map.Entry<String, ? extends Number> entry: studentMap.entrySet()) {
//			NOTE: The data type of the element is unknown, we can only access 
//			it using the Obect data type
			Object score = entry.getValue();
			
//			NOTE: This method requires the actual data type of the element
//			being added, that is not available when we use upper bounded wildcards
			
			/**
			 * We have also lost the compile-time checks here
			 */
//			list.add(score);
		}
		
		return list;
	}

}
