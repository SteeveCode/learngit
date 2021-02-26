/*
 Making a Difference
10.17 (CarbonFootprint Interface: Polymorphism) Using interfaces, as you learned in this chapter,
you can specify similar behaviors for possibly disparate classes. Governments and companies
worldwide are becoming increasingly concerned with carbon footprints (annual releases of carbon
dioxide into the atmosphere) from buildings burning various types of fuels for heat, vehicles burning
fuels for power, and the like. Many scientists blame these greenhouse gases for the phenomenon
called global warming. Create three small classes unrelated by inheritance—classes Building, Car
and Bicycle. Give each class some unique appropriate attributes and behaviors that it does not have
in common with other classes. Write an interface CarbonFootprint with a getCarbonFootprint
method. Have each of your classes implement that interface, so that its getCarbonFootprint method
calculates an appropriate carbon footprint for that class (check out a few websites that explain how
to calculate carbon footprints). Write an application that creates objects of each of the three classes,
places references to those objects in ArrayList<CarbonFootprint>, then iterates through the Array-
List, polymorphically invoking each object’s getCarbonFootprint method. For each object, print
some identifying information and the object’s carbon footprint.
 **/

package Chapter10MakingADifference;

import java.util.ArrayList;

public class CarbonFootprintTest {

	public static void main(String[] args) {
		
		CarbonFootprint obj1 = new Building(1.0,2.0,17.0);
		CarbonFootprint obj2 = new Car(7.0,2.0,33.0);
		CarbonFootprint obj3 = new Bicycle(5.0,2.0,8.0);
		
		ArrayList<CarbonFootprint> objList = new ArrayList<CarbonFootprint>();
		
		objList.add(obj1);
		objList.add(obj2);
		objList.add(obj3);
		
		for(CarbonFootprint element:objList) {
			
			System.out.println(element);
		}
	}

}
