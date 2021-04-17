/**
 * 
 */
package org.howard.edu.assignment7.tollbooth;

import org.howard.edu.assignment7.tollbooth.ScrantonTollBooth;
import org.howard.edu.assignment7.tollbooth.Truck;

/**
 * @author greerjackson
 *
 */



/**
 * @author greerjackson
 *class that implements the specified interface truck 
 */
public class LandRover extends ScrantonTollBooth implements Truck{
		
		private String make;
		private int axles;
		private int totalWeight; 
		
	public LandRover(String make, int axles, int totalWeight){
		this.make = make;
		this.axles = axles;
		this.totalWeight = totalWeight; 
				
	}
	
	public String getMake() {
		return make;
	}

	public int getAxles() {
		return axles;
	}

	public int getTotalWeight() {
		return totalWeight;
		
	}
	
	
	}


