import java.util.Scanner;
class Main
{
  public static int numbersqr(int n)
  {
    int k = n*n;
    return k;
  }
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int p = in.nextInt();
      int s = numbersqr(p);
      System.out.println(s);
	 // Type your code here   
	} 
}