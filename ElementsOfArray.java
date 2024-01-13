package com.Entities;

public class ElementsOfArray {
	    public static void main(String[] args) {
	        // Initialize an array
	        int[] originalArray = {1, 2, 3, 4, 5};

	        // Double each element in the array
	        doubleArrayElements(originalArray);

	        // Print the modified array
	        printArray(originalArray);
	    }

	    // Method to double each element in the array
	    private static void doubleArrayElements(int[] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] *= 2;
	        }
	    }

	    // Method to print the elements of the array
	    private static void printArray(int[] arr) {
	        System.out.print("Elements of Array Include: ");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	}
