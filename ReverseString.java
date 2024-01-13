package com.Entities;

public class ReverseString {
	    public static void main(String[] args) {
	        String input1 = "Hello, World!";
	        String input2 = "Java is Program";
	        
	        System.out.println("Original String 1: " + input1);
	        System.out.println("Reversed String 1: " + reverseString(input1));
	        
	        System.out.println("\nOriginal String 2: " + input2);
	        System.out.println("Reversed String 2: " + reverseString(input2));
	    }

	    public static String reverseString(String str) {
	        char[] charArray = str.toCharArray();
	        int start = 0;
	        int end = str.length() - 1;

	        while (start < end) {
	        	
	            char temp = charArray[start];
	            charArray[start] = charArray[end];
	            charArray[end] = temp;

	            start++;
	            end--;
	        }
	        
	        return new String(charArray);
	    }
}

