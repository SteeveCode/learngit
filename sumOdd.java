import java.util.*;
public class sumOdd{

    public static void main(String []args){
        int sum = 0;
        for(int i = 1; i<=99; i++){
            if(i%2==0)
                continue;
            sum+=i;
        }
        System.out.printf("The sum of odd numbers between 1 and 99 is %d", sum);
        
    }
}