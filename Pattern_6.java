
public class Pattern_6 {

	public static void main(String[] args) {
		System.out.println("5th Pattern");
		int rowSize =10;
		int frontSpaces = rowSize - 1; // note: the number of rows for this pattern must be 1 higher than the number white spaces on row 1
		int midSpaces = 1;
		for(int i = 1; i<=rowSize; i++) {
			for(int j = 1; j<=frontSpaces; j++) {
				System.out.print(" ");
			}
			if(i==1) {
			System.out.print("*");	
			}
			else {
			System.out.print("*");
			for(int k = 1; k<midSpaces; k++) 
				System.out.print("o");
			System.out.print("*");
			}
			midSpaces +=2;
			
			--frontSpaces;
			
			System.out.println();
		}

	}

}
