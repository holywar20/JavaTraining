package bwinter.training;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class LinkedListLearn {

	private LinkedList<String> places = new LinkedList<String>();
	
	public void runLearning(){
		addInOrder(places , "Melborne" );
		addInOrder(places , "Perth" );
		addInOrder(places , "Canberra" );

		
		printList( places );
		addInOrder( places , "Alice Springs" );
		printList( places );
		
		// Advantages of a linked list
		
		
	}
	
	public static void printList(LinkedList<String> linkedList ) {
		Iterator<String> i = linkedList.iterator();
		
		while( i.hasNext() ) {
			System.out.println("Now Visiting " + i.next() );
		}
		System.out.println("----------------------");		
	}
	
	private static boolean addInOrder( LinkedList<String> list, String newCity) {
		ListIterator<String> myIterator = list.listIterator();
		
		while( myIterator.hasNext() ) {
			int comparision = myIterator.next().compareTo(newCity); // .next() moves forward one entry.
			
			if( comparision == 0 ) {
				System.out.println( newCity + " City already eixsts " );
				return false;
			} else if( comparision > 0  ) {
				myIterator.previous();
				myIterator.add( newCity );
				
				return true;
			} else if( comparision < 0 ) {
				
			}
		}
			
		myIterator.add( newCity );
		return true;
	}
}
