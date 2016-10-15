package edu.cambiare.datastructures.test;

import org.junit.Test;

import edu.cambiare.sorting.ArraySort;

public class ArraySortTest 
{
	@Test
	public void testBubbleSort( )
	{
		Comparable[] inputArray = makeRandomArray( 10 );
		ArraySort.printArray( inputArray );
		ArraySort.bubbleSort( inputArray );
		ArraySort.printArray( inputArray );
		
	}
	
	@Test
	public void testSelectionSort( )
	{
		Comparable[] inputArray = makeRandomArray( 10 );
		ArraySort.printArray( inputArray );
		ArraySort.selectionSort( inputArray );
		ArraySort.printArray( inputArray );
	}
	
	private Comparable[] makeRandomArray( int length )
	{
		Integer[] inputArray = new Integer[length];
		
		for( int i=0; i < length; i++ )
		{
			inputArray[i] = new Double(Math.floor( Math.random() * length )).intValue();
		}
		
		return inputArray;
	}
}
