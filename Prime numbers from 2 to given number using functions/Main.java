import java.util.Scanner;
class Main{
  public static void primenumbers(int n)
  {
    int fact;
    for(int i=1;i<=n;i++)
    {
      fact=0;
      for(int j=1;j<=i;j++)
      {
        if((i%j==0))
          fact++;   
      }
       if(fact==2)
      System.out.println(i);
    }
   
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int num =in.nextInt();
      primenumbers(num);
	}
}