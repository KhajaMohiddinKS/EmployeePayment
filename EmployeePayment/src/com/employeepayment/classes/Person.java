package com.employeepayment.classes;

public class Person {

	String firstName, lastName;
	double hourlyRent;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getHourlyRent() {
		return hourlyRent;
	}

	public void setHourlyRent(double hourlyRent) {
		this.hourlyRent = hourlyRent;
	}

	public Person() {//Default Constructor
		super();
		this.firstName = "khaja";
		this.lastName = "Mohiddin";
		this.hourlyRent = 9.9;

	}

	Person(String firstName, String lastName, double hourlyRent) {// Parameterized Constructor 

		this.firstName = firstName;
		this.lastName = lastName;
		this.hourlyRent = hourlyRent;

	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", hourlyRent=" + hourlyRent + "]";
	}
	
	public double getPayment(int hour) {
		
		return this.hourlyRent*hour;
	}

}
