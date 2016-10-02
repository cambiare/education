package edu.cambiare.datastructures.test;

import org.junit.Test;
import static org.junit.Assert.*;

import datastructures.DoubleLinkedList;

public class DoubleLinkedListTest 
{
	
	
	@Test
	public void testAppend( )
	{
		DoubleLinkedList<Integer> 	dll = new DoubleLinkedList<>();
		
		addValues( 100, dll );
		
		assertEquals( dll.getSize(), 100 );
		
		addValues( 10, dll );
		
		assertEquals( dll.getSize(), 110 );
	}
	
	@Test
	public void testDelete( )
	{
		
	}
	
	@Test
	public void testFindByIndex( )
	{
		DoubleLinkedList<Integer> 	dll = new DoubleLinkedList<>();
		
		addValues( 100, dll );
		
		assertEquals( dll.get( 50 ).intValue(), 49 );
	}
	
	private void addValues( int nvalues, DoubleLinkedList<Integer> dll )
	{
		for( int i=0; i < nvalues; i++ )
		{
			dll.append( i );
		}
	}
	
}
