package edu.cambiare.sorting;

import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;
import edu.cambiare.sorting.ArraySort;

public class ArraySortTest 
{
	@Test
	public void testBubbleSort( )
	{
		System.out.println( "bubbleSort");

		for( int i=0; i < 100; i++ )
		{
			Integer[] inputArray = makeRandomArray( 10000 );
			//ArraySort.printArray( inputArray );
			ArraySort.bubbleSort( inputArray );
			//ArraySort.printArray( inputArray );
			//System.out.println();
			
			assertTrue( ArraySort.checkSorted(inputArray) );
		}
	}
	
	@Test
	public void testQuickSort( )
	{
		System.out.println( "quickSort");

		for( int i=0; i < 100; i++ )
		{
			Integer[] inputArray = makeRandomArray( 10000 );
			//ArraySort.printArray( inputArray );
			ArraySort.quickSort( inputArray, 0, inputArray.length-1 );
			//ArraySort.printArray( inputArray );
			//System.out.println();
			
			assertTrue( ArraySort.checkSorted(inputArray) );
		}
	}
	
	@Test
	public void testSelectionSort( )
	{
		System.out.println( "selectionSort");

		for( int i=0; i < 100; i++ )
		{
			Integer[] inputArray = makeRandomArray( 10000 );
			//ArraySort.printArray( inputArray );
			ArraySort.selectionSort( inputArray );
			//ArraySort.printArray( inputArray );
			//System.out.println();
		
			assertTrue( ArraySort.checkSorted(inputArray) );
		}
	}
	
	@Test
	public void testShellSort( )
	{
		System.out.println( "shellSort");
		
		for( int i=0; i < 100; i++ )
		{
			Integer[] inputArray = makeRandomArray( 10000 );
			Integer[] copy = Arrays.copyOf( inputArray, inputArray.length );
			//ArraySort.printArray( inputArray );
			ArraySort.shellSort( inputArray, inputArray.length/2 );
			//ArraySort.printArray( inputArray );
			//System.out.println();
			
			boolean sorted = ArraySort.checkSorted(inputArray);
			if( !sorted )
			{
				System.out.println( "FAILED: ");
				ArraySort.printArray( copy );
				ArraySort.printArray( inputArray );
				System.out.println();
			}
			assertTrue( sorted );
		}
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
