import java.util.Scanner;

public class Pattern_1 {

	public static void main(String[] args) {
		System.out.println("1st Pattern");
		//Scanner input = new Scanner(System.in);
		for(int i=1; i<=10; i++) {
			for(int j=0; j<i; j++) {
			System.out.print('*');
			}
			System.out.println();
			}
	}

}
