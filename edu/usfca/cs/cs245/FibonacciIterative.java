package edu.usfca.cs.cs245;

public class FibonacciIterative implements Fibonacci{	
	public int fibonacci(int n){
		int a = 0;
		int b = 1;
		int temp;
		
		for(int i = 1; i < n; i++){
			temp = a + b;
			a = b;
			b = temp;
		}return b;
	}
}