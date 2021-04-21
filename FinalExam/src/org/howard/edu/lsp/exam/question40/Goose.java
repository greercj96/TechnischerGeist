/*
 * 
 */
package org.howard.edu.lsp.exam.question40;

/**
 * @author greerjackson
 *
 */
 class Goose extends Animal implements Flying{
		
		public Goose() {
			super("goose");
		}
		
		public void fly() {
			System.out.println("This " + getName() + " is up, up, and AWAY!");
		}
		
	
	
}


