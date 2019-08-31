import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       // type your code here
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Enter the number of values to be inserted in map:");
      int n = Integer.parseInt(br.readLine());
      System.out.println(n);
      TreeMap<String,String> mp = new TreeMap<String,String>();
      for(int i=0;i<n;i++)
      {
        String key = br.readLine();
        String value = br.readLine();
        mp.put(key, value);
      }
      System.out.println(mp);
      System.out.print("Enter the index to be removed:");
      String str = br.readLine();
      System.out.println(str);
      mp.remove(str);
      System.out.println(mp);
      System.out.print("Enter the index to insert:");
      String str1 = br.readLine();
      System.out.println(str1);
      System.out.print("Enter the value to be inserted:");
      String str2 = br.readLine();
      System.out.println(str2);
      mp.put(str1,str2);
      System.out.println(mp);
      
      
    }
}