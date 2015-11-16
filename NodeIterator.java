import java.util.*;
public class NodeIterator<T> implements Iterator
{
	private Node<T> currentNode = null;
	private Node<T> previousNode = null;


	public NodeIterator(Node<T> currentNode)
	{
		this.currentNode = currentNode;
	}

	@Override
	public Node<T> next()
	{
		this.previousNode = currentNode;
		this.currentNode = this.currentNode.getNext();
		return this.currentNode;
	}

	@Override
	public boolean hasNext()
	{
		return this.currentNode.hasNext();
	}

	@Override
	public void remove()
	{
		//Do nothing if the previousNode is null (which means this Node is the headNode)?
		if(this.previousNode == null)
		{
			this.currentNode = null; //I guesss?
		}
		else
		{

			this.previousNode.setNext(this.currentNode.getNext());
			this.currentNode.setNext(null); 
		}

	}


}