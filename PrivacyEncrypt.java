import java.util.Scanner;

public class PrivacyEncrypt {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		int firstDigit;
		int secondDigit;
		int thirdDigit;
		int fourthDigit;
		int originalNumber;
		String encryptedNumber;
		
		boolean flag = true;
		outer:
		while(flag) {
		System.out.println("Enter a four digit number");
		
		originalNumber = input.nextInt();
		if(originalNumber >= 1000 && originalNumber <=10000) {
			
			
			// separate integer to individual digits
			firstDigit = originalNumber/1000;
			int firstModulus =  originalNumber%1000;
			
			secondDigit =  firstModulus/100;
			int secondModulus =  (firstModulus%100);
			
			thirdDigit = secondModulus/10;
			int thirdModulus = secondModulus%10;
			
			fourthDigit = thirdModulus/1;
			System.out.println("Individual digits: ");
			System.out.println( firstDigit +" "+" " + secondDigit+" " +" " + thirdDigit+ " " + " "+fourthDigit);
			
			
			// perform operations on individual digits
			firstDigit = ((firstDigit + 7)%10); //* 10;
			
			secondDigit = ((secondDigit + 7)%10); //* 1;
			
			thirdDigit = ((thirdDigit + 7)%10); //* 1000;
			
			fourthDigit = ((fourthDigit + 7)%10); //* 100;
			
			encryptedNumber = thirdDigit + "" + fourthDigit + "" + firstDigit +""+ secondDigit; 
			
			System.out.println("Integer after addition & modulus operation");
			System.out.println(firstDigit +""+"" + secondDigit+"" +"" + thirdDigit+ "" + ""+fourthDigit);
			
			// swap individual digits
			System.out.println("Integer after swap operation");
			System.out.println(encryptedNumber);
			
			
			flag = false;
		}
		else
			continue outer;
		}
		
		

	}

}
