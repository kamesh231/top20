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
	  public static long pow(int x, long n) {
		  long res=1;
		  for (long  i=0;i<n;++i) {
			  res=res*x;
		  }
		  return res;
	  }
	  
	   public static long pow2(int x,long n) {
		  if (n==0)return 1;
		  if (n==1) return x;
		  long tmp= pow2(x,n/2);
		  if (n%2 ==0) {
			  return tmp*tmp;
		  }
		  else 
			  return tmp*tmp*x;
		  
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a= 2147483647;
		//System.out.println(Math.pow(2, 16));
	//	a=a+a-1;
		//System.out.println(a);
     int x = Integer.parseInt(args[0]);
        long n = Long.parseLong(args[1]);
        
        //Method call for power 1
        //System.out.println(pow(x,n));
        //Method Call for Power 2
        System.out.println(pow2 (x,n));
	}

}
