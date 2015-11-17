import java.lang.Iterable;
import java.util.Iterator;

public class BasicSet<T> implements Iterable<T>{
	public Node<T> head;
	public Node<T> tail;

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
			Node<T> current = this.head;

			while(current != null){
				if(current.getElement() == element)
					return false;

				if(current.getNext() == null){
					Node<T> newTail = new Node<T>(element);
					current.setNext(newTail);
					return true;
				}

				current = current.getNext();
			}
		}
		return true;
	}

	@Override
	public Iterator<T> iterator(){
		return new NodeIterator<T>(this.head);
	}
}