package $8genericsTypeParameterAndWildcards.$13recognizingjavacompilersuseoftypeerasure;

public class NodeUsingComparable<T extends Comparable<T	>> {

	private T data;
	private NodeUsingComparable<T> next;
	private NodeUsingComparable<T> previous;
	
	public NodeUsingComparable(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public NodeUsingComparable<T> getNext() {
		return next;
	}
	
	public void setNext(NodeUsingComparable<T> next) {
		this.next = next;
	}
	
	public NodeUsingComparable<T> getPrevious() {
		return previous;
	}

	public void setPrevious(NodeUsingComparable<T> previous) {
		this.previous = previous;
	}
	
}



/*
 * ByteCode will generate in this way using classes and bridge methods...
 * 
 * public class Node {
 * 
 * private Comparable data; private Node next; private Node previous;
 * 
 * public Node(Comparable data) { this.data = data; }
 * 
 * public Object getData() { return data; }
 * 
 * public void setData(Comparable data) { this.data = data; }
 * 
 * public Node getNext() { return next; }
 * 
 * public void setNext(Node next) { this.next = next; }
 * 
 * public Node getPrevious() { return previous; }
 * 
 * public void setPrevious(Node previous) { this.previous = previous; }
 * 
 * }
 */