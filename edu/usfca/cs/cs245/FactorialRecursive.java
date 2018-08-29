package edu.usfca.cs.cs245;

public class FactorialRecursive implements Factorial{
	public int factorial (int n){
		if(n==1){
			return n;
		}return n * factorial(n-1);
	}
}