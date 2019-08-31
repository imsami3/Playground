import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String str = br.readLine();
      
      
      
      String str1[] = str.split(",");
      LinkedHashSet<String> lhs = new LinkedHashSet<String>(Arrays.asList(str1));
      System.out.println(lhs);
      System.out.print("Enter the value to be deleted: ");
      String s1 = br.readLine();
      System.out.println(s1);
      lhs.remove(s1);
      System.out.println(lhs);
      
      System.out.print("Enter the value to be added: ");
      String s2 = br.readLine();
      System.out.println(s2);
      lhs.add(s2);
      System.out.println(lhs);
     
      
      
    }
}