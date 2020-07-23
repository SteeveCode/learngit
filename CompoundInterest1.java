// This code computes the compound interest for a giving number of years without using the formula a = p(1+r)^n
// or the Math.pow() method.
public class CompoundInterest1 {

	public static void main(String[] args) {
		double principal =  1000.0; //
		double rate = 0.05;
		double amount = 0;
		int numberOfYears = 10;
		
		// display headers
		System.out.printf( "%s%19s\n", "Year", "Amount on deposit" );
		
		// calculate amount on deposit for each of ten years
		for(int i=1; i<=numberOfYears; i++){
			
		    double interest = principal * rate;
		    amount = principal + interest;
		    principal = amount;
		    System.out.printf("%4d%,10.2f\n",i,amount);

		}
	}
}
