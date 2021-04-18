
package org.howard.edu.assignment7.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.howard.edu.assignment7.tollbooth.LandRover;
import org.howard.edu.assignment7.tollbooth.ScrantonTollBooth;
import org.howard.edu.assignment7.tollbooth.TollBooth;
import org.howard.edu.assignment7.tollbooth.Truck;
import org.howard.edu.assignment7.tollbooth.Volkswagen;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author greerjackson
 *
 */
class TollboothTest {
	
	
	@Test 
	@DisplayName("Test cases for calculate toll")
	public void testCalculateToll() {
		
	TollBooth booth = new ScrantonTollBooth();
		
		Truck landrover = new LandRover("Land Rover", 5,12000); 
		Truck volkswagen = new Volkswagen("Volkswagen", 2,5000);
		
	
		//Toll due for landrover = 31 , so this passes
		
		assertEquals(booth.calculateToll(landrover ), 31);
		
		//Toll due for volkswagen is 12, so this passes
		
		assertEquals(booth.calculateToll(volkswagen), 12);
		
		
		
	}
	
	@Test
	@DisplayName("Test cases for display data")
	public void testDisplayData() {
		
		TollBooth booth = new ScrantonTollBooth();
		
		Truck landrover = new LandRover("Land Rover", 5,12000); 
		Truck volkswagen = new Volkswagen("Volkswagen", 2,5000);
		
		booth.calculateToll(landrover);
		
		//Test 1 - Toll due for landrover is 31 so this should be output to the console
		assertEquals(booth.toStringTotals(), "Total since last collection - Receipts: $31\nTrucks: 1\n");
		
		booth.calculateToll(volkswagen);
		
		//Test 2 - Toll for volkswagen has been added (11) so 43 should output to the console
		assertEquals(booth.toStringTotals(), "Total since last collection - Receipts: $43\nTrucks: 2\n");
		
		
	}

	
	
	
	@Test
	@DisplayName("Test cases for reset")
	public void testReset() {
		TollBooth booth = new ScrantonTollBooth();
		
		Truck landrover = new LandRover("Land Rover", 5,12000); 
		Truck volkswagen = new Volkswagen("Volkswagen", 2,5000);
		
		booth.calculateToll(landrover);
		
		booth.reset();
		
		//Test 1 - since booth has now been reset, the total receipts and trucks should be zero 
		
		 
		assertEquals(booth.toStringTotals(),"Total since last collection - Receipts: $0\nTrucks: 0\n");
		
		
		booth.calculateToll(volkswagen); 
		booth.calculateToll(landrover);
		
		//Test 2 - add totals to the booth - receipts should now be 42 and trucks should be 2
		
		assertEquals(booth.toStringTotals(), "Total since last collection - Receipts: $43\nTrucks: 2\n");
		
		booth.reset();
		
		//Test 3 - reset booth once more after two trucks passed; receipts and trucks should be zero
		assertEquals(booth.toStringTotals(),"Total since last collection - Receipts: $0\nTrucks: 0\n");
	}
	
	
	
	
	

}
