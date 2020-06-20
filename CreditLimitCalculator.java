import java.util.Scanner;

public class CreditLimitCalculator{

    /* public static void main(String []args){
         int accountNumber;
         int beginningBalance = 0;
         int creditLimit = 10000;
         int itemCharge;
         int totalChargesThisMonth = 0;
         int newBalance;
        System.out.println("Enter account number");
        Scanner input = new Scanner(System.in);
        accountNumber = input.nextInt();
        System.out.println("Enter item charge or -1 to quit");
         itemCharge = input.nextInt();
         while(itemCharge != -1){
             totalChargesThisMonth = totalChargesThisMonth + itemCharge;
             System.out.println("Enter item charge again or -1 to quit");
             itemCharge = input.nextInt();
             
         }
         newBalance = beginningBalance + totalChargesThisMonth - creditLimit;
         System.out.println("New balance on account number " + accountNumber+ " is = "+ newBalance);
         if(newBalance > 1){
             System.out.println("Credit limit exceeded !");
         }
        else {
            System.out.println("Credit limit not exceeded !");
        }
         
        
     }*/
	

	     public static void main(String []args){
	         int sum = 0;
	         int a;
	         int count =0;
	         double mean;
	         Scanner input = new Scanner(System.in);
	         for(int i=1; i<=1; i++){
	        	 System.out.println("Enter a number");
	             for(int j=1; j<=5; j++){
	            	 
	                 a = input.nextInt();
	                // System.out.println(" "+a);
	                 sum = sum + a;
	                 count++;
	                 System.out.println("Enter a number again");
	             }
	            
	         }
	         mean = (double)sum/count;
             System.out.println(mean);
	     }
	     
}
	     
	
