import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     TreeSet<String> ts = new TreeSet<String>();
     String m = br.readLine();
     String[] str = m.split(",");
     System.out.println("Duplicate Entry is:");
     for(String str1: str)
     {
       if(!ts.add(str1))
       {
         System.out.println(str1);
       }
     }
      
     System.out.println("TreeSet is : "+ ts);
      
    }
}