// This code computes the compound interest for a giving number of years using the formula a = p(1+r)^n
// and the Math.pow() method.
import java.util.Scanner;
public class CompoundInterest2 {

	public static void main(String[] args) {
		double principal =  1000.0; //
		double rate = 0.05;
		double amount = 0;
		int numberOfYears = 10;
		
		// display headers
		System.out.printf( "%s%20s \n", "Year", "Amount on deposit" );
		
		
		// calculate amount on deposit for each of ten years
		for ( int year = 1; year <=numberOfYears; year++ )
		{
			// calculate new amount for specified year
			amount = principal * Math.pow( 1.0 + rate, year );
			// display the year and the amount
			System.out.printf( "%4d%,20.2f\n", year, amount );
		} // end for
	}
}
