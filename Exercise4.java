import java.util.Scanner;

public class Exercise4{

public static void main(String[] args){

System.out.println("Enter a number");
Scanner input = new Scanner(System.in);
int num = input.nextInt();
int result = num%2;
if (result!=0){
System.out.println("Number is odd");
input.close();
}
}
}