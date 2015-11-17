import java.util.Iterator;

public class NodeIterator<T> implements Iterator<T>
{
	private Node<T> currentNode = null;
	private Node<T> previousNode = null;


	public NodeIterator(Node<T> currentNode)
	{
		this.currentNode = currentNode;
	}

	@Override
	public T next()
	{
		T tmp = this.currentNode.getElement();
		this.previousNode = currentNode;
		this.currentNode = this.currentNode.getNext();
		return tmp;
	}

	@Override
	public boolean hasNext()
	{
		return this.currentNode == null;
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
			this.currentNode = this.previousNode.getNext();
		}

	}


}