//Program to test for a prime number using all numbers greater than 1 and less than n.

import java.util.Scanner;

public class PrimNum{

public static void main(String []args){

System.out.println("Enter any number");
Scanner input = new Scanner(System.in);
int number = input.nextInt();
int flag = 0; // We assume that the inputed number is a prime number by setting the flag value to 0.
for(int i=2; i<number;i++){
	if(number%i==0) {
		flag = 1; // the flag value is reset if a factor is found.
		break;
	}
	

}

if(flag == 1){
	System.out.println(number +" is not a prime number");
		
}else
	System.out.println("Huraay! "+number +" is a prime number!");

}

}