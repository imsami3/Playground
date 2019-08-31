import java.util.Scanner;
import java.util.*;
import java.io.*;
interface Nomination
{
   void notificationBySms();
   void notificationByEmail();
   void notificationByCourier();
  
}

 class Details implements Nomination
{
  public Details(String name, int num)
  {
    System.out.print(name);
    switch(num){
    case 1:
    notificationBySms();
    break;
    case 2:
    notificationByEmail();
    break;
    case 3:
    notificationByCourier();
    break;
    }
    }
        public void notificationBySms()
    {
        System.out.print("-Notification by SMS");
    }
    public void notificationByEmail()
    {
        System.out.print("-Notification by Mail");
    }
    public void notificationByCourier()
    {
        System.out.print("-Notification by Courier");
    }

  
}
public class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      String bank = in.nextLine();
      int n = in.nextInt();
      Details d = new Details(bank, n);
    }
}