package org.algorthimica.classroom.recursion;

public class NthFibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n = Integer.parseInt(args[0]);
    System.out.println(fib2(n));
	}
	public static int fib2(int n) {
		int[] mem = new int[n+1];
		
		return fibonacci(n, mem);
	}
	public static int fibonacci(int n,int[] mem) {
		
		
		if (n<=2) return 1;
		if(mem[n]!=0) return mem[n];
		int prev1 = fibonacci(n-1,mem);
		int prev2= fibonacci(n-2,mem);
		return mem[n]=prev1+prev2;
	}

}
