package edu.usfca.cs.cs245;

public class FibonacciRecursive implements Fibonacci{
	public int fibonacci(int n){
		if(n == 1){
			return 1;
		}else if(n == 2){
			return 1;
		}return fibonacci(n-1) + fibonacci(n-2);
	}
}