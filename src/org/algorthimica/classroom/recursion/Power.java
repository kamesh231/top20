package org.algorthimica.classroom.recursion;

public class Power {
/*Results in overflow for large numbers in this method
 * Corner case - 2^64
 * Solution --> Use our own custom data type
 * 
 * 
 * 
 * 
 */
	  public static long pow(int x, int n) {
		  long res=1;
		  for (int i=0;i<n;++i) {
			  res=res*x;
		  }
		  return res;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        System.out.println(pow (x,n));
	}

}
