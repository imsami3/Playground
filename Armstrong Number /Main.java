import java.util.*;
class Main{
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int original = n;
      int lastdig,num,sum=0,k=0;
      num =n;
      for(;num!=0;num=num/10, k++);
      while(n!=0)
      {
        lastdig = n%10;
        sum = sum+ (int)Math.pow(lastdig,k);
        n = n/10;
       
      }
      if(sum==original)
      System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
      
	}
}