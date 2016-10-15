package edu.cambiare.sorting;

public class ArraySort 
{
	public static void bubbleSort( Comparable[] inputArray )
	{
		for( int i=0; i < inputArray.length; i++ )
		{
			for( int j=0; j < inputArray.length-1; j++ )
			{
				if( inputArray[j].compareTo( inputArray[j+1] ) > 0 )
				{
					Comparable temp = inputArray[j];
					inputArray[j] = inputArray[j+1];
					inputArray[j+1] = temp;
				}
			}
			System.out.print( i + ": " );
			printArray( inputArray );
		}
	}
	
	public static void selectionSort( Comparable[] inputArray )
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
			
			Comparable temp = inputArray[minValLocation];
			inputArray[minValLocation] = inputArray[i];
			inputArray[i] = temp;
			
			printArray( inputArray );
		}
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
