package bwinter.training;

import java.util.ArrayList;

public class ArrayListLearn {
	private ArrayList<String> aList = new ArrayList<String>();
	
	public void addGroceryItem( String item ) {
		aList.add(item);
	}
	
	public void printGroceryList() {
		System.out.println( "You have " + aList.size() );
	
		for( int i = 0; i < aList.size(); i++ ) {
			System.out.println( i );
		}
	}
	
	public void modifyGroceryItem( int pos , String newItem ) {
		aList.set( pos , newItem );
		System.out.println("Grocery Item " + pos + 1 );
	}
	
	public void removeGroceryItem( int pos ) {
		String theItem = aList.get(pos);
		aList.remove(pos);
	}

	public String findItem( String searchItem ) {
		// boolean exists = aList.contains( searchItem );
		int pos = aList.indexOf( searchItem );
		
		if( pos >= 0 )
			return aList.get(pos);
		
		return null;
	}
}
