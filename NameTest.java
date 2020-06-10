import java.util.Scanner;

public class NameTest{
	public static void main(String...args){
	System.out.println("Enter firstname");
	Scanner input = new Scanner(System.in);
	String name = input.next();
	Name obj = new Name();
	obj.setFirstname(name);
	String firstname = obj.getFirstname();
	System.out.printf("Your firstname is %s%n, ",firstname);
	
}



}