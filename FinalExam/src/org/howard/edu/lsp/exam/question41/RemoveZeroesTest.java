/**
 * 
 */
package org.howard.edu.lsp.exam.question41;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;




/**
 * @author greerjackson
 *
 */
public class RemoveZeroesTest {

	@Test
	@DisplayName("Test cases for remove zeroes")
	void testRemoveZeroes() {
		
		RemoveZeroes rz = new RemoveZeroes();
		
		 ArrayList<Integer> numberList = new ArrayList<Integer>();
		
		  
	            numberList.add(2);
	            numberList.add(3);
	            numberList.add(10);
	            numberList.add(0);
	            numberList.add(0);
	            numberList.add(20);
	            numberList.add(0);
	            
	        
		  
	            
	            //Test 1 - check that numbers have been added to numberList
	            
	            assertEquals(numberList.toString(), "[2, 3, 10, 0, 0, 20, 0]");
		  
	            //Test 2 - run removeZeroes and check that all zeroes have been removed from numberList
	            
	            rz.removeZeroes(numberList);
	            
	            assertFalse(numberList.contains(0));
	            
	            assertEquals(numberList.toString(), "[2, 3, 10, 20]");
	            
	            
	            //Test 3 - run removeZeroes on a list with all zeros. Check that the remaining list is an empty list.
	            
	            
	            ArrayList<Integer> numberList2 = new ArrayList<Integer>();
	            
	            numberList2.add(0);
	            numberList2.add(0);
	            numberList2.add(0);
	            numberList2.add(0);
	            numberList2.add(0);
	            
	            assertEquals(numberList2.toString(), "[0, 0, 0, 0, 0]");
	            
	            rz.removeZeroes(numberList2);
	            
	            assertFalse(numberList.contains(0));
	            
	            assertEquals(numberList2.toString(), "[]");
	            
	            
	            
		  
		  
		  
	}

}
