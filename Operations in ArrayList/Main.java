import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      ArrayList<String> al = new ArrayList<String>();
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int p =1; 
      while(p!=0)
      {
      System.out.println("Choose any one:");
      System.out.println("1.Insert");
      System.out.println("2.delete");
      System.out.println("3.Display");
      System.out.println("4.Exit");
      int n = Integer.parseInt(br.readLine());
      
     
      switch(n)
      {
        case 1:
          String str = br.readLine();
          String[] str1 = str.split(",");
          for(int i=0; i<str1.length; i++)
          {
            al.add(str1[i]);
          }
          break;
        case 2:
          System.out.print("Enter the index value to be deleted:");
          int del = Integer.parseInt(br.readLine());
          System.out.println(del);
          al.remove(del);
          break;
        case 3:
          System.out.println(al);
          break;
        case 4:
          p=0;
          break;
      }
    }
    }
}