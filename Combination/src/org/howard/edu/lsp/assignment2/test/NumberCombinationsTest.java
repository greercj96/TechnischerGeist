/*Greer Jackson
  Large Scale Programming
  Combination
  Test Drive File*/

package org.howard.edu.lsp.assignment2.test;

import org.howard.edu.lsp.assignment2.combination.NumberCombinations;  //import implementation class




public class NumberCombinationsTest {
	
	

	public static void main(String[] args) {
	
		
		
		/*
		 * FIRST TEST CASE
		 */
		
		NumberCombinations test1;

		test1 = new NumberCombinations();
		
		int [] numbers = {5,5,10,15};
		int targetSum = 15;
		
		System.out.println(test1.combinationSum(numbers, targetSum));
	
		
		
		
		/*
		 * SECOND TEST CASE
		 */

//		
//		NumberCombinations test2;
//
//		test2 = new NumberCombinations();
//		
//		int [] numbers = {11,14,5,7};
//		int targetSum = 20;
//		
//		System.out.println(test2.combinationSum(numbers, targetSum));
		
		
		/*
		 * THIRD TEST CASE
		 */
		
//		NumberCombinations test3;
//
//		test3 = new NumberCombinations();
//		
//		int [] numbers = {1,2,3,4,5,6};
//		int targetSum = 6;
//		
//		System.out.println(test3.combinationSum(numbers, targetSum));
//		

	}

}
