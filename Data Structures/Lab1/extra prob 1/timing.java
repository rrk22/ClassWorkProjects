//       GSN    30 Aug 08; 22 Jan 10
//       Improved by Thomas Finsterbusch

import java.util.Random;
import java.math.BigInteger;
import java.math.*;

final class timing {
 public static int fact(int n) {
  return (n <= 0) ? 1 : n * fact(n-1);
 }

 public static long fact(long n) {
  return (n <= 0) ? 1 : n * fact((long) (n-1));
 }

 public static Integer fact(Integer n) {
  return (n <= 0) ? 1 : n * fact((Integer) (n-1));
 }

 public static float fact(float n) {
  return (n <= 0) ? 1 : n * fact(n-1);
 }

 public static double fact(double n) {
  return (n <= 0) ? 1 : n * fact((double) (n-1));
 }


    // recursive factorial, gets stack overflow beyond 8000
 public static BigInteger factr(BigInteger n) {
  if (n.equals(BigInteger.ZERO))
   return BigInteger.ONE;
  else 
   return n.multiply(fact(n.subtract(BigInteger.ONE)));
 }

    // iterative factorial to avoid stack overflow
 public static BigInteger fact(BigInteger n) {
            BigInteger prod = BigInteger.ONE;
            BigInteger mult = BigInteger.ONE;
            int nn = n.intValue();
            for (int i = 0; i < nn; i++ ) {
                prod = prod.multiply(mult);
                mult = mult.add(BigInteger.ONE); }
            return prod;
 }

 public static int daffy(int n) {
  if (n < 2)
   return n;
  else
   return daffy(n-2) + daffy(n-1);
 }

 public static int donald(int n) { 
  return donaldb(0, 1, n);
 }

 public static int donaldb(int lo, int hi, int steps) {
  if (steps == 0)
   return lo;
  else 
   return donaldb(hi, lo+hi, steps-1);
 }
 
 public static int[] randomarr (int n) {
  int[] arr = new int[n];
  int val;
  Random ran = new Random();
  for (int i = 0; i < n; i++) {
   val = ran.nextInt() % n;
   if (val < 0)
    val += n;
   arr[i] = val;
  
  }
  return arr;
 }

 public static void printarr(int[] a) {
  for (int i = 0; i < a.length; i++)
   System.out.print(" " + a[i]);
  System.out.println();
 }

 public static void printIarr(Integer[] a) {
  for (int i = 0; i < a.length; i++)
   System.out.print(" " + a[i]);
  System.out.println();
 }

 public static int mickey(int[] a) {
  int min = a[0];
  for (int i = 0; i < a.length; i++)
   if (a[i] < min)
    min = a[i];
  return min;
 }

 public static int mickeyi(int[] a, int lo) {
  int min = a[lo];
  int mini = lo;
  for (int i = lo; i < a.length; i++)
   if (a[i] < min) { 
    min = a[i];
    mini = i;
   }
  return mini;
 }

 public static void minnie(int[] a) {
  int mini;
  int val;
  for (int i = 0; i < a.length; i++) {
   mini = mickeyi(a, i);
   val = a[mini];
   a[mini] = a[i];
   a[i] = val;
  }
 }

 public static void goofy(int[] a) {
  for (int i = 1; i < a.length; i++) {
   int hole;
   int item = a[i];
   for (hole = i; hole > 0 && item < a[hole - 1]; hole--)
    a[hole] = a[hole-1];
   a[hole] = item;
  }
 }

 public static int elmer(int[] a, int left, int right, int pivot) {
  int tmp;
  int pivotValue = a[pivot];
  a[pivot] = a[right];
  int storeindex = left;
  for (int i = left; i < right; i++) {
   if(a[i] <= pivotValue) {
    tmp = a[storeindex];      // swap
    a[storeindex++] = a[i];
    a[i] = tmp;
   }
  }
  a[right] = a[storeindex];
  a[storeindex] = pivotValue;
  return storeindex;
 }

 public static void pluto(int[] a) {
  plutob(a, 0, a.length - 1);
 }

 public static void plutob(int[] a, int left, int right) {
  if (right > left) {
   int pivot = (left + right) / 2;
   int mid = elmer(a, left, right, pivot);
   plutob(a, left, mid-1);
   plutob(a, mid+1, right);
  }
 }

