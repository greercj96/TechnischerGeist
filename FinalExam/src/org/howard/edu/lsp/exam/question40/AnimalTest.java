/**
 * 
 */
package org.howard.edu.lsp.exam.question40;

/**
 * @author greerjackson
 *
 */
public class AnimalTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.println("TESTS FOR OBJECTS STORED IN FLYING");
			
			Flying Boeing787 = new Airplane();
			
			Flying CrestedGoose = new Goose();
			
			Boeing787.fly();
			
			CrestedGoose.fly();
			
			System.out.println("\n");
			
			System.out.println("TESTS FOR ANIMAL TYPES ");
			Goose EgyptianGoose = new Goose();
			
			EgyptianGoose.move();
			
			EgyptianGoose.speak();
			
			System.out.println("\n");
			
			Tiger BengalTiger = new Tiger();
			
			BengalTiger.move();
			
			BengalTiger.speak();
			
			System.out.println("\n");
			
			
			
			
			
	}		
}
