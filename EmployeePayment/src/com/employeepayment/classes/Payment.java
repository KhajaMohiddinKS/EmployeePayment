package com.employeepayment.classes;

public class Payment {
	
	public static void main(String args[]) {
		
		Person obj=new Person();//Concrete Method
		obj.setFirstName("Khaja Shah");
		obj.setLastName("Mohiddin");
		obj.setHourlyRent(11);
		
		//Print the state of the person object
		System.out.println(obj.toString());
		
		//get and print the weekly payment
		System.out.println(obj.getPayment(55));
		
		System.out.println("Running");
		
	}

}
