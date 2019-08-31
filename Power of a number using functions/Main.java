import java.util.*;
class Main{
   public static int poweroffunc(int a ,int b)
    {
      int k =(int) Math.pow(a,b);
      return k;
    }
  public static void main(String[] args)
  {
   
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    int s = poweroffunc(a,b);
    System.out.println(s);
  }
}