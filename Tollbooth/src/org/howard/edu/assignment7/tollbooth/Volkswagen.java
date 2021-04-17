/**
 * 
 */
package org.howard.edu.assignment7.tollbooth;

/**
 * @author greerjackson
 *
 */

/**
 * @author greerjackson
 *class that implements the specified interface Truck
 */
public class Volkswagen extends ScrantonTollBooth implements Truck{
	private String make;
	private int axles;
	private int totalWeight; 
		
	public Volkswagen(String make,int axles, int totalWeight ){
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
