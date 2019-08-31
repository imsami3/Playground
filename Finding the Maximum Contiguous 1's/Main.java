import java.io.*; 
// Java program to print largest contiguous array sum 
import java.util.*; 

class Main
{ 
	public static void main (String[] args) 
	{ 
		Scanner in =new Scanner(System.in);
      int n = in.nextInt();
      int a[] = new int[n];
        for(int i=0;i<n;i++)
          a[i]=in.nextInt();
		System.out.println(maxSubArraySum(a)); 
	} 

	public static int maxSubArraySum(int a[]) 
	{ 
		int size = a.length; 
		int max_so_far = Integer.MIN_VALUE, runningsum = 0; 

		for (int i = 0; i < size-1; i++) 
		{ 
          if(a[i]==1 && a[i+1]==1)
          {
            runningsum = runningsum+1;
          }
          else
            runningsum = 0;
          if(runningsum>max_so_far)
            max_so_far = runningsum;
		} 
		return max_so_far+1; 
	} 
} 
