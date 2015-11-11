import java.lang.Iterable;

public class BasicSet<T> implements Iterable<T>{
	private Node<T> head;
	private Node<T> tail;

	public BasicSet(){
		this.head = this.tail = null;
	}

	public BasicSet(Node<T> headNode){
		this.head = this.tail = headNode;
	}

	public Iterator<T> iterator(){
		return null;
	}
}