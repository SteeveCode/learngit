import java.util.Scanner;
public class JavaEx417 
{
public static void main( String[] args )
{
int trips = 0;
int md;
int gu;
double mpg;
int tmd = 0;
int tgu = 0;
double tmpg;

System.out.println("Enter miles driven : ");
Scanner input = new Scanner(System.in);
md = input.nextInt();

while(md != 0){
	System.out.println("Enter gallon used: ");
	gu = input.nextInt();
	mpg = (double)md/gu;
	tmd += md;
	tgu += gu;
	trips++;
	System.out.println("The average miles per gallon used for trip "+trips+" is "+mpg);
	System.out.println();
	System.out.println("Enter next miles driven : ");
	md = input.nextInt();
	
}
	tmpg = (double)tmd/tgu;
	System.out.println("The total number of trips is "+trips);
	System.out.println();
	System.out.println("The combined miles per gallon used for all trip is "+tmpg);
	
	input.close();
}
	
	
}


