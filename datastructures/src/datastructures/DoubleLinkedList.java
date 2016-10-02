package datastructures;


/*
 * A simple Double Linked List
 */

public class DoubleLinkedList<T>
{
	private Node<T>		root;
	
	public int getSize( )
	{
		if( root == null )
			return 0;
		
		int counter = 1;
		
		Node<T> next = root;
		
		while( (next = next.getNext()) != null )
			counter++;
		
		return counter;
	}
	
	public void insertBefore( T value, int i )
	{
		Node<T> target = find( i );
		
		Node<T> newNode = new Node<T>( value );
		
		target.getPrev().setNext( newNode );
		newNode.setPrev( target.getPrev() );
		
		newNode.setNext( target );
		target.setPrev( newNode );
	}
	
	public T delete( int i )
	{
		Node<T> target = find( i );
		
		if( target == null )
			return null;
		
		target.getPrev().setNext( target.getNext() );
		target.getNext().setPrev( target.getPrev() );
		
		target.setNext( null );
		target.setPrev( null );
		
		return target.value;
	}
	
	public void append( T value )
	{
		Node<T>	end = findEnd( );
		Node<T> newNode = new Node<T>( value );
		
		
		// setup root if collection is empty
		if( end == null )
		{
			end = newNode;
			root = end;
		} else {
			// add new node to end
			end.setNext( newNode );
			newNode.setPrev( end );
		}
	}
	
	public T get( int i )
	{
		Node<T> node = find( i );
		if( node != null )
			return node.value;
		
		return null;
	}
	
	private Node<T> find( int i )
	{
		if( root == null )
			return null;
		
		int counter = 0;
		
		Node<T> target = root;
		
		while( counter < i && target != null ) 
		{
			target = target.getNext();
			counter++;
		}
		
		return target;
	}
	
	private Node<T> findEnd( )
	{	
		return find( getSize()-1 );
	}
}

class Node<T>
{
	Node<T>		prev;
	Node<T>		next;
	
	T			value;

	public Node( T value )
	{
		this.value = value;
	}
	
	public Node<T> getPrev() {
		return prev;
	}

	public void setPrev(Node<T> prev) {
		this.prev = prev;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	
	
	
}
