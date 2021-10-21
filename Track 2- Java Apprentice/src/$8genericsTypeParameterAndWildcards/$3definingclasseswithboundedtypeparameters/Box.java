package $8genericsTypeParameterAndWildcards.$3definingclasseswithboundedtypeparameters;

public class Box<T extends Comparable<T>> {
	
	private T value;
	
	public Box(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return String.format("In a box: {%s}", value);
	}

}
