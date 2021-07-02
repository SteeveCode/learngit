
public class Pattern_4 {

	public static void main(String[] args) {
		System.out.println("3rd Pattern");
		int size =10;
		for(int i=1; i<=size; i++) {
			for(int j=1; j<size; j++) {
				if(j<i) {
					System.out.print(" ");
			}
				else {
					System.out.print("*");
			}
			}
			System.out.println();
			}

	}

}
