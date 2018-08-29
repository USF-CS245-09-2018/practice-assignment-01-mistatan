package edu.usfca.cs.cs245;

public class FactorialIterative implements Factorial{
	public int factorial(int n){
		int total = n; 
		int num = n;
		while(num>=1){
			if(num==1){
				break;
			}
			num -= 1;
			total *= num;
		}
		return total;
	}
}