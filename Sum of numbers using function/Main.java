import java.util.Scanner;
class Main
{
  public static int numbersqr(int a)
  {
    int k = ((a+1)*(a))/2;
    return k;
  }
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int a = in.nextInt();
     
      int s = numbersqr(a);
      System.out.println(s);
	 // Type your code here   
	} 
}