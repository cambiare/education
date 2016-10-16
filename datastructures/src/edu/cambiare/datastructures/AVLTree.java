package edu.cambiare.datastructures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AVLTree<T extends Comparable<T>> implements Iterable<T> 
{
	AVLTreeNode<T>		root;
	
	public void insert( T value )
	{
		insert( value, root );
	}
	
	private AVLTreeNode<T> insert( T value, AVLTreeNode<T> node )
	{
		if( node == null )
			return new AVLTreeNode<T>( value );
		
		int comparison = node.getValue().compareTo( value );
		
		// looking left
		if( comparison > 0 )
		{
			node.setLeft( insert( value, node.getLeft() ) );		
		} else if( comparison < 0 ) {
			node.setRight( insert( value, node.getRight() ) );
		} else {
			// dumping for now
		}
		
		return balance( node );
	}
	
	private AVLTreeNode<T> balance( AVLTreeNode<T> node )
	{
		if( node == null )
			return node;
		
		
	}
	
//	public T delete( T value )
//	{
//		
//	}
	
	public T findMin( )
	{
		return findMinNode().getValue();
	}
	
	private AVLTreeNode<T> findMinNode( )
	{
		
	}
	
	public List<T> traverse( )
	{
		List<T> result = new ArrayList<T>();
		
		for( T value : this )
		{
			result.add( value );
		}
		
		return result;
	}
	
	public Iterator<T> iterator( )
	{
		return new AVLTreeIterator<T>( findMinNode() );
	}
}

class AVLTreeIterator<T extends Comparable<T>> implements Iterator<T>
{
	private AVLTreeNode<T>		currentNode;
	
	public AVLTreeIterator( AVLTreeNode<T> first )
	{
		this.currentNode = first;
	}
	
	@Override
	public boolean hasNext() {
		return ( currentNode.getLeft() != null || currentNode.getRight() != null );
	}

	@Override
	public T next() {
		return null;
	}
	
}

class AVLTreeNode<T extends Comparable<T>>
{
	private T				value;
	private AVLTreeNode<T>	left;
	private AVLTreeNode<T>	right;
	
	private int				leftHeight;
	private int				rightHeight;

	public AVLTreeNode( T value )
	{
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public AVLTreeNode<T> getLeft() {
		return left;
	}

	public void setLeft(AVLTreeNode<T> left) {
		this.left = left;
	}

	public AVLTreeNode<T> getRight() {
		return right;
	}

	public void setRight(AVLTreeNode<T> right) {
		this.right = right;
	}

	

	public int getLeftHeight() {
		return leftHeight;
	}

	public void setLeftHeight(int leftHeight) {
		this.leftHeight = leftHeight;
	}

	public int getRightHeight() {
		return rightHeight;
	}

	public void setRightHeight(int rightHeight) {
		this.rightHeight = rightHeight;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
}
