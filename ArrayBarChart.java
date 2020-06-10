
// Fig. 7.6: BarChart.java
// Bar chart printing program.

public class ArrayBarChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {0,0,0,0,0,0,1,2,4,2,1};
		
		// for each array element, output a bar of the chart
		for(int counter = 0; counter<array.length;counter++) {
			if(counter==10)
				System.out.printf("%5d: ",100);
			else
				//The 0 flag in the format specifier displays a leading 0 for values with fewer digits than the field width (2).
				System.out.printf("%02d-%02d: ",counter*10,counter*10+9);
			
			
			// print bar of asterisks
			for(int stars =0;stars<array[counter];stars++)
				System.out.print("*");
			
			// start a new line of output
			System.out.println();
		}// end outer for	
	}// end main
}// end class BarChart
