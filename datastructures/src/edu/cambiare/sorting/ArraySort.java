package edu.cambiare.sorting;

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
					T temp = inputArray[j];
					inputArray[j] = inputArray[j+1];
					inputArray[j+1] = temp;
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
			
			T temp = inputArray[minValLocation];
			inputArray[minValLocation] = inputArray[i];
			inputArray[i] = temp;
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
				T temp = inputArray[j];
				inputArray[j] = inputArray[i];
				inputArray[i] = temp;
				
				for( int bi=i-k, bj=j-k; bi > 0; bi-=k, bj-=k )
				{
					if( inputArray[bi].compareTo( inputArray[bj] ) > 0 )
					{
						T btemp = inputArray[bj];
						inputArray[bj] = inputArray[bi];
						inputArray[bi] = btemp;
					} else {
						break;
					}
				}
			}
		}
		
		shellSort( inputArray, k/2 );
		
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
