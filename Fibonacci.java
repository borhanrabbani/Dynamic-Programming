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

	public static void main(String[] args) {

		Fibonacci fibo = new Fibonacci();
		System.out.println(fibo.fib_memo(10));
	}

}
