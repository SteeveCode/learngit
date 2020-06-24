//Program to test for all the prime numbers in a range of numbers using square root of n method. This code has a time 
//complexity of O(n.√n) because the number of iteration is n multiplied square root of n (i.e √n)


import java.util.Scanner;

public class PrimNumRange{

public static void main(String []args){
System.out.println("Enter any number");
Scanner input = new Scanner(System.in);
int numRange = input.nextInt();


for(int i = 1; i<numRange; i++){
	int flag = 0;
	for(int j=2; j<=(int)Math.sqrt(i);j++){
	
		if(i%j==0){
			flag = 1;
			break;		
			}
		}
	if(flag == 1) {
		System.out.println(i + " is not a prime number!");
	}
	else
		System.out.println(i +" is a prime number!");
	}

}
}
