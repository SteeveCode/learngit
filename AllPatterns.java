
import java.util.Scanner;
public class AllPatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1st Pattern");
		Scanner input = new Scanner(System.in);
		for(int i=1; i<=10; i++) {
			for(int j=0; j<i; j++) {
			System.out.print('*');
			}
			System.out.println();
			}
		System.out.println("2nd Pattern - Solution 1");
		for(int i=10; i>=1; i--) {
			for(int j=0; j<i; j++) {
			System.out.print('*');
			}
			System.out.println();
			}
		System.out.println("2nd Pattern - Solution 2");
		int size =10;
		int round =1;
		for(int i=1; i<=size; i++) {
			if(i == round) {
				for(int j=0;j<size-i; j++) {
					System.out.print('*');
			}
				}++round;
			System.out.println();
			}
		System.out.println("4th Pattern");
		for(int i=1; i<=size; i++) {
			for(int j=1; j<size; j++) {
				if(j<i) {
					System.out.print(" ");
			}
				else {
					System.out.print("*");
			}
			}
			System.out.println();
			}
		System.out.println("5th Pattern");
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
		
		System.out.println("6th Pattern");
			int rowSize =10;
			int frontSpaces = rowSize - 1; // note: the number of rows for this pattern must be 1 higher than the number white spaces on row 1
			int midSpaces = 1;
			for(int i = 1; i<=rowSize; i++) {
				for(int j = 1; j<=frontSpaces; j++) {
					System.out.print(" ");
				}
				if(i==1) {
				System.out.print("*");	
				}
				else {
				System.out.print("*");
				for(int k = 1; k<midSpaces; k++) 
					System.out.print("o");
				System.out.print("*");
				}
				midSpaces +=2;
				
				--frontSpaces;
				
				System.out.println();
			}
			System.out.println("7th Pattern - Solution 1");
			
			// Solution 1 to numeric pattern 7 problem 
			System.out.print("Enter a number: ");
	
			 int num = input.nextInt();
			 int total = 0;
			 int reverse = 0;
			 int rem = 0;
			 int ntotal = 0;
			 for(int i=1; i<=num; i++){
				total = total * 10 + i;
				ntotal = total;
				System.out.printf("%d\t",total);
				while(ntotal != 0) {
					reverse = reverse *10 + ntotal%10;
					ntotal = ntotal/10;
				}System.out.printf("%d",reverse);
				reverse = 0;
				System.out.println();
			 }
				System.out.println();
				System.out.println();
				
				System.out.println("7th Pattern - Solution 2");
				for(int i =1; i<=num; i++) {
					for(int j=1; j<=i;j++) {
						System.out.print(j);
						}
					System.out.print("\t");
					for(int j=i; j>=1; j--) {
						System.out.print(j);
					}
					System.out.println();
				}
				System.out.println("8th Pattern");
		int rowSizes = 9;
		int rowSpaces = --rowSizes;

		for(int i =1; i<= rowSizes; i++){

			for(int j = 0; j<rowSpaces; j++){
				System.out.print(" ");
			}
			for(int k = i; k > 0; k--){
				System.out.print(k);
			}
			
			for(int l=2; l<=i; l++){
			
				System.out.print(l);
			} 
			System.out.println();
			rowSpaces--;
		}
		
		}
		
	}


