//Exercises Question 4.29 - Solution 
//Write an application that prompts the user to enter the size of the side of a square, then displays a hollow square of that size made of asterisks. 
//Your program should work for squares of all side lengths between 1 and 20.

import java.util.Scanner;
public class HollowSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter square size: ");
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		if(size > 1 && size <20){
			for(int i=1; i<=size; i++){
				if(i == 1 || i ==size )
					for(int j=1; j<=size; j++)
						System.out.print("*");
				else{
					System.out.print("*");
					for(int m =1; m<=size-2;m++)
						System.out.print(" ");
					System.out.print("*");
					}
				System.out.println();
		}
		}
		else
			System.out.println("Enter a number between 1 & 20");

	}

}
