//Program to test for a prime number using half of n method. Although, this code also has a time complexity of O(n), it is much more efficient than 
//the previous method because the number of iteration is reduced to half of the given number.

import java.util.Scanner;

public class PrimNum2{

public static void main(String []args){
System.out.println("Enter any number");
Scanner input = new Scanner(System.in);
int num = input.nextInt();
int flag = 0;
for(int j=2; j<=num/2;j++){
	
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

