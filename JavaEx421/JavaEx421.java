package JavaEx421;

import java.util.Scanner;
public class JavaEx421 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intCount = 1;
		int intNum ;
		int largeNum = 0;
		
		Scanner input = new Scanner(System.in);
		//intNum = input.nextInt();
		for(int i = 1; i<=7; i++) {
			
			System.out.println("Enter integer number "+intCount+":");
			intNum = input.nextInt();
			if(intNum > largeNum) {
				largeNum = intNum;
				}
			intCount++;
			
		}
		System.out.println("The largest number is "+ largeNum);

	}

}
