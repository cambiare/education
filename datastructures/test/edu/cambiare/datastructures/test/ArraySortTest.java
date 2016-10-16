package edu.cambiare.datastructures.test;

import org.junit.Test;
import static org.junit.Assert.*;

import edu.cambiare.sorting.ArraySort;

public class ArraySortTest 
{
	@Test
	public void testBubbleSort( )
	{
		System.out.println( "bubbleSort");

		Integer[] inputArray = makeRandomArray( 1000 );
		ArraySort.printArray( inputArray );
		ArraySort.bubbleSort( inputArray );
		ArraySort.printArray( inputArray );
		System.out.println();
		
		assertTrue( ArraySort.checkSorted(inputArray) );
	}
	
	@Test
	public void testSelectionSort( )
	{
		System.out.println( "selectionSort");

		Integer[] inputArray = makeRandomArray( 1000 );
		ArraySort.printArray( inputArray );
		ArraySort.selectionSort( inputArray );
		ArraySort.printArray( inputArray );
		System.out.println();
		
		assertTrue( ArraySort.checkSorted(inputArray) );
	}
	
	@Test
	public void testShellSort( )
	{
		System.out.println( "shellSort");
		
		Integer[] inputArray = makeRandomArray( 1000 );
		ArraySort.printArray( inputArray );
		ArraySort.shellSort( inputArray, inputArray.length/2 );
		ArraySort.printArray( inputArray );
		System.out.println();
		
		assertTrue( ArraySort.checkSorted(inputArray) );
	}
	
	private Integer[] makeRandomArray( int length )
	{
		Integer[] inputArray = new Integer[length];
		
		for( int i=0; i < length; i++ )
		{
			inputArray[i] = new Double(Math.floor( Math.random() * length )).intValue();
		}
		
		return inputArray;
	}
}
