package org.howard.edu.lsp.assignment4.test;
/**
 *  DRIVER FILE 
 *
 */



import java.util.*;

import org.howard.edu.lsp.assignment4.implementation.*;



/**
 * @author greerjackson
 *
 */
public class IntegerSetTest {

	
	/**
	 * @param args IntegerSetException throws error with string message
	 * @throws throws an error if performing largest() or smallest() on empty set
	 */
	public static void main(String[] args) throws IntegerSetException{
		// TODO Auto-generated method stub
		
		/**
		 * initiating two new sets 
		 */
		
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		
		
		IntegerSet set1 = new IntegerSet (list1);
		IntegerSet set2 = new IntegerSet (list2);
		
		
		
		/*
		 * Test Cases for adding, removing, equals, determining length and displaying
		 */
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);

		
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(5);
		set2.add(6);
		
	
	
		
		System.out.println("Set 1: " +set1.toString());
		System.out.println("Set 1 length:" + set1.length()+ " "+ "\n");
		
		System.out.println("Set 2:" + set2.toString());
		System.out.println("Set 2 length:" + set2.length()+ " "+ "\n");
		
		
		set2.remove(6);
	
		System.out.println("Set 2:" + set2.getlist() + "\n");
		
		System.out.println("Is set 1 equal to set 2?" + " " + set1.equals(set2)+ "\n");
	
		
		/**
		 * Test cases for largest, smallest, isEmpty and contains methods
		 */

		System.out.println("Largest item in set 1 is" + " "+set1.largest()+ "\n");
		
		System.out.println("Smallest item in set 1 is" +" "+ set1.smallest()+ "\n");
		
		System.out.println("Is Set1 empty?" + " " +set1.isEmpty()+ "\n");
		
		System.out.println("Does Set1 contain 9?" + " "+ set1.contains(9)+ "\n");
		
		System.out.println("Does Set2 contain 1?" + " "+ set1.contains(1)+ "\n");
		
		
		
		/**
		 * (Test cases for difference, intersection, union and is Equal
		 *
		 */
	
		
	
		System.out.println("Difference Set1-Set2");
 		set1.diff(set2);
 		
 		System.out.println("Difference Set2-Set1");
 		set2.diff(set1);
	
	
	
		
		
		System.out.println("Intersection of Set1 and Set2: ");
		set1.intersect(set2);
		
		System.out.println("Union of Set1 and Set2 ");
		set1.union(set2);
		
	
	
		
		
		
		/**
		 * Test cases for clear and IntegerSetException
		 * Clear set 2 and then try to find the largest number; exception should be thrown
		 */
		set2.clear();
		System.out.println("Set 2:" + set2.toString());
		
		System.out.println(set2.largest());
//	
	
	}

}
