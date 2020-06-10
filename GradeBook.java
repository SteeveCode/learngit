 // Fig. 4.9: GradeBook.java
 // GradeBook class that solves the class-average problem using
 // sentinel-controlled repetition.
 import java.util.Scanner; // program uses class Scanner

 public class GradeBook
 {
 private String courseName; // name of course this GradeBook represents

 // constructor initializes courseName
 public GradeBook( String name )
 {
 courseName = name; // initializes courseName
 } // end constructor

 // method to set the course name
 public void setCourseName( String name )
 {
 courseName = name; // store the course name
 } // end method setCourseName

 // method to retrieve the course name
 public String getCourseName()
 {
 return courseName;
 } // end method getCourseName

 // display a welcome message to the GradeBook user
 public void displayMessage()
 {
 // getCourseName gets the name of the course
 System.out.printf( "Welcome to the grade book for\n%s!\n\n",
 getCourseName() );
 } // end method displayMessage

 // determine the average of an arbitrary number of grades
 public void determineClassAverage()
 {
 // create Scanner to obtain input from command window
 Scanner input = new Scanner( System.in );

 int total; // sum of grades
 int gradeCounter; // number of grades entered
 int grade; // grade value
 double average; // number with decimal point for average

 // initialization phase
 total = 0; // initialize total
 gradeCounter = 0; // initialize loop counter

 // processing phase
 // prompt for input and read grade from user
 System.out.print( "Enter grade or -1 to quit: " );
 grade = input.nextInt();

 // loop until sentinel value read from user
 while ( grade != -1 )
 {
 total = total + grade; // add grade to total
 gradeCounter = gradeCounter + 1; // increment counter

 // prompt for input and read next grade from user
 System.out.print( "Enter grade or -1 to quit: " );
 grade = input.nextInt();
 } // end while

 // termination phase
 // if user entered at least one grade...
 if( gradeCounter != 0)
 {
 // calculate average of all grades entered
 average = (double) total / gradeCounter;

 // display total and average (with two digits of precision)
 System.out.printf( "\nTotal of the %d grades entered is %d\n",
 gradeCounter, total );
 System.out.printf( "Class average is %.2f\n", average );
 } // end if
 else // no grades were entered, so output appropriate message
 System.out.println( "No grades were entered" );
 } // end method determineClassAverage
 } // end class GradeBook