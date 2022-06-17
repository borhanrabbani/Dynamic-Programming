package com.dp;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
	
	public int fib(int n) {
		if(n<=2) {
			return 1;
		}
		return fib(n-1) + fib(n-2);
	}
	
	// Fibonacci memoization solution
	
	Map<Integer, Integer> memo = new HashMap<>();
	
	public int fib_memo(int n) {
		if(n<=2) {
			return n;
		}
		
		if(memo.containsKey(n)) {
			int temp = memo.get(n);
			return temp;
		}
		
		int result = fib_memo(n-1) + fib_memo(n-2);
		memo.put(n, result);
		return result;
	}
	
	// Fibonacci optimized solution Time: O(n), Space: O(1)
	
	public int fib_optimized(int n) {
		if(n<=1) {
			return n;
		}
		
		int a=0, b=1;
		
		for(int i=2; i<=n; i++) {
			int sum = a+b;
			a=b;
			b=sum;
		}
		
		return b;
	}

	public static void main(String[] args) {

		Fibonacci fibo = new Fibonacci();
		System.out.println(fibo.fib_memo(10));
		System.out.println(fibo.fib_optimized(67));
	}

}
