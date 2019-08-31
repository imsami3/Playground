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
		int max_so_far = a[0], runningsum = a[0]; 

		for (int i = 1; i < size; i++) 
		{ 
          if(a[i]>a[i-1])
          {
            runningsum = runningsum+a[i];
          }
          else
            runningsum = a[i];
          if(runningsum>max_so_far)
            max_so_far = runningsum;
		} 
		return max_so_far; 
	} 
} 
