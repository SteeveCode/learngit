// My solution to numeric pattern from Slidenerd(Program 63)
//Note: sysout + control space bar is the shortcut for System.out.println()

import java.util.Scanner;
public class pattern63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			System.out.println();
// Solution from Slidenerd to the same numeric pattern problem above
			for(int i =1; i<=num; i++) {
				for(int j=1; j<=i;j++) {
					System.out.print(j);
					}
				System.out.print("\t");
				for(int l=i; l>=1; l--) {
					System.out.print(l);
				}
				System.out.println();
			}
	}
	

}
