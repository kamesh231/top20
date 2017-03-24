package org.algorthmica.classroom.backtracking;
//Usse recursion to generate all posiblities and remove the incorrect combinations
import java.util.Arrays;

public class nqueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=Integer.parseInt(args[0]);
     nqueens1(n);
	}

	 // n being the n X n matrix
	 public static void nqueens1(int n) {
		 //Heap memory to find out previous data details
		 int[] out = new int[n];
		 auxqueens1(0,n,out);
	 }
	 //Reursion
 	 public static void auxqueens1(int d,int n,int[] out) {
		 if (d==n) {
             if (isValid(out))
             {
            	 System.out.println(Arrays.toString(out));
             }
			 return;

		 }
		 for (int c=0;c<n;++c) {  
		out[d]=c;
		auxqueens1(d+1,n,out);
		 }
	 }
	
	 //Column verification and diagonal attack for each pair of queens
	 //i and j store the rows
	 public static boolean isValid(int[] out) {
		 //To check diagonal is row gap == column gap between both nodes
		 
		 //Check for duplicates to check linear fashion
		 for (int i=0;i<out.length;++i) {
			 for (int j=i+1;j<out.length;j++) {
				 //Check for linear fashion and second part for diagonal
				 if (out[i]==out[j] || Math.abs(i-j) == Math.abs(out[i]-out[j]))
					 return false;
				 
				 
			 }
		 }
		 return true;
		 
	 }
	 
	 public static void nqueens2(int n) {
		 //Heap memory to find out previous data details
		 int[] out = new int[n];
		 auxqueens2(0,n,out);
	 }
	 public static boolean isPositionValid(int cq,int cc,int[] out) {
		 //current queen - cq
		 //current queen position - cc
		for (int q=0;q<cq;q++) {
			if (cc==out[q]||Math.abs(q-cc)==Math.abs(out[q]-out[cc])) {
				return false;
			}
		}
		 return true; 
	 }
	 //Approach to skip the linear and diagonal fashions better than auxqueens1
	 public static void auxqueens2(int d,int n,int[] out) {
		 if (d==n) {
             if (isValid(out))
             {
            	 System.out.println(Arrays.toString(out));
             }
			 return;

		 }
		 for (int c=0;c<n;++c) { 
			 //d - current queen
			 if(isPositionValid(d,c,out)) {
				 out[d]=c;
					auxqueens2(d+1,n,out);
			 }
		
		 }
	 }

}
