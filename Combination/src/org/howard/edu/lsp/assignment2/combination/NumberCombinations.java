/*Greer Jackson
  Large Scale Programming
  Combination
  Implementation File*/

package org.howard.edu.lsp.assignment2.combination;

/*
 * Import statements for data structures to be used
 */

import java.util.ArrayList;
import java.util.Arrays;       
import java.util.List;

public class NumberCombinations {

	
		/*
		 * This function takes an array of numbers and 
		 * target sum as input. The array list stores an array of each set of
		 * combinations. It also sorts the numbers to that a specific order is 
		 * maintained during the Depth First Search
		 */
		public List<List<Integer>> combinationSum(int[]numbers, int targetSum){             
			List<List<Integer>> combos = new ArrayList<>();                                 
			Arrays.sort(numbers);                                                           
			calculateCombinations(numbers, 0,targetSum, new ArrayList<Integer>(), combos);  
			
			if (combos.size() == 0){
				System.out.println("There are no possible combinations which equal " + targetSum);
			}
			else {
			
			System.out.println("Here is the list of possible combinations which equal " + targetSum);
	
			}
			return combos;
		}
		
		
		/*
		 * This is a recursive function which calculates
		 * all combinations using DFS. 
		 */
		
		public void calculateCombinations(int[] numbers, int index,int targetSum, List<Integer> current, List<List<Integer>> combos) {  
			if (targetSum == 0) {                          
				combos.add(new ArrayList<>(current));      //base case - if combination that sums to target is found, add it to the arraylist
				return;
			}
			
			if(targetSum<0) {                              //if search ends and target is less than 0, return
				return;
			}
				
			for (int i = index; i < numbers.length; i++) {             
				if (i == index || numbers[i] != numbers[i-1]) {         //check to ensure that we're at the first iteration or the previous number is not the same as the current number, to avoid duplicates
					current.add(i);                                     
					calculateCombinations(numbers, i+1, targetSum-numbers[i], current, combos);   //recursive call 
					current.remove(current.size()-1);  
				
				}
			}
		}
		
 }
