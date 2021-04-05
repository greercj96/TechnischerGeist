/**
 * 
 */
package org.howard.edu.lsp.assignment6.integerset;

/**
 * @author greerjackson
 * IMPLEMENTATION FILE
 * This program allows users to create sets and perform different operations on them. 
 *
 */


import java.util.*;
import org.howard.edu.lsp.assignment6.integerset.IntegerSetException.*;


public class IntegerSet {
	
	private ArrayList<Integer>list = new ArrayList<>();
	/**
	 * @param list
	 */
	public IntegerSet(ArrayList list) {
		this.list = list;
	}

	
	
	/**
	 * clears the internal representation of the set 
	 */
	public void clear() {
		list.clear();
	}
	
	

	
	/**
	 * @return returns the length of the set
	 */
	public int length()
	{
		return list.size();
	}
	
	
	
	
	/**
	 * @param b represents the list we are comparing list1 to
	 * @return returns true if the 2 sets are equal, false otherwise
	 * Two sets are equal if they contain all of the same values in ANY order
	 */
	public boolean equals(IntegerSet b) {
		ArrayList<Integer> list2 = b.list;
		
		if(list.size()!= list2.size()) {
			return false;
		}
		
		ArrayList<Integer> temp1 = list;
		
		ArrayList<Integer> temp2 = list2;
		
		Collections.sort(temp1);
		Collections.sort(temp2);
		
		
		for (int i=0; i <temp1.size(); i++) {
			if (temp1.get(i)!=temp2.get(i)) {
				return false;
			}
		}
		return true;
	}
	
	
	
	/**
	 * @param value this is the value that the user wants to check for in the set 
	 * @return returns true if the set contains the value, otherwise false
	 */
	
	public boolean contains(int value) {
		
		if (list.contains(value)){
			return true;
		}
		return false; 
	}
	

	
	
	/**
	 * @return returns the largest item in the set
	 * @throws IntegerSetException throws this exception if the set is empty
	 */
	public int largest () throws IntegerSetException{
		
		if (list.size()==0) {
			
			throw new IntegerSetException("The set is empty.");
			
		}
		
		int max = 0;
		
		for(int i=0;i <list.size();i++) {
			if(list.get(i)>max) {
				max = list.get(i);
			}
		}
		return max;
	}
	

	
	
	/**
	 * @return returns the smallest item in the set
	 * @throws IntegerSetException throws this exception if the set is empty
	 */
	
	public int smallest() throws IntegerSetException {
		

		if(list.size()==0) {
			throw new IntegerSetException ("The set is empty.");
		}
		
		try {
				int min = Integer.MAX_VALUE;
				
				
				
				for(int i=0; i <list.size(); i++) {
					
					
					if(list.get(i)<min) {
						min = list.get(i);
						
			
						
					}	
					
				}
		
			
			return min; 
		}
		catch(Exception IntegerSetException) {
			throw new IntegerSetException("The set is empty.");
		}
	
	}
	
	
	
	/**
	 * @param item an integer to be added to the set
	 * adds an item to the set or does nothing if already there
	 */
	
	public void add(int item) {
		
		boolean alreadyExists = false;
		
		for (int i=0; i<list.size(); i++) {
			if (list.get(i)==item) {
				alreadyExists = true;
			}
		}
		
	if (alreadyExists == false) {
		list.add(item);
	}
	
		
	}
	
	
	
//	public void add(int value) {
//		if (!list.contains(value)) {
//			list.add(value);
//		}
//	}

	
	/**
	 * @param item an integer to be removed from the set
	 * removes an item from the set or does nothing if not there
	 */
	public void remove(int item) {
		
		for(int i=0; i<list.size();i++) {
			if(list.get(i)==item) {
				list.remove(i);
				
				
			}
		}
		
	}
//	
//	public void remove (int value){
//		list.remove(value);
//	}
//	

	/**
	 * @param intSetb represents the list we are creating a union with 
	 * @return returns the union of the set
	 */
	public IntegerSet union(IntegerSet intSetb) {
		
      	ArrayList<Integer>temp = intSetb.getlist();
		
		Set<Integer>set = new HashSet<>();
	

		set.addAll(list);
		set.addAll(temp);
		
		set.toString();	
		
		ArrayList<Integer> list3 = new ArrayList<>(set);
	
		IntegerSet list4 = new IntegerSet(list3);
		
		return list4;

	
		
	}
	

	

	
	/**
	 * @param intSetb represents the list we are looking for an intersection with
	 * @return returns the intersection of the sets
	 */
	public IntegerSet intersect(IntegerSet intSetb) {
		


		ArrayList<Integer>tempList1  = new ArrayList<>( list);
	
		ArrayList<Integer> tempList2 = new ArrayList<>(intSetb.getlist());
		
		tempList1.retainAll(tempList2);
		
	
		IntegerSet list4 = new IntegerSet(tempList1); 
		
		return list4;
//		System.out.println(list4.toString());
		

		
		
	}
	
	
	//set difference 
	
	
	/**
	 * @param intSetb represents the list we are looking for a difference between 
	 * @return returns the difference between two sets 
	 */
	public IntegerSet diff(IntegerSet intSetb) {
		
 
		
		ArrayList<Integer>tempList1  = new ArrayList<>( list);
	
		ArrayList <Integer> tempList2 =new ArrayList <>(intSetb.getlist());
		
		Set<Integer>set1 = new HashSet<>(tempList1);
		Set<Integer>set2 = new HashSet<>(tempList2);
		
		
		set1.removeAll(set2);
		

		ArrayList<Integer> tempList3 = new ArrayList<>(set1);
		
		IntegerSet list4 = new IntegerSet(tempList3);
		
		return list4;
//		
//		System.out.println(list4.toString());
		
	
		
	}
	
	
	
	/**
	 * @return returns the items currently in the list
	 */
	public ArrayList <Integer> getlist(){
		return list;
	}
	
	
	
	
	
	/**
	 * @return returns true if the set is empty, false otherwise
	 */
	public boolean isEmpty() {
		if (list.size() == 0) {
			return true;
		}
		return false; 
	}
	
	

	
	
	/**
	 * returns string representation of set 
	 */
	public String toString() {
		return String.format("Set elements: " + this.getlist() + "\n");
	}
	
	
}
