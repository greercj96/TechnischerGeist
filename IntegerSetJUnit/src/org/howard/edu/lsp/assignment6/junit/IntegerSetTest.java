package org.howard.edu.lsp.assignment6.junit;


import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.howard.edu.lsp.assignment6.integerset.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author greerjackson
 *This file contains JUnit tests for the IntegerSet class
 */
public class IntegerSetTest {



	@Test
	@DisplayName("Test cases for clear")
	public void testClear() {
		ArrayList<Integer> list1 = new ArrayList<>();
		IntegerSet set1 = new IntegerSet (list1);
		
		//Test 1 - clearing empty set results in isEmpty being true 
		set1.clear();
		
		assertTrue(set1.isEmpty());
		
		//Test 2- clearing set after adding elements results in isEmpty being true 
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		
		set1.clear();
		
		assertTrue(set1.isEmpty());
		
	
		
		//Test 3 - after adding element, isEmpty is false
		set1.add(4);
		
		assertFalse(set1.isEmpty());
		
		
	}

	@Test
	@DisplayName("Test cases for length")
	public void testLength() {
		ArrayList<Integer> list1 = new ArrayList<>();
		IntegerSet set1 = new IntegerSet (list1);
		
		//Test 1 - length equals zero before adding any elements 
		
		assertTrue(set1.length() == 0 );
	
		//Test 2 - length equals 4 after adding 4 elements 
		set1.add(2);
		set1.add(4);
		set1.add(6);
		set1.add(8);
		
		assertTrue(set1.length() == 4);
		
		
		//Test 3 - length still equals 4 after attempting to add already existing element 
		set1.add(8);
		
		assertTrue(set1.length() == 4);
		
		
	}

	@Test
	@DisplayName("Test cases for equals")
	public void testEqualsIntegerSet() {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		ArrayList<Integer> list3 = new ArrayList<>();
		
		IntegerSet set1 = new IntegerSet (list1);
		IntegerSet set2 = new IntegerSet (list2);
		IntegerSet set3 = new IntegerSet (list3);
		
		//Test 1 - sets are equal when elements in order 
		set1.add(12);
		set1.add(14);
		set1.add(16);
		set1.add(18);
	
		
		set2.add(12);
		set2.add(14);
		set2.add(16);
		set2.add(18);
		
		assertEquals(set1.equals(set2), true);
//		
//		//Test 2 - sets are equal when elements not in order 
//		
		set3.add(18);
		set3.add(12);
		set3.add(16);
		set3.add(14);
		
		assertTrue(set1.equals(set3) == true);
//		
//		//Test 3 - sets are equal because both are empty after being cleared 
//		
		set1.clear();
		set2.clear();
		
		assertTrue(set1.equals(set2) == true);
//		
//		//Test 4 - sets are not equal 
//		
		set3.remove(14);
		
		assertTrue(set1.equals(set3) == false);
		
	}

	@Test
	@DisplayName("Test cases for contains")
	public void testContains() {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		IntegerSet set1 = new IntegerSet (list1);
		
		//Test 1 - contains is false because no elements are currently in the set 
		
		assertFalse(set1.contains(0));
		
		
		// Test 2 - contains 4 is true because 4 has been added to the set 
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		
		assertTrue(set1.contains(4));
		
		
		//Test 3 - contains 4 is now false because 4 has been removed from the set 
		
		set1.remove(4);
		
		assertFalse(set1.contains(4));
	}

	@Test
	@DisplayName("Test cases for largest")
	public void testLargest() throws IntegerSetException {
		ArrayList<Integer> list1 = new ArrayList<>();
		IntegerSet set1 = new IntegerSet (list1);
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		
	    //Test 1 - largest is true because 4 is currently the largest element 
		
		try {
		assertTrue(set1.largest() == 4);
		}
		catch(Exception IntegerSetException) {
			System.out.println("Caught Exception: " + IntegerSetException.getMessage());
		}
		
		//Test 2 -  largest is true because 65 has now been added and is the largest element 
		
		set1.add(65);
		
		try {
		assertTrue(set1.largest()== 65);
		}
		catch(Exception IntegerSetException) {
			System.out.println("Caught Exception: " + IntegerSetException.getMessage());
		}
		
		//Test 3 - IntegerSetException is thrown because the set has been cleared and is now empty 
		set1.clear();
		
		assertThrows(IntegerSetException.class, () -> set1.largest());
	}

	@Test
	@DisplayName("Test cases for smallest")
	public void testSmallest() throws IntegerSetException {
		ArrayList<Integer> list1 = new ArrayList<>();
		IntegerSet set1 = new IntegerSet (list1);
		
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		
		//Test 1 - smallest  is true because 1 is currently the smallest element 
		try {
		assertTrue(set1.smallest() == 1);	
		}
		catch(Exception IntegerSetException) {
			System.out.println("Caught Exception: " + IntegerSetException.getMessage());
		}
		
		//Test 2 - smallest is true because 1 has been removed and 2 is currently the smallest element
		set1.remove(1);
		
		try {
		assertTrue(set1.smallest() == 2);
		}
		catch(Exception IntegerSetException) {
			System.out.println("Caught Exception: " + IntegerSetException.getMessage());
		}
		
		//Test 3 - IntegerSetException is thrown because the set has been cleared and is now empty 
		set1.clear();
		
		
		
		assertThrows(IntegerSetException.class, ()-> set1.largest());
		
	}

