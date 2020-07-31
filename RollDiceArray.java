// Fig. 7.7: RollDie.java
// Die-rolling program using arrays instead of switch.
import java.util.Random;
public class RollDiceArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randomNumbers = new Random(); // random number generator
		int[] frequency = new int[ 7 ]; // array of frequency counters
		//Note: The frequency array has 0 default value at each index position because it is not initialised.
		 
		// roll die 6,000,000 times; use die value as frequency index
		 for ( int roll = 1; roll <= 6000000; roll++ )
			 ++frequency[ 1 + randomNumbers.nextInt( 6 ) ];
		 
		 //Note: The explanation of the code on line 14 is this:-
		 // 1 + randomNumbers.nextInt( 6 ) will return a random number from the range 1 - 6. The code on line 14 becomes something like this:-
		 // ++frequency[4] assuming that the number 4 was the random number that was returned from the range 1 - 6. Next:-
		 // ++frequency[4] will search through the array to find the value of the element at the 4th index position. 
		 // When the element at the 4th index position is found, it will be incremented by 1 but remember that the initial value is 0
		 // Hence the value of the element at the 4th index position will change from 0 to 1
		 // The loop is repeated 6000 times, generating different index value and the increment operator is used to increase the value each time.
		
		 System.out.printf( "%s%10s\n", "Face", "Frequency" );
		
		 // output each array element's value
		 for ( int face = 1; face < frequency.length; face++ )
		 System.out.printf( "%4d%10d\n", face, frequency[ face ] );
		 System.out.println();
		 System.out.printf( "%4d%10d\n", 0, frequency[ 0 ] );// to show that index 0 was not affected.

	}// end main
}// end class RollDie
