// This code  is to display a series of a + 2^0*b, a + 2^0*b + 2^1*b, a + 2^0*b +2^1*b + 2^2*b + 2^3*b....2^n
public class Series {

    public static void main(String []args){
        int a = 5; // first term of series
        int b = 3; // constant
        int n = 10; // number of terms
        int s = a; // nth term of series
        
        for(int p=0; p<n; p++){
            s = s + (int)Math.pow(2,p)*b;
            System.out.print(s);
            System.out.print(" ");
            
            
            
        }
     }
}


