import java.util.Scanner;

public class Pattern_7 {

	public static void main(String[] args) {
		// Solution 1 to numeric pattern 7 problem 
					System.out.print("Enter a number: ");
					Scanner input = new Scanner(System.in);
						
					 int num = input.nextInt();
					 int total = 0;
					 int reverse = 0;
					 int rem = 0;
					 int ntotal = 0;
					 for(int i=1; i<=num; i++){
						total = total * 10 + i;
						ntotal = total;
						System.out.printf("%d\t",total);
						while(ntotal != 0) {
							reverse = reverse *10 + ntotal%10;
							ntotal = ntotal/10;
						}System.out.printf("%d",reverse);
						reverse = 0;
						System.out.println();
					 }
						System.out.println();
						System.out.println();// line break

	}

}
