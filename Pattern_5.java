import java.util.Scanner;
import java.util.Scanner.*;
public class Pattern_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("4th Pattern");
		System.out.print("Enter number of diamond rows:");
		int odd =1;
		int numOfRows = input.nextInt();
		int midWay = numOfRows/2;
		int noOfSpaces = numOfRows/2;
		
		for(int i=1; i<=numOfRows; i++) {
			for(int j=1; j<=noOfSpaces; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=odd; j++) {
				System.out.print("*");
				}
			System.out.println();
				if(i<midWay){
					odd += 2;
					--noOfSpaces;
			}else {
				odd -= 2;
				++noOfSpaces;
			}
			
			}

	}

}
