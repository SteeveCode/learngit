//Program to find the factors of a given number

import java.util.Scanner;

public class Factor{

public static void main(String []args){

System.out.print("Enter any number: ");



Scanner input = new Scanner(System.in);
int number = input.nextInt();
int i=1;
for(; i<= number; ++i)
{
	if(number%i==0)
		System.out.println(i+" is a factor of "+number);
	}

	input.close();
}


}