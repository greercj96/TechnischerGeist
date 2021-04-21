/**
 * 
 */
package org.howard.edu.lsp.exam.question41;

import java.util.ArrayList;

/**
 * @author greerjackson
 *
 */
public class RemoveZeroes {

		/**
		 * @param numberList represents the ArrayList we would like to remove zeroes from
		 * Iterate through the list, get zeroes and remove them.  
		 */
		public void removeZeroes(ArrayList<Integer> numberList) {
			for (int i = 0; i < numberList.size(); i++) {
				if (numberList.get(i)==0) {
					numberList.remove(i);
					i--;
				}
			}
		}

		
		
}
