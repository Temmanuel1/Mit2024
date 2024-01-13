package com.Entities;

public class FibonacciSequence {

    public static void main(String[] args) {
        int numberOfTerms = 10; 
        generateAndPrintFibonacciSequence(numberOfTerms);
    }

    public static void generateAndPrintFibonacciSequence(int numberOfTerms) {
        int firstTerm = 0, secondTerm = 1;

        System.out.println("Fibonacci Sequence up to " + numberOfTerms + " terms:");

        for (int i = 0; i < numberOfTerms; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
