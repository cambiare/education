package edu.cambiare.datastructures;


public class BinaryTree<T extends Comparable<T>> 
{
	TreeNode<T> rootNode;
	
	public void insert( T value )
	{
		
	}
	
	public T find( T value )
	{
		return null;
	}
}

class TreeNode<T extends Comparable>
{
	private TreeNode<T>		left;
	private TreeNode<T>		right;
	
	T	value;

	public TreeNode<T> getLeft() {
		return left;
	}

	public void setLeft(TreeNode<T> left) {
		this.left = left;
	}

	public TreeNode<T> getRight() {
		return right;
	}

	public void setRight(TreeNode<T> right) {
		this.right = right;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	
	
}
