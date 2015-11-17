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
		
		while(currentNode != null){
			if(!currentNode.getElement().smaller(element)){
				if(element == currentNode.getElement())
					return false;
				break;
			}
			previousNode = currentNode;
			currentNode = currentNode.getNext();
		}


		Node<T> newNode = new Node<T>(element);
		previousNode.setNext(newNode);
		newNode.setNext(currentNode);
		return true;
	}
}