 public static int gyrob(int [] arr, int low, int high, int goal) {
  if (high < low)
   return -1;       // goal not found
  else { 
   int root = (low + high) / 2;
   if (goal == arr[root])
    return root;     // found
   else if (goal < arr[root])
    return gyrob(arr, low, root-1, goal);
   else 
    return gyrob(arr, root+1, high, goal); 
  }
 } 

        public static int gyro (int [] arr) {
                return gyrob(arr, 0, arr.length, arr.length / 2); }
 
    public static void main(String args[])
   {
      // your code here
    	
	  //max int factorial
		  int counter = 1;
		  int int_num = 1;
		  
		  BigInteger b = new BigInteger(""+int_num);
		  
		  while (factr(b).equals(new BigInteger("" + fact(int_num))))
		  {
		    counter++;
		    int_num = counter;
		    b = new BigInteger("" + int_num);
		    
		    System.out.println(fact(int_num) + " " + factr(b));
		  }
		  
		  System.out.println("Max Int Factorial: " + --counter);
	  //
	  
	  System.out.println();
	  
	  //max Integer factorial
		  counter = 1;
		  Integer Integer_num = new Integer(1);
		  
		  b = new BigInteger(""+Integer_num);
		  
		  while (factr(b).equals(new BigInteger("" + fact(Integer_num))))
		  {
		    counter++;
		    Integer_num = new Integer(counter);
		    b = new BigInteger("" + Integer_num);
		    
		    System.out.println(fact(Integer_num) + " " + factr(b));
		  }
		  
		  System.out.println("Max Integer Factorial: " + --counter);
	  //
	  
	  System.out.println();
	  
	   
      //max long factorial
	 	  counter = 1;
		  long long_num = 1;
		
		  b = new BigInteger(""+long_num);
		
		  while (factr(b).equals(new BigInteger("" + fact(long_num))))
		  {
			  counter++;
			  long_num = counter;
			  b = new BigInteger("" + long_num);
			
			  System.out.println(fact(long_num) + " " + factr(b));
		  }
		
		  System.out.println("Max Long Factorial: " + --counter);
	  //
		  
	  System.out.println();
	  
	  //max float factorial
	  
		  float float_num = 1;
		  BigInteger big_Integer = new BigInteger("" + (int)float_num);
		  
		  while (factr(big_Integer).equals(new BigInteger("" + (int)fact(float_num))))
		  {
			  float_num++;
			  big_Integer = new BigInteger("" + (int)float_num);
			  
			  System.out.println(fact(float_num) + " " + factr(big_Integer));
		  }
			  
		  	  System.out.println("Max Float Factorial: " + --float_num);
	  //
	  	  
	  System.out.println();
	  
	  // max double factorial
		  double double_num = 1;
		  big_Integer = new BigInteger("" + (int)double_num);
		  
		  while (factr(big_Integer).equals(new BigInteger("" + (int)fact(double_num))))
		  {
			  double_num++;
			  big_Integer = new BigInteger("" + (int)double_num);
			  
			  System.out.println(fact(double_num) + " " + factr(big_Integer));
		  }
			  
		  	  System.out.println("Max Double Factorial: " + --double_num);
	  //
	  
	  
	  System.out.println();
	  
	  
	  counter = 1;
	  boolean keepgoing = true;
	  while (keepgoing)
	  {
	  	counter++;
	  	BigInteger big1 = factr(new BigInteger("" + counter));
	  	BigInteger big2 = factr(new BigInteger("" + (counter+1)));
	  	
	  	BigDecimal dec1 = new BigDecimal(big1);
	  	BigDecimal dec2 = new BigDecimal(Float.MAX_VALUE);
	  	BigDecimal dec3 = new BigDecimal(big2);
	  //	System.out.println(dec1 + " " +dec3);
	  	
	  	
	  	BigDecimal min1 = dec1.min(dec2);
	  	BigDecimal min2 = dec2.min(dec3);
	  	
	  	if (min1.equals(dec1) && min2.equals(dec2))
	  	{
	  		keepgoing = false;
	  	}
	  }
	  
	  System.out.println(counter);
   }
}
