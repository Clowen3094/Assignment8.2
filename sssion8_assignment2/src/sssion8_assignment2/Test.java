package sssion8_assignment2;

/* a class that checks whether a given number is a prime
using both the Thread class and Runnable interface*/
public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Prime n= new Prime(5);
     
     
		PrimeThread t= new PrimeThread(7);
		t.start();

	}

}