import java.util.*;
class Main{
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int original = n;
      int lastdig,sum=0,factorial=1;
      while(n!=0)
      {
        factorial =1;
        lastdig = n%10;
        for(int i=1;i<=lastdig;i++)
          factorial = factorial*i;
        sum = sum + factorial;
        n = n/10;
      }
      if(sum==original)
      System.out.println("Yes");
      else
        System.out.println("No");
      
	}
}