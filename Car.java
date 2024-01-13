package com.Entities;

public class Car {
	    String make;
	    String model;
	    int year;

	    public Car(String make, String model, int year) {
	        this.make = make;
	        this.model = model;
	        this.year = year;
	    }
	    public void printDetails() {
	        System.out.println("Car Details:");
	        System.out.println("Make: " + make);
	        System.out.println("Model: " + model);
	        System.out.println("Year: " + year);
	    }
	    public static void main(String[] args) {
	        Car myCar1 = new Car("Toyota", "Camry", 2022);
	        System.out.println("Details of the first car:");
	        myCar1.printDetails();
	        Car myCar2 = new Car("Honda", "Accord", 2023);
	        System.out.println("\nDetails of the second car:");
	        myCar2.printDetails();
	    }
	}


