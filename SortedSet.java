import java.util.Iterator;

public class SortedSet<T extends Smaller<? super T>> extends BasicSet<T>{
	public SortedSet(){
		super();
	}

	public SortedSet(Node<T> headNode){
		super(headNode);
	}

	public boolean add(T element){
		if(this.head == null){
			this.head = new Node<T>(element);
			return true;
		}else if(!this.head.getElement().smaller(element)){
			if(this.head.getElement() == element)
				return false;
			Node<T> newNode = new Node<T>(element);
			newNode.setNext(this.head);
			this.head = newNode;
			return true;
		}
		
		Node<T> previousNode = null;
		Node<T> currentNode = this.head;
		
		while(currentNode.hasNext()){
			if(!currentNode.getElement().smaller(element)){
				if(element == currentNode.getElement())
					return false;
				Node<T> newNode = new Node<T>(element);
				newNode.setNext(previousNode);
				previousNode.setNext(newNode);
				return true;
			}
			previousNode = currentNode;
			currentNode = currentNode.getNext();
		}
		return true;
	}
}