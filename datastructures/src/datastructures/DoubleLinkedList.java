package datastructures;

import java.util.Iterator;

public class DoubleLinkedList<T> implements Iterable<T>, Iterator<T>
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
	
	public Node<T> delete( int i )
	{
		return null;
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
		
		int counter = 1;
		
		Node<T> target = root;
		
		while( counter < i || target == null ) 
		{
			target = target.getNext();
			counter++;
		}
		
		return target;
	}
	
	private Node<T> findEnd( )
	{	
		return find( getSize() );
	}

	@Override
	public Iterator<T> iterator() 
	{
		return this;
	}

	@Override
	public boolean hasNext() 
	{
		return false;
	}

	@Override
	public T next() 
	{
		return null;
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
