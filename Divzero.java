import java.util.Scanner;

public class Divzero {

public static void main(String...args){

System.out.println("Enter first number");
Scanner input = new Scanner(System.in);
int fnum = input.nextInt();
System.out.println("Enter second number");
int snum = input.nextInt();
int add = fnum + snum;
int sub= fnum - snum;
int mul= fnum * snum;
if(snum==0){
System.out.printf("%d %d %d", add, sub, mul);
//System.out.println("division impossible");
}else {
Double div = ((double)fnum)/snum;
System.out.printf("%d %d %d %f", add,sub,mul,div);
}

}

}