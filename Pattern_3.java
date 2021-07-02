
public class Pattern_3 {

	public static void main(String[] args) {
		System.out.println("2nd Pattern - Solution 2");
		int size =10;
		int round =1;
		for(int i=1; i<=size; i++) {
			if(i == round) {
				for(int j=0;j<size-i; j++) {
					System.out.print('*');
			}
				}++round;
			System.out.println();
			}

	}

}
