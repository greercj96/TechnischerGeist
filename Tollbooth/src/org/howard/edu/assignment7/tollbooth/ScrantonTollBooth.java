/**
 * 
 */
package org.howard.edu.assignment7.tollbooth;

import org.howard.edu.assignment7.tollbooth.TollBooth;
import org.howard.edu.assignment7.tollbooth.Truck;




/**
 * @author greerjackson
 *
 */
/**
 * @author greerjackson
 * class thaat implements the specified interface TollBooth
 */
public class ScrantonTollBooth implements TollBooth {


		int totalTrucks;
		int totalReceipts; 
	
		
	    /**
	     * constructor
	     */
	    public ScrantonTollBooth(){
		totalTrucks = 0;
		totalReceipts = 0; 
	}


	/**
	 * takes object type Truck and calculates toll 
	 */
	public int calculateToll(Truck T) {
		
		int axles = T.getAxles();
		int totalWeight = T.getTotalWeight();
		int tollDue = 5*axles + ((totalWeight/1000)/2);
		
		
		System.out.println("Truck arrival - Axles:" + T.getAxles() + "\n" + "Total weight: " + T.getTotalWeight()  + "kg" + "\n" + "Toll due: $" + tollDue + "\n");
	
		totalTrucks = totalTrucks +1; 
		totalReceipts = totalReceipts + tollDue; 

		return tollDue;
	}

	/**
	 *displays the data for the total receipts and number of trucks since the last receipt collection 
	 */
	public void displayData() {
		System.out.println("Total since last collection - Receipts: $" + totalReceipts + "\n" +  "Trucks: " + totalTrucks + "\n");
	}	


	/**
	 *zeros out receipts aand prints out summary information on Trucks
	 */
	public void reset() {
		System.out.println(" *** Collecting receipts ***");
		this.displayData();
		this.totalTrucks = 0;
		this.totalReceipts = 0;
		
		
	}


	/* toString for jUnit testing purposes 
	 * 
	 */
	public String toStringTotals() {
		return("Total since last collection - Receipts: $" + totalReceipts + "\n" +  "Trucks: " + totalTrucks + "\n");
	}


	
}
