//Program to check for  a prime number

import java.util.Scanner;

public class PrimNum{

public static void main(String []args){
System.out.println("Enter any number");
Scanner input = new Scanner(System.in);
int number = input.nextInt();
for(int i=2; i<number;i++){
	if(number%i==0){
		System.out.println(number +" is not a prime number");
			
	}else
		System.out.println("Huraay! "+number +" is a prime number!");
	break;

}


}

}