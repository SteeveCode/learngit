/* Java textbook example - chapter 7
Fig. 7.19: GradeBookTest.java
GradeBookTest creates GradeBook object using a two-dimensional array
of grades, then invokes method processGrades to analyse them.
 */

public class ArrayGradeBook {

	
		// TODO Auto-generated method stub
		private String courseName;// name of course this GradeBook represents
		private int[] grades;// array of student grades
		
		//private int[][] gradesArray=new int[10][3];
		
		// two-argument constructor initialises courseName and grades array
		public ArrayGradeBook(String name, int[] gradesArray) {
			
			courseName = name;// Initialise courseName
			grades = gradesArray;// store grades
		}// end two-argument GradeBook constructor
		
		// method to set the course name
		public void setCourseName( String name)
		{
		 courseName = name; // store the course name
		 }// end method setCourseName
		
		// method to retrieve the course name
		public String getCourseName()
		{
		 return courseName;
		 } // end method getCourseName
		
		// display a welcome message to the GradeBook user
		public void displayMessage()
		{
			// getCourseName gets the name of the course
		System.out.printf("Welcome to the grade book for\n%s!\n\n",getCourseName());
		}	// end method displayMessage
		
		
		// perform various operations on the data
		public void processGrades() {
			
			// output grades array
			outputGrades();
			
			// call method getAverage to calculate the average grade
		System.out.printf( "\nClass average is %.2f\n",getAverage());
		
		// call methods getMinimum and getMaximum
		System.out.printf( "Lowest grade is %d\nHighest grade is %d\n\n",getMinimum(),getMaximum());
		
		// call outputBarChart to print grade distribution chart
			outputBarChart();
			
			System.out.printf("%19s%8s%8s%9s","Test 1","Test 2","Test 3", "Average");
			
			
		
			
		}// end method processGrades
		
		//ALL METHOD DEFINITION
		
		public int getMinimum() {
			int lowGrade = grades[0]; // assume grades[ 0 ] is smallest
			
			// loop through grades array
			for(int grade: grades) {
				
				// if grade lower than lowGrade, assign it to lowGrade
				if(grade<lowGrade)
					lowGrade = grade;// new lowest grade
				}// end for
				return lowGrade; // return lowest grade
			}// end method getMinimum
		
		// find maximum grade
		public int getMaximum() {
			int highGrade = grades[0];// assume grades[ 0 ] is largest
			
			// loop through grades array
			for(int grade: grades) {
				
				// if grade greater than highGrade, assign it to highGrade
				if(grade>highGrade)
					highGrade = grade;// new highest grade
				}// end for
			return highGrade;// return highest grade
		}// end method getMaximum
		
		public double getAverage() {
			int total =0; // Initialise total
			
			// sum grades for one student
			for(int grade: grades)
				total += grade;
			
			// return average of grades
			return (double) total/grades.length;	
			}// end method getAverage
		
		public void outputGrades() {
			
			System.out.println("The grades are: ");
			
			for(int i=0; i<grades.length; i++)
				System.out.printf("Student %4d:%5d\n",i+1,grades[i]);
		}
		
		// output bar chart displaying grade distribution
		public void outputBarChart() {
			
			// stores frequency of grades in each range of 10 grades
			int[] freq = new int[11];
			
			// for each grade, increment the appropriate frequency
			for(int grd:grades)
				++freq[grd/10];
			
			System.out.println("Grade distribution: ");
			
			// for each grade frequency, print bar in chart
			for(int i=0; i<freq.length; i++) {
				
				// output bar label ( "00-09: ", ..., "90-99: ", "100: " )
				if(i==10)
					System.out.printf("%5d:",100);
				else
					System.out.printf("%02d-%02d:", i*10,i*10+9);
			
				// print bar of asterisks
				for(int stars=0; stars<freq[i]; stars++)
					System.out.printf("*");
				
				System.out.println();// start a new line of output
				}// end outer for
			}
			// end method outputBarChart
	
			//populate two-dimensional array

			public void popArray(int[][] a) {
				double avgTotal = 0;
				for(int row =0; row<a.length; row++) {
					System.out.printf("%s%3d ","Student",row+1);
					for(int column =0; column<a[row].length; column++) {
						System.out.printf("%8d", a[row][column]);
						avgTotal +=a[row][column];
						}
					System.out.printf("%9.2f",avgTotal/a[row].length);
					avgTotal=0;
					System.out.println();// start a new line of output
						
							}
			}
	
}// end class GradeBook
