import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
   Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = 3 ;
    int k=1;
    for(int i=1;i<=n;i++,k++)
    {
      System.out.print(k);
      if((i%m==0)&&(i!=n))
        System.out.print(",");
    }
  }
}