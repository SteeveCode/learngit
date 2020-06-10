// program to find the two largest numbers

import java.util.Scanner;
public class TwoLargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int first = 0;
		int second =0;
		
		while(counter<10) {
			System.out.printf("Enter %d: ", counter+1);
			int num = input.nextInt();
			if(num>first) {
				second=first;
				first=num;
			}
			else
				if(num>second)
					second=num;
			counter++;
			
		}
		System.out.println("The highest number is: "+first);
		System.out.println("The second highest number is: "+second);

	}

}
