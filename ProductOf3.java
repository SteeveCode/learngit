// This program was used as a practice question in a tutorial class I anchored. It finds The power to which 3 must be raised to be greater than 100.

public class ProductOf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		int product = 1;

		while (num <= 100 ){
			product = product * 3;
			if(product > 100) {
		    System.out.print("The power to which 3 must be raised to be greater than 100 is: "+num);
		    break;
			}
			num++;
			
		}

	}
}

