import java.util.Random;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {3,1,5,3,6,8,9};
		int[] array1 = new int[10];
		int[] array2 = new int[10];
		int[] frequency = {0,0,0,0,0,0,1,2,4,2,1};
		int[] dice = new int[7];
		int[] responses = {2,1,4,2,4,3,3,5,2,2,3,4,3,2,4,1,4,2,3,4};
		int[] frequency2 =new int[6];
		int add=0;
		
		
		System.out.println("//Sum of the first 3 elements of an Array");
		int sum=0;
		for(int i=0; i<array.length-4; i++)
			sum = array[0] + array[1] + array[2];
		System.out.println(sum);
		
		//Print default values of an Array
		System.out.println("//Print the default values of an Array");
		System.out.printf("%5s\t%5s\n","Index","Value");
		for(int j=0;j<array1.length;j++)
			System.out.printf("%5d\t%5d\n",j,array1[j]);
		
		// Increase Array elements by 2
		System.out.println("//Increase the elements of an Array by 2");
		
		System.out.printf("%5s\t%5s\n","Index","Value");
		
		for(int j=0;j<array2.length;j++) {
			array2[j] =j*2+2;
			System.out.printf("%5d\t%5d\n",j,array2[j]);
		}
		//Sum Array elements
		System.out.println("//Sum of all the elements of an Array");
		System.out.print("Sum of Array2: ");
		for(int j=0;j<array2.length;j++) {
				add +=array2[j];
		}
		System.out.print(add);
		
		System.out.println();
		
		//Grade Distribution Bar Chart
		System.out.println("//Print the grade distribution frequency of an Array as bar chart");
		for(int counter=0; counter<frequency.length;counter++) {
			if(counter==10)
				System.out.printf("%5d",100);
			else
				System.out.printf("%02d-%02d:", counter*10,counter*10+9);
			for(int stars=0;stars<frequency[counter];stars++)
				System.out.print("*");
			System.out.println();
			
		}
		System.out.println("//Print the number of occurrence of each side of a six-sided die as the program rolled the die 6,000,000 times.");
		Random randNumber = new Random();
		System.out.printf("%s%10s\n","Face","Frequency");
		for(int i =0; i<6000; i++) {
			++dice[1 + randNumber.nextInt(6)];
		}
		for(int j=1; j<dice.length; j++) 
			System.out.printf("%4s%10s\n",j, dice[j]);
		
		System.out.println();
		
		//Rate on a scale of 1 to 5 the quality of the food in the student cafeteria,
		System.out.println("//Rate on a scale of 1 to 5 the quality of the food");
		System.out.printf("%s%10s\n","Rating","Frequency");
		for(int i=0; i<responses.length; i++)
			++frequency2[responses[i]];
		for(int i=1; i<frequency2.length;i++)
			System.out.printf("%6s%10s\n",i,frequency2[i]);
			
		

}
}
