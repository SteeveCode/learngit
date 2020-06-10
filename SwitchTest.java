import java.util.Scanner;
public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter score");
		Scanner input  = new Scanner(System.in);
		int score = input.nextInt();
		switch(score) {
		case 70: System.out.println("You scored A");
		break;
		case 60: System.out.println("You scored B");
		break;
		case 50: System.out.println("You scored C");
		break;
		case 40: System.out.println("You scored D");
		break;
		case 30: System.out.println("You failed the exam");
		break;
		default: System.out.println("You did not take the exam");
		
		}
		
	}

}