	@Test
	@DisplayName("Test cases for add")
	public void testAdd() {
		ArrayList<Integer> list1 = new ArrayList<>();
		IntegerSet set1 = new IntegerSet (list1);
		
		//Test 1 - set1 contains 1 and 2 is true because 1 and 2 were successfully added 
		set1.add(1);
		set1.add(2);
		assertTrue(set1.contains(1));
		assertTrue(set1.contains(2));

		//Test 2 - the contents of set1 will still be 1,2 because 2 has already been added; therefore this add will be ignored
	
		set1.add(2);

		assertEquals(set1.toString(), "Set elements: [1, 2]\n");
	}

	@Test
	@DisplayName("Test cases for remove")
	public void testRemove() {
		ArrayList<Integer> list1 = new ArrayList<>();
		IntegerSet set1 = new IntegerSet (list1);
		
		
		set1.add(1);
		set1.add(2);
		
		//Test 1 - set 1 length equals 1 because 2 has been removed successfully 
		set1.remove(2);
		assertTrue(set1.length() == 1);
		
		
		//Test 2 - set 1 length equals 0 because 1 has been removed successfully
		set1.remove(1);
		
		assertTrue(set1.length() == 0);
		
		
		
		set1.add(12);
		set1.add(13);
		set1.add(14);
		
		set1.remove(14);
		
		//Test 3 - set 1 toString returns 12,13 because 14 has been removed successfully
		assertEquals(set1.toString(), "Set elements: [12, 13]\n");
		
		

		
	
	}

	@Test
	@DisplayName("Test cases for Union")
	void testUnion() {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		IntegerSet set1 = new IntegerSet(list1);
		IntegerSet set2 = new IntegerSet(list2);
		
		set1.add(12);
		set1.add(15);
		set1.add(20);
		
		set2.add(3);
		set2.add(6);
		set2.add(9);
		
		
		
		set1.union(set2);
		
		//Test 1- set 1 union set 2 is equal to 12,15,20,3,6,9 because these are all the elements in the two sets 
		assertEquals(set1.toString(), "Set elements: [12, 15, 20, 3, 6, 9]\n");
		
		set1.clear();
		set1.add(5);
		
		set1.union(set2);
		
		//Test 2 - set 1 has been cleared and only 5 has been added. Therefore, the union is now 5,3,6,9
		assertEquals(set1.toString(), "Set elements: [5, 3, 6, 9]\n");
		
		set1.clear();
		set2.clear();
		
		set1.union(set2);
		
		//Test 3 - both sets have been cleared so the resulting union is an empty set 
		assertEquals(set1.toString(), "Set elements: []\n");
	}

	@Test
	@DisplayName("Test cases for intersect")
	public void testIntersect() {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		
		IntegerSet set1 = new IntegerSet (list1);
		IntegerSet set2 = new IntegerSet(list2);
		
		
//		
		set1.add(30);
		set1.add(50);
		
		set2.add(30);
		set2.add(60);
		set2.add(90);
		
		
		set1.intersect(set2);
		
		//Test 1 - 30 is the only element in the intersection 

		assertEquals(set1.toString(), "Set elements: [30]\n");
		
		
		set1.add(60);
		
		set2.intersect(set1);
		
		//Test 2- since 60 has been added to set 1, set 2 now has 30 and 60 in common with set 1 
		
		assertEquals(set2.toString(), "Set elements: [30, 60]\n");
		
		set1.clear(); 
		
		set1.intersect(set2);
		
		//Test 3 - set 1 has been cleared, meaning that when it intersects set 2, the intersection is empty 
		assertEquals(set1.toString(), "Set elements: []\n");
		
	}

	@Test
	@DisplayName("Test cases for difference")
	public void testDiff() {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		IntegerSet set1 = new IntegerSet (list1);
		IntegerSet set2 = new IntegerSet (list2);
		
		set1.add(33);
		set1.add(22);
		set1.add(55);
		
		set2.add(44);
		set2.add(55);
		set2.add(22);
		
		
		set1.diff(set2);
		//Test 1 - the difference equals 33 because 33 is the only number in set 1 that isn't in set 2
		assertEquals(set1.getlist().toString(), "[33]");
		
		set1.add(66);
		set1.add(77);
		set1.add(44);
		
		
		set2.diff(set1);
		
		//Test 2 - the difference equals 55,22 because 55 and 22 are no longer in set 1 but they are in set 2 
		assertEquals(set2.getlist().toString(), "[55, 22]");
		
		set1.clear();
		set1.diff(set2);
		
		//Test 3  - the difference is now an empty set because set 1 was cleared and there is nothing in set 1 that isn't in set 2
		assertEquals(set1.getlist().toString(), "[]" );
		
		
	
	}



	@Test
	@DisplayName("Test cases for isEmpty")
	public void testIsEmpty() {
		ArrayList<Integer> list1 = new ArrayList<>();
		IntegerSet set1 = new IntegerSet (list1);
		set1.add(10);
		set1.add(20);
		
		//Test 1 - set 1 isEmpty is false because the set currently has elements 10 and 20 
		assertFalse(set1.isEmpty());
		
		//Test 2 - set 1 isEmpty is true because the set has been cleared 
		
		set1.clear();
		
		assertTrue(set1.isEmpty());
	
	
	}

	@Test
	@DisplayName("Test cases for toString")
	public void testToString() {

		ArrayList<Integer> list1 = new ArrayList<>();
		
		IntegerSet set1 = new IntegerSet (list1);
	
		
		set1.add(12);
		set1.add(5);
	
	
		
		//Test 1 - toString returns a string with set 12,5 because those are the elements currently in the set 
		
		assertEquals("Set elements: [12, 5]\n" ,set1.toString());
		
		set1.clear();
		
		//Test 2 - toString returns a string with empty set because set1 has been cleared 
		
		assertEquals("Set elements: []\n" ,set1.toString());
		
		
	}

}

