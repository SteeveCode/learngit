
import java.util.Scanner;
public class PrivacyDecrypt {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int firstDigit;
		int secondDigit;
		int thirdDigit;
		int fourthDigit;
		int originalNumber;
		int encryptedNumber;
		int decimal;
		
		
		boolean flag = true;
		outer:
		while(flag) {
			System.out.println("Enter encrypted four digit number");
			encryptedNumber = input.nextInt();
			
			if(encryptedNumber >= 1000 && encryptedNumber <=10000) {
				firstDigit = encryptedNumber/1000;
				int firstModulus =  encryptedNumber%1000;
				
				secondDigit =  firstModulus/100;
				int secondModulus =  (firstModulus%100);
				
				thirdDigit = secondModulus/10;
				int thirdModulus = secondModulus%10;
				
				fourthDigit = thirdModulus/1;
				
				System.out.println("Individual digits: ");
				System.out.println( firstDigit +" "+" " + secondDigit+" " +" " + thirdDigit+ " " + " "+fourthDigit);
				
				// 1st
				if(firstDigit == 8 || firstDigit == 9) {
					decimal = 0;
				firstDigit = ((firstDigit + decimal) - 7) * 10;
				}
				else if(firstDigit >= 0 || firstDigit < 8) {
					decimal = 10;
					firstDigit = ((firstDigit + decimal) - 7)  * 10;
				}
				
				//2nd 
				if(secondDigit == 8 || secondDigit == 9) {
					decimal = 0;
					secondDigit = ((secondDigit + decimal) - 7) * 1;
				}
				else if(secondDigit >= 0 || secondDigit < 8) {
					decimal = 10;
					secondDigit = ((secondDigit + decimal) - 7) * 1;
				}
				
				
				//3rd
				if(thirdDigit == 8 || thirdDigit == 9) {
					decimal = 0;
					thirdDigit = ((thirdDigit + decimal) - 7) * 1000;
				}
				else if(thirdDigit >= 0 || thirdDigit < 8) {
					decimal = 10;
					thirdDigit = ((thirdDigit + decimal) - 7) * 1000;
				}
				
				
				//4th
				if(fourthDigit==0) {
					if(fourthDigit == 8 || fourthDigit == 9) {
						decimal = 0;
						fourthDigit = ((fourthDigit + decimal) - 7) * 100;
					}
					else if(fourthDigit >= 0 || fourthDigit < 8) {
						decimal = 10;
						fourthDigit = ((fourthDigit + decimal) - 7) * 100;
					}
					
					//originalNumber = fourthDigit + firstDigit + secondDigit + thirdDigit ;
					System.out.println(fourthDigit + "" + firstDigit + "" +secondDigit + "" + thirdDigit);
				}
				else {
					
					if(fourthDigit == 8 || fourthDigit == 9) {
						decimal = 0;
						fourthDigit = ((fourthDigit + decimal) - 7) * 100;
					}
					else if(fourthDigit >= 0 || fourthDigit < 8) {
						decimal = 10;
						fourthDigit = ((fourthDigit + decimal) - 7) * 100;
					}	
					
					originalNumber = firstDigit + secondDigit + thirdDigit + fourthDigit;
				}
				
				
				
				
				//System.out.println(originalNumber);
				
				flag = false;
			}
			else
				continue outer;
			
			
		}

	}

}
