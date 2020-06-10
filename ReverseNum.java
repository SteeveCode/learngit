import java.util.Scanner;

public class ReverseNum{
public static void main(String []args){
System.out.println("Enter any 3 digit number and above");
Scanner input = new Scanner(System.in);
int num = input.nextInt();
int temp = num;

while(temp!=0){
	System.out.print(temp%10);
	temp = temp/10;
}
}
}