import java.util.Scanner;

public class Ex216 {

public static void main(String args[]){
System.out.print("Enter an integer :");
Scanner input1 = new Scanner(System.in);
int b = input1.nextInt();

System.out.print("Enter another integer :");
Scanner input2 = new Scanner(System.in);
int c = input2.nextInt();

if(b<c) {
System.out.printf("%d is larger", c);


}


if(b>c) {
System.out.printf("%d is larger", b);

}


if(b==c) {
System.out.printf("These numbers are equal");

}
input2.close();
}

}