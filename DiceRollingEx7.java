import java.util.Random;
public class DiceRollingEx7 {

	public static void main(String[] args) {
		Random randomNumbers = new Random(); // random number generator
		int firstRoll = 0;
		int secondRoll = 0;
		int sumOfValues = 0;
		int[] sumOfRoll = new int[13];
		int total =0;
		
		
		// roll die 36,000,000 times; use die value as frequency index
		for ( int row = 0; row < 6000; row++ ) {
			for(int column = 0; column < 6000; column++){
				firstRoll = 1 + randomNumbers.nextInt( 6 );
				secondRoll = 1 + randomNumbers.nextInt( 6 );
				sumOfValues = firstRoll + secondRoll;
				++sumOfRoll[sumOfValues] ;
			}
		}
		System.out.printf("%4s%10s\n","Sum of Faces","Frequency");
		for(int i =2; i < sumOfRoll.length; i++) {
			System.out.printf("%2d%18d\n",i,sumOfRoll[i]);
		}
		
		for(int element:sumOfRoll) {
			total +=element;
		}
		System.out.printf("Total = %d",total);

}
}
