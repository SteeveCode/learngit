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
