///import java.util.Iterable;

public class Node<T>{ // } implements Iterable<Node<T>>{
    
	private T element;
	private Node<T> next = null;

	/**
     * Adds an element (which will be wrapped in a node) to a Node, making a linked List.
     * Returns NULL if element was NULL or the adding somehow failed.
     *
     * @param (element): Can be NULL, which indicates the end of the list.
     **/ 

	/*public Node<T> add(T element)
	{
		//If you already have a next element, make space for the element to be added.
		if(next != null)
		{
			Node<T> tmpnext = this.next;
			this.next = new Node<T>(element);
			this.next.add(tmpnext);
			return this.next.add(element);
		}
		
		this.next = new Node<T>(element);

		return this.next;
	}*/

	/**
     * Returns the next element of the list, if possible.
     * Returns NULL if the next element is NULL.
    **/ 
	public Node<T> getNext()
	{
		return this.next;
	}


	public T getElement()
	{
		return this.element;
	}

	public void setNext(Node<T> nextNode)
	{
		this.next = nextNode;
	}

	//@Override
	public boolean hasNext()
	{
		return this.next != null;
	}

	
	/**
     * Konstruktor von Node
     *
     * @param (element): Can be NULL, which indicates the end of the list.
     **/
	public Node(T element)
	{
		this.element = element;
	}

}
