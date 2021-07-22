// program to compute the factorial of a number using recursive and iterative methods respectively.

package com.learnprogramming.recursion;

public class Recursion {

    public static void main(String[] args) {
        System.out.println(recursiveFactorial(4));
        System.out.println(iterativeFactorial(4));
    }

    public static int recursiveFactorial(int num){
        // recursion breaking condition or base case necessary to end recursion
        if(num == 0){
            return 1;
        }
        return num * recursiveFactorial(num - 1);
    }

    public static int iterativeFactorial(int num){
        if(num == 0){
            return 1;
        }
        int factorial = 1;
        for(int i = 1; i <= num; i++){
            factorial = factorial * i;
        }
        return factorial;
    }
}
