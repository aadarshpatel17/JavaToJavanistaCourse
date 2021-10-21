package $8genericsTypeParameterAndWildcards.$11recognizingjavasuseofwildcardcapture;

import java.util.List;

public class ListUtil {
	
	public static <T> void swap(List<T> list, int index1, int index2) {
		T firstElement = list.get(index1);
		T secondElement = list.get(index2);
		
		list.set(index1, secondElement);
		list.set(index2, firstElement);
	}

}
