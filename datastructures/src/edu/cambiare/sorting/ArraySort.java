package edu.cambiare.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ArraySort 
{
	public static <T extends Comparable<T>> void bubbleSort( T[] inputArray )
	{
		for( int i=0; i < inputArray.length; i++ )
		{
			for( int j=0; j < inputArray.length-1; j++ )
			{
				if( inputArray[j].compareTo( inputArray[j+1] ) > 0 )
				{
					swap( inputArray, j, j+1 );
				}
			}
		}
	}
	
	public static <T extends Comparable<T>> void selectionSort( T[] inputArray )
	{
		for( int i=0; i < inputArray.length; i++ )
		{
			int minValLocation = i;
			for( int j=i; j < inputArray.length; j++ )
			{
				if( inputArray[j].compareTo( inputArray[minValLocation] ) < 0 )
				{
					minValLocation = j;
				}
			}
			
			swap( inputArray, i, minValLocation );
		}
	}
	
	public static <T extends Comparable<T>> void shellSort( T[] inputArray, int k )
	{	
		if( k < 1 )
		{
			return;
		}
		
		for( int i=0, j=k; j < inputArray.length; i++, j++ )
		{
			if( inputArray[i].compareTo( inputArray[j] ) > 0 )
			{
				swap( inputArray, i, j );
				
				for( int bi=i-k, bj=j-k; bi >= 0; bi-=k, bj-=k )
				{
					if( inputArray[bi].compareTo( inputArray[bj] ) > 0 )
					{
						swap( inputArray, bi, bj );
					} else {
						break;
					}
				}
			}
		}
		
		shellSort( inputArray, k/2 );
	}
	
	public static <T extends Comparable<T>> void quickSort( T[] inputArray, int i, int j )
	{
		int wall;
		int pivot;
		
		if( j-i < 1 )
		{
			return;
		}
		
		// randomize the pivot
		pivot = new Double(Math.floor(Math.random() * (j-i))).intValue() + i;
		swap( inputArray, i, pivot );
		
		T pivotValue = inputArray[i];
		pivot = i;
		i++;
		wall = i;
		
		for( ; i <= j; i++ )
		{
			if( inputArray[i].compareTo( pivotValue ) < 0 )
			{
				swap( inputArray, i, wall );
				wall++;
			}
		}
		
		swap( inputArray, pivot, wall-1 );
		
		quickSort( inputArray, pivot, wall-1 );
		quickSort( inputArray, wall, j );
	}
	
	public static <T extends Comparable<T>> void insertionSort( T[] inputArray )
	{
		for( int i=0; i < inputArray.length; i++ )
		{
			for( int j=i; j > 0; j-- )
			{
				if( inputArray[j].compareTo( inputArray[j-1] ) < 0 )
				{
					swap( inputArray, j, j-1 );
				}
			}
		}
	}
	
	public static <T extends Comparable<T>> void treeSort( T[] inputArray )
	{
		TreeMap<T, List<T>> tree = new TreeMap<T, List<T>>();
		
		for( T value : inputArray )
		{
			List<T> valueList = tree.get( value );
			if( valueList == null )
			{
				valueList = new ArrayList<T>();
				tree.put( value, valueList );
			}
			valueList.add( value );
		}
		
		int i=0;
		for( Map.Entry<T, List<T>> entry : tree.entrySet() )
		{
			List<T> valueList = entry.getValue();
			for( T value : valueList )
			{
				inputArray[i] = value;
				i++;
			}
			
		}
	}
	
	private static <T> void swap( T[] inputArray, int i, int j )
	{
		T temp = inputArray[i];
		inputArray[i] = inputArray[j];
		inputArray[j] = temp;
	}
	
	public static <T extends Comparable<T>> boolean checkSorted( T[] inputArray )
	{
		
		for( int i=0; i < inputArray.length-1; i++ )
		{
			if( inputArray[i].compareTo( inputArray[i+1] ) > 0 )
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static void printArray( Object[] arr )
	{
		System.out.print( "[ ");
		for( Object obj : arr )
		{
			System.out.print( obj + "," );
		}
		System.out.println( " ]");
	}
}
