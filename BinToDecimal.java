import java.util.Scanner;

public class BinToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a binary number: ");
		
		
		while(true) {
			
			Scanner input = new Scanner(System.in);
			int binNum = input.nextInt();
			int decimalNum = 0;
			int power =0;
			
		if(binNum ==0) {
			System.out.print("Please enter a binary number: ");
			continue;
		}
		else {
		while(binNum!=0){
			int tempMod = binNum%10;
			decimalNum = decimalNum + tempMod*(int)(Math.pow(2, power));
			binNum = binNum/10;
			power++;
				
		}System.out.println(decimalNum);
		}
		break;
		}
		      } 
		   		
		     }
		
	
