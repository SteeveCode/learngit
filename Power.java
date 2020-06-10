//Program to calculate "raised to power of".

import java.util.Scanner;

public class Power{

public static void main(String []args){

Scanner input = new Scanner(System.in);
System.out.println("Enter base of number");
int base = input.nextInt();
System.out.println("Enter power of number");
int exp = input.nextInt();
int result =1;
//int answer;
for(int i=1; i<=exp;i++)
	result = result * base;

System.out.println(base+" raised to power "+exp+" is: "+result);
}

}