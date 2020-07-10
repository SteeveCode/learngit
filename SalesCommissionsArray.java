import java.util.Scanner;
public class SalesCommissionsArray {

	public static void main(String[] args) {
		int wkpay = 200;
		double rate = 0.09;
		int wkGrSale ;
		int wkGrPay;
		int [] arrayGrPay = new int[5];
		int [] tempArrayGrPay = new int[5];
		int [] frequency = new int[7];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter week gross sales");
		
		for(int i=0; i<tempArrayGrPay.length; i++) {
			wkGrSale = input.nextInt();
			wkGrPay = (int) (wkpay + (wkGrSale * rate));
			arrayGrPay[i] = wkGrPay;
			tempArrayGrPay[i] = wkGrPay/100;
			System.out.println("Enter week gross sales again");
		}
		for(int i=0; i<tempArrayGrPay.length; i++)
		System.out.println(tempArrayGrPay[i]);
		
		for(int j=0; j<tempArrayGrPay.length; j++){
			++frequency[tempArrayGrPay[j]];
			
		}
		System.out.println("BREAK");
		for(int k=0; k<frequency.length; k++)
			System.out.println(frequency[k]);
	}

}
