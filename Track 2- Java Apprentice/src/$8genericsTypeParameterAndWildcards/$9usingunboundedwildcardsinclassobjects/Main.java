package $8genericsTypeParameterAndWildcards.$9usingunboundedwildcardsinclassobjects;

import java.io.Serializable;
import java.util.Date;

public class Main {
	
	/**
	 * Using Unbounded Wildcards in Class Objects
	 * 	-	
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Class<String> stringClass = String.class;
		Class<?> stringClass = String.class;
		
		System.out.println("\nName (string): " + stringClass.getName());
		System.out.println("Package (string): " + stringClass.getPackageName());
		System.out.println("Superclass (string): " + stringClass.getSuperclass());
		System.out.println("isInterface (string): " + stringClass.isInterface());

		Class<Date> dateClass = Date.class;
//		Class<?> dateClass = Date.class;
		
		System.out.println("\nName (string): " + dateClass.getName());
		System.out.println("Package (string): " + dateClass.getPackageName());
		System.out.println("Superclass (string): " + dateClass.getSuperclass());
		System.out.println("isInterface (string): " + dateClass.isInterface());

//		Class<Serializable> serializableClass = Serializable.class;
		Class<?> serializableClass = Serializable.class;
		
		System.out.println("\nName (string): " + serializableClass.getName());
		System.out.println("Package (string): " + serializableClass.getPackageName());
		System.out.println("Superclass (string): " + serializableClass.getSuperclass());
		System.out.println("isInterface (string): " + serializableClass.isInterface());

	}

}
