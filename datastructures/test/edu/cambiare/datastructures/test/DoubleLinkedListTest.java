package edu.cambiare.datastructures.test;

import org.junit.Test;

import static org.junit.Assert.*;
import edu.cambiare.datastructures.DoubleLinkedList;

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
		DoubleLinkedList<Integer> 	dll = new DoubleLinkedList<>();

		addValues( 100, dll );
		
		assertEquals( dll.get(50).intValue(), 50 );
		
		dll.delete( 50 );
		
		assertEquals( dll.get(50).intValue(), 51 );
		
		dll.delete( 25 );
		
		assertEquals( dll.get(50).intValue(), 52 );

	}
	
	@Test
	public void testFindByIndex( )
	{
		DoubleLinkedList<Integer> 	dll = new DoubleLinkedList<>();
		
		addValues( 100, dll );
		
		assertEquals( dll.get( 50 ).intValue(), 50 );
		assertEquals( dll.get( 0 ).intValue(), 0 );
		assertEquals( dll.get( 99 ).intValue(), 99 );

	}
	
	@Test
	public void testInsertBefore( )
	{
		DoubleLinkedList<Integer> 	dll = new DoubleLinkedList<>();

		addValues( 100, dll );
		
		assertEquals( dll.get( 50 ).intValue(), 50 );

		dll.insertBefore( 1000, 50 );
		
		assertEquals( dll.get( 50 ).intValue(), 1000 );
		assertEquals( dll.get( 51 ).intValue(), 50 );
		assertEquals( dll.get( 49 ).intValue(), 49 );
	}
	
	private void addValues( int nvalues, DoubleLinkedList<Integer> dll )
	{
		for( int i=0; i < nvalues; i++ )
		{
			dll.append( i );
		}
	}
	
}
