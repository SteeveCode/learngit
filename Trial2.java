// This code is to demonstrate how nested for loop works.

public class Trial2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i =1; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.print("*");
				}
			System.out.print("\n");
			for(int k=1; k<10; k++) {
				System.out.print("o");
				}
			System.out.println();
				}
		// code to test if string are truly immutable
		String tr = "hello";
		System.out.println(tr.replace('h', 'H')); // returns a new string. variable tr remains unmodified.
		System.out.println(tr);
		tr = tr.replace('h', 'H'); // variable tr overridden with new string.
		System.out.println(tr);
		char letterL = Character.toUpperCase(tr.charAt(3));
		
		System.out.println(tr);
		String newtr = tr.replace('l', letterL);
		System.out.println(newtr);
		System.out.println(letterL);

}
}