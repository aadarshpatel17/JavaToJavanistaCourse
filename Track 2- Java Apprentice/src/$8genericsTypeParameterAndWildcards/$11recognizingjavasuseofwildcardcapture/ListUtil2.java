package $8genericsTypeParameterAndWildcards.$11recognizingjavasuseofwildcardcapture;

import java.util.List;

public class ListUtil2 {
	
	/**
	 * If we try to replace T with ? then exception occurs 
	 * 	-	required type: T
	 * 	-	provided: capture of ?
	 * 
	 * Basically Java is unable to infer the type of object you want to store in the list.
	 * 	We can remove this by using any helper function like below:
	 * 
	 */
	
	public static <T> void swap(List<?> list, int index1, int index2) {
		swapHelper(list, index1, index2);
	}
	
//	NOTE: Within this helper function the type of the generic type parameter is known.
	
	public static <T> void swapHelper(List<T> list, int index1, int index2) {
		T firstElement = list.get(index1);
		T secondElement = list.get(index2);

		list.set(index1, secondElement);
		list.set(index2, firstElement);
	}
	
//	NOTE: The use of helper method can be used when the code written itself is wrong 
	public static void copy(List<?> sourceList, List<?> destList, int index) {
//		copyHelper(sourceList, destList, index);
	}
	
	/**
	 * Here at line 33, Java realises that the sourceList and destList may contain different elements,
	 * 	making the code invalid.
	 */
	
	public static <T> void copyHelper(List<T> sourceList, List<T> destList, int index) {
		destList.set(index, sourceList.get(index));
	}
	
	
}
