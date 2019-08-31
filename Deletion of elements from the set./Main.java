import java.io.*;
import java.lang.*;
import java.util.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      TreeSet<String> ts = new TreeSet<String>();
      String str = br.readLine();
      String[] str1 = str.split(",");
      for(int i=0; i<str1.length ;i++)
      {
        ts.add(str1[i]);
      }
      System.out.println(ts);
      Object str2[] = ts.toArray();
      int n = str2.length-1;
      while(ts.isEmpty()!=true)
      {
        Object m = str2[n];
        ts.remove(m);
        System.out.println(ts);
        --n;
      }
    }
}