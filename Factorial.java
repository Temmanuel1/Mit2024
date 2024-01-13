package com.Entities;

public class Factorial {

   
    public static long calculateFactorial(int n) {
       
        if (n == 0 || n == 1) {
            return 1;
        }
      
        return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args) {
      
        int num1 = 3;
        int num2 = 5;
        int num3 = 8;

        System.out.println("Factorial of " + num1 + " is: " + calculateFactorial(num1));
        System.out.println("Factorial of " + num2 + " is: " + calculateFactorial(num2));
        System.out.println("Factorial of " + num3 + " is: " + calculateFactorial(num3));
    }
}


