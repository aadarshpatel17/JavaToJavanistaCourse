package $8genericsTypeParameterAndWildcards.$13recognizingjavacompilersuseoftypeerasure;

public class Node<T> {

	private T data;
	private Node<T> next;
	private Node<T> previous;
	
	public Node(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public Node<T> getNext() {
		return next;
	}
	
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	public Node<T> getPrevious() {
		return previous;
	}

	public void setPrevious(Node<T> previous) {
		this.previous = previous;
	}
	
}



/*
 * ByteCode will generate in this way using classes and bridge methods...
 * 
 * public class Node {
 * 
 * private Object data; private Node next; private Node previous;
 * 
 * public Node(Object data) { this.data = data; }
 * 
 * public Object getData() { return data; }
 * 
 * public void setData(Object data) { this.data = data; }
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