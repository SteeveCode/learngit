//Program to test for a prime number using square root of n method.This code has a time  complexity of O(√n) hence it is 
//much more efficient than the previous two methods because the number of iteration is reduced to square root of the number.

import java.util.Scanner;

public class PrimNum3{

public static void main(String []args){
System.out.println("Enter any number");
Scanner input = new Scanner(System.in);
int num = input.nextInt();
int flag = 0;
for(int j=2; j<=(int)Math.sqrt(num);j++){
	
	if(num%j==0){
		flag = 1;
		break;		
	}
}
if(flag == 1) {
	System.out.println(num + " is not a prime number!");
}
else
	System.out.println("Huraay! "+num +" is a prime number!");
}

}
