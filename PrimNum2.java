//Program to calculate a prime number. This code was not exactly clear. needs to be refactored.

import java.util.Scanner;

public class PrimNum2{

public static void main(String []args){
System.out.println("Enter any number");
Scanner input = new Scanner(System.in);
int topNum = input.nextInt();
for(int j=2; j<=topNum;j++){
	int number = j;
	for(int i=2; i<number;i++){
	if(number%i==0){
		//System.out.println(number +" is not a prime number");
			
	}else
		System.out.println("Huraay! "+number +" is a prime number!");
	break;

}
}

}

}