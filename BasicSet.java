import java.lang.Iterable;
import java.util.Iterator;

public class BasicSet<T> implements Iterable<T>{
	protected Node<T> head;
	protected Node<T> tail;

	public BasicSet(){
		this.head = this.tail = null;
	}

	public BasicSet(Node<T> headNode){
		this.head = this.tail = headNode;
	}

	public boolean add(T element){
		if(this.head == null){
			this.head = this.tail = new Node<T>(element);
		}else{
			Node<T> newTail = new Node<T>(element);
			this.tail.setNext(newTail);
			this.tail = newTail;
		}
		return true;
	}

	@Override
	public Iterator<T> iterator(){
		return new NodeIterator<T>(this.head);
	}
}