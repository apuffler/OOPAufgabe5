import java.util.Iterator;

public class OrderedSet<T extends Smaller<? super T>> extends BasicSet<T>{
	public OrderedSet(){
		super();
	}

	public OrderedSet(Node<T> headNode){
		super(headNode);
	}

	public boolean add(T element){
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