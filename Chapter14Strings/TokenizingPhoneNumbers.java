/**
 Exercise 14.8 (Tokenizing Telephone Numbers) Write an application that inputs a telephone number as a
string in the form (555) 555-5555. The application should use String method split to extract the
area code as a token, the first three digits of the phone number as a token and the last four digits of
the phone number as a token. The seven digits of the phone number should be concatenated into
one string. Both the area code and the phone number should be printed. Remember that you’ll have
to change delimiter characters during the tokenization process.
 */

package Chapter14Strings;

import java.util.Arrays;
import java.util.Scanner;

public class TokenizingPhoneNumbers {

	public static void main(String[] args) {
		System.out.println("Enter phone number");
		Scanner input = new Scanner(System.in);
		String phoneNumber = input.nextLine();
		String[] split1 = phoneNumber.split("\\(");
		String[] split2 = split1[1].split("\\)");
		String[] split3 = split2[1].split(" ");
		String[] split4 = split3[1].split("-");
		
		System.out.println(Arrays.toString(split4));

		String areaCode = split2[0];
		String first3Digits = split4[0];
		String last4Digits = split4[1];
		String sevenDigits = first3Digits.concat(last4Digits);
		String combinedNumber = areaCode + sevenDigits;
		System.out.println("Area code: "+areaCode);
		System.out.println("Phone number: "+sevenDigits);
		System.out.println("Area code + Phone number: "+combinedNumber);

	}

}
