import java.util.Scanner;

public class Grade{
public static void main(String []args){
System.out.println("Enter student grade");
Scanner input = new Scanner(System.in);
int grade = input.nextInt();
if(grade >= 70)
	System.out.println("You scored an A");
else
	if(grade >= 60)
		System.out.println("You scored a B");
	else
		if(grade >= 50)
			System.out.println("You scored a C");
		else
			if(grade >= 40)
				System.out.println("You scored a D");
			else
				System.out.println("You failed this course!");
			

	input.close();

}

}