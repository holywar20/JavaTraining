
package bwinter.main;

// import bwinter.training.ArrayListLearn;
// import bwinter.training.AutoBoxingLearn;

import bwinter.training.LinkedListLearn;


import java.util.Scanner;

public class Scratch {
	/* This is just a container class. Import one of the training libraries to then do cool things with the subclasses */
	private static Scanner scanner = new Scanner( System.in );
	
	public static void main( String args[] ) {
		LinkedListLearn linkedList = new LinkedListLearn();
		
		linkedList.runLearning();
	}	
}